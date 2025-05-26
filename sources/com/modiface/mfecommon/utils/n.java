package com.modiface.mfecommon.utils;

import android.opengl.EGLContext;

/* loaded from: classes7.dex */
public class n extends g {

    /* renamed from: m */
    private static final m0 f34350m = new m0();

    public n(String str) {
        this(str, false);
    }

    @Override // com.modiface.mfecommon.utils.g
    public void a(EGLContext eGLContext) {
        if (eGLContext != null) {
            throw new IllegalArgumentException("cannot create GL context with a user specified share context in MFEMakeupGLThread");
        }
        super.a(f34350m.a(this));
    }

    @Override // com.modiface.mfecommon.utils.g
    public void c() {
        super.c();
        f34350m.b(this);
    }

    public n(String str, boolean z13) {
        super(str, null, z13);
    }
}
