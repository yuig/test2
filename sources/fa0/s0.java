package fa0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s0 implements w {

    /* renamed from: a, reason: collision with root package name */
    public final List f61534a;

    /* renamed from: b, reason: collision with root package name */
    public final ra0.c f61535b;

    /* renamed from: c, reason: collision with root package name */
    public final h32.i0 f61536c;

    public s0(List options, ra0.c ids, h32.i0 context) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(ids, "ids");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f61534a = options;
        this.f61535b = ids;
        this.f61536c = context;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return Intrinsics.d(this.f61534a, s0Var.f61534a) && Intrinsics.d(this.f61535b, s0Var.f61535b) && Intrinsics.d(this.f61536c, s0Var.f61536c);
    }

    public final int hashCode() {
        return this.f61536c.hashCode() + ((this.f61535b.hashCode() + (this.f61534a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ShowOptions(options=" + this.f61534a + ", ids=" + this.f61535b + ", context=" + this.f61536c + ")";
    }
}
