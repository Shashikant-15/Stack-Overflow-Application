package com.knoldus.trainning.StackOverflowApplication.migration;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MigrationPOC {

    public static void main(String[] args) {

        startMigration(123);
    }

    static ExecutorService ex = Executors.newCachedThreadPool();

    private static void startMigration(int pcid) {

        try {
            CompletableFuture<MigrationResponse> orderResponse = startOrderMigration(pcid);
            CompletableFuture<MigrationResponse> paymentResponse = startPaymentMigration(pcid);
            CompletableFuture<MigrationResponse> cartResponse = startCartMigration(pcid);
            CompletableFuture<MigrationResponse> profileResponse = startProfileMigration(pcid);

            System.out.println(1);
            MigrationResponse mrOrder = orderResponse.get();
            System.out.println(2);
            MigrationResponse mrPayment = paymentResponse.get();
            System.out.println(3);
            MigrationResponse mrCart = cartResponse.get();
            System.out.println(4);
            MigrationResponse mrProfile = profileResponse.get();
            System.out.println(5);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static CompletableFuture<MigrationResponse> startProfileMigration(int pcid) {
        CompletableFuture<MigrationResponse> completableFuture = new CompletableFuture<>();

        ex.submit(() -> {
            Thread.sleep(1000);
            completableFuture.complete(new MigrationResponse(200,"Migrated"));
            return null;
        });

        return completableFuture;
    }

    private static CompletableFuture<MigrationResponse> startCartMigration(int pcid) {
        CompletableFuture<MigrationResponse> completableFuture = new CompletableFuture<>();

        ex.submit(() -> {
            Thread.sleep(5000);
            completableFuture.complete(new MigrationResponse(200,"Migrated"));
            return null;
        });

        return completableFuture;
    }

    private static CompletableFuture<MigrationResponse> startPaymentMigration(int pcid) {
        CompletableFuture<MigrationResponse> completableFuture = new CompletableFuture<>();

        ex.submit(() -> {
            Thread.sleep(3000);
            completableFuture.complete(new MigrationResponse(200,"Migrated"));
            return null;
        });

        return completableFuture;
    }

    private static CompletableFuture<MigrationResponse> startOrderMigration(int pcid)  throws InterruptedException {
        CompletableFuture<MigrationResponse> completableFuture = new CompletableFuture<>();

        ex.submit(() -> {
            Thread.sleep(5000);
            completableFuture.complete(new MigrationResponse(200,"Migrated"));
            return null;
        });

        return completableFuture;
    }



}
class MigrationResponse{

    int statusCode;
    String message;

    public MigrationResponse(int statusCode, String message) {
        super();
        this.statusCode = statusCode;
        this.message = message;
    }

    public int getStatusCode() {return statusCode;    }
    public void setStatusCode(int statusCode) {this.statusCode = statusCode;    }
    public String getMessage() {return message;    }
    public void setMessage(String message) {this.message = message;    }

}
