package h32;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: e */
    public static final vb0.i f66957e = new vb0.i(1);

    /* renamed from: a */
    public final r0 f66958a;

    /* renamed from: b */
    public final s f66959b;

    /* renamed from: c */
    public final g f66960c;

    /* renamed from: d */
    public final e32.b f66961d;

    public e(r0 r0Var, s sVar, g gVar, e32.b bVar) {
        this.f66958a = r0Var;
        this.f66959b = sVar;
        this.f66960c = gVar;
        this.f66961d = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f66958a, eVar.f66958a) && Intrinsics.d(this.f66959b, eVar.f66959b) && Intrinsics.d(null, null) && Intrinsics.d(this.f66960c, eVar.f66960c) && Intrinsics.d(null, null) && Intrinsics.d(this.f66961d, eVar.f66961d);
    }

    public final int hashCode() {
        r0 r0Var = this.f66958a;
        int hashCode = (r0Var == null ? 0 : r0Var.hashCode()) * 31;
        s sVar = this.f66959b;
        int hashCode2 = (hashCode + (sVar == null ? 0 : sVar.hashCode())) * 961;
        g gVar = this.f66960c;
        int hashCode3 = (hashCode2 + (gVar == null ? 0 : gVar.hashCode())) * 961;
        e32.b bVar = this.f66961d;
        return hashCode3 + (bVar != null ? bVar.hashCode() : 0);
    }

    public final String toString() {
        return "AdDataEventData(dynamicAdData=" + this.f66958a + ", badgeItem=" + this.f66959b + ", modularizationResult=null, adFormatsModularizationData=" + this.f66960c + ", renderData=null, commonExtraData=" + this.f66961d + ")";
    }
}
