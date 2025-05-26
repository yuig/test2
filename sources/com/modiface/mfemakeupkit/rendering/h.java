package com.modiface.mfemakeupkit.rendering;

import com.modiface.mfecommon.utils.MFEDebugInfo;

/* loaded from: classes7.dex */
public final class h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f34585a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a f34586b;

    public h(a aVar, String str) {
        this.f34586b = aVar;
        this.f34585a = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.modiface.mfemakeupkit.mfea.c cVar;
        MFEDebugInfo mFEDebugInfo;
        cVar = this.f34586b.f34558e;
        String str = this.f34585a;
        mFEDebugInfo = this.f34586b.f34567n;
        cVar.l(str, mFEDebugInfo);
    }
}
