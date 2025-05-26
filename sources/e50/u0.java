package e50;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f57429a;

    /* renamed from: b, reason: collision with root package name */
    public final List f57430b;

    public u0(String str, List list) {
        this.f57429a = str;
        this.f57430b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return Intrinsics.d(this.f57429a, u0Var.f57429a) && Intrinsics.d(this.f57430b, u0Var.f57430b);
    }

    public final int hashCode() {
        String str = this.f57429a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.f57430b;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Title(text=");
        sb3.append(this.f57429a);
        sb3.append(", textTags=");
        return a.c.j(sb3, this.f57430b, ")");
    }
}
