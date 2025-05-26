package s80;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r5 implements t5 {

    /* renamed from: a, reason: collision with root package name */
    public final String f111784a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f111785b;

    public r5(String id3, boolean z13) {
        Intrinsics.checkNotNullParameter(id3, "id");
        this.f111784a = id3;
        this.f111785b = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r5)) {
            return false;
        }
        r5 r5Var = (r5) obj;
        String str = r5Var.f111784a;
        int i13 = r72.a2.f106437b;
        return Intrinsics.d(this.f111784a, str) && this.f111785b == r5Var.f111785b;
    }

    public final int hashCode() {
        int i13 = r72.a2.f106437b;
        return Boolean.hashCode(this.f111785b) + (this.f111784a.hashCode() * 31);
    }

    public final String toString() {
        return a.a.r(cb.o("NavigateToEffects(id=", r72.a2.a(this.f111784a), ", fromTextItemClicked="), this.f111785b, ")");
    }
}
