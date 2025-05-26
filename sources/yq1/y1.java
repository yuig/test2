package yq1;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import com.pinterest.feature.nux.utils.PlainCarouselIndexView;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.navigation.Navigation;
import h32.a4;
import h32.d4;
import java.io.Serializable;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lyq1/y1;", "Lyk1/k;", "Lzq1/a0;", "Lar1/a;", "<init>", "()V", "org/chromium/net/y", "identity_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class y1 extends l0 implements zq1.a0, ar1.a {
    public static final Map A0;
    public static final Map B0;
    public static final Map C0;

    /* renamed from: z0, reason: collision with root package name */
    public static final qr1.f0 f140069z0 = qr1.f0.PERSONAL;

    /* renamed from: j0, reason: collision with root package name */
    public vy.m f140070j0;

    /* renamed from: k0, reason: collision with root package name */
    public uk1.e f140071k0;

    /* renamed from: l0, reason: collision with root package name */
    public so.a0 f140072l0;

    /* renamed from: m0, reason: collision with root package name */
    public il1.a f140073m0;

    /* renamed from: n0, reason: collision with root package name */
    public fr1.c f140074n0;

    /* renamed from: o0, reason: collision with root package name */
    public PlainCarouselIndexView f140075o0;

    /* renamed from: p0, reason: collision with root package name */
    public zq1.z f140076p0;

    /* renamed from: v0, reason: collision with root package name */
    public long f140082v0;

    /* renamed from: x0, reason: collision with root package name */
    public int f140084x0;

    /* renamed from: q0, reason: collision with root package name */
    public ar1.d f140077q0 = ar1.d.PASSWORD_STEP;

    /* renamed from: r0, reason: collision with root package name */
    public int f140078r0 = 7;

    /* renamed from: s0, reason: collision with root package name */
    public String f140079s0 = "";

    /* renamed from: t0, reason: collision with root package name */
    public String f140080t0 = "";

    /* renamed from: u0, reason: collision with root package name */
    public String f140081u0 = "";

    /* renamed from: w0, reason: collision with root package name */
    public qr1.f0 f140083w0 = f140069z0;

    /* renamed from: y0, reason: collision with root package name */
    public final d4 f140085y0 = d4.REGISTRATION;

    static {
        ar1.d dVar = ar1.d.EMAIL_STEP;
        Pair pair = new Pair(dVar, 1);
        ar1.d dVar2 = ar1.d.PASSWORD_STEP;
        Pair pair2 = new Pair(dVar2, 2);
        ar1.d dVar3 = ar1.d.NAME_STEP;
        Pair pair3 = new Pair(dVar3, 3);
        ar1.d dVar4 = ar1.d.BIRTHDAY_STEP;
        Pair pair4 = new Pair(dVar4, 4);
        ar1.d dVar5 = ar1.d.KOREA_CONSENT_STEP;
        A0 = kotlin.collections.z0.g(pair, pair2, pair3, pair4, new Pair(dVar5, 5));
        B0 = kotlin.collections.z0.g(new Pair(dVar, a4.SIGNUP_EMAIL_STEP), new Pair(dVar2, a4.SIGNUP_PASSWORD_STEP), new Pair(dVar3, a4.SIGNUP_NAME_STEP), new Pair(dVar4, a4.SIGNUP_BIRTHDAY_STEP), new Pair(dVar5, a4.SIGNUP_PRIVACY_CONSENT_STEP));
        C0 = kotlin.collections.z0.g(new Pair(dVar, v1.class), new Pair(dVar2, h2.class), new Pair(dVar3, e2.class), new Pair(dVar4, s1.class), new Pair(dVar5, c2.class));
    }

    @Override // ar1.a
    public final void I0(Object arg, ar1.d step) {
        Intrinsics.checkNotNullParameter(arg, "arg");
        Intrinsics.checkNotNullParameter(step, "step");
        b8("signup_next");
        int i13 = x1.f140055a[step.ordinal()];
        if (i13 == 1) {
            String str = (String) arg;
            this.f140079s0 = str;
            zq1.z zVar = this.f140076p0;
            if (zVar != null) {
                ((zq1.f0) zVar).r3(str);
                return;
            }
            return;
        }
        if (i13 == 2) {
            this.f140080t0 = (String) arg;
            zq1.z zVar2 = this.f140076p0;
            if (zVar2 != null) {
                ((zq1.f0) zVar2).t3();
                return;
            }
            return;
        }
        if (i13 == 3) {
            this.f140081u0 = (String) arg;
            zq1.z zVar3 = this.f140076p0;
            if (zVar3 != null) {
                ((zq1.f0) zVar3).s3();
                return;
            }
            return;
        }
        if (i13 != 4) {
            if (i13 != 5) {
                return;
            }
            ar1.b bVar = (ar1.b) arg;
            zq1.z zVar4 = this.f140076p0;
            if (zVar4 != null) {
                String email = this.f140079s0;
                String userPassword = this.f140080t0;
                String fullName = this.f140081u0;
                long j13 = this.f140082v0;
                boolean z13 = bVar.f20411a;
                Intrinsics.checkNotNullParameter(email, "email");
                Intrinsics.checkNotNullParameter(userPassword, "userPassword");
                Intrinsics.checkNotNullParameter(fullName, "fullName");
                ((zq1.f0) zVar4).q3(email, userPassword, fullName, j13, Boolean.valueOf(z13), Boolean.valueOf(bVar.f20412b));
                return;
            }
            return;
        }
        long parseLong = Long.parseLong((String) arg);
        this.f140082v0 = parseLong;
        zq1.z zVar5 = this.f140076p0;
        if (zVar5 != null) {
            String email2 = this.f140079s0;
            String userPassword2 = this.f140080t0;
            String fullName2 = this.f140081u0;
            zq1.f0 f0Var = (zq1.f0) zVar5;
            Intrinsics.checkNotNullParameter(email2, "email");
            Intrinsics.checkNotNullParameter(userPassword2, "userPassword");
            Intrinsics.checkNotNullParameter(fullName2, "fullName");
            f0Var.getPinalytics().f0(h32.u0.NEXT_BUTTON, null, null, null, false);
            if (!f0Var.f142677j.d(t92.c.KR_SIGNUP_CONSENT)) {
                f0Var.q3(email2, userPassword2, fullName2, parseLong, null, null);
                return;
            }
            ((y1) ((zq1.a0) f0Var.getView())).c8(ar1.d.KOREA_CONSENT_STEP);
        }
    }

    @Override // yk1.k, nl1.d
    public final void K7() {
        Window window;
        super.K7();
        FragmentActivity E4 = E4();
        if (E4 == null || (window = E4.getWindow()) == null) {
            return;
        }
        this.f140084x0 = window.getAttributes().softInputMode;
        window.setSoftInputMode(16);
    }

    @Override // yk1.k, nl1.d
    public final void L7() {
        FragmentActivity E4 = E4();
        if (E4 != null) {
            Window window = E4.getWindow();
            if (window != null) {
                window.setSoftInputMode(this.f140084x0);
            }
            hf0.b.l(E4);
        }
        super.L7();
    }

    @Override // nl1.d
    public final void R7(Navigation navigation) {
        super.R7(navigation);
        Serializable V = com.bumptech.glide.d.V(this, "com.pinterest.EXTRA_SIGNUP_TYPE", f140069z0);
        Intrinsics.g(V, "null cannot be cast to non-null type com.pinterest.identity.core.model.SignupType");
        this.f140083w0 = (qr1.f0) V;
        String X = com.bumptech.glide.d.X(this, "com.pinterest.EXTRA_EMAIL");
        this.f140079s0 = X;
        this.f140077q0 = kotlin.text.z.j(X) ? ar1.d.EMAIL_STEP : ar1.d.PASSWORD_STEP;
    }

    @Override // yk1.k
    public final yk1.m V7() {
        so.a0 a0Var = this.f140072l0;
        if (a0Var == null) {
            Intrinsics.r("presenterFactory");
            throw null;
        }
        uk1.e eVar = this.f140071k0;
        if (eVar == null) {
            Intrinsics.r("presenterPinalyticsFactory");
            throw null;
        }
        uk1.d f13 = ((uk1.a) eVar).f(s7(), "");
        uj2.q p73 = p7();
        qr1.f0 f0Var = this.f140083w0;
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        return a0Var.a(f13, p73, f0Var, bs1.c.m(requireActivity));
    }

    public final void b8(String str) {
        String U = df.j1.U("%s_%s", new Object[]{str, String.valueOf(A0.get(this.f140077q0))});
        vy.m mVar = this.f140070j0;
        if (mVar != null) {
            mVar.a(U);
        } else {
            Intrinsics.r("analyticsApi");
            throw null;
        }
    }

    public final void c8(ar1.d step) {
        Intrinsics.checkNotNullParameter(step, "step");
        this.f140077q0 = step;
        Integer num = (Integer) A0.get(step);
        if (num != null) {
            int intValue = num.intValue();
            if (intValue > 10) {
                PlainCarouselIndexView plainCarouselIndexView = this.f140075o0;
                if (plainCarouselIndexView == null) {
                    Intrinsics.r("carouselIndexView");
                    throw null;
                }
                plainCarouselIndexView.d((intValue / 10) - 1);
            } else {
                PlainCarouselIndexView plainCarouselIndexView2 = this.f140075o0;
                if (plainCarouselIndexView2 == null) {
                    Intrinsics.r("carouselIndexView");
                    throw null;
                }
                plainCarouselIndexView2.d(intValue - 1);
            }
        }
        il1.a aVar = this.f140073m0;
        if (aVar == null) {
            Intrinsics.r("fragmentFactory");
            throw null;
        }
        Class fragmentClass = (Class) C0.getOrDefault(step, v1.class);
        Intrinsics.checkNotNullParameter(fragmentClass, "fragmentClass");
        nl1.d dVar = (nl1.d) ((mu1.a) aVar).f(fragmentClass);
        Bundle bundle = new Bundle();
        int i13 = x1.f140055a[step.ordinal()];
        if (i13 == 1) {
            bundle.putString("EXTRA_SIGNUP_EMAIL", this.f140079s0);
        } else if (i13 == 2) {
            bundle.putString("EXTRA_SIGNUP_PWD", this.f140080t0);
        } else if (i13 == 3) {
            bundle.putString("EXTRA_SIGNUP_NAME", this.f140081u0);
        } else if (i13 == 4) {
            bundle.putString("EXTRA_SIGNUP_NAME", this.f140081u0);
            bundle.putLong("EXTRA_SIGNUP_BIRTHDATE", this.f140082v0);
        } else if (i13 == 5) {
            bundle.putSerializable("EXTRA_KOREA_CONSENT", this.f140083w0);
        }
        dVar.setArguments(bundle);
        androidx.fragment.app.w0 childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        mo1.c.c(childFragmentManager, vq1.b.fragment_signup_host_container, dVar, false, mo1.a.SLIDE, 32);
    }

    @Override // nl1.d, nx.a
    public final h32.i0 generateLoggingContext() {
        return new h32.i0(d4.REGISTRATION, (a4) B0.get(this.f140077q0), null, null, null, null);
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getW0() {
        return this.f140085y0;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = vq1.c.fragment_signup_flow_host;
        Context context = getContext();
        if (context != null) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter("US", "default");
            String e13 = qb0.b.e(context);
            if (e13.length() <= 0) {
                e13 = "US";
            }
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            Intrinsics.checkNotNullExpressionValue(e13.toUpperCase(US), "toUpperCase(...)");
        }
        fr1.c cVar = this.f140074n0;
        if (cVar == null) {
            Intrinsics.r("complianceManager");
            throw null;
        }
        if (cVar.d(t92.c.KR_SIGNUP_CONSENT)) {
            this.f140078r0++;
        }
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        hf0.b.l(requireActivity());
        super.onDestroyView();
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(vq1.b.fragment_signup_host_carousel);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        PlainCarouselIndexView plainCarouselIndexView = (PlainCarouselIndexView) findViewById;
        this.f140075o0 = plainCarouselIndexView;
        if (plainCarouselIndexView == null) {
            Intrinsics.r("carouselIndexView");
            throw null;
        }
        plainCarouselIndexView.b(this.f140078r0, 0);
        c8(this.f140077q0);
        ((GestaltIcon) view.findViewById(vq1.b.fragment_signup_host_back)).setOnClickListener(new wq1.a(this, 3));
    }
}
