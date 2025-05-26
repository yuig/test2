package y01;

import android.app.Application;
import android.os.Bundle;
import com.pinterest.analytics.TrackingParamKeyBuilder;
import com.pinterest.api.model.PinFeed;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q1 extends l82.b implements l82.i {

    /* renamed from: c, reason: collision with root package name */
    public final p70.e f136475c;

    /* renamed from: d, reason: collision with root package name */
    public final ws.q f136476d;

    /* renamed from: e, reason: collision with root package name */
    public final z01.e f136477e;

    /* renamed from: f, reason: collision with root package name */
    public final mb0.a f136478f;

    /* renamed from: g, reason: collision with root package name */
    public final w60.d f136479g;

    /* renamed from: h, reason: collision with root package name */
    public final ws.q f136480h;

    /* renamed from: i, reason: collision with root package name */
    public final nu.b f136481i;

    /* renamed from: j, reason: collision with root package name */
    public final nu.a f136482j;

    /* renamed from: k, reason: collision with root package name */
    public final z01.k f136483k;

    /* renamed from: l, reason: collision with root package name */
    public final zy.d0 f136484l;

    /* renamed from: m, reason: collision with root package name */
    public final rg0.s f136485m;

    /* renamed from: n, reason: collision with root package name */
    public final mb0.a f136486n;

    /* renamed from: o, reason: collision with root package name */
    public final l82.y f136487o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(Application application, ao2.j0 scope, a11.d clickThroughHelperFactory, nx.d1 trackingParamAttacher, p70.e pinSwipeInitializerManagerSEP, ws.q loggingSEP, z01.e handlePinDeletedSEP, mb0.a pinFeedLoaderSEP, w60.d screenNavigatorSEP, ws.q pinSwipeFragmentPWTEventSEP, nu.b checkSpamSEP, nu.a educationEventSEP, z01.k observeScreenshotSEP, zy.d0 pinalyticsSEP, rg0.s experiences, nx.b0 pinAuxHelper, mb0.a experiencesSEP) {
        super(scope);
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(clickThroughHelperFactory, "clickThroughHelperFactory");
        Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
        Intrinsics.checkNotNullParameter(pinSwipeInitializerManagerSEP, "pinSwipeInitializerManagerSEP");
        Intrinsics.checkNotNullParameter(loggingSEP, "loggingSEP");
        Intrinsics.checkNotNullParameter(handlePinDeletedSEP, "handlePinDeletedSEP");
        Intrinsics.checkNotNullParameter(pinFeedLoaderSEP, "pinFeedLoaderSEP");
        Intrinsics.checkNotNullParameter(screenNavigatorSEP, "screenNavigatorSEP");
        Intrinsics.checkNotNullParameter(pinSwipeFragmentPWTEventSEP, "pinSwipeFragmentPWTEventSEP");
        Intrinsics.checkNotNullParameter(checkSpamSEP, "checkSpamSEP");
        Intrinsics.checkNotNullParameter(educationEventSEP, "educationEventSEP");
        Intrinsics.checkNotNullParameter(observeScreenshotSEP, "observeScreenshotSEP");
        Intrinsics.checkNotNullParameter(pinalyticsSEP, "pinalyticsSEP");
        Intrinsics.checkNotNullParameter(experiences, "experiences");
        Intrinsics.checkNotNullParameter(pinAuxHelper, "pinAuxHelper");
        Intrinsics.checkNotNullParameter(experiencesSEP, "experiencesSEP");
        this.f136475c = pinSwipeInitializerManagerSEP;
        this.f136476d = loggingSEP;
        this.f136477e = handlePinDeletedSEP;
        this.f136478f = pinFeedLoaderSEP;
        this.f136479g = screenNavigatorSEP;
        this.f136480h = pinSwipeFragmentPWTEventSEP;
        this.f136481i = checkSpamSEP;
        this.f136482j = educationEventSEP;
        this.f136483k = observeScreenshotSEP;
        this.f136484l = pinalyticsSEP;
        this.f136485m = experiences;
        this.f136486n = experiencesSEP;
        l82.a0 a0Var = new l82.a0(scope);
        m1 stateTransformer = new m1(new rw1.f(9), trackingParamAttacher, pinAuxHelper);
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        a0Var.f82204b = stateTransformer;
        a0Var.c(this, application);
        this.f136487o = a0Var.a();
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f136487o.d();
    }

    @Override // l82.i
    public final u50.r c() {
        return this.f136487o.e();
    }

    @Override // l82.b, androidx.lifecycle.l1
    public final void g() {
        super.g();
        p70.e eVar = this.f136475c;
        m60.t tVar = (m60.t) eVar.f99073c;
        Object obj = eVar.f99072b;
        if (tVar != null) {
            ((m60.w) obj).j(tVar);
        }
        eVar.f99073c = null;
        m60.t tVar2 = (m60.t) eVar.f99074d;
        if (tVar2 != null) {
            ((m60.w) obj).j(tVar2);
        }
        eVar.f99074d = null;
        z01.k kVar = this.f136483k;
        is1.z zVar = (is1.z) kVar.f140568g;
        if (zVar != null) {
            zVar.b();
        }
        ((m60.w) kVar.f140565d).j((m60.t) kVar.f140569h);
    }

    public final void h(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        gv0.b save = new gv0.b(outState, 6);
        l82.y yVar = this.f136487o;
        yVar.getClass();
        Intrinsics.checkNotNullParameter(save, "save");
        l82.c0 c0Var = yVar.f82292j;
        if (c0Var != null) {
            save.invoke(c0Var.f82212a, c0Var.f82213b);
        }
    }

    public final h0 i(PinFeed pinFeed, String pinUid, String str, TrackingParamKeyBuilder trackingParamKeyBuilder, int i13, String str2, String str3, int i14, ArrayList arrayList, boolean z13, String str4, boolean z14, boolean z15, boolean z16, mq.w analyticsContextProvider) {
        z zVar;
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        Intrinsics.checkNotNullParameter(analyticsContextProvider, "analyticsContextProvider");
        if (pinFeed != null) {
            List q13 = pinFeed.q();
            Intrinsics.checkNotNullExpressionValue(q13, "getItems(...)");
            List F0 = CollectionsKt.F0(q13);
            String str5 = pinFeed.f35558j;
            if (str5 == null) {
                str5 = "";
            }
            zVar = new z(F0, str5, pinFeed.f105383c, Integer.valueOf(pinFeed.f105387g), pinFeed.f105382b, pinFeed.f105384d);
        } else {
            zVar = new z();
        }
        return (h0) this.f136487o.h(new n1(zVar, pinUid, z14, z16, new o(str, trackingParamKeyBuilder, i13, str2, str3, i14, arrayList, z13, str4), new h42.f(), false, 3, "", z15, -1, 0, analyticsContextProvider, ((dh0.d) this.f136485m).b(i32.y0.ANDROID_PIN_CLOSEUP_AFTER_SCREENSHOT) != null, null), false, new p1(this, 0));
    }
}
