package la;

import a.cb;
import d7.g;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f82347a;

    /* renamed from: b, reason: collision with root package name */
    public final String f82348b;

    /* renamed from: c, reason: collision with root package name */
    public final String f82349c;

    /* renamed from: d, reason: collision with root package name */
    public final List f82350d;

    /* renamed from: e, reason: collision with root package name */
    public final List f82351e;

    public b(String referenceTable, String onDelete, String onUpdate, List columnNames, List referenceColumnNames) {
        Intrinsics.checkNotNullParameter(referenceTable, "referenceTable");
        Intrinsics.checkNotNullParameter(onDelete, "onDelete");
        Intrinsics.checkNotNullParameter(onUpdate, "onUpdate");
        Intrinsics.checkNotNullParameter(columnNames, "columnNames");
        Intrinsics.checkNotNullParameter(referenceColumnNames, "referenceColumnNames");
        this.f82347a = referenceTable;
        this.f82348b = onDelete;
        this.f82349c = onUpdate;
        this.f82350d = columnNames;
        this.f82351e = referenceColumnNames;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (Intrinsics.d(this.f82347a, bVar.f82347a) && Intrinsics.d(this.f82348b, bVar.f82348b) && Intrinsics.d(this.f82349c, bVar.f82349c) && Intrinsics.d(this.f82350d, bVar.f82350d)) {
            return Intrinsics.d(this.f82351e, bVar.f82351e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f82351e.hashCode() + ep.b.c(this.f82350d, cb.d(this.f82349c, cb.d(this.f82348b, this.f82347a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ForeignKey{referenceTable='");
        sb3.append(this.f82347a);
        sb3.append("', onDelete='");
        sb3.append(this.f82348b);
        sb3.append(" +', onUpdate='");
        sb3.append(this.f82349c);
        sb3.append("', columnNames=");
        sb3.append(this.f82350d);
        sb3.append(", referenceColumnNames=");
        return g.k(sb3, this.f82351e, '}');
    }
}
