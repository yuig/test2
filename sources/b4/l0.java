package b4;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final g f21603a;

    /* renamed from: b, reason: collision with root package name */
    public final q0 f21604b;

    /* renamed from: c, reason: collision with root package name */
    public final List f21605c;

    /* renamed from: d, reason: collision with root package name */
    public final int f21606d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f21607e;

    /* renamed from: f, reason: collision with root package name */
    public final int f21608f;

    /* renamed from: g, reason: collision with root package name */
    public final n4.b f21609g;

    /* renamed from: h, reason: collision with root package name */
    public final n4.k f21610h;

    /* renamed from: i, reason: collision with root package name */
    public final g4.d f21611i;

    /* renamed from: j, reason: collision with root package name */
    public final long f21612j;

    public l0(g gVar, q0 q0Var, List list, int i13, boolean z13, int i14, n4.b bVar, n4.k kVar, g4.d dVar, long j13) {
        this.f21603a = gVar;
        this.f21604b = q0Var;
        this.f21605c = list;
        this.f21606d = i13;
        this.f21607e = z13;
        this.f21608f = i14;
        this.f21609g = bVar;
        this.f21610h = kVar;
        this.f21611i = dVar;
        this.f21612j = j13;
    }

    public final n4.b a() {
        return this.f21609g;
    }

    public final q0 b() {
        return this.f21604b;
    }

    public final g c() {
        return this.f21603a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return Intrinsics.d(this.f21603a, l0Var.f21603a) && Intrinsics.d(this.f21604b, l0Var.f21604b) && Intrinsics.d(this.f21605c, l0Var.f21605c) && this.f21606d == l0Var.f21606d && this.f21607e == l0Var.f21607e && kh2.s0.B(this.f21608f, l0Var.f21608f) && Intrinsics.d(this.f21609g, l0Var.f21609g) && this.f21610h == l0Var.f21610h && Intrinsics.d(this.f21611i, l0Var.f21611i) && n4.a.b(this.f21612j, l0Var.f21612j);
    }

    public final int hashCode() {
        return Long.hashCode(this.f21612j) + ((this.f21611i.hashCode() + ((this.f21610h.hashCode() + ((this.f21609g.hashCode() + ep.b.b(this.f21608f, ep.b.e(this.f21607e, (ep.b.c(this.f21605c, a.c.c(this.f21604b, this.f21603a.hashCode() * 31, 31), 31) + this.f21606d) * 31, 31), 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TextLayoutInput(text=" + ((Object) this.f21603a) + ", style=" + this.f21604b + ", placeholders=" + this.f21605c + ", maxLines=" + this.f21606d + ", softWrap=" + this.f21607e + ", overflow=" + ((Object) kh2.s0.Z0(this.f21608f)) + ", density=" + this.f21609g + ", layoutDirection=" + this.f21610h + ", fontFamilyResolver=" + this.f21611i + ", constraints=" + ((Object) n4.a.k(this.f21612j)) + ')';
    }
}
