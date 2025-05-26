package n7;

import a7.b1;
import java.util.Objects;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f89378a;

    /* renamed from: b, reason: collision with root package name */
    public final b1 f89379b;

    /* renamed from: c, reason: collision with root package name */
    public final int f89380c;

    /* renamed from: d, reason: collision with root package name */
    public final g8.e0 f89381d;

    /* renamed from: e, reason: collision with root package name */
    public final long f89382e;

    /* renamed from: f, reason: collision with root package name */
    public final b1 f89383f;

    /* renamed from: g, reason: collision with root package name */
    public final int f89384g;

    /* renamed from: h, reason: collision with root package name */
    public final g8.e0 f89385h;

    /* renamed from: i, reason: collision with root package name */
    public final long f89386i;

    /* renamed from: j, reason: collision with root package name */
    public final long f89387j;

    public b(long j13, b1 b1Var, int i13, g8.e0 e0Var, long j14, b1 b1Var2, int i14, g8.e0 e0Var2, long j15, long j16) {
        this.f89378a = j13;
        this.f89379b = b1Var;
        this.f89380c = i13;
        this.f89381d = e0Var;
        this.f89382e = j14;
        this.f89383f = b1Var2;
        this.f89384g = i14;
        this.f89385h = e0Var2;
        this.f89386i = j15;
        this.f89387j = j16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f89378a == bVar.f89378a && this.f89380c == bVar.f89380c && this.f89382e == bVar.f89382e && this.f89384g == bVar.f89384g && this.f89386i == bVar.f89386i && this.f89387j == bVar.f89387j && Objects.equals(this.f89379b, bVar.f89379b) && Objects.equals(this.f89381d, bVar.f89381d) && Objects.equals(this.f89383f, bVar.f89383f) && Objects.equals(this.f89385h, bVar.f89385h);
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f89378a), this.f89379b, Integer.valueOf(this.f89380c), this.f89381d, Long.valueOf(this.f89382e), this.f89383f, Integer.valueOf(this.f89384g), this.f89385h, Long.valueOf(this.f89386i), Long.valueOf(this.f89387j));
    }
}
