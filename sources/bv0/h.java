package bv0;

import com.pinterest.api.model.ba;
import com.pinterest.api.model.v7;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final v7 f23932a;

    /* renamed from: b, reason: collision with root package name */
    public final ba f23933b;

    public /* synthetic */ h(v7 v7Var, int i13) {
        this((i13 & 1) != 0 ? null : v7Var, (ba) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.d(this.f23932a, hVar.f23932a) && Intrinsics.d(this.f23933b, hVar.f23933b);
    }

    public final int hashCode() {
        v7 v7Var = this.f23932a;
        int hashCode = (v7Var == null ? 0 : v7Var.hashCode()) * 31;
        ba baVar = this.f23933b;
        return hashCode + (baVar != null ? baVar.hashCode() : 0);
    }

    public final String toString() {
        return "IdeaPinBoardData(board=" + this.f23932a + ", section=" + this.f23933b + ")";
    }

    public h(v7 v7Var, ba baVar) {
        this.f23932a = v7Var;
        this.f23933b = baVar;
    }
}
