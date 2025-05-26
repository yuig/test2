package ml0;

import com.pinterest.api.model.e8;
import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c implements j {

    /* renamed from: a, reason: collision with root package name */
    public final e8 f87442a;

    /* renamed from: b, reason: collision with root package name */
    public final f30 f87443b;

    public c(e8 e8Var, f30 f30Var) {
        this.f87442a = e8Var;
        this.f87443b = f30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f87442a, cVar.f87442a) && Intrinsics.d(this.f87443b, cVar.f87443b);
    }

    public final int hashCode() {
        e8 e8Var = this.f87442a;
        int hashCode = (e8Var == null ? 0 : e8Var.hashCode()) * 31;
        f30 f30Var = this.f87443b;
        return hashCode + (f30Var != null ? f30Var.hashCode() : 0);
    }

    public final String toString() {
        return "BoardHeaderImageLoaded(boardHeaderImage=" + this.f87442a + ", headerPin=" + this.f87443b + ")";
    }
}
