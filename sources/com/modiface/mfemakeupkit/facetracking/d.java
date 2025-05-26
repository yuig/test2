package com.modiface.mfemakeupkit.facetracking;

import android.os.Handler;
import com.modiface.mfecommon.utils.MFEImage;
import com.modiface.mfecommon.utils.p;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ a f34476a;

    public d(a aVar) {
        this.f34476a = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        p pVar;
        AtomicReference atomicReference;
        MFEImage mFEImage;
        pVar = this.f34476a.f34459b;
        Handler b13 = pVar.b();
        if (b13 != null) {
            b13.removeMessages(17);
        }
        atomicReference = this.f34476a.f34468k;
        n nVar = (n) atomicReference.getAndSet(null);
        if (nVar != null) {
            mFEImage = nVar.f34495a;
            mFEImage.close();
        }
    }
}
