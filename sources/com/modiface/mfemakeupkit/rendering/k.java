package com.modiface.mfemakeupkit.rendering;

import com.modiface.mfecommon.utils.MFEDebugInfo;

/* loaded from: classes7.dex */
public final class k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ l f34590a;

    public k(l lVar) {
        this.f34590a = lVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.modiface.mfemakeupkit.mfea.c cVar;
        MFEDebugInfo mFEDebugInfo;
        cVar = this.f34590a.f34592b.f34558e;
        mFEDebugInfo = this.f34590a.f34592b.f34567n;
        cVar.cs1776(mFEDebugInfo);
    }
}
