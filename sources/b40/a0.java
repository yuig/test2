package b40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a0 implements d40.l, d40.h {

    /* renamed from: a, reason: collision with root package name */
    public final String f21683a;

    /* renamed from: b, reason: collision with root package name */
    public final List f21684b;

    /* renamed from: c, reason: collision with root package name */
    public final String f21685c;

    /* renamed from: d, reason: collision with root package name */
    public final String f21686d;

    public a0(String __typename, String str, String str2, List list) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f21683a = __typename;
        this.f21684b = list;
        this.f21685c = str;
        this.f21686d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return Intrinsics.d(this.f21683a, a0Var.f21683a) && Intrinsics.d(this.f21684b, a0Var.f21684b) && Intrinsics.d(this.f21685c, a0Var.f21685c) && Intrinsics.d(this.f21686d, a0Var.f21686d);
    }

    public final int hashCode() {
        int hashCode = this.f21683a.hashCode() * 31;
        List list = this.f21684b;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.f21685c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f21686d;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("TextMapping(__typename=");
        sb3.append(this.f21683a);
        sb3.append(", text=");
        sb3.append(this.f21684b);
        sb3.append(", url=");
        sb3.append(this.f21685c);
        sb3.append(", key=");
        return a.a.p(sb3, this.f21686d, ")");
    }
}
