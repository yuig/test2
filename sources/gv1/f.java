package gv1;

import java.time.Clock;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import kotlin.Pair;
import kotlin.collections.f0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lh0.g1;
import lh0.y0;
import lh0.z0;
import lh0.z3;
import vy.m;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: e, reason: collision with root package name */
    public static f f66167e;

    /* renamed from: f, reason: collision with root package name */
    public static Function0 f66168f = e.f66166i;

    /* renamed from: a, reason: collision with root package name */
    public final z0 f66169a;

    /* renamed from: b, reason: collision with root package name */
    public final m f66170b;

    /* renamed from: c, reason: collision with root package name */
    public final b60.b f66171c;

    /* renamed from: d, reason: collision with root package name */
    public final Clock f66172d;

    public f(z0 experimentsActivator, m analyticsApi, b60.b activeUserManager) {
        Intrinsics.checkNotNullParameter(experimentsActivator, "experimentsActivator");
        Intrinsics.checkNotNullParameter(analyticsApi, "analyticsApi");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        this.f66169a = experimentsActivator;
        this.f66170b = analyticsApi;
        this.f66171c = activeUserManager;
        Clock systemUTC = Clock.systemUTC();
        Intrinsics.checkNotNullExpressionValue(systemUTC, "systemUTC(...)");
        this.f66172d = systemUTC;
        f66167e = this;
    }

    public final Pair a(String shipDateStr, String source) {
        boolean z13;
        boolean z14;
        String str;
        CharSequence charSequence;
        CharSequence charSequence2;
        String str2;
        Intrinsics.checkNotNullParameter(shipDateStr, "shipDateStr");
        Intrinsics.checkNotNullParameter(source, "source");
        LocalDate parse = LocalDate.parse(shipDateStr, DateTimeFormatter.ISO_DATE);
        int year = parse.getYear();
        int monthValue = parse.getMonthValue();
        String str3 = monthValue < 7 ? "h1" : "h2";
        LocalDate now = LocalDate.now(this.f66172d);
        int monthValue2 = now.getMonthValue();
        int year2 = now.getYear();
        int i13 = year2 - 1;
        String experiment = a.a.d("notifications_holdout_", i13);
        String experiment2 = a.a.d("notifications_holdout_", year2);
        b60.b bVar = this.f66171c;
        m mVar = this.f66170b;
        if (year < i13 || ((year == i13 && monthValue2 >= 2) || (year == i13 && monthValue <= 6))) {
            c0.d.i2(mVar, dl2.b.g1(((b60.d) bVar).f()), new a(source));
            return new Pair(Boolean.FALSE, "");
        }
        g1 g1Var = (g1) this.f66169a;
        g1Var.getClass();
        Intrinsics.checkNotNullParameter(experiment2, "experiment");
        y0 y0Var = z0.f83518a;
        y0Var.getClass();
        z3 z3Var = y0.f83513c;
        String g13 = g1Var.g(experiment2, z3Var);
        String str4 = g13 == null ? "" : g13;
        g1Var.getClass();
        Intrinsics.checkNotNullParameter(experiment, "experiment");
        y0Var.getClass();
        String g14 = g1Var.g(experiment, z3Var);
        if (g14 == null) {
            g14 = "";
        }
        boolean z15 = 1 <= monthValue2 && monthValue2 < 7;
        boolean z16 = 7 <= monthValue2 && monthValue2 < 13;
        if (monthValue2 == 1 || monthValue2 == 7) {
            z13 = z16;
            z14 = true;
        } else {
            z13 = z16;
            z14 = false;
        }
        if (f0.j("prod_experiment", "").contains(str4)) {
            str = str3;
        } else {
            str = str3;
            c0.d.i2(mVar, dl2.b.g1(((b60.d) bVar).f()), new a("in_notifications_holdout_group", source, experiment2, str4));
        }
        if (!f0.j("prod_experiment", "").contains(g14)) {
            c0.d.i2(mVar, dl2.b.g1(((b60.d) bVar).f()), new a("in_notifications_holdout_group", source, experiment, g14));
        }
        if (z14) {
            if (monthValue2 == 1) {
                charSequence2 = "h1";
                str2 = str;
                if (year == i13) {
                    charSequence = "h2";
                    if (Intrinsics.d(str2, charSequence)) {
                        return new Pair(Boolean.valueOf(Intrinsics.d("holdout_".concat(str2), g14)), g14);
                    }
                } else {
                    charSequence = "h2";
                }
                if (year == year2 && monthValue == 1 && f0.j("holdout_h2", "production_h2").contains(g14)) {
                    return new Pair(Boolean.TRUE, g14);
                }
            } else if (monthValue2 == 7) {
                charSequence2 = "h1";
                str2 = str;
                if (year == year2 && Intrinsics.d(str2, charSequence2)) {
                    return new Pair(Boolean.valueOf(Intrinsics.d("holdout_".concat(str2), str4)), str4);
                }
                if (year == year2 && monthValue == 7 && f0.j("holdout_h1", "production_h1").contains(str4)) {
                    return new Pair(Boolean.TRUE, str4);
                }
                charSequence = "h2";
            }
            return ((z15 || !StringsKt.E(str4, charSequence2, false)) && !(z13 && StringsKt.E(str4, charSequence, false))) ? new Pair(Boolean.FALSE, str4) : new Pair(Boolean.valueOf(Intrinsics.d("holdout_".concat(str2), str4)), str4);
        }
        charSequence = "h2";
        charSequence2 = "h1";
        str2 = str;
        if (z15) {
        }
    }
}
