package dx0;

import com.pinterest.api.model.f30;
import com.pinterest.api.model.vi;
import kh2.g0;
import kotlin.jvm.internal.Intrinsics;
import l82.i0;
import ue1.z;

/* loaded from: classes5.dex */
public final class a implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f56413a;

    /* renamed from: b, reason: collision with root package name */
    public final z f56414b;

    /* renamed from: c, reason: collision with root package name */
    public final int f56415c;

    /* renamed from: d, reason: collision with root package name */
    public final bx0.z f56416d;

    /* renamed from: e, reason: collision with root package name */
    public final wa2.m f56417e;

    /* renamed from: f, reason: collision with root package name */
    public final vi f56418f;

    public a(f30 pin, z zVar, int i13, bx0.z moduleVariant, vi viVar, int i14) {
        zVar = (i14 & 2) != 0 ? null : zVar;
        i13 = (i14 & 4) != 0 ? 0 : i13;
        wa2.m pinFeatureConfig = g0.t();
        viVar = (i14 & 32) != 0 ? null : viVar;
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(moduleVariant, "moduleVariant");
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        this.f56413a = pin;
        this.f56414b = zVar;
        this.f56415c = i13;
        this.f56416d = moduleVariant;
        this.f56417e = pinFeatureConfig;
        this.f56418f = viVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f56413a, aVar.f56413a) && Intrinsics.d(this.f56414b, aVar.f56414b) && this.f56415c == aVar.f56415c && this.f56416d == aVar.f56416d && Intrinsics.d(this.f56417e, aVar.f56417e) && Intrinsics.d(this.f56418f, aVar.f56418f);
    }

    public final int hashCode() {
        int hashCode = this.f56413a.hashCode() * 31;
        z zVar = this.f56414b;
        int hashCode2 = (this.f56417e.hashCode() + ((this.f56416d.hashCode() + ep.b.b(this.f56415c, (hashCode + (zVar == null ? 0 : zVar.hashCode())) * 31, 31)) * 31)) * 31;
        vi viVar = this.f56418f;
        return hashCode2 + (viVar != null ? viVar.hashCode() : 0);
    }

    public final String toString() {
        return "CompleteTheLookProductVMState(pin=" + this.f56413a + ", storyEndCellActionModel=" + this.f56414b + ", position=" + this.f56415c + ", moduleVariant=" + this.f56416d + ", pinFeatureConfig=" + this.f56417e + ", dynamicStoryShoppingGridDisplay=" + this.f56418f + ")";
    }
}
