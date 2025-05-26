package g72;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@no2.g
/* loaded from: classes4.dex */
public final class g2 {

    @NotNull
    public static final f2 Companion = new f2();

    /* renamed from: e, reason: collision with root package name */
    public static final no2.b[] f63992e = {null, null, new qo2.i0(qo2.j1.f104576a, w1.f64133a), null};

    /* renamed from: a, reason: collision with root package name */
    public final String f63993a;

    /* renamed from: b, reason: collision with root package name */
    public final double f63994b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f63995c;

    /* renamed from: d, reason: collision with root package name */
    public final String f63996d;

    public g2(int i13, String str, double d2, Map map, String str2) {
        if (15 != (i13 & 15)) {
            kg.t.b1(i13, 15, e2.f63970b);
            throw null;
        }
        this.f63993a = str;
        this.f63994b = d2;
        this.f63995c = map;
        this.f63996d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g2)) {
            return false;
        }
        g2 g2Var = (g2) obj;
        return Intrinsics.d(this.f63993a, g2Var.f63993a) && Double.compare(this.f63994b, g2Var.f63994b) == 0 && Intrinsics.d(this.f63995c, g2Var.f63995c) && Intrinsics.d(this.f63996d, g2Var.f63996d);
    }

    public final int hashCode() {
        return this.f63996d.hashCode() + a.c.e(this.f63995c, a.c.a(this.f63994b, this.f63993a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "KeyframeEntity(id=" + this.f63993a + ", duration=" + this.f63994b + ", itemStates=" + this.f63995c + ", timingFunction=" + this.f63996d + ")";
    }
}
