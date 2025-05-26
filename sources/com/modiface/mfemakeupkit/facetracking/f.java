package com.modiface.mfemakeupkit.facetracking;

import com.modiface.mfecommon.utils.MFEDebugInfo;
import com.modiface.mfemakeupkit.facetracking.a;

/* loaded from: classes7.dex */
public final class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f34479a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a.p f34480b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ a f34481c;

    public f(a aVar, String str, a.p pVar) {
        this.f34481c = aVar;
        this.f34479a = str;
        this.f34480b = pVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.modiface.mfemakeupkit.mfea.b bVar;
        MFEDebugInfo mFEDebugInfo;
        MFEDebugInfo mFEDebugInfo2 = new MFEDebugInfo("Face Tracker Load Resources");
        bVar = this.f34481c.f34458a;
        bVar.h(this.f34479a, mFEDebugInfo2);
        this.f34481c.f34466i = this.f34479a;
        mFEDebugInfo = this.f34481c.f34460c;
        mFEDebugInfo.addSubDebugInfo(mFEDebugInfo2);
        a.p pVar = this.f34480b;
        if (pVar != null) {
            pVar.a();
        }
    }
}
