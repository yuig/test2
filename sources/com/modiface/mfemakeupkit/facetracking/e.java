package com.modiface.mfemakeupkit.facetracking;

import android.content.res.AssetManager;
import com.modiface.mfecommon.utils.MFEDebugInfo;
import com.modiface.mfemakeupkit.MFEMakeupEngine;
import com.pinterest.modiface.MFEMakeupViewKt;

/* loaded from: classes7.dex */
public final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AssetManager f34477a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a f34478b;

    public e(a aVar, AssetManager assetManager) {
        this.f34478b = aVar;
        this.f34477a = assetManager;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.modiface.mfemakeupkit.mfea.b bVar;
        String str;
        MFEMakeupEngine.Region region;
        com.modiface.mfemakeupkit.mfea.b bVar2;
        MFEDebugInfo mFEDebugInfo;
        MFEDebugInfo mFEDebugInfo2 = new MFEDebugInfo("Face Tracker Initialization");
        bVar = this.f34478b.f34458a;
        str = this.f34478b.f34464g;
        region = this.f34478b.f34465h;
        bVar.e(str, region, mFEDebugInfo2);
        bVar2 = this.f34478b.f34458a;
        bVar2.j(this.f34477a, MFEMakeupViewKt.MFE_FACE_TRACKER_BUNDLE_PATH);
        mFEDebugInfo = this.f34478b.f34460c;
        mFEDebugInfo.addSubDebugInfo(mFEDebugInfo2);
    }
}
