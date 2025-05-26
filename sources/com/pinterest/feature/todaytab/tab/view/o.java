package com.pinterest.feature.todaytab.tab.view;

import com.pinterest.api.model.f30;
import com.pinterest.gestalt.text.GestaltText;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import nx.v;
import pk.a0;

/* loaded from: classes5.dex */
public final class o extends com.pinterest.feature.home.view.l implements ch1.b, v {

    /* renamed from: j, reason: collision with root package name */
    public dh1.e f48738j;

    @Override // ch1.b
    public final void D3(dh1.e eVar) {
        this.f48738j = eVar;
    }

    @Override // ch1.b
    public final void W5(List pins) {
        Intrinsics.checkNotNullParameter(pins, "pins");
        Intrinsics.checkNotNullParameter(pins, "pins");
        post(new dp.a(21, this, pins));
    }

    @Override // ch1.b
    public final void d() {
        this.f45877d.i(com.pinterest.feature.home.view.j.f45868j);
        this.f45878e.i(com.pinterest.feature.home.view.j.f45869k);
        q0 value = q0.f80391a;
        com.pinterest.feature.home.view.e eVar = this.f45880g;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(value, "value");
        eVar.f45852g = CollectionsKt.y0(value, eVar.f45854i);
        eVar.f45853h = -1;
        eVar.h();
        this.f45876c.setPaddingRelative(0, getResources().getDimensionPixelOffset(eo1.c.margin), 0, 0);
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        dh1.e eVar = this.f48738j;
        if (eVar != null) {
            return eVar.u3();
        }
        return null;
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        dh1.e eVar = this.f48738j;
        if (eVar != null) {
            return eVar.v3();
        }
        return null;
    }

    @Override // ch1.b
    public final void p(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(text, "text");
        boolean z13 = !z.j(text);
        GestaltText gestaltText = this.f45878e;
        if (z13) {
            gestaltText.i(new com.pinterest.feature.home.view.k(text, 1));
        } else {
            a0.k0(gestaltText);
        }
    }

    @Override // com.pinterest.feature.home.view.m
    public final void q2(f30 f30Var) {
        dh1.e eVar = this.f48738j;
        if (eVar != null) {
            eVar.t3(f30Var != null ? f30Var.getUid() : null);
        }
    }
}
