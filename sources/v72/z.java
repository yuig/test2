package v72;

import com.pinterest.api.model.fi0;
import kotlin.jvm.internal.Intrinsics;
import l82.i0;
import ni1.y2;

/* loaded from: classes4.dex */
public final class z implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f124459a;

    /* renamed from: b, reason: collision with root package name */
    public final fi0 f124460b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f124461c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f124462d;

    /* renamed from: e, reason: collision with root package name */
    public final y2 f124463e;

    public z(String pinUid, fi0 fi0Var, boolean z13, boolean z14, y2 pinRepViewModelState) {
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        Intrinsics.checkNotNullParameter(pinRepViewModelState, "pinRepViewModelState");
        this.f124459a = pinUid;
        this.f124460b = fi0Var;
        this.f124461c = z13;
        this.f124462d = z14;
        this.f124463e = pinRepViewModelState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return Intrinsics.d(this.f124459a, zVar.f124459a) && Intrinsics.d(this.f124460b, zVar.f124460b) && this.f124461c == zVar.f124461c && this.f124462d == zVar.f124462d && Intrinsics.d(this.f124463e, zVar.f124463e);
    }

    public final int hashCode() {
        int hashCode = this.f124459a.hashCode() * 31;
        fi0 fi0Var = this.f124460b;
        return this.f124463e.hashCode() + ep.b.e(this.f124462d, ep.b.e(this.f124461c, (hashCode + (fi0Var == null ? 0 : fi0Var.hashCode())) * 31, 31), 31);
    }

    public final String toString() {
        return "SbaPinCollageGridCellVMState(pinUid=" + this.f124459a + ", shuffle=" + this.f124460b + ", renderingEnabled=" + this.f124461c + ", shouldIgnoreVideoPlayback=" + this.f124462d + ", pinRepViewModelState=" + this.f124463e + ")";
    }
}
