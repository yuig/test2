package com.modiface.mfemakeupkit.rendering;

import com.modiface.mfecommon.utils.MFEDebugInfo;
import com.modiface.mfecommon.utils.MFENativeError;
import com.modiface.mfemakeupkit.rendering.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes7.dex */
public final class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.modiface.mfemakeupkit.utils.d f34598a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ float f34599b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ a f34600c;

    public p(a aVar, com.modiface.mfemakeupkit.utils.d dVar, float f13) {
        this.f34600c = aVar;
        this.f34598a = dVar;
        this.f34599b = f13;
    }

    @Override // java.lang.Runnable
    public void run() {
        WeakReference weakReference;
        com.modiface.mfemakeupkit.utils.d dVar;
        AtomicBoolean atomicBoolean;
        MFEDebugInfo mFEDebugInfo;
        com.modiface.mfemakeupkit.mfea.c cVar;
        com.modiface.mfemakeupkit.utils.d dVar2;
        com.modiface.mfemakeupkit.utils.d dVar3;
        com.modiface.mfecommon.utils.q qVar = new com.modiface.mfecommon.utils.q();
        weakReference = this.f34600c.f34554a;
        a.q qVar2 = (a.q) weakReference.get();
        dVar = this.f34600c.f34561h;
        if (dVar != null && qVar2 != null) {
            dVar3 = this.f34600c.f34561h;
            dVar3.f34672a.getImage().close();
        }
        this.f34600c.f34561h = this.f34598a;
        MFEDebugInfo mFEDebugInfo2 = new MFEDebugInfo("Rendering Tracking Data");
        atomicBoolean = this.f34600c.f34555b;
        boolean z13 = false;
        if (!atomicBoolean.get()) {
            ArrayList arrayList = new ArrayList();
            MFENativeError mFENativeError = new MFENativeError();
            cVar = this.f34600c.f34558e;
            dVar2 = this.f34600c.f34561h;
            cVar.e(dVar2.f34672a, mFEDebugInfo2, mFENativeError.getNativeState());
            Throwable nativeError = mFENativeError.getNativeError();
            if (nativeError != null) {
                arrayList.add(nativeError);
            }
            mFEDebugInfo2.addSimpleDebugInfo("total update tracking data time (ms)", qVar.d());
            z13 = this.f34600c.a(arrayList, false, this.f34599b);
        }
        mFEDebugInfo = this.f34600c.f34567n;
        mFEDebugInfo.addSubDebugInfo(mFEDebugInfo2);
        if (qVar2 != null) {
            qVar2.onApplyMakeupWithTrackingDataDone(z13, this.f34598a);
        }
    }
}
