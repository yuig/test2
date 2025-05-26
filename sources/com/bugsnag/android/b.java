package com.bugsnag.android;

import android.os.HandlerThread;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final HandlerThread f29157a;

    public b() {
        HandlerThread handlerThread = new HandlerThread("bugsnag-anr-collector");
        this.f29157a = handlerThread;
        handlerThread.start();
    }
}
