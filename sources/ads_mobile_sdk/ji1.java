package ads_mobile_sdk;

import a.s5;
import a.zb;
import ao2.j0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ji1 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f6823a;

    /* renamed from: b, reason: collision with root package name */
    public final a.o8 f6824b;

    /* renamed from: c, reason: collision with root package name */
    public final a.o8 f6825c;

    /* renamed from: d, reason: collision with root package name */
    public final a.o8 f6826d;

    /* renamed from: e, reason: collision with root package name */
    public final a.o8 f6827e;

    public ji1(a.o8 o8Var, a.ca caVar, a.o8 o8Var2, a.o8 o8Var3, a.o8 o8Var4) {
        this.f6823a = o8Var;
        this.f6824b = caVar;
        this.f6825c = o8Var2;
        this.f6826d = o8Var3;
        this.f6827e = o8Var4;
    }

    @Override // a.v7
    public final Object get() {
        j0 uiScope = (j0) this.f6823a.get();
        nm.u nativeAdJson = (nm.u) this.f6824b.get();
        ky2 viewabilityEventEmitter = (ky2) this.f6825c.get();
        r90 displayUtil = (r90) this.f6826d.get();
        zb clock = (zb) this.f6827e.get();
        Intrinsics.checkNotNullParameter(uiScope, "uiScope");
        Intrinsics.checkNotNullParameter(nativeAdJson, "nativeAdJson");
        Intrinsics.checkNotNullParameter(viewabilityEventEmitter, "viewabilityEventEmitter");
        Intrinsics.checkNotNullParameter(displayUtil, "displayUtil");
        Intrinsics.checkNotNullParameter(clock, "clock");
        return new s5(uiScope, viewabilityEventEmitter, displayUtil, clock);
    }
}
