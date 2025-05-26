package com.modiface.mfemakeupkit;

import com.modiface.mfemakeupkit.MFEMakeupEngine;
import com.modiface.mfemakeupkit.facetracking.a;

/* loaded from: classes7.dex */
public final class b0 implements a.n {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ MFEMakeupEngine.w f34405a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ MFEMakeupEngine f34406b;

    public b0(MFEMakeupEngine mFEMakeupEngine, MFEMakeupEngine.w wVar) {
        this.f34406b = mFEMakeupEngine;
        this.f34405a = wVar;
    }

    @Override // com.modiface.mfemakeupkit.facetracking.a.n
    public void a() {
        if (this.f34405a != null) {
            com.modiface.mfecommon.utils.h.a(new a0(this));
        }
    }
}
