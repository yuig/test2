package w21;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r implements v {

    /* renamed from: a, reason: collision with root package name */
    public final int f127785a;

    /* renamed from: b, reason: collision with root package name */
    public final List f127786b;

    /* renamed from: c, reason: collision with root package name */
    public final List f127787c;

    public r(int i13, List options, List chosenOptions) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(chosenOptions, "chosenOptions");
        this.f127785a = i13;
        this.f127786b = options;
        this.f127787c = chosenOptions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f127785a == rVar.f127785a && Intrinsics.d(this.f127786b, rVar.f127786b) && Intrinsics.d(this.f127787c, rVar.f127787c);
    }

    public final int hashCode() {
        return this.f127787c.hashCode() + ep.b.c(this.f127786b, Integer.hashCode(this.f127785a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LoadState(index=");
        sb3.append(this.f127785a);
        sb3.append(", options=");
        sb3.append(this.f127786b);
        sb3.append(", chosenOptions=");
        return a.c.j(sb3, this.f127787c, ")");
    }
}
