package com.google.android.gms.common.api.internal;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class v implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30886a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f30887b;

    public /* synthetic */ v(bi.f fVar) {
        this.f30886a = 0;
        this.f30887b = fVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i13 = this.f30886a;
        Handler handler = this.f30887b;
        switch (i13) {
            case 0:
                handler.post(runnable);
                break;
            default:
                handler.post(runnable);
                break;
        }
    }

    public v() {
        this.f30886a = 1;
        this.f30887b = new Handler(Looper.getMainLooper());
    }
}
