package oi;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.r8;

/* loaded from: classes3.dex */
public final /* synthetic */ class t4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f95167a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k5 f95168b;

    public /* synthetic */ t4(k5 k5Var, int i13) {
        this.f95167a = i13;
        this.f95168b = k5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k5 k5Var = this.f95168b;
        switch (this.f95167a) {
            case 0:
                k5Var.S();
                break;
            case 1:
                k5Var.p();
                if (k5Var.n().f94784s.g()) {
                    k5Var.zzj().f95275m.c("Deferred Deep Link already retrieved. Not fetching again.");
                    break;
                } else {
                    long a13 = k5Var.n().f94785t.a();
                    k5Var.n().f94785t.b(1 + a13);
                    if (a13 >= 5) {
                        k5Var.zzj().f95271i.c("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                        k5Var.n().f94784s.f(true);
                        break;
                    } else {
                        r8.a();
                        if (k5Var.l().x(null, s.K0)) {
                            if (k5Var.f94919p == null) {
                                k5Var.f94919p = new r5(k5Var, (u4) k5Var.f24333a, 0);
                            }
                            k5Var.f94919p.b(0L);
                            break;
                        } else {
                            ((u4) k5Var.f24333a).g();
                            break;
                        }
                    }
                }
            case 2:
                v4 v4Var = k5Var.f94917n;
                u4 u4Var = v4Var.f95230a;
                o4 o4Var = u4Var.f95206j;
                u4.d(o4Var);
                o4Var.p();
                if (v4Var.c()) {
                    boolean d2 = v4Var.d();
                    k5 k5Var2 = u4Var.f95212p;
                    g4 g4Var = u4Var.f95204h;
                    if (d2) {
                        u4.c(g4Var);
                        g4Var.f94787v.m(null);
                        Bundle bundle = new Bundle();
                        bundle.putString("source", "(not set)");
                        bundle.putString("medium", "(not set)");
                        bundle.putString("_cis", "intent");
                        bundle.putLong("_cc", 1L);
                        u4.b(k5Var2);
                        k5Var2.W("auto", "_cmpx", bundle);
                    } else {
                        u4.c(g4Var);
                        e2.g0 g0Var = g4Var.f94787v;
                        String l13 = g0Var.l();
                        if (TextUtils.isEmpty(l13)) {
                            y3 y3Var = u4Var.f95205i;
                            u4.d(y3Var);
                            y3Var.f95269g.c("Cache still valid but referrer not found");
                        } else {
                            long a14 = ((g4Var.f94788w.a() / 3600000) - 1) * 3600000;
                            Uri parse = Uri.parse(l13);
                            Bundle bundle2 = new Bundle();
                            Pair pair = new Pair(parse.getPath(), bundle2);
                            for (String str : parse.getQueryParameterNames()) {
                                bundle2.putString(str, parse.getQueryParameter(str));
                            }
                            ((Bundle) pair.second).putLong("_cc", a14);
                            Object obj = pair.first;
                            String str2 = obj == null ? "app" : (String) obj;
                            u4.b(k5Var2);
                            k5Var2.W(str2, "_cmp", (Bundle) pair.second);
                        }
                        g0Var.m(null);
                    }
                    u4.c(g4Var);
                    g4Var.f94788w.b(0L);
                    break;
                }
                break;
            default:
                k5Var.S();
                break;
        }
    }
}
