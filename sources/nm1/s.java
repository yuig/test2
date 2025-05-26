package nm1;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s implements u {

    /* renamed from: a, reason: collision with root package name */
    public final List f91481a;

    /* renamed from: b, reason: collision with root package name */
    public final List f91482b;

    /* renamed from: c, reason: collision with root package name */
    public final List f91483c;

    /* renamed from: d, reason: collision with root package name */
    public final List f91484d;

    /* renamed from: e, reason: collision with root package name */
    public final List f91485e;

    /* renamed from: f, reason: collision with root package name */
    public final List f91486f;

    public s(ArrayList startActionElements, ArrayList startActionConstraints, ArrayList titleElements, ArrayList titleConstraints, ArrayList endActionElements, ArrayList endActionConstraints) {
        Intrinsics.checkNotNullParameter(startActionElements, "startActionElements");
        Intrinsics.checkNotNullParameter(startActionConstraints, "startActionConstraints");
        Intrinsics.checkNotNullParameter(titleElements, "titleElements");
        Intrinsics.checkNotNullParameter(titleConstraints, "titleConstraints");
        Intrinsics.checkNotNullParameter(endActionElements, "endActionElements");
        Intrinsics.checkNotNullParameter(endActionConstraints, "endActionConstraints");
        this.f91481a = startActionElements;
        this.f91482b = startActionConstraints;
        this.f91483c = titleElements;
        this.f91484d = titleConstraints;
        this.f91485e = endActionElements;
        this.f91486f = endActionConstraints;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Intrinsics.d(this.f91481a, sVar.f91481a) && Intrinsics.d(this.f91482b, sVar.f91482b) && Intrinsics.d(this.f91483c, sVar.f91483c) && Intrinsics.d(this.f91484d, sVar.f91484d) && Intrinsics.d(this.f91485e, sVar.f91485e) && Intrinsics.d(this.f91486f, sVar.f91486f);
    }

    public final int hashCode() {
        return this.f91486f.hashCode() + ep.b.c(this.f91485e, ep.b.c(this.f91484d, ep.b.c(this.f91483c, ep.b.c(this.f91482b, this.f91481a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("TitleAndActions(startActionElements=");
        sb3.append(this.f91481a);
        sb3.append(", startActionConstraints=");
        sb3.append(this.f91482b);
        sb3.append(", titleElements=");
        sb3.append(this.f91483c);
        sb3.append(", titleConstraints=");
        sb3.append(this.f91484d);
        sb3.append(", endActionElements=");
        sb3.append(this.f91485e);
        sb3.append(", endActionConstraints=");
        return a.c.j(sb3, this.f91486f, ")");
    }
}
