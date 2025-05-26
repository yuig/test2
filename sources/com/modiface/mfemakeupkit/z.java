package com.modiface.mfemakeupkit;

import com.modiface.mfemakeupkit.MFEMakeupEngine;
import com.modiface.mfemakeupkit.facetracking.a;

/* loaded from: classes7.dex */
public final class z implements a.m {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ MFEMakeupEngine.x f34775a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ MFEMakeupEngine f34776b;

    public z(MFEMakeupEngine mFEMakeupEngine, MFEMakeupEngine.x xVar) {
        this.f34776b = mFEMakeupEngine;
        this.f34775a = xVar;
    }

    @Override // com.modiface.mfemakeupkit.facetracking.a.m
    public void a() {
        if (this.f34775a != null) {
            com.modiface.mfecommon.utils.h.a(new y(this));
        }
    }
}
