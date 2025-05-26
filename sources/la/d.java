package la;

import ja.n;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f82356a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f82357b;

    /* renamed from: c, reason: collision with root package name */
    public final List f82358c;

    /* renamed from: d, reason: collision with root package name */
    public final List f82359d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.ArrayList] */
    public d(String name, List columns, List orders, boolean z13) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(columns, "columns");
        Intrinsics.checkNotNullParameter(orders, "orders");
        this.f82356a = name;
        this.f82357b = z13;
        this.f82358c = columns;
        this.f82359d = orders;
        List list = orders;
        if (list.isEmpty()) {
            int size = columns.size();
            list = new ArrayList(size);
            for (int i13 = 0; i13 < size; i13++) {
                list.add(n.ASC.name());
            }
        }
        this.f82359d = (List) list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f82357b != dVar.f82357b || !Intrinsics.d(this.f82358c, dVar.f82358c) || !Intrinsics.d(this.f82359d, dVar.f82359d)) {
            return false;
        }
        String str = this.f82356a;
        boolean p13 = z.p(str, "index_", false);
        String str2 = dVar.f82356a;
        return p13 ? z.p(str2, "index_", false) : Intrinsics.d(str, str2);
    }

    public final int hashCode() {
        String str = this.f82356a;
        return this.f82359d.hashCode() + ep.b.c(this.f82358c, (((z.p(str, "index_", false) ? -1184239155 : str.hashCode()) * 31) + (this.f82357b ? 1 : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Index{name='");
        sb3.append(this.f82356a);
        sb3.append("', unique=");
        sb3.append(this.f82357b);
        sb3.append(", columns=");
        sb3.append(this.f82358c);
        sb3.append(", orders=");
        return a.c.j(sb3, this.f82359d, "'}");
    }
}
