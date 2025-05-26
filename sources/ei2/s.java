package ei2;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final oi2.b f59032a;

    /* renamed from: b, reason: collision with root package name */
    public final List f59033b;

    public s(q span, ArrayList children) {
        Intrinsics.checkNotNullParameter(span, "span");
        Intrinsics.checkNotNullParameter(children, "children");
        this.f59032a = span;
        this.f59033b = children;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Intrinsics.d(this.f59032a, sVar.f59032a) && Intrinsics.d(this.f59033b, sVar.f59033b);
    }

    public final int hashCode() {
        return this.f59033b.hashCode() + (this.f59032a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SpanNode(span=");
        sb3.append(this.f59032a);
        sb3.append(", children=");
        return d7.g.k(sb3, this.f59033b, ')');
    }
}
