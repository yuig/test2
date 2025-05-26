package f72;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@no2.g
/* loaded from: classes4.dex */
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* renamed from: a, reason: collision with root package name */
    public final String f61245a;

    /* renamed from: b, reason: collision with root package name */
    public final int f61246b;

    /* renamed from: c, reason: collision with root package name */
    public final int f61247c;

    public f(int i13, String str, int i14, int i15) {
        if (7 != (i13 & 7)) {
            kg.t.b1(i13, 7, d.f61241b);
            throw null;
        }
        this.f61245a = str;
        this.f61246b = i14;
        this.f61247c = i15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.d(this.f61245a, fVar.f61245a) && this.f61246b == fVar.f61246b && this.f61247c == fVar.f61247c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f61247c) + ep.b.b(this.f61246b, this.f61245a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ImageAttributesEntity(url=");
        sb3.append(this.f61245a);
        sb3.append(", width=");
        sb3.append(this.f61246b);
        sb3.append(", height=");
        return a.a.n(sb3, this.f61247c, ")");
    }
}
