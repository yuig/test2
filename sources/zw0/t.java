package zw0;

import com.pinterest.api.model.f30;
import com.pinterest.api.model.vi;
import kotlin.jvm.internal.Intrinsics;
import l82.i0;
import m60.f0;

/* loaded from: classes5.dex */
public final class t implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f142929a;

    /* renamed from: b, reason: collision with root package name */
    public final int f142930b;

    /* renamed from: c, reason: collision with root package name */
    public final wa2.m f142931c;

    /* renamed from: d, reason: collision with root package name */
    public final yw0.n f142932d;

    /* renamed from: e, reason: collision with root package name */
    public final vi f142933e;

    public t(f30 pin, int i13, yw0.n moduleVariant, vi viVar, int i14) {
        i13 = (i14 & 2) != 0 ? 0 : i13;
        wa2.m pinFeatureConfig = f0.i0(ve.h.p(ue1.t.SHOPPING_PIN_REP));
        moduleVariant = (i14 & 8) != 0 ? yw0.n.DROPDOWN : moduleVariant;
        viVar = (i14 & 16) != 0 ? null : viVar;
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        Intrinsics.checkNotNullParameter(moduleVariant, "moduleVariant");
        this.f142929a = pin;
        this.f142930b = i13;
        this.f142931c = pinFeatureConfig;
        this.f142932d = moduleVariant;
        this.f142933e = viVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Intrinsics.d(this.f142929a, tVar.f142929a) && this.f142930b == tVar.f142930b && Intrinsics.d(this.f142931c, tVar.f142931c) && this.f142932d == tVar.f142932d && Intrinsics.d(this.f142933e, tVar.f142933e);
    }

    public final int hashCode() {
        int hashCode = (this.f142932d.hashCode() + ((this.f142931c.hashCode() + ep.b.b(this.f142930b, this.f142929a.hashCode() * 31, 31)) * 31)) * 31;
        vi viVar = this.f142933e;
        return hashCode + (viVar == null ? 0 : viVar.hashCode());
    }

    public final String toString() {
        return "CompleteTheLookProductVMState(pin=" + this.f142929a + ", position=" + this.f142930b + ", pinFeatureConfig=" + this.f142931c + ", moduleVariant=" + this.f142932d + ", dynamicStoryShoppingGridDisplay=" + this.f142933e + ")";
    }
}
