package yq1;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.pinterest.feature.nux.utils.PlainCarouselIndexView;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import h32.a4;
import h32.d4;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lyq1/b1;", "Lyk1/k;", "Lzq1/w;", "Lar1/a;", "<init>", "()V", "org/chromium/net/y", "identity_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class b1 extends h0 implements zq1.w, ar1.a {

    /* renamed from: x0, reason: collision with root package name */
    public static final Map f139782x0;

    /* renamed from: y0, reason: collision with root package name */
    public static final Map f139783y0;

    /* renamed from: z0, reason: collision with root package name */
    public static final Map f139784z0;

    /* renamed from: j0, reason: collision with root package name */
    public uk1.e f139785j0;

    /* renamed from: k0, reason: collision with root package name */
    public so.i0 f139786k0;

    /* renamed from: l0, reason: collision with root package name */
    public il1.a f139787l0;

    /* renamed from: m0, reason: collision with root package name */
    public fr1.c f139788m0;

    /* renamed from: n0, reason: collision with root package name */
    public PlainCarouselIndexView f139789n0;

    /* renamed from: o0, reason: collision with root package name */
    public zq1.x f139790o0;

    /* renamed from: q0, reason: collision with root package name */
    public String f139792q0;

    /* renamed from: r0, reason: collision with root package name */
    public sr1.g f139793r0;

    /* renamed from: s0, reason: collision with root package name */
    public String f139794s0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f139797v0;

    /* renamed from: p0, reason: collision with root package name */
    public ar1.d f139791p0 = ar1.d.BIRTHDAY_STEP;

    /* renamed from: t0, reason: collision with root package name */
    public int f139795t0 = 1;

    /* renamed from: u0, reason: collision with root package name */
    public int f139796u0 = 2;

    /* renamed from: w0, reason: collision with root package name */
    public final d4 f139798w0 = d4.REGISTRATION;

    static {
        ar1.d dVar = ar1.d.BIRTHDAY_STEP;
        Pair pair = new Pair(dVar, 4);
        ar1.d dVar2 = ar1.d.KOREA_CONSENT_STEP;
        f139782x0 = kotlin.collections.z0.g(pair, new Pair(dVar2, 5));
        f139783y0 = kotlin.collections.z0.g(new Pair(dVar, s1.class), new Pair(dVar2, c2.class));
        f139784z0 = kotlin.collections.z0.g(new Pair(dVar, a4.SIGNUP_BIRTHDAY_STEP), new Pair(dVar2, a4.SIGNUP_PRIVACY_CONSENT_STEP));
    }

    @Override // ar1.a
    public final void I0(Object arg, ar1.d step) {
        zq1.x xVar;
        zq1.x xVar2;
        Intrinsics.checkNotNullParameter(arg, "arg");
        Intrinsics.checkNotNullParameter(step, "step");
        int i13 = a1.f139770a[step.ordinal()];
        if (i13 == 1) {
            String str = (String) arg;
            this.f139792q0 = str;
            sr1.g gVar = this.f139793r0;
            if (gVar == null || (xVar = this.f139790o0) == null) {
                return;
            }
            ((zq1.y) xVar).r3(Long.parseLong(str), gVar, this.f139795t0);
            return;
        }
        if (i13 != 2) {
            return;
        }
        ar1.b bVar = (ar1.b) arg;
        String str2 = this.f139792q0;
        long longValue = str2 != null ? Long.valueOf(Long.parseLong(str2)).longValue() : 0L;
        sr1.g gVar2 = this.f139793r0;
        if (gVar2 == null || (xVar2 = this.f139790o0) == null) {
            return;
        }
        ((zq1.y) xVar2).s3(longValue, gVar2, this.f139795t0, bVar.a(), bVar.b());
    }

    @Override // yk1.k
    public final yk1.m V7() {
        so.i0 i0Var = this.f139786k0;
        if (i0Var == null) {
            Intrinsics.r("presenterFactory");
            throw null;
        }
        uk1.e eVar = this.f139785j0;
        if (eVar == null) {
            Intrinsics.r("presenterPinalyticsFactory");
            throw null;
        }
        uk1.d f13 = ((uk1.a) eVar).f(s7(), "");
        uj2.q p73 = p7();
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        return i0Var.a(f13, p73, bs1.c.m(requireActivity));
    }

    public final void b8(ar1.d step) {
        Intrinsics.checkNotNullParameter(step, "step");
        Map map = f139782x0;
        Integer num = (Integer) map.get(step);
        if (num != null) {
            int intValue = num.intValue();
            Integer num2 = (Integer) map.get(this.f139791p0);
            if (num2 != null) {
                int intValue2 = num2.intValue();
                if (intValue > intValue2) {
                    PlainCarouselIndexView plainCarouselIndexView = this.f139789n0;
                    if (plainCarouselIndexView == null) {
                        Intrinsics.r("carouselIndexView");
                        throw null;
                    }
                    plainCarouselIndexView.c();
                } else if (intValue < intValue2) {
                    PlainCarouselIndexView plainCarouselIndexView2 = this.f139789n0;
                    if (plainCarouselIndexView2 == null) {
                        Intrinsics.r("carouselIndexView");
                        throw null;
                    }
                    plainCarouselIndexView2.e();
                }
            }
        }
        this.f139791p0 = step;
        il1.a aVar = this.f139787l0;
        if (aVar == null) {
            Intrinsics.r("fragmentFactory");
            throw null;
        }
        Class fragmentClass = (Class) f139783y0.getOrDefault(step, v1.class);
        Intrinsics.checkNotNullParameter(fragmentClass, "fragmentClass");
        nl1.d dVar = (nl1.d) ((mu1.a) aVar).f(fragmentClass);
        Bundle bundle = new Bundle();
        bundle.putString("EXTRA_SIGNUP_NAME", this.f139794s0);
        String str = this.f139792q0;
        if (str != null) {
            bundle.putLong("EXTRA_SIGNUP_BIRTHDATE", Long.parseLong(str));
        }
        bundle.putBoolean("EXTRA_IS_GOOGLE_AUTH", this.f139797v0);
        dVar.setArguments(bundle);
        androidx.fragment.app.w0 childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        mo1.c.c(childFragmentManager, vq1.b.fragment_signup_host_container, dVar, false, mo1.a.SLIDE, 32);
    }

    @Override // nl1.d, nx.a
    public final h32.i0 generateLoggingContext() {
        return new h32.i0(d4.REGISTRATION, (a4) f139784z0.get(this.f139791p0), null, null, null, null);
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF0() {
        return this.f139798w0;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = vq1.c.fragment_signup_flow_host;
        Context context = getContext();
        if (context != null) {
            hf0.b.t(context);
        }
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        hf0.b.l(requireActivity());
        super.onDestroyView();
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        HashMap b13;
        String str;
        HashMap b14;
        HashMap b15;
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        Serializable V = com.bumptech.glide.d.V(this, "EXTRA_PENDING_SIGNUP_DATA", null);
        Intrinsics.g(V, "null cannot be cast to non-null type com.pinterest.identity.core.signup.PendingSignupData");
        this.f139793r0 = (sr1.g) V;
        this.f139797v0 = com.bumptech.glide.d.F(this, "EXTRA_IS_GOOGLE_AUTH");
        sr1.g gVar = this.f139793r0;
        this.f139794s0 = (gVar == null || (b15 = gVar.b()) == null) ? null : (String) b15.get("first_name");
        sr1.g gVar2 = this.f139793r0;
        this.f139792q0 = (gVar2 == null || (b14 = gVar2.b()) == null) ? null : (String) b14.get("birthday");
        sr1.g gVar3 = this.f139793r0;
        if (gVar3 != null && (b13 = gVar3.b()) != null && (str = (String) b13.get("gender")) != null) {
            this.f139796u0 = (kotlin.text.z.j(str) || Intrinsics.d(str, "unspecified")) ? 3 : 2;
        }
        int i13 = 1;
        this.f139795t0 = 1;
        fr1.c cVar = this.f139788m0;
        if (cVar == null) {
            Intrinsics.r("complianceManager");
            throw null;
        }
        if (cVar.d(t92.c.KR_SIGNUP_CONSENT)) {
            this.f139795t0++;
        }
        View findViewById = v13.findViewById(vq1.b.fragment_signup_host_carousel);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        PlainCarouselIndexView plainCarouselIndexView = (PlainCarouselIndexView) findViewById;
        this.f139789n0 = plainCarouselIndexView;
        if (plainCarouselIndexView == null) {
            Intrinsics.r("carouselIndexView");
            throw null;
        }
        plainCarouselIndexView.b(this.f139795t0 + this.f139796u0, 0);
        b8(this.f139791p0);
        ((GestaltIcon) v13.findViewById(vq1.b.fragment_signup_host_back)).setOnClickListener(new wq1.a(this, i13));
    }
}
