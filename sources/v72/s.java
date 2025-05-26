package v72;

import com.pinterest.api.model.fi0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class s implements w {

    /* renamed from: a, reason: collision with root package name */
    public final String f124450a;

    /* renamed from: b, reason: collision with root package name */
    public final fi0 f124451b;

    public s(String pinUid, fi0 fi0Var) {
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        this.f124450a = pinUid;
        this.f124451b = fi0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Intrinsics.d(this.f124450a, sVar.f124450a) && Intrinsics.d(this.f124451b, sVar.f124451b);
    }

    public final int hashCode() {
        int hashCode = this.f124450a.hashCode() * 31;
        fi0 fi0Var = this.f124451b;
        return hashCode + (fi0Var == null ? 0 : fi0Var.hashCode());
    }

    public final String toString() {
        return "LoadShuffleData(pinUid=" + this.f124450a + ", shuffle=" + this.f124451b + ")";
    }
}
