package com.google.firebase.messaging;

import a.o3;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class g extends Service {
    private static final String TAG = "EnhancedIntentService";

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f33779a = 0;
    private Binder binder;
    final ExecutorService executor;
    private int lastStartId;
    private final Object lock;
    private int runningTasks;

    public g() {
        o.c cVar = new o.c("Firebase-Messaging-Intent-Handle");
        jm.a aVar = jm.a.LOW_POWER;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), cVar);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.executor = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.lock = new Object();
        this.runningTasks = 0;
    }

    public final void a(Intent intent) {
        if (intent != null) {
            b0.b(intent);
        }
        synchronized (this.lock) {
            try {
                int i13 = this.runningTasks - 1;
                this.runningTasks = i13;
                if (i13 == 0) {
                    stopSelfResultHook(this.lastStartId);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final Task b(Intent intent) {
        if (handleIntentOnMainThread(intent)) {
            return Tasks.forResult(null);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.executor.execute(new h6.o(this, intent, taskCompletionSource, 12));
        return taskCompletionSource.getTask();
    }

    public abstract Intent getStartCommandIntent(Intent intent);

    public abstract void handleIntent(Intent intent);

    public boolean handleIntentOnMainThread(Intent intent) {
        return false;
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        try {
            if (Log.isLoggable(TAG, 3)) {
                Log.d(TAG, "Service received bind request");
            }
            if (this.binder == null) {
                this.binder = new c0(new rd.j(this, 20));
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return this.binder;
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.executor.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i13, int i14) {
        synchronized (this.lock) {
            this.lastStartId = i14;
            this.runningTasks++;
        }
        Intent startCommandIntent = getStartCommandIntent(intent);
        if (startCommandIntent == null) {
            a(intent);
            return 2;
        }
        Task b13 = b(startCommandIntent);
        if (b13.isComplete()) {
            a(intent);
            return 2;
        }
        b13.addOnCompleteListener(new u5.j(12), new o3(1, this, intent));
        return 3;
    }

    public boolean stopSelfResultHook(int i13) {
        return stopSelfResult(i13);
    }
}
