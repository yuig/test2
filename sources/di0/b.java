package di0;

import android.content.Context;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.wy0;
import i01.o0;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.z;
import lh0.z3;
import m60.w;
import np0.g;
import nx.b0;
import nx.d0;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f55030a;

    /* renamed from: b, reason: collision with root package name */
    public final d0 f55031b;

    /* renamed from: c, reason: collision with root package name */
    public final o0 f55032c;

    /* renamed from: d, reason: collision with root package name */
    public w f55033d;

    /* renamed from: e, reason: collision with root package name */
    public g f55034e;

    /* renamed from: f, reason: collision with root package name */
    public wk2.a f55035f;

    /* renamed from: g, reason: collision with root package name */
    public b0 f55036g;

    /* renamed from: h, reason: collision with root package name */
    public z f55037h;

    /* renamed from: i, reason: collision with root package name */
    public f30 f55038i;

    /* renamed from: j, reason: collision with root package name */
    public String f55039j;

    /* renamed from: k, reason: collision with root package name */
    public final xj2.b f55040k;

    /* renamed from: l, reason: collision with root package name */
    public long f55041l;

    /* renamed from: m, reason: collision with root package name */
    public final a f55042m;

    public b(Context context, d0 pinalytics, o0 pinSpamParamsProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(pinSpamParamsProvider, "pinSpamParamsProvider");
        this.f55030a = context;
        this.f55031b = pinalytics;
        this.f55032c = pinSpamParamsProvider;
        this.f55040k = new xj2.b();
        this.f55042m = new a(this);
    }

    public final String a(f30 f30Var) {
        wy0 z53;
        Boolean X4 = f30Var.X4();
        Intrinsics.checkNotNullExpressionValue(X4, "getIsInstagramApi(...)");
        if (X4.booleanValue()) {
            wy0 z54 = f30Var.z5();
            if ((z54 != null ? z54.E4() : null) != null && (z53 = f30Var.z5()) != null && Intrinsics.d(z53.I3(), Boolean.TRUE)) {
                z zVar = this.f55037h;
                if (zVar == null) {
                    Intrinsics.r("experiments");
                    throw null;
                }
                z3 z3Var = a4.f83298b;
                g1 g1Var = (g1) zVar.f83517a;
                if (g1Var.o("android_closeup_links", "enabled", z3Var) || g1Var.l("android_closeup_links")) {
                    wy0 z55 = f30Var.z5();
                    if (z55 != null) {
                        return z55.E4();
                    }
                    return null;
                }
            }
        }
        return f30Var.s5();
    }

    public final void b() {
        w wVar = this.f55033d;
        if (wVar != null) {
            wVar.h(this.f55042m);
        } else {
            Intrinsics.r("eventManager");
            throw null;
        }
    }

    public final void c() {
        w wVar = this.f55033d;
        if (wVar == null) {
            Intrinsics.r("eventManager");
            throw null;
        }
        wVar.j(this.f55042m);
        this.f55040k.d();
    }

    public final void d(f30 pin, String str) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f55038i = pin;
        this.f55039j = str;
    }
}
