package com.modiface.mfecommon.utils;

import android.graphics.Bitmap;

/* loaded from: classes7.dex */
public final class j0 implements k0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ i f34330a;

    public j0(i iVar) {
        this.f34330a = iVar;
    }

    @Override // com.modiface.mfecommon.utils.k0
    public a0 a() {
        i iVar = this.f34330a;
        Bitmap a13 = h.a(iVar.f34324a, iVar.f34325b, Bitmap.Config.ARGB_8888);
        i iVar2 = this.f34330a;
        return new a0(iVar2.f34324a, iVar2.f34325b, a13, new MFESharedGLTexture(a13), this.f34330a);
    }
}
