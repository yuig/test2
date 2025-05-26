package com.modiface.mfemakeupkit.rendering;

import com.modiface.mfecommon.utils.MFEDebugInfo;
import com.modiface.mfemakeupkit.effects.MFEMakeupTint;

/* loaded from: classes7.dex */
public final class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ MFEMakeupTint.Style f34583a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a f34584b;

    public g(a aVar, MFEMakeupTint.Style style) {
        this.f34584b = aVar;
        this.f34583a = style;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.modiface.mfemakeupkit.mfea.c cVar;
        MFEDebugInfo mFEDebugInfo;
        cVar = this.f34584b.f34558e;
        MFEMakeupTint.Style style = this.f34583a;
        mFEDebugInfo = this.f34584b.f34567n;
        cVar.k(style, mFEDebugInfo);
    }
}
