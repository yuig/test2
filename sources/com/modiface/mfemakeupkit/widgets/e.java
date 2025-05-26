package com.modiface.mfemakeupkit.widgets;

import android.graphics.RectF;
import com.modiface.mfecommon.utils.h;
import com.modiface.mfemakeupkit.data.MFEFacePoints;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class e extends com.modiface.mfemakeupkit.c {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ MFEMakeupView f34770m;

    public e(MFEMakeupView mFEMakeupView) {
        this.f34770m = mFEMakeupView;
    }

    @Override // com.modiface.mfemakeupkit.c
    public float[] a(int i13, int i14, int i15, int i16, MFEFacePoints mFEFacePoints) {
        AtomicReference atomicReference;
        atomicReference = this.f34770m.mZoomAreaRef;
        MFEMakeupZoomArea mFEMakeupZoomArea = (MFEMakeupZoomArea) atomicReference.get();
        if (mFEMakeupZoomArea == null) {
            mFEMakeupZoomArea = MFEMakeupZoomArea.None;
        }
        MFEMakeupZoomArea mFEMakeupZoomArea2 = mFEMakeupZoomArea;
        RectF rectF = new RectF();
        this.f34770m.jniCalculateZoomArea(mFEMakeupZoomArea2, i13, i14, mFEFacePoints, rectF);
        RectF rectF2 = new RectF(h.a(rectF.width(), rectF.height(), i15, i16));
        rectF2.offset(rectF.left, rectF.top);
        return rectF2.isEmpty() ? super.a(i13, i14, i15, i16, mFEFacePoints) : h.a(rectF2, i13, i14);
    }
}
