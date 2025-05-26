package a7;

import a.cb;
import java.util.Objects;

/* loaded from: classes.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1208a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1209b;

    /* renamed from: c, reason: collision with root package name */
    public final i0 f1210c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1211d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1212e;

    /* renamed from: f, reason: collision with root package name */
    public final long f1213f;

    /* renamed from: g, reason: collision with root package name */
    public final long f1214g;

    /* renamed from: h, reason: collision with root package name */
    public final int f1215h;

    /* renamed from: i, reason: collision with root package name */
    public final int f1216i;

    static {
        cb.s(0, 1, 2, 3, 4);
        d7.n0.Q(5);
        d7.n0.Q(6);
    }

    public u0(Object obj, int i13, i0 i0Var, Object obj2, int i14, long j13, long j14, int i15, int i16) {
        this.f1208a = obj;
        this.f1209b = i13;
        this.f1210c = i0Var;
        this.f1211d = obj2;
        this.f1212e = i14;
        this.f1213f = j13;
        this.f1214g = j14;
        this.f1215h = i15;
        this.f1216i = i16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u0.class != obj.getClass()) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return this.f1209b == u0Var.f1209b && this.f1212e == u0Var.f1212e && this.f1213f == u0Var.f1213f && this.f1214g == u0Var.f1214g && this.f1215h == u0Var.f1215h && this.f1216i == u0Var.f1216i && Objects.equals(this.f1210c, u0Var.f1210c) && Objects.equals(this.f1208a, u0Var.f1208a) && Objects.equals(this.f1211d, u0Var.f1211d);
    }

    public final int hashCode() {
        return Objects.hash(this.f1208a, Integer.valueOf(this.f1209b), this.f1210c, this.f1211d, Integer.valueOf(this.f1212e), Long.valueOf(this.f1213f), Long.valueOf(this.f1214g), Integer.valueOf(this.f1215h), Integer.valueOf(this.f1216i));
    }
}
