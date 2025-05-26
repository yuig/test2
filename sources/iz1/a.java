package iz1;

import hk1.t;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.z;
import lb0.b;
import lb0.j;
import lb0.m;
import lb0.o;
import lh0.a4;
import lh0.g1;
import lh0.z0;
import lh0.z3;
import yn2.c0;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final Regex f73940e = new Regex("_([a-zA-z]+)(_\\d+)+");

    /* renamed from: a, reason: collision with root package name */
    public final kz1.a f73941a;

    /* renamed from: b, reason: collision with root package name */
    public final z0 f73942b;

    /* renamed from: c, reason: collision with root package name */
    public final o f73943c;

    /* renamed from: d, reason: collision with root package name */
    public Double f73944d;

    public a(kz1.a powerscoreCalculator, z0 experimentsActivator, o preferencesManager) {
        Intrinsics.checkNotNullParameter(powerscoreCalculator, "powerscoreCalculator");
        Intrinsics.checkNotNullParameter(experimentsActivator, "experimentsActivator");
        Intrinsics.checkNotNullParameter(preferencesManager, "preferencesManager");
        this.f73941a = powerscoreCalculator;
        this.f73942b = experimentsActivator;
        this.f73943c = preferencesManager;
    }

    public final double a() {
        Double d2 = this.f73944d;
        if (d2 != null) {
            return d2.doubleValue();
        }
        b bVar = (b) this.f73943c;
        bVar.getClass();
        b.q();
        Object obj = bVar.i().get("PREF_POWER_SCORE");
        Float valueOf = Float.valueOf(obj == j.f82711a ? -1.0f : obj != null ? ((Float) obj).floatValue() : bVar.f82703b.getFloat("PREF_POWER_SCORE", -1.0f));
        if (Intrinsics.c(valueOf, -1.0f)) {
            double a13 = this.f73941a.a();
            m c13 = bVar.c();
            float f13 = (float) a13;
            c13.putFloat("PREF_POWER_SCORE", f13);
            c13.apply();
            valueOf = Float.valueOf(f13);
        }
        this.f73944d = Double.valueOf(valueOf.floatValue());
        return valueOf.floatValue();
    }

    public final boolean b(String experimentName, String keyword, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(experimentName, "experimentName");
        Intrinsics.checkNotNullParameter(keyword, "keyword");
        double a13 = a();
        z3 z3Var = a4.f83297a;
        g1 g1Var = (g1) this.f73942b;
        String g13 = g1Var.g(experimentName, z3Var);
        if (g13 == null) {
            return false;
        }
        if (z13) {
            g1Var.c(experimentName);
        }
        if (z.p(g13, "control", false) || !z.p(g13, "enabled", false)) {
            return false;
        }
        Integer num = (Integer) CollectionsKt.firstOrNull(new jz1.b(kotlin.collections.z0.o(c0.p(Regex.c(f73940e, g13), new t(this, 26)))).a(keyword));
        return num != null ? a13 >= ((double) num.intValue()) : z14;
    }
}
