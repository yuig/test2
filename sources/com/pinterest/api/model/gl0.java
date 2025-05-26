package com.pinterest.api.model;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class gl0 extends vg {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f38082b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gl0(String str) {
        super(Boolean.FALSE);
        this.f38082b = str;
    }

    @Override // com.pinterest.api.model.vg
    public final Object h(mp0 value9) {
        hh t53;
        wy0 d2;
        Intrinsics.checkNotNullParameter(value9, "value9");
        Context context = kb0.a.f79058b;
        x02.i2 i2Var = (x02.i2) ((so.oa) ((so1.b) ep.b.g(so1.b.class))).F3.get();
        String l13 = value9.l();
        Intrinsics.checkNotNullExpressionValue(l13, "getPinId(...)");
        f30 f30Var = (f30) i2Var.O(l13);
        return (!Intrinsics.d((f30Var == null || (t53 = f30Var.t5()) == null || (d2 = t53.d()) == null) ? null : d2.getUid(), this.f38082b) || value9.k().booleanValue()) ? Boolean.FALSE : Boolean.TRUE;
    }
}
