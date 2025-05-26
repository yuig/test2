package com.modiface.mfecommon.camera;

import android.os.Handler;

/* loaded from: classes7.dex */
public final class n implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ o f34240a;

    public n(o oVar) {
        this.f34240a = oVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.modiface.mfecommon.utils.n nVar;
        nVar = this.f34240a.f34242b.f34170e;
        Handler b13 = nVar.b();
        if (b13 != null) {
            b13.sendEmptyMessage(13);
        }
    }
}
