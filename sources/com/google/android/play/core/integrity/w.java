package com.google.android.play.core.integrity;

import android.content.Context;
import androidx.recyclerview.widget.y1;

/* loaded from: classes3.dex */
final class w implements aw {

    /* renamed from: a, reason: collision with root package name */
    private final w f33509a = this;

    /* renamed from: b, reason: collision with root package name */
    private final nk.g f33510b;

    /* renamed from: c, reason: collision with root package name */
    private final nk.g f33511c;

    /* renamed from: d, reason: collision with root package name */
    private final nk.g f33512d;

    /* renamed from: e, reason: collision with root package name */
    private final nk.g f33513e;

    /* renamed from: f, reason: collision with root package name */
    private final nk.g f33514f;

    /* renamed from: g, reason: collision with root package name */
    private final nk.g f33515g;

    public w(Context context, v vVar) {
        bc bcVar;
        o oVar;
        o oVar2;
        if (context == null) {
            throw new NullPointerException("instance cannot be null");
        }
        y1 y1Var = new y1(context);
        this.f33510b = y1Var;
        bcVar = bb.f33446a;
        nk.g b13 = nk.e.b(bcVar);
        this.f33511c = b13;
        oVar = n.f33500a;
        au auVar = new au(y1Var, oVar);
        this.f33512d = auVar;
        oVar2 = n.f33500a;
        nk.g b14 = nk.e.b(new bp(y1Var, b13, auVar, oVar2));
        this.f33513e = b14;
        nk.g b15 = nk.e.b(new bu(b14));
        this.f33514f = b15;
        this.f33515g = nk.e.b(new ba(b14, b15));
    }

    @Override // com.google.android.play.core.integrity.aw
    public final StandardIntegrityManager a() {
        return (StandardIntegrityManager) this.f33515g.a();
    }
}
