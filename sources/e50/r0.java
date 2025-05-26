package e50;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f57411a;

    /* renamed from: b, reason: collision with root package name */
    public final List f57412b;

    public r0(String str, List list) {
        this.f57411a = str;
        this.f57412b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return Intrinsics.d(this.f57411a, r0Var.f57411a) && Intrinsics.d(this.f57412b, r0Var.f57412b);
    }

    public final int hashCode() {
        String str = this.f57411a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.f57412b;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Description(text=");
        sb3.append(this.f57411a);
        sb3.append(", textTags=");
        return a.c.j(sb3, this.f57412b, ")");
    }
}
