package fz0;

import com.pinterest.api.model.ia0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final ia0 f63115a;

    /* renamed from: b, reason: collision with root package name */
    public final int f63116b;

    /* renamed from: c, reason: collision with root package name */
    public final int f63117c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f63118d;

    public b(ia0 ia0Var, int i13, int i14, boolean z13, int i15) {
        ia0Var = (i15 & 1) != 0 ? null : ia0Var;
        i13 = (i15 & 2) != 0 ? 0 : i13;
        i14 = (i15 & 4) != 0 ? -1 : i14;
        z13 = (i15 & 8) != 0 ? false : z13;
        this.f63115a = ia0Var;
        this.f63116b = i13;
        this.f63117c = i14;
        this.f63118d = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f63115a, bVar.f63115a) && this.f63116b == bVar.f63116b && this.f63117c == bVar.f63117c && this.f63118d == bVar.f63118d;
    }

    public final int hashCode() {
        ia0 ia0Var = this.f63115a;
        return Boolean.hashCode(this.f63118d) + ep.b.b(this.f63117c, ep.b.b(this.f63116b, (ia0Var == null ? 0 : ia0Var.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        return "QuizDisplayState(quiz=" + this.f63115a + ", currentPage=" + this.f63116b + ", currentSelection=" + this.f63117c + ", showNux=" + this.f63118d + ")";
    }
}
