package ads_mobile_sdk;

import java.io.Closeable;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class cs2 implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public ss2 f4018a;

    /* renamed from: b, reason: collision with root package name */
    public final cs2 f4019b;

    /* renamed from: c, reason: collision with root package name */
    public final long f4020c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f4021d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicLong f4022e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicLong f4023f;

    public cs2(il0 cuiName, ss2 traceMetaSet, cs2 cs2Var, long j13, boolean z13) {
        Intrinsics.checkNotNullParameter(cuiName, "cuiName");
        Intrinsics.checkNotNullParameter(traceMetaSet, "traceMetaSet");
        this.f4018a = traceMetaSet;
        this.f4019b = cs2Var;
        this.f4020c = j13;
        this.f4021d = new AtomicBoolean(false);
        this.f4022e = new AtomicLong();
        this.f4023f = new AtomicLong();
        zn2.b.e(j13);
        Intrinsics.checkNotNullParameter(cuiName, "cuiName");
        ok.e0 e0Var = gk0.f5596a;
        gk0.c("Trace " + cuiName.name() + " started.", null);
    }

    public abstract cs2 a(il0 il0Var, List list, boolean z13);

    public void a() {
        if (this.f4021d.getAndSet(true)) {
            ds2.a("This trace " + f().f6981c.name() + " has already finished, can't finish again");
            return;
        }
        jw1 f13 = f();
        zn2.a aVar = zn2.b.f142311b;
        long j13 = this.f4022e.get();
        zn2.d dVar = zn2.d.MILLISECONDS;
        f13.b(dl2.b.Q2(j13, dVar));
        f().a(dl2.b.Q2(this.f4023f.get(), dVar));
        cs2 cs2Var = this.f4019b;
        if (cs2Var != null) {
            cs2Var.f4023f.addAndGet(zn2.b.e(zn2.b.k(f().b(), f().a())));
        }
        h();
        jw1 perTraceMeta = f();
        ss2 unused = this.f4018a;
        Intrinsics.checkNotNullParameter(perTraceMeta, "perTraceMeta");
        Intrinsics.checkNotNullParameter(unused, "unused");
        String str = perTraceMeta.f6988j ? "successfully" : "unsuccessfully";
        ok.e0 e0Var = gk0.f5596a;
        String name = perTraceMeta.f6981c.name();
        long e13 = zn2.b.e(perTraceMeta.c());
        StringBuilder w13 = a.a.w("Trace ", name, " completed ", str, " in ");
        w13.append(e13);
        w13.append("ms.");
        gk0.c(w13.toString(), null);
    }

    public final long b() {
        return this.f4020c;
    }

    public final AtomicBoolean c() {
        return this.f4021d;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        qs2.a(this);
    }

    public final int d() {
        return f().f6979a;
    }

    public final cs2 e() {
        return this.f4019b;
    }

    public abstract jw1 f();

    public final ss2 g() {
        return this.f4018a;
    }

    public abstract void h();

    public final void b(Throwable e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        if (!this.f4021d.get()) {
            f().f6988j = false;
            f().f6989k = e13;
            return;
        }
        ds2.a("This trace " + f().f6981c.name() + " has already finished, can't set exception");
    }

    public /* synthetic */ cs2(il0 il0Var, ss2 ss2Var, cs2 cs2Var, long j13, boolean z13, int i13) {
        this(il0Var, ss2Var, cs2Var, j13, z13);
    }

    public final void a(Throwable e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        if (this.f4021d.get()) {
            ds2.a("This trace " + f().f6981c.name() + " has already finished, can't set causing exception");
            return;
        }
        f().f6988j = false;
        f().f6990l = e13;
    }

    public final void a(ss2 ss2Var) {
        Intrinsics.checkNotNullParameter(ss2Var, "<set-?>");
        this.f4018a = ss2Var;
    }
}
