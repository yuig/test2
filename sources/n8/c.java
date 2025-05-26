package n8;

import a7.o1;
import android.view.Surface;
import com.google.android.gms.internal.measurement.q4;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final x f89748a;

    /* renamed from: b, reason: collision with root package name */
    public final d7.e f89749b;

    /* renamed from: c, reason: collision with root package name */
    public final c0 f89750c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque f89751d;

    /* renamed from: e, reason: collision with root package name */
    public Surface f89752e;

    /* renamed from: f, reason: collision with root package name */
    public androidx.media3.common.b f89753f;

    /* renamed from: g, reason: collision with root package name */
    public long f89754g;

    /* renamed from: h, reason: collision with root package name */
    public long f89755h;

    /* renamed from: i, reason: collision with root package name */
    public j0 f89756i;

    /* renamed from: j, reason: collision with root package name */
    public Executor f89757j;

    /* renamed from: k, reason: collision with root package name */
    public v f89758k;

    public c(x xVar, d7.e eVar) {
        this.f89748a = xVar;
        xVar.f89915l = eVar;
        this.f89749b = eVar;
        this.f89750c = new c0(new q4(this, 0), xVar);
        this.f89751d = new ArrayDeque();
        this.f89753f = new androidx.media3.common.b(new a7.q());
        this.f89754g = -9223372036854775807L;
        this.f89756i = j0.Ko;
        this.f89757j = new u5.j(1);
        this.f89758k = new a();
    }

    public final void a() {
        x xVar = this.f89748a;
        if (xVar.f89908e == 0) {
            xVar.f89908e = 1;
        }
    }

    public final boolean b() {
        c0 c0Var = this.f89750c;
        long j13 = c0Var.f89767i;
        return j13 != -9223372036854775807L && c0Var.f89766h == j13;
    }

    public final void c(androidx.media3.common.b bVar, List list) {
        bf.b.t(list.isEmpty());
        androidx.media3.common.b bVar2 = this.f89753f;
        int i13 = bVar2.f18772v;
        int i14 = bVar.f18772v;
        int i15 = bVar.f18773w;
        if (i14 != i13 || i15 != bVar2.f18773w) {
            c0 c0Var = this.f89750c;
            long j13 = c0Var.f89765g;
            c0Var.f89762d.a(j13 == -9223372036854775807L ? 0L : j13 + 1, new o1(i14, i15));
        }
        float f13 = this.f89753f.f18774x;
        float f14 = bVar.f18774x;
        if (f14 != f13) {
            this.f89748a.g(f14);
        }
        this.f89753f = bVar;
    }

    public final void d() {
        this.f89748a.e();
    }

    public final void e() {
        this.f89748a.f();
    }

    public final void f(int i13) {
        a0 a0Var = this.f89748a.f89905b;
        if (a0Var.f89738j == i13) {
            return;
        }
        a0Var.f89738j = i13;
        a0Var.d(true);
    }

    public final void g(Surface surface, d7.f0 f0Var) {
        this.f89752e = surface;
        this.f89748a.h(surface);
    }

    public final void h(float f13) {
        this.f89748a.i(f13);
    }

    public final void i(long j13, long j14) {
        if (j13 != this.f89754g) {
            c0 c0Var = this.f89750c;
            long j15 = c0Var.f89765g;
            c0Var.f89763e.a(j15 == -9223372036854775807L ? 0L : j15 + 1, Long.valueOf(j13));
            this.f89754g = j13;
        }
        this.f89755h = j14;
    }

    public final void j() {
        c0 c0Var = this.f89750c;
        c0Var.f89767i = c0Var.f89765g;
    }
}
