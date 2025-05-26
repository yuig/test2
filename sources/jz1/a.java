package jz1;

import ex1.n;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import lh0.g1;
import lh0.z0;
import lh0.z3;
import tu1.u;
import xk2.m;
import xk2.v;
import yn2.c0;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: g, reason: collision with root package name */
    public static final Regex f77768g = new Regex("_([a-zA-z]+)(_\\d+)+");

    /* renamed from: a, reason: collision with root package name */
    public final String f77769a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f77770b;

    /* renamed from: c, reason: collision with root package name */
    public final z0 f77771c;

    /* renamed from: d, reason: collision with root package name */
    public final kz1.a f77772d;

    /* renamed from: e, reason: collision with root package name */
    public b f77773e;

    /* renamed from: f, reason: collision with root package name */
    public final v f77774f;

    public a(String experimentName, z0 experimentsActivator, kz1.a powerscoreCalculator) {
        Intrinsics.checkNotNullParameter(experimentName, "experimentName");
        Intrinsics.checkNotNullParameter(experimentsActivator, "experimentsActivator");
        Intrinsics.checkNotNullParameter(powerscoreCalculator, "powerscoreCalculator");
        this.f77769a = experimentName;
        this.f77770b = false;
        this.f77771c = experimentsActivator;
        this.f77772d = powerscoreCalculator;
        this.f77774f = m.b(new u(this, 2));
    }

    public final void a() {
        ((g1) this.f77771c).c(this.f77769a);
    }

    public final String b(z3 z3Var) {
        String g13 = ((g1) this.f77771c).g(this.f77769a, z3.DO_NOT_ACTIVATE_EXPERIMENT);
        if (g13 == null) {
            return null;
        }
        d(z3Var);
        return g13;
    }

    public final b c(z3 z3Var) {
        b bVar;
        if (this.f77773e != null) {
            d(z3Var);
            return this.f77773e;
        }
        try {
            String b13 = b(z3Var);
            bVar = b13 != null ? e(b13) : b.f77775b;
        } catch (Exception unused) {
            bVar = null;
        }
        this.f77773e = bVar;
        return bVar;
    }

    public final void d(z3 z3Var) {
        if (z3Var == z3.ACTIVATE_EXPERIMENT || (z3Var == null && this.f77770b)) {
            a();
        }
    }

    public final b e(String str) {
        return new b(kotlin.collections.z0.o(c0.p(Regex.c(f77768g, str), new n(this, 16))));
    }
}
