package fx;

import com.pinterest.api.model.h2;
import kotlin.jvm.internal.Intrinsics;
import l82.i0;

/* loaded from: classes3.dex */
public final class c implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final h2 f63071a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f63072b;

    public /* synthetic */ c(h2 h2Var, int i13) {
        this((i13 & 1) != 0 ? null : h2Var, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f63071a, cVar.f63071a) && this.f63072b == cVar.f63072b;
    }

    public final int hashCode() {
        h2 h2Var = this.f63071a;
        return Boolean.hashCode(this.f63072b) + ((h2Var == null ? 0 : h2Var.hashCode()) * 31);
    }

    public final String toString() {
        return "AdsStlCategoryVMState(model=" + this.f63071a + ", isSelected=" + this.f63072b + ")";
    }

    public c(h2 h2Var, boolean z13) {
        this.f63071a = h2Var;
        this.f63072b = z13;
    }
}
