package com.modiface.mfemakeupkit.facetracking;

import com.modiface.mfecommon.utils.MFEDebugInfo;
import com.modiface.mfemakeupkit.MFEMakeupEngine;
import com.modiface.mfemakeupkit.facetracking.a;

/* loaded from: classes7.dex */
public final class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ a.m f34482a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a f34483b;

    public g(a aVar, a.m mVar) {
        this.f34483b = aVar;
        this.f34482a = mVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.modiface.mfemakeupkit.mfea.b bVar;
        com.modiface.mfemakeupkit.mfea.b bVar2;
        String str;
        MFEMakeupEngine.Region region;
        MFEDebugInfo mFEDebugInfo;
        String str2;
        com.modiface.mfemakeupkit.mfea.b bVar3;
        String str3;
        MFEDebugInfo mFEDebugInfo2;
        bVar = this.f34483b.f34458a;
        if (bVar.g()) {
            return;
        }
        MFEDebugInfo mFEDebugInfo3 = new MFEDebugInfo("Face Tracker Initialization");
        bVar2 = this.f34483b.f34458a;
        str = this.f34483b.f34464g;
        region = this.f34483b.f34465h;
        bVar2.e(str, region, mFEDebugInfo3);
        mFEDebugInfo = this.f34483b.f34460c;
        mFEDebugInfo.addSubDebugInfo(mFEDebugInfo3);
        str2 = this.f34483b.f34466i;
        if (str2 != null) {
            MFEDebugInfo mFEDebugInfo4 = new MFEDebugInfo("Face Tracker Load Resources");
            bVar3 = this.f34483b.f34458a;
            str3 = this.f34483b.f34466i;
            bVar3.h(str3, mFEDebugInfo4);
            mFEDebugInfo2 = this.f34483b.f34460c;
            mFEDebugInfo2.addSubDebugInfo(mFEDebugInfo4);
        }
        a.m mVar = this.f34482a;
        if (mVar != null) {
            mVar.a();
        }
    }
}
