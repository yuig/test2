package com.modiface.mfecommon.utils;

import android.opengl.EGLContext;

/* loaded from: classes7.dex */
public final class b0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ EGLContext f34283a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ g f34284b;

    public b0(g gVar, EGLContext eGLContext) {
        this.f34284b = gVar;
        this.f34283a = eGLContext;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f34284b.a(this.f34283a);
    }
}
