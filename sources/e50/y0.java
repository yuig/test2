package e50;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f57459a;

    /* renamed from: b, reason: collision with root package name */
    public final List f57460b;

    public y0(String str, List list) {
        this.f57459a = str;
        this.f57460b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return Intrinsics.d(this.f57459a, y0Var.f57459a) && Intrinsics.d(this.f57460b, y0Var.f57460b);
    }

    public final int hashCode() {
        String str = this.f57459a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.f57460b;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Description(text=");
        sb3.append(this.f57459a);
        sb3.append(", textTags=");
        return a.c.j(sb3, this.f57460b, ")");
    }
}
