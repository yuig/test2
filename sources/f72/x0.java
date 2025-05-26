package f72;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@no2.g
/* loaded from: classes4.dex */
public final class x0 {

    @NotNull
    public static final w0 Companion = new w0();

    /* renamed from: e, reason: collision with root package name */
    public static final no2.b[] f61408e = {null, new qo2.d(y.f61413a, 0), new qo2.d(z0.f61416a, 0), null};

    /* renamed from: a, reason: collision with root package name */
    public final String f61409a;

    /* renamed from: b, reason: collision with root package name */
    public final List f61410b;

    /* renamed from: c, reason: collision with root package name */
    public final List f61411c;

    /* renamed from: d, reason: collision with root package name */
    public final String f61412d;

    public x0(int i13, String str, List list, List list2, String str2) {
        if (15 != (i13 & 15)) {
            kg.t.b1(i13, 15, v0.f61376b);
            throw null;
        }
        this.f61409a = str;
        this.f61410b = list;
        this.f61411c = list2;
        this.f61412d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return Intrinsics.d(this.f61409a, x0Var.f61409a) && Intrinsics.d(this.f61410b, x0Var.f61410b) && Intrinsics.d(this.f61411c, x0Var.f61411c) && Intrinsics.d(this.f61412d, x0Var.f61412d);
    }

    public final int hashCode() {
        return this.f61412d.hashCode() + ep.b.c(this.f61411c, ep.b.c(this.f61410b, this.f61409a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ShuffleRenderResourceEntity(id=");
        sb3.append(this.f61409a);
        sb3.append(", fonts=");
        sb3.append(this.f61410b);
        sb3.append(", static_assets=");
        sb3.append(this.f61411c);
        sb3.append(", type=");
        return a.a.p(sb3, this.f61412d, ")");
    }
}
