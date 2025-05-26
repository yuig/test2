package com.amazonaws.event;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes3.dex */
public class ProgressListenerCallbackExecutor {

    /* renamed from: b, reason: collision with root package name */
    public static final ExecutorService f28582b = Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: com.amazonaws.event.ProgressListenerCallbackExecutor.3
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("android-sdk-progress-listener-callback-thread");
            thread.setDaemon(true);
            return thread;
        }
    });

    /* renamed from: a, reason: collision with root package name */
    public final ProgressListener f28583a;

    public ProgressListenerCallbackExecutor(ProgressListener progressListener) {
        this.f28583a = progressListener;
    }

    public final void a(final ProgressEvent progressEvent) {
        if (this.f28583a == null) {
            return;
        }
        f28582b.submit(new Runnable() { // from class: com.amazonaws.event.ProgressListenerCallbackExecutor.2
            @Override // java.lang.Runnable
            public final void run() {
                ProgressListenerCallbackExecutor.this.f28583a.a(progressEvent);
            }
        });
    }
}
