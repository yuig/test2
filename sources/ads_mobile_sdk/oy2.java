package ads_mobile_sdk;

import a.c9;
import a.zb;
import android.view.View;
import ao2.j0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class oy2 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f9496a;

    /* renamed from: b, reason: collision with root package name */
    public final a.o8 f9497b;

    /* renamed from: c, reason: collision with root package name */
    public final a.o8 f9498c;

    /* renamed from: d, reason: collision with root package name */
    public final a.o8 f9499d;

    /* renamed from: e, reason: collision with root package name */
    public final a.o8 f9500e;

    public oy2(a.o8 o8Var, a.o8 o8Var2, a.o8 o8Var3, xv0 xv0Var, a.o8 o8Var4) {
        this.f9496a = o8Var;
        this.f9497b = o8Var2;
        this.f9498c = o8Var3;
        this.f9499d = xv0Var;
        this.f9500e = o8Var4;
    }

    @Override // a.v7
    public final Object get() {
        j0 uiScope = (j0) this.f9496a.get();
        ky2 viewabilityEventEmitter = (ky2) this.f9497b.get();
        r90 displayUtil = (r90) this.f9498c.get();
        View view = (View) this.f9499d.get();
        zb clock = (zb) this.f9500e.get();
        Intrinsics.checkNotNullParameter(uiScope, "uiScope");
        Intrinsics.checkNotNullParameter(viewabilityEventEmitter, "viewabilityEventEmitter");
        Intrinsics.checkNotNullParameter(displayUtil, "displayUtil");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(clock, "clock");
        c9 c9Var = new c9(uiScope, viewabilityEventEmitter, displayUtil, clock);
        c9Var.b(view);
        c9Var.a(view);
        return c9Var;
    }
}
