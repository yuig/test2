package com.modiface.mfemakeupkit.facetracking;

import com.modiface.mfecommon.utils.MFEDebugInfo;
import com.modiface.mfecommon.utils.MFEImage;
import com.modiface.mfecommon.utils.q;
import com.modiface.mfemakeupkit.data.MFEFaceTrackingParameters;
import com.modiface.mfemakeupkit.data.MFETrackingData;
import com.modiface.mfemakeupkit.facetracking.a;

/* loaded from: classes7.dex */
public final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ MFEImage f34472a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ MFEFaceTrackingParameters f34473b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ a.r f34474c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ a f34475d;

    public c(a aVar, MFEImage mFEImage, MFEFaceTrackingParameters mFEFaceTrackingParameters, a.r rVar) {
        this.f34475d = aVar;
        this.f34472a = mFEImage;
        this.f34473b = mFEFaceTrackingParameters;
        this.f34474c = rVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.modiface.mfemakeupkit.mfea.b bVar;
        com.modiface.mfemakeupkit.mfea.b bVar2;
        com.modiface.mfemakeupkit.mfea.b bVar3;
        double d2;
        q qVar;
        q qVar2;
        double d13;
        MFEDebugInfo mFEDebugInfo;
        MFETrackingData mFETrackingData = new MFETrackingData(this.f34472a);
        bVar = this.f34475d.f34458a;
        if (bVar.g()) {
            MFEDebugInfo mFEDebugInfo2 = new MFEDebugInfo("Face Tracking");
            bVar2 = this.f34475d.f34458a;
            bVar2.c(mFETrackingData, this.f34473b, mFEDebugInfo2);
            bVar3 = this.f34475d.f34458a;
            bVar3.d();
            a aVar = this.f34475d;
            d2 = aVar.f34462e;
            qVar = this.f34475d.f34461d;
            aVar.f34462e = (d2 * 0.9d) + (qVar.a() * 0.1d);
            qVar2 = this.f34475d.f34461d;
            qVar2.c();
            d13 = this.f34475d.f34462e;
            mFEDebugInfo2.addSimpleDebugInfo("face tracking fps", d13);
            mFEDebugInfo = this.f34475d.f34460c;
            mFEDebugInfo.addSubDebugInfo(mFEDebugInfo2);
        }
        this.f34474c.a(mFETrackingData);
    }
}
