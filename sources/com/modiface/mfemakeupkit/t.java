package com.modiface.mfemakeupkit;

import com.modiface.mfecommon.utils.MFEDebugInfo;
import com.modiface.mfecommon.utils.MFEGLFramebuffer;
import com.modiface.mfemakeupkit.data.MFETrackingData;
import com.modiface.mfemakeupkit.rendering.a;
import com.modiface.mfemakeupkit.widgets.MFEMakeupView;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes7.dex */
public final class t implements a.r {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ c f34607a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ MFEMakeupEngine f34608b;

    public t(MFEMakeupEngine mFEMakeupEngine, c cVar) {
        this.f34608b = mFEMakeupEngine;
        this.f34607a = cVar;
    }

    @Override // com.modiface.mfemakeupkit.rendering.a.r
    public void a(MFEGLFramebuffer mFEGLFramebuffer, MFEGLFramebuffer mFEGLFramebuffer2, MFETrackingData mFETrackingData) {
        CopyOnWriteArrayList copyOnWriteArrayList;
        MFEDebugInfo mFEDebugInfo;
        this.f34607a.a(mFEGLFramebuffer, mFEGLFramebuffer2, mFETrackingData != null ? mFETrackingData.getFirstFacePoints() : null);
        copyOnWriteArrayList = this.f34608b.mMakeupViewRefs;
        Iterator it = copyOnWriteArrayList.iterator();
        int i13 = 1;
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference != null) {
                MFEMakeupView mFEMakeupView = (MFEMakeupView) weakReference.get();
                if (mFEMakeupView != null && mFEMakeupView.getMakeupSurface() == this.f34607a) {
                    MFEDebugInfo debugInfo = mFEMakeupView.getDebugInfo();
                    mFEDebugInfo = this.f34608b.mDebugInfo;
                    mFEDebugInfo.addSubDebugInfo(debugInfo.getNewCopy(debugInfo.name + " " + i13));
                    return;
                }
                i13++;
            }
        }
    }
}
