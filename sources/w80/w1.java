package w80;

/* loaded from: classes5.dex */
public final class w1 implements u50.o {

    /* renamed from: c, reason: collision with root package name */
    public static final w1 f128400c = new w1(true, true);

    /* renamed from: d, reason: collision with root package name */
    public static final w1 f128401d = new w1(true, false);

    /* renamed from: e, reason: collision with root package name */
    public static final w1 f128402e = new w1(false, false);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f128403a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f128404b;

    public w1(boolean z13, boolean z14) {
        this.f128403a = z13;
        this.f128404b = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w1)) {
            return false;
        }
        w1 w1Var = (w1) obj;
        return this.f128403a == w1Var.f128403a && this.f128404b == w1Var.f128404b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f128404b) + (Boolean.hashCode(this.f128403a) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("TopBarActionState(visible=");
        sb3.append(this.f128403a);
        sb3.append(", enabled=");
        return a.a.r(sb3, this.f128404b, ")");
    }
}
