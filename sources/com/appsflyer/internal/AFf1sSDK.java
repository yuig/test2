package com.appsflyer.internal;

import java.util.TimerTask;

/* loaded from: classes.dex */
public final class AFf1sSDK extends TimerTask {
    private final Thread getRevenue;

    public AFf1sSDK(Thread thread) {
        this.getRevenue = thread;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.getRevenue.interrupt();
    }
}
