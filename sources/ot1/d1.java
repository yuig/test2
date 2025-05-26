package ot1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d1 {

    /* renamed from: a, reason: collision with root package name */
    public final b f97549a;

    /* renamed from: b, reason: collision with root package name */
    public final nt1.e f97550b;

    /* renamed from: c, reason: collision with root package name */
    public final Boolean f97551c;

    /* renamed from: d, reason: collision with root package name */
    public final c1 f97552d;

    /* renamed from: e, reason: collision with root package name */
    public final z f97553e;

    /* renamed from: f, reason: collision with root package name */
    public final b1 f97554f;

    /* renamed from: g, reason: collision with root package name */
    public final g0 f97555g;

    /* renamed from: h, reason: collision with root package name */
    public final g0 f97556h;

    /* renamed from: i, reason: collision with root package name */
    public final Boolean f97557i;

    /* renamed from: j, reason: collision with root package name */
    public final Boolean f97558j;

    /* renamed from: k, reason: collision with root package name */
    public final y f97559k;

    public d1(b bVar, nt1.e eVar, Boolean bool, c1 c1Var, z zVar, b1 b1Var, g0 g0Var, g0 g0Var2, Boolean bool2, Boolean bool3, y yVar) {
        this.f97549a = bVar;
        this.f97550b = eVar;
        this.f97551c = bool;
        this.f97552d = c1Var;
        this.f97553e = zVar;
        this.f97554f = b1Var;
        this.f97555g = g0Var;
        this.f97556h = g0Var2;
        this.f97557i = bool2;
        this.f97558j = bool3;
        this.f97559k = yVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj;
        return this.f97549a == d1Var.f97549a && Intrinsics.d(this.f97550b, d1Var.f97550b) && Intrinsics.d(this.f97551c, d1Var.f97551c) && Intrinsics.d(this.f97552d, d1Var.f97552d) && Intrinsics.d(this.f97553e, d1Var.f97553e) && Intrinsics.d(this.f97554f, d1Var.f97554f) && Intrinsics.d(this.f97555g, d1Var.f97555g) && Intrinsics.d(this.f97556h, d1Var.f97556h) && Intrinsics.d(this.f97557i, d1Var.f97557i) && Intrinsics.d(this.f97558j, d1Var.f97558j) && Intrinsics.d(this.f97559k, d1Var.f97559k);
    }

    public final int hashCode() {
        b bVar = this.f97549a;
        int hashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        nt1.e eVar = this.f97550b;
        int hashCode2 = (hashCode + (eVar == null ? 0 : eVar.hashCode())) * 31;
        Boolean bool = this.f97551c;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        c1 c1Var = this.f97552d;
        int hashCode4 = (hashCode3 + (c1Var == null ? 0 : c1Var.hashCode())) * 31;
        z zVar = this.f97553e;
        int hashCode5 = (hashCode4 + (zVar == null ? 0 : zVar.hashCode())) * 31;
        b1 b1Var = this.f97554f;
        int hashCode6 = (hashCode5 + (b1Var == null ? 0 : b1Var.hashCode())) * 31;
        g0 g0Var = this.f97555g;
        int hashCode7 = (hashCode6 + (g0Var == null ? 0 : g0Var.hashCode())) * 31;
        g0 g0Var2 = this.f97556h;
        int hashCode8 = (hashCode7 + (g0Var2 == null ? 0 : g0Var2.hashCode())) * 31;
        Boolean bool2 = this.f97557i;
        int hashCode9 = (hashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f97558j;
        int hashCode10 = (hashCode9 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        y yVar = this.f97559k;
        return hashCode10 + (yVar != null ? yVar.hashCode() : 0);
    }

    public final String toString() {
        return "VuiParameters(aspectRatio=" + this.f97549a + ", sar=" + this.f97550b + ", isOverscanAppropriate=" + this.f97551c + ", videoSignalType=" + this.f97552d + ", chromaLocInfo=" + this.f97553e + ", timingInfo=" + this.f97554f + ", nalHrdParameters=" + this.f97555g + ", vclHrdParameters=" + this.f97556h + ", lowDelayHrd=" + this.f97557i + ", isPicStructPresent=" + this.f97558j + ", bitstreamRestrictions=" + this.f97559k + ")";
    }
}
