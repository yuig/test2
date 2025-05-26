package ey;

import android.os.Build;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Util;

/* loaded from: classes.dex */
public final class d5 extends hb0.d {

    /* renamed from: d, reason: collision with root package name */
    public final List f60473d;

    /* renamed from: e, reason: collision with root package name */
    public final k3 f60474e;

    /* renamed from: f, reason: collision with root package name */
    public final rd.j f60475f;

    /* renamed from: g, reason: collision with root package name */
    public final c4 f60476g;

    /* renamed from: h, reason: collision with root package name */
    public final String f60477h;

    public d5(List stopwatches, k3 perfLogger) {
        Intrinsics.checkNotNullParameter(stopwatches, "stopwatches");
        Intrinsics.checkNotNullParameter(perfLogger, "perfLogger");
        this.f60473d = stopwatches;
        this.f60474e = perfLogger;
        this.f60475f = perfLogger.f60521b;
        this.f60476g = perfLogger.f60522c;
        this.f60477h = perfLogger.f60523d;
    }

    @Override // hb0.c
    public final void c() {
        List<o1> list = this.f60473d;
        ArrayList spans = new ArrayList(list.size());
        for (o1 o1Var : list) {
            if (o1Var.f60549c) {
                o1Var.j("app.version", this.f60477h);
                boolean z13 = ff0.j.f62103a;
                if (z13) {
                    o1Var.k("app.type", (short) h32.m.ANDROID_MOBILE.getValue());
                } else {
                    o1Var.k("app.type", (short) hf0.b.a().getValue());
                }
                String str = this.f60474e.f60525f;
                if (str != null && str.length() > 0) {
                    o1Var.i(Long.parseLong(str), "user.id");
                }
                j3 j3Var = j3.f60510a;
                o1Var.k("device.type", (short) j3.e().getValue());
                o1Var.k("device.os.type", (short) h32.t1.ANDROID.getValue());
                if (z13) {
                    o1Var.j("device.version", "Samsung S6");
                    o1Var.j("device.os.version", "7.0");
                    o1Var.k("net.type", (short) s92.f.CELLULAR.getValue());
                    o1Var.j("net.cell.carrier", "TMobile");
                } else {
                    String MODEL = Build.MODEL;
                    Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                    o1Var.j("device.version", MODEL);
                    String RELEASE = Build.VERSION.RELEASE;
                    Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
                    o1Var.j("device.os.version", RELEASE);
                    qb0.e eVar = qb0.d.f103396a;
                    String b13 = eVar.b();
                    Intrinsics.checkNotNullExpressionValue(b13, "getCarrierName(...)");
                    this.f60476g.f60459a.getClass();
                    String str2 = eVar.f103399c;
                    Intrinsics.checkNotNullExpressionValue(str2, "getNetworkClass(...)");
                    s92.f d2 = j3.d(b13, str2);
                    o1Var.k("net.type", (short) d2.getValue());
                    if (d2 == s92.f.CELLULAR) {
                        o1Var.j("net.cell.carrier", b13);
                    }
                }
                o1Var.j("lc", "pwt");
            }
            ly1.f a13 = o1Var.a();
            re2.j source = o1Var.b();
            Object[] objArr = {o1Var.f60548b};
            vb0.j.f125466a.N(source.f107710b, "the span name should not be null, stop watch id [%s]", objArr);
            Intrinsics.checkNotNullParameter(source, "source");
            Long valueOf = Long.valueOf((a13.f85169h - a13.f85164c) * 1000);
            Long valueOf2 = Long.valueOf(a13.f85168g * 1000);
            Boolean bool = source.f107715g;
            Long l13 = source.f107718j;
            Long l14 = source.f107709a;
            String str3 = source.f107710b;
            Long l15 = source.f107711c;
            re2.j span = new re2.j(l14, str3, l15, source.f107712d, source.f107713e, source.f107714f, bool, valueOf2, valueOf, l13);
            if (l14 != null) {
                Util.y(l14.longValue());
            }
            if (l15 != null) {
                Util.y(l15.longValue());
            }
            spans.add(span);
            j3 j3Var2 = j3.f60510a;
            Intrinsics.checkNotNullParameter(span, "span");
            ArrayDeque arrayDeque = s1.f60573a;
            Intrinsics.checkNotNullParameter(span, "span");
        }
        if (ff0.j.b()) {
            m60.u.f85943a.d(new i2.a2(spans, 10));
        }
        if (ff0.j.f62103a) {
            return;
        }
        rd.j jVar = this.f60475f;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(spans, "spans");
        ((vy.m) ((wk2.a) jVar.f107506b).get()).j(spans);
    }

    @Override // hb0.d
    public final void e() {
        List<o1> list = this.f60473d;
        for (o1 stopwatch : list) {
            stopwatch.d();
            k3 k3Var = this.f60474e;
            k3Var.getClass();
            Intrinsics.checkNotNullParameter(stopwatch, "stopwatch");
            ArrayDeque arrayDeque = k3Var.f60527h;
            if (arrayDeque.size() < 50) {
                arrayDeque.add(stopwatch);
            }
        }
        list.clear();
    }
}
