package ads_mobile_sdk;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class vz2 extends yr0 {

    /* renamed from: d, reason: collision with root package name */
    public final a.l4 f12732d;

    /* renamed from: e, reason: collision with root package name */
    public final kp f12733e;

    /* renamed from: f, reason: collision with root package name */
    public final oh0 f12734f;

    /* renamed from: g, reason: collision with root package name */
    public final j0 f12735g;

    /* renamed from: h, reason: collision with root package name */
    public final sb2 f12736h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vz2(a.l4 webViewCompatWrapper, kp concurrencyObjects, oh0 flags, j0 backgroundScope, sb2 rootTraceCreator) {
        super((il0) null, true, (int) (true ? 1 : 0));
        Intrinsics.checkNotNullParameter(webViewCompatWrapper, "webViewCompatWrapper");
        Intrinsics.checkNotNullParameter(concurrencyObjects, "concurrencyObjects");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        this.f12732d = webViewCompatWrapper;
        this.f12733e = concurrencyObjects;
        this.f12734f = flags;
        this.f12735g = backgroundScope;
        this.f12736h = rootTraceCreator;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(ads_mobile_sdk.vz2 r7, bl2.c r8) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.vz2.a(ads_mobile_sdk.vz2, bl2.c):java.lang.Object");
    }

    @Override // ads_mobile_sdk.yr0
    public final Object e(bl2.c cVar) {
        if (((Boolean) this.f12734f.a("gads:startup_webview_during_initialization:enabled", Boolean.FALSE, oh0.f9281e)).booleanValue()) {
            j0 j0Var = this.f12735g;
            sz2 block = new sz2(this, null);
            kotlin.coroutines.j context = kotlin.coroutines.j.f80412a;
            Intrinsics.checkNotNullParameter(j0Var, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            kotlin.jvm.internal.j.z(j0Var, context, null, new et2(block, null), 2);
        }
        return new pk0(Unit.f80348a);
    }
}
