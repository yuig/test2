package com.google.android.play.core.integrity;

import android.content.Context;
import androidx.recyclerview.widget.y1;

/* loaded from: classes.dex */
final class s {

    /* renamed from: a, reason: collision with root package name */
    private final s f33502a = this;

    /* renamed from: b, reason: collision with root package name */
    private final nk.g f33503b;

    /* renamed from: c, reason: collision with root package name */
    private final nk.g f33504c;

    /* renamed from: d, reason: collision with root package name */
    private final nk.g f33505d;

    /* renamed from: e, reason: collision with root package name */
    private final nk.g f33506e;

    /* renamed from: f, reason: collision with root package name */
    private final nk.g f33507f;

    public s(Context context, r rVar) {
        ad adVar;
        m mVar;
        m mVar2;
        if (context == null) {
            throw new NullPointerException("instance cannot be null");
        }
        y1 y1Var = new y1(context);
        this.f33503b = y1Var;
        adVar = ac.f33393a;
        nk.g b13 = nk.e.b(adVar);
        this.f33504c = b13;
        mVar = l.f33495a;
        au auVar = new au(y1Var, mVar);
        this.f33505d = auVar;
        mVar2 = l.f33495a;
        nk.g b14 = nk.e.b(new al(y1Var, b13, auVar, mVar2));
        this.f33506e = b14;
        this.f33507f = nk.e.b(new ab(b14));
    }

    public final IntegrityManager a() {
        return (IntegrityManager) this.f33507f.a();
    }
}
