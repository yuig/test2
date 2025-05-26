package com.modiface.mfemakeupkit.rendering;

import com.modiface.mfecommon.utils.MFEDebugInfo;

/* loaded from: classes7.dex */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ c f34568a;

    public b(c cVar) {
        this.f34568a = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.modiface.mfemakeupkit.mfea.c cVar;
        MFEDebugInfo mFEDebugInfo;
        cVar = this.f34568a.f34572d.f34558e;
        mFEDebugInfo = this.f34568a.f34572d.f34567n;
        cVar.cs1776(mFEDebugInfo);
    }
}
