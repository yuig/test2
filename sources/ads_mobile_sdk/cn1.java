package ads_mobile_sdk;

import a.zb;
import android.content.Context;
import android.os.SystemClock;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;
import kh2.m2;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class cn1 implements a.l8 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3972a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3973b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3974c;

    /* renamed from: d, reason: collision with root package name */
    public final hf f3975d;

    /* renamed from: e, reason: collision with root package name */
    public final Optional f3976e;

    /* renamed from: f, reason: collision with root package name */
    public final zb f3977f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f3978g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f3979h;

    /* renamed from: i, reason: collision with root package name */
    public final en1 f3980i;

    public cn1(Context context, String afmaVersion, String adId, hf appSettings, Optional optionalGmaWebView, zb clock) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(afmaVersion, "afmaVersion");
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(appSettings, "appSettings");
        Intrinsics.checkNotNullParameter(optionalGmaWebView, "optionalGmaWebView");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.f3972a = context;
        this.f3973b = afmaVersion;
        this.f3974c = adId;
        this.f3975d = appSettings;
        this.f3976e = optionalGmaWebView;
        this.f3977f = clock;
        this.f3978g = new AtomicBoolean(false);
        this.f3979h = new AtomicBoolean(false);
        this.f3980i = new en1();
    }

    public final Object a(bl2.c cVar) {
        ym0 ym0Var = (ym0) m2.U0(this.f3976e);
        if (ym0Var == null) {
            return Unit.f80348a;
        }
        nm.u a13 = this.f3980i.a(this.f3972a, this.f3973b, this.f3974c, this.f3975d);
        ok.e0 e0Var = gk0.f5596a;
        gk0.c("Calling: AFMA_updateActiveView(" + a13 + ");", null);
        Object b13 = ym0Var.b(a13, "AFMA_updateActiveView", cVar);
        return b13 == cl2.a.COROUTINE_SUSPENDED ? b13 : Unit.f80348a;
    }

    @Override // a.l8
    public final Object a(hy2 hy2Var, bl2.c cVar) {
        this.f3980i.f4902a = this.f3979h.get() ? false : hy2Var.f6144b;
        en1 en1Var = this.f3980i;
        this.f3977f.getClass();
        en1Var.f4905d = SystemClock.elapsedRealtime();
        this.f3980i.f4907f = hy2Var;
        if (!this.f3978g.get()) {
            return Unit.f80348a;
        }
        Object a13 = a(cVar);
        return a13 == cl2.a.COROUTINE_SUSPENDED ? a13 : Unit.f80348a;
    }
}
