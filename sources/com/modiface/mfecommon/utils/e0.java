package com.modiface.mfecommon.utils;

import android.opengl.EGLContext;

/* loaded from: classes7.dex */
public final class e0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ EGLContext f34296a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ g f34297b;

    public e0(g gVar, EGLContext eGLContext) {
        this.f34297b = gVar;
        this.f34296a = eGLContext;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f34297b.a(this.f34296a);
    }
}
