package com.modiface.mfemakeupkit.video;

import android.graphics.Rect;
import com.modiface.mfemakeupkit.video.MFEVideoRecordingError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class i extends com.modiface.mfemakeupkit.c {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ e f34716m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(e eVar, boolean z13) {
        super(z13);
        this.f34716m = eVar;
    }

    @Override // com.modiface.mfemakeupkit.c
    public float[] a(int i13, int i14, int i15, int i16) {
        Rect a13 = com.modiface.mfecommon.utils.h.a(i13, i14, i15, i16);
        return a13.isEmpty() ? super.a(i13, i14, i15, i16) : com.modiface.mfecommon.utils.h.a(a13, i15, i16);
    }

    @Override // com.modiface.mfemakeupkit.c
    public void a(boolean z13, ArrayList<Throwable> arrayList) {
        List list;
        List list2;
        if (arrayList == null) {
            return;
        }
        Iterator<Throwable> it = arrayList.iterator();
        while (it.hasNext()) {
            Throwable next = it.next();
            if (next != null) {
                if (z13) {
                    list = this.f34716m.f34705m;
                    list.add(new MFEVideoRecordingError(next, new MFEVideoRecordingError.Consequence[0]));
                } else {
                    list2 = this.f34716m.f34705m;
                    list2.add(new MFEVideoRecordingError(next, MFEVideoRecordingError.Consequence.RecordingFailed));
                }
            }
        }
    }

    @Override // com.modiface.mfemakeupkit.c
    public void a(Throwable th3) {
        List list;
        if (th3 != null) {
            list = this.f34716m.f34705m;
            list.add(new MFEVideoRecordingError(th3, MFEVideoRecordingError.Consequence.SkippedVideoFrame));
        }
    }
}
