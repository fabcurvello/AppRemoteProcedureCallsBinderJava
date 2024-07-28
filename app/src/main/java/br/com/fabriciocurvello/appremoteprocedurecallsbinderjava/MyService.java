package br.com.fabriciocurvello.appremoteprocedurecallsbinderjava;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Binder;

public class MyService extends Service {

    // Binder entregue aos clientes
    private final IBinder binder = new LocalBinder();

    // Classe utilizada para o cliente Binder
    public class LocalBinder extends Binder {
        MyService getService() {
            return MyService.this;
        }
    }

    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        //throw new UnsupportedOperationException("Not yet implemented");
        return binder;
    }

    // Um método simples que os clientes podem chamar
    public String getMessage() {
        return "Hello from the service!";
    }
}