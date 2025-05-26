package com.google.firebase.iid;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import hh.d;
import hh.h;
import hh.k;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import n60.o;
import o.c;

/* loaded from: classes3.dex */
public final class FirebaseInstanceIdReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f33725a;

    public FirebaseInstanceIdReceiver() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new c("firebase-iid-executor"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f33725a = Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    public static int b(Context context, Intent intent) {
        int i13;
        Task c13;
        int i14 = 500;
        if (intent.getExtras() != null) {
            String stringExtra = intent.getStringExtra("google.message_id");
            if (TextUtils.isEmpty(stringExtra)) {
                c13 = Tasks.forResult(null);
            } else {
                Bundle a13 = o.a("google.message_id", stringExtra);
                k b13 = k.b(context);
                synchronized (b13) {
                    i13 = b13.f69123a;
                    b13.f69123a = i13 + 1;
                }
                c13 = b13.c(new h(i13, 2, a13));
            }
            try {
                i14 = ((Integer) Tasks.await(new com.google.firebase.messaging.h(context).c(intent))).intValue();
            } catch (InterruptedException | ExecutionException e13) {
                Log.e("FirebaseMessaging", "Failed to send message to service.", e13);
            }
            try {
                Tasks.await(c13, TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException e14) {
                String valueOf = String.valueOf(e14);
                StringBuilder sb3 = new StringBuilder(valueOf.length() + 20);
                sb3.append("Message ack failed: ");
                sb3.append(valueOf);
                Log.w("CloudMessagingReceiver", sb3.toString());
            }
        }
        return i14;
    }

    public static int c(Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
                Log.e("CloudMessagingReceiver", "Notification pending intent canceled");
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.remove("pending_intent");
        } else {
            extras = new Bundle();
        }
        if (!"com.google.firebase.messaging.NOTIFICATION_DISMISS".equals(intent.getAction())) {
            Log.e("CloudMessagingReceiver", "Unknown notification action");
            return 500;
        }
        Intent putExtras = new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(extras);
        if (com.bumptech.glide.c.g1(putExtras)) {
            com.bumptech.glide.c.I0("_nd", putExtras.getExtras());
        }
        return -1;
    }

    @Override // android.content.BroadcastReceiver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        this.f33725a.execute(new d(this, intent, context, isOrderedBroadcast(), goAsync()));
    }
}
