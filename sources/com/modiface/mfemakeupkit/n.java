package com.modiface.mfemakeupkit;

import android.graphics.Bitmap;

/* loaded from: classes7.dex */
public final class n implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Bitmap f34531a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ o f34532b;

    public n(o oVar, Bitmap bitmap) {
        this.f34532b = oVar;
        this.f34531a = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        o oVar = this.f34532b;
        oVar.f34536d.startRunningWithPhoto(this.f34531a, oVar.f34535c, null, new m(this));
    }
}
