package wq1;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import com.pinterest.framework.screens.ScreenDescription;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import com.pinterest.navigation.Navigation;
import df.j1;
import h32.a4;
import h32.d4;
import h32.f1;
import h32.i0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import pk.a0;
import rm1.q;
import so.z;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lwq1/f;", "Lyk1/k;", "Lwq1/i;", "<init>", "()V", "org/chromium/net/y", "identity_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class f extends o implements i {
    public static final Map L0;
    public static final Map M0;
    public GestaltTextField A0;
    public GestaltTextField B0;
    public GestaltTextField C0;
    public ProgressBar D0;
    public GestaltText E0;
    public GestaltButton F0;
    public GestaltButton G0;
    public RadioGroup H0;
    public RadioGroup I0;
    public ScrollView J0;

    /* renamed from: j0, reason: collision with root package name */
    public h f130817j0;

    /* renamed from: t0, reason: collision with root package name */
    public vy.m f130827t0;

    /* renamed from: u0, reason: collision with root package name */
    public uk1.e f130828u0;

    /* renamed from: v0, reason: collision with root package name */
    public z f130829v0;

    /* renamed from: w0, reason: collision with root package name */
    public i92.k f130830w0;

    /* renamed from: x0, reason: collision with root package name */
    public GestaltText f130831x0;

    /* renamed from: y0, reason: collision with root package name */
    public GestaltText f130832y0;

    /* renamed from: z0, reason: collision with root package name */
    public GestaltText f130833z0;

    /* renamed from: k0, reason: collision with root package name */
    public j f130818k0 = j.PROFILE_NAME_STEP;

    /* renamed from: l0, reason: collision with root package name */
    public String f130819l0 = "";

    /* renamed from: m0, reason: collision with root package name */
    public String f130820m0 = "";

    /* renamed from: n0, reason: collision with root package name */
    public String f130821n0 = "";

    /* renamed from: o0, reason: collision with root package name */
    public String f130822o0 = "";

    /* renamed from: p0, reason: collision with root package name */
    public String f130823p0 = "";

    /* renamed from: q0, reason: collision with root package name */
    public String f130824q0 = "";

    /* renamed from: r0, reason: collision with root package name */
    public String f130825r0 = "";

    /* renamed from: s0, reason: collision with root package name */
    public String f130826s0 = "";
    public final d4 K0 = d4.BIZ_ORIENTATION;

    static {
        j jVar = j.PROFILE_NAME_STEP;
        Pair pair = new Pair(jVar, 5);
        j jVar2 = j.WEBSITE_STEP;
        Pair pair2 = new Pair(jVar2, 6);
        j jVar3 = j.DESCRIPTION_STEP;
        Pair pair3 = new Pair(jVar3, 7);
        j jVar4 = j.RUN_ADS_STEP;
        Pair pair4 = new Pair(jVar4, 8);
        j jVar5 = j.LAUNCH_ADS_STEP;
        L0 = z0.g(pair, pair2, pair3, pair4, new Pair(jVar5, 9));
        M0 = z0.g(new Pair(jVar, a4.ORIENTATION_BUSINESS_NAME), new Pair(jVar2, a4.ORIENTATION_WEBSITE), new Pair(jVar3, a4.ORIENTATION_BUSINESS_TYPE), new Pair(jVar4, a4.ORIENTATION_INTENT_TO_ADVERTISE), new Pair(jVar5, a4.ORIENTATION_SALES_CONTACT));
    }

    public static void b8(GestaltTextField gestaltTextField, boolean z13) {
        gestaltTextField.X(new mm1.i(z13, 6));
    }

    @Override // nl1.d
    public final void R7(Navigation navigation) {
        Bundle arguments;
        super.R7(navigation);
        this.f130824q0 = com.bumptech.glide.d.X(this, "com.pinterest.EXTRA_EMAIL");
        com.bumptech.glide.d.X(this, "com.pinterest.EXTRA_USERNAME");
        this.f130825r0 = com.bumptech.glide.d.X(this, "com.pinterest.COUNTRY");
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter("com.pinterst.EXTRA_SETTINGS_AGE", "key");
        ScreenDescription screenDescription = this.f76937a;
        if (screenDescription == null || (arguments = screenDescription.getF49207c()) == null) {
            arguments = getArguments();
        }
        if (arguments == null || !arguments.containsKey("com.pinterst.EXTRA_SETTINGS_AGE")) {
            Bundle arguments2 = getArguments();
            if (arguments2 == null || !arguments2.containsKey("com.pinterst.EXTRA_SETTINGS_AGE")) {
                Navigation navigation2 = this.I;
                if (navigation2 != null) {
                    navigation2.q1(0, "com.pinterst.EXTRA_SETTINGS_AGE");
                }
            } else {
                Bundle arguments3 = getArguments();
                if (arguments3 != null) {
                    arguments3.getInt("com.pinterst.EXTRA_SETTINGS_AGE", 0);
                }
            }
        } else {
            arguments.getInt("com.pinterst.EXTRA_SETTINGS_AGE", 0);
        }
        this.f130826s0 = com.bumptech.glide.d.X(this, "com.pinterest.identity.EXTRA_BUSINESS_CREATE_ACCOUNT_TYPE");
    }

    @Override // nl1.d
    public final void S7(fo1.a toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Context context = getContext();
        int drawableRes = context != null ? q.ARROW_BACK.drawableRes(context, dl2.b.f1(context)) : sm1.b.ic_arrow_back_gestalt;
        GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) toolbar;
        gestaltToolbarImpl.Y(vq1.d.signup_create_business_account);
        gestaltToolbarImpl.Q(drawableRes, eo1.b.color_themed_text_default, x0.back);
        gestaltToolbarImpl.E();
        gestaltToolbarImpl.m();
    }

    @Override // yk1.k
    public final yk1.m V7() {
        z zVar = this.f130829v0;
        if (zVar == null) {
            Intrinsics.r("presenterFactory");
            throw null;
        }
        uk1.e eVar = this.f130828u0;
        if (eVar != null) {
            return zVar.a(((uk1.a) eVar).f(s7(), ""), p7());
        }
        Intrinsics.r("presenterPinalyticsFactory");
        throw null;
    }

    public final i92.k c8() {
        i92.k kVar = this.f130830w0;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.r("toastUtils");
        throw null;
    }

    public final void d8(boolean z13) {
        GestaltButton gestaltButton = this.F0;
        if (gestaltButton != null) {
            gestaltButton.d(new mm1.i(z13, 7));
        } else {
            Intrinsics.r("nextButton");
            throw null;
        }
    }

    public final void e8(boolean z13) {
        GestaltTextField gestaltTextField = this.C0;
        if (gestaltTextField == null) {
            Intrinsics.r("launchAdsEditText");
            throw null;
        }
        String B0 = gestaltTextField.B0();
        if (kotlin.text.z.j(B0) && !z13) {
            c8().i(getString(vq1.d.business_launch_ads_empty_error));
            return;
        }
        if (!z13 && !tr1.b.e(B0)) {
            c8().i(getString(vq1.d.business_launch_ads_pattern_error));
            return;
        }
        h hVar = this.f130817j0;
        if (hVar != null) {
            ((n) hVar).t3(B0, this.f130820m0, this.f130819l0);
        }
    }

    public final void f8(boolean z13) {
        GestaltTextField gestaltTextField = this.B0;
        if (gestaltTextField == null) {
            Intrinsics.r("websiteEditText");
            throw null;
        }
        String B0 = gestaltTextField.B0();
        if (kotlin.text.z.j(B0) && !z13) {
            c8().i(getString(vq1.d.business_website_empty_error));
            return;
        }
        if (!z13 && !tr1.b.g(B0)) {
            c8().i(getString(vq1.d.business_website_pattern_error));
            return;
        }
        this.f130820m0 = B0;
        h hVar = this.f130817j0;
        if (hVar != null) {
            ((n) hVar).v3();
        }
    }

    public final void g8(String str) {
        String U = j1.U("%s_%s", new Object[]{str, String.valueOf(L0.get(this.f130818k0))});
        vy.m mVar = this.f130827t0;
        if (mVar != null) {
            mVar.a(U);
        } else {
            Intrinsics.r("analyticsApi");
            throw null;
        }
    }

    @Override // nl1.d, nx.a
    public final i0 generateLoggingContext() {
        return new i0(d4.BIZ_ORIENTATION, (a4) M0.get(this.f130818k0), null, null, null, null);
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF0() {
        return this.K0;
    }

    public final void h8() {
        s7().U(generateLoggingContext(), f1.VIEW, null, null, null, false);
    }

    public final void i8(j step) {
        Intrinsics.checkNotNullParameter(step, "step");
        this.f130818k0 = step;
        int i13 = d.f130798a[step.ordinal()];
        if (i13 == 1) {
            GestaltText gestaltText = this.f130831x0;
            if (gestaltText == null) {
                Intrinsics.r("titleTextView");
                throw null;
            }
            gestaltText.i(e.f130808s);
            GestaltTextField gestaltTextField = this.A0;
            if (gestaltTextField == null) {
                Intrinsics.r("profileEditText");
                throw null;
            }
            b8(gestaltTextField, true);
            GestaltTextField gestaltTextField2 = this.B0;
            if (gestaltTextField2 == null) {
                Intrinsics.r("websiteEditText");
                throw null;
            }
            b8(gestaltTextField2, false);
            GestaltTextField gestaltTextField3 = this.C0;
            if (gestaltTextField3 == null) {
                Intrinsics.r("launchAdsEditText");
                throw null;
            }
            b8(gestaltTextField3, false);
            GestaltButton gestaltButton = this.G0;
            if (gestaltButton == null) {
                Intrinsics.r("skipButton");
                throw null;
            }
            a0.l0(gestaltButton);
            GestaltButton gestaltButton2 = this.F0;
            if (gestaltButton2 == null) {
                Intrinsics.r("nextButton");
                throw null;
            }
            gestaltButton2.d(e.f130809t);
            GestaltText gestaltText2 = this.f130832y0;
            if (gestaltText2 == null) {
                Intrinsics.r("descriptionTextView");
                throw null;
            }
            a0.o(gestaltText2, vq1.d.business_profile_name_description, new Object[0]);
            GestaltText gestaltText3 = this.f130833z0;
            if (gestaltText3 == null) {
                Intrinsics.r("disclaimerTextView");
                throw null;
            }
            gestaltText3.i(e.f130810u);
            RadioGroup radioGroup = this.H0;
            if (radioGroup == null) {
                Intrinsics.r("descriptionRadioGroup");
                throw null;
            }
            bs1.c.R1(radioGroup, false);
            RadioGroup radioGroup2 = this.I0;
            if (radioGroup2 == null) {
                Intrinsics.r("runAdsRadioGroup");
                throw null;
            }
            bs1.c.R1(radioGroup2, false);
            ScrollView scrollView = this.J0;
            if (scrollView == null) {
                Intrinsics.r("scrollDescription");
                throw null;
            }
            bs1.c.R1(scrollView, false);
            ProgressBar progressBar = this.D0;
            if (progressBar == null) {
                Intrinsics.r("progressBar");
                throw null;
            }
            bs1.c.R1(progressBar, true);
            GestaltText gestaltText4 = this.E0;
            if (gestaltText4 == null) {
                Intrinsics.r("progressText");
                throw null;
            }
            gestaltText4.i(e.f130811v);
            h8();
            j8();
            d8(kotlin.text.z.j(this.f130819l0));
            return;
        }
        if (i13 == 2) {
            GestaltText gestaltText5 = this.f130831x0;
            if (gestaltText5 == null) {
                Intrinsics.r("titleTextView");
                throw null;
            }
            gestaltText5.i(e.f130815z);
            GestaltTextField gestaltTextField4 = this.B0;
            if (gestaltTextField4 == null) {
                Intrinsics.r("websiteEditText");
                throw null;
            }
            b8(gestaltTextField4, true);
            GestaltTextField gestaltTextField5 = this.A0;
            if (gestaltTextField5 == null) {
                Intrinsics.r("profileEditText");
                throw null;
            }
            b8(gestaltTextField5, false);
            GestaltTextField gestaltTextField6 = this.C0;
            if (gestaltTextField6 == null) {
                Intrinsics.r("launchAdsEditText");
                throw null;
            }
            b8(gestaltTextField6, false);
            GestaltButton gestaltButton3 = this.F0;
            if (gestaltButton3 == null) {
                Intrinsics.r("nextButton");
                throw null;
            }
            gestaltButton3.d(e.A);
            GestaltButton gestaltButton4 = this.G0;
            if (gestaltButton4 == null) {
                Intrinsics.r("skipButton");
                throw null;
            }
            gestaltButton4.d(e.B);
            GestaltText gestaltText6 = this.f130832y0;
            if (gestaltText6 == null) {
                Intrinsics.r("descriptionTextView");
                throw null;
            }
            a0.o(gestaltText6, vq1.d.business_website_description, new Object[0]);
            GestaltText gestaltText7 = this.f130833z0;
            if (gestaltText7 == null) {
                Intrinsics.r("disclaimerTextView");
                throw null;
            }
            gestaltText7.i(e.C);
            RadioGroup radioGroup3 = this.H0;
            if (radioGroup3 == null) {
                Intrinsics.r("descriptionRadioGroup");
                throw null;
            }
            bs1.c.R1(radioGroup3, false);
            RadioGroup radioGroup4 = this.I0;
            if (radioGroup4 == null) {
                Intrinsics.r("runAdsRadioGroup");
                throw null;
            }
            bs1.c.R1(radioGroup4, false);
            ScrollView scrollView2 = this.J0;
            if (scrollView2 == null) {
                Intrinsics.r("scrollDescription");
                throw null;
            }
            bs1.c.R1(scrollView2, false);
            ProgressBar progressBar2 = this.D0;
            if (progressBar2 == null) {
                Intrinsics.r("progressBar");
                throw null;
            }
            bs1.c.R1(progressBar2, true);
            GestaltText gestaltText8 = this.E0;
            if (gestaltText8 == null) {
                Intrinsics.r("progressText");
                throw null;
            }
            gestaltText8.i(e.D);
            GestaltTextField gestaltTextField7 = this.A0;
            if (gestaltTextField7 == null) {
                Intrinsics.r("profileEditText");
                throw null;
            }
            hf0.b.k(gestaltTextField7);
            h8();
            j8();
            d8(kotlin.text.z.j(this.f130820m0));
            return;
        }
        if (i13 == 3) {
            GestaltText gestaltText9 = this.f130831x0;
            if (gestaltText9 == null) {
                Intrinsics.r("titleTextView");
                throw null;
            }
            a0.o(gestaltText9, vq1.d.business_describe_title, new Object[0]);
            GestaltTextField gestaltTextField8 = this.A0;
            if (gestaltTextField8 == null) {
                Intrinsics.r("profileEditText");
                throw null;
            }
            b8(gestaltTextField8, false);
            GestaltTextField gestaltTextField9 = this.B0;
            if (gestaltTextField9 == null) {
                Intrinsics.r("websiteEditText");
                throw null;
            }
            b8(gestaltTextField9, false);
            GestaltTextField gestaltTextField10 = this.B0;
            if (gestaltTextField10 == null) {
                Intrinsics.r("websiteEditText");
                throw null;
            }
            hf0.b.k(gestaltTextField10);
            GestaltTextField gestaltTextField11 = this.C0;
            if (gestaltTextField11 == null) {
                Intrinsics.r("launchAdsEditText");
                throw null;
            }
            b8(gestaltTextField11, false);
            GestaltText gestaltText10 = this.f130832y0;
            if (gestaltText10 == null) {
                Intrinsics.r("descriptionTextView");
                throw null;
            }
            a0.o(gestaltText10, vq1.d.business_describe_description, new Object[0]);
            GestaltButton gestaltButton5 = this.F0;
            if (gestaltButton5 == null) {
                Intrinsics.r("nextButton");
                throw null;
            }
            gestaltButton5.d(e.f130801l);
            GestaltButton gestaltButton6 = this.G0;
            if (gestaltButton6 == null) {
                Intrinsics.r("skipButton");
                throw null;
            }
            a0.l0(gestaltButton6);
            RadioGroup radioGroup5 = this.H0;
            if (radioGroup5 == null) {
                Intrinsics.r("descriptionRadioGroup");
                throw null;
            }
            bs1.c.R1(radioGroup5, true);
            RadioGroup radioGroup6 = this.I0;
            if (radioGroup6 == null) {
                Intrinsics.r("runAdsRadioGroup");
                throw null;
            }
            bs1.c.R1(radioGroup6, false);
            GestaltText gestaltText11 = this.f130833z0;
            if (gestaltText11 == null) {
                Intrinsics.r("disclaimerTextView");
                throw null;
            }
            gestaltText11.i(e.f130802m);
            ScrollView scrollView3 = this.J0;
            if (scrollView3 == null) {
                Intrinsics.r("scrollDescription");
                throw null;
            }
            bs1.c.R1(scrollView3, true);
            ProgressBar progressBar3 = this.D0;
            if (progressBar3 == null) {
                Intrinsics.r("progressBar");
                throw null;
            }
            bs1.c.R1(progressBar3, true);
            GestaltText gestaltText12 = this.E0;
            if (gestaltText12 == null) {
                Intrinsics.r("progressText");
                throw null;
            }
            gestaltText12.i(e.f130803n);
            h8();
            j8();
            d8(kotlin.text.z.j(this.f130821n0));
            return;
        }
        if (i13 == 4) {
            GestaltText gestaltText13 = this.f130831x0;
            if (gestaltText13 == null) {
                Intrinsics.r("titleTextView");
                throw null;
            }
            a0.o(gestaltText13, vq1.d.business_run_ads_title, new Object[0]);
            GestaltTextField gestaltTextField12 = this.A0;
            if (gestaltTextField12 == null) {
                Intrinsics.r("profileEditText");
                throw null;
            }
            b8(gestaltTextField12, false);
            GestaltTextField gestaltTextField13 = this.B0;
            if (gestaltTextField13 == null) {
                Intrinsics.r("websiteEditText");
                throw null;
            }
            b8(gestaltTextField13, false);
            GestaltTextField gestaltTextField14 = this.C0;
            if (gestaltTextField14 == null) {
                Intrinsics.r("launchAdsEditText");
                throw null;
            }
            b8(gestaltTextField14, false);
            GestaltText gestaltText14 = this.f130832y0;
            if (gestaltText14 == null) {
                Intrinsics.r("descriptionTextView");
                throw null;
            }
            a0.o(gestaltText14, vq1.d.business_run_ads_description, new Object[0]);
            GestaltButton gestaltButton7 = this.F0;
            if (gestaltButton7 == null) {
                Intrinsics.r("nextButton");
                throw null;
            }
            gestaltButton7.d(e.f130812w);
            GestaltButton gestaltButton8 = this.G0;
            if (gestaltButton8 == null) {
                Intrinsics.r("skipButton");
                throw null;
            }
            a0.l0(gestaltButton8);
            RadioGroup radioGroup7 = this.H0;
            if (radioGroup7 == null) {
                Intrinsics.r("descriptionRadioGroup");
                throw null;
            }
            bs1.c.R1(radioGroup7, false);
            RadioGroup radioGroup8 = this.I0;
            if (radioGroup8 == null) {
                Intrinsics.r("runAdsRadioGroup");
                throw null;
            }
            bs1.c.R1(radioGroup8, true);
            GestaltText gestaltText15 = this.f130833z0;
            if (gestaltText15 == null) {
                Intrinsics.r("disclaimerTextView");
                throw null;
            }
            gestaltText15.i(e.f130813x);
            ScrollView scrollView4 = this.J0;
            if (scrollView4 == null) {
                Intrinsics.r("scrollDescription");
                throw null;
            }
            bs1.c.R1(scrollView4, false);
            ProgressBar progressBar4 = this.D0;
            if (progressBar4 == null) {
                Intrinsics.r("progressBar");
                throw null;
            }
            bs1.c.R1(progressBar4, true);
            GestaltText gestaltText16 = this.E0;
            if (gestaltText16 == null) {
                Intrinsics.r("progressText");
                throw null;
            }
            gestaltText16.i(e.f130814y);
            h8();
            j8();
            d8(kotlin.text.z.j(this.f130822o0));
            return;
        }
        if (i13 != 5) {
            return;
        }
        GestaltText gestaltText17 = this.f130831x0;
        if (gestaltText17 == null) {
            Intrinsics.r("titleTextView");
            throw null;
        }
        a0.o(gestaltText17, vq1.d.business_launch_ads_title, new Object[0]);
        GestaltTextField gestaltTextField15 = this.A0;
        if (gestaltTextField15 == null) {
            Intrinsics.r("profileEditText");
            throw null;
        }
        b8(gestaltTextField15, false);
        GestaltTextField gestaltTextField16 = this.B0;
        if (gestaltTextField16 == null) {
            Intrinsics.r("websiteEditText");
            throw null;
        }
        b8(gestaltTextField16, false);
        GestaltTextField gestaltTextField17 = this.C0;
        if (gestaltTextField17 == null) {
            Intrinsics.r("launchAdsEditText");
            throw null;
        }
        b8(gestaltTextField17, true);
        GestaltText gestaltText18 = this.f130832y0;
        if (gestaltText18 == null) {
            Intrinsics.r("descriptionTextView");
            throw null;
        }
        a0.o(gestaltText18, vq1.d.business_launch_ads_description, new Object[0]);
        GestaltButton gestaltButton9 = this.F0;
        if (gestaltButton9 == null) {
            Intrinsics.r("nextButton");
            throw null;
        }
        gestaltButton9.d(e.f130804o);
        GestaltButton gestaltButton10 = this.G0;
        if (gestaltButton10 == null) {
            Intrinsics.r("skipButton");
            throw null;
        }
        gestaltButton10.d(e.f130805p);
        RadioGroup radioGroup9 = this.H0;
        if (radioGroup9 == null) {
            Intrinsics.r("descriptionRadioGroup");
            throw null;
        }
        bs1.c.R1(radioGroup9, false);
        RadioGroup radioGroup10 = this.I0;
        if (radioGroup10 == null) {
            Intrinsics.r("runAdsRadioGroup");
            throw null;
        }
        bs1.c.R1(radioGroup10, false);
        GestaltText gestaltText19 = this.f130833z0;
        if (gestaltText19 == null) {
            Intrinsics.r("disclaimerTextView");
            throw null;
        }
        gestaltText19.i(e.f130806q);
        ScrollView scrollView5 = this.J0;
        if (scrollView5 == null) {
            Intrinsics.r("scrollDescription");
            throw null;
        }
        bs1.c.R1(scrollView5, false);
        ProgressBar progressBar5 = this.D0;
        if (progressBar5 == null) {
            Intrinsics.r("progressBar");
            throw null;
        }
        bs1.c.R1(progressBar5, false);
        GestaltText gestaltText20 = this.E0;
        if (gestaltText20 == null) {
            Intrinsics.r("progressText");
            throw null;
        }
        gestaltText20.i(e.f130807r);
        h8();
        j8();
        d8(kotlin.text.z.j(this.f130823p0));
    }

    public final void j8() {
        Integer num = (Integer) L0.get(this.f130818k0);
        int intValue = num != null ? num.intValue() : 1;
        ProgressBar progressBar = this.D0;
        if (progressBar == null) {
            Intrinsics.r("progressBar");
            throw null;
        }
        progressBar.setProgress(intValue);
        ProgressBar progressBar2 = this.D0;
        if (progressBar2 == null) {
            Intrinsics.r("progressBar");
            throw null;
        }
        progressBar2.setMax(8);
        GestaltText gestaltText = this.E0;
        if (gestaltText == null) {
            Intrinsics.r("progressText");
            throw null;
        }
        String string = getString(vq1.d.signup_flow_progress);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        a0.p(gestaltText, j1.Y(string, new Object[]{Integer.valueOf(intValue), 8}, null, 6));
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = vq1.c.fragment_business_signup;
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
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        View findViewById = v13.findViewById(vq1.b.business_signup_title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f130831x0 = (GestaltText) findViewById;
        View findViewById2 = v13.findViewById(vq1.b.business_signup_description);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f130832y0 = (GestaltText) findViewById2;
        View findViewById3 = v13.findViewById(vq1.b.disclaimer_textview);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f130833z0 = (GestaltText) findViewById3;
        View findViewById4 = v13.findViewById(vq1.b.business_signup_description_radio_group);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.H0 = (RadioGroup) findViewById4;
        View findViewById5 = v13.findViewById(vq1.b.business_signup_adsup);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.I0 = (RadioGroup) findViewById5;
        View findViewById6 = v13.findViewById(vq1.b.profile_name_input_text);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.A0 = (GestaltTextField) findViewById6;
        View findViewById7 = v13.findViewById(vq1.b.website_input_text);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.B0 = (GestaltTextField) findViewById7;
        View findViewById8 = v13.findViewById(vq1.b.signup_progress_bar);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
        this.D0 = (ProgressBar) findViewById8;
        View findViewById9 = v13.findViewById(vq1.b.signup_progress_text);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "findViewById(...)");
        this.E0 = (GestaltText) findViewById9;
        View findViewById10 = v13.findViewById(vq1.b.business_sign_next_button);
        Intrinsics.checkNotNullExpressionValue(findViewById10, "findViewById(...)");
        this.F0 = (GestaltButton) findViewById10;
        View findViewById11 = v13.findViewById(vq1.b.business_sign_second_option_button);
        Intrinsics.checkNotNullExpressionValue(findViewById11, "findViewById(...)");
        this.G0 = (GestaltButton) findViewById11;
        View findViewById12 = v13.findViewById(vq1.b.scroll_describe_options);
        Intrinsics.checkNotNullExpressionValue(findViewById12, "findViewById(...)");
        this.J0 = (ScrollView) findViewById12;
        View findViewById13 = v13.findViewById(vq1.b.launch_ads_input_text);
        Intrinsics.checkNotNullExpressionValue(findViewById13, "findViewById(...)");
        this.C0 = (GestaltTextField) findViewById13;
        fo1.a i73 = i7();
        final int i13 = 0;
        if (i73 != null) {
            ((GestaltToolbarImpl) i73).U(new a(this, i13));
        }
        GestaltButton gestaltButton = this.F0;
        if (gestaltButton == null) {
            Intrinsics.r("nextButton");
            throw null;
        }
        gestaltButton.d(e.f130799j).e(new gm1.a(this) { // from class: wq1.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f130795b;

            {
                this.f130795b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                h hVar;
                int i14 = i13;
                f this$0 = this.f130795b;
                switch (i14) {
                    case 0:
                        Map map = f.L0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.g8("signup_next");
                        int i15 = d.f130798a[this$0.f130818k0.ordinal()];
                        if (i15 == 1) {
                            GestaltTextField gestaltTextField = this$0.A0;
                            if (gestaltTextField == null) {
                                Intrinsics.r("profileEditText");
                                throw null;
                            }
                            String B0 = gestaltTextField.B0();
                            if (kotlin.text.z.j(B0)) {
                                this$0.c8().i(this$0.getString(vq1.d.business_profile_name_error));
                                return;
                            }
                            this$0.f130819l0 = B0;
                            h hVar2 = this$0.f130817j0;
                            if (hVar2 != null) {
                                ((n) hVar2).u3();
                                return;
                            }
                            return;
                        }
                        if (i15 == 2) {
                            this$0.f8(false);
                            return;
                        }
                        if (i15 == 3) {
                            if (kotlin.text.z.j(this$0.f130821n0)) {
                                this$0.c8().i(this$0.getString(vq1.d.business_describe_missing_option));
                                return;
                            }
                            h hVar3 = this$0.f130817j0;
                            if (hVar3 != null) {
                                ((n) hVar3).r3();
                                return;
                            }
                            return;
                        }
                        if (i15 != 4) {
                            if (i15 != 5) {
                                return;
                            }
                            this$0.e8(false);
                            return;
                        }
                        String str = Intrinsics.d(this$0.f130822o0, xq1.a.YES.getValue()) ? "mobile_nux_yes_intent" : "mobile_nux";
                        String str2 = this$0.f130826s0;
                        if (Intrinsics.d(str2, "CREATE")) {
                            h hVar4 = this$0.f130817j0;
                            if (hVar4 != null) {
                                ((n) hVar4).s3(str, this$0.f130824q0, this$0.f130819l0, this$0.f130825r0, this$0.f130821n0, this$0.f130822o0, this$0.f130820m0);
                                return;
                            }
                            return;
                        }
                        if (!Intrinsics.d(str2, "CONVERTED") || (hVar = this$0.f130817j0) == null) {
                            return;
                        }
                        ((n) hVar).q3(str, this$0.f130819l0, this$0.f130821n0, this$0.f130822o0, this$0.f130820m0);
                        return;
                    case 1:
                        Map map2 = f.L0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.g8("signup_next");
                        int i16 = d.f130798a[this$0.f130818k0.ordinal()];
                        if (i16 == 2) {
                            this$0.f8(true);
                            return;
                        } else {
                            if (i16 != 5) {
                                return;
                            }
                            this$0.e8(true);
                            return;
                        }
                    case 2:
                        Map map3 = f.L0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "event");
                        if (it instanceof xn1.i) {
                            this$0.d8(kotlin.text.z.j(((xn1.i) it).f135454c));
                            return;
                        }
                        return;
                    case 3:
                        Map map4 = f.L0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "event");
                        if (it instanceof xn1.i) {
                            this$0.d8(kotlin.text.z.j(((xn1.i) it).f135454c));
                            return;
                        }
                        if (it instanceof xn1.f) {
                            GestaltButton gestaltButton2 = this$0.G0;
                            if (gestaltButton2 == null) {
                                Intrinsics.r("skipButton");
                                throw null;
                            }
                            gestaltButton2.d(new rc0.z0(8, it));
                            if (((xn1.f) it).f135448c) {
                                return;
                            }
                            GestaltTextField gestaltTextField2 = this$0.C0;
                            if (gestaltTextField2 != null) {
                                hf0.b.k(gestaltTextField2);
                                return;
                            } else {
                                Intrinsics.r("launchAdsEditText");
                                throw null;
                            }
                        }
                        return;
                    default:
                        Map map5 = f.L0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "event");
                        if (it instanceof xn1.i) {
                            this$0.d8(kotlin.text.z.j(((xn1.i) it).f135454c));
                            return;
                        }
                        if (it instanceof xn1.f) {
                            GestaltButton gestaltButton3 = this$0.G0;
                            if (gestaltButton3 == null) {
                                Intrinsics.r("skipButton");
                                throw null;
                            }
                            gestaltButton3.d(new rc0.z0(9, it));
                            if (((xn1.f) it).f135448c) {
                                return;
                            }
                            GestaltTextField gestaltTextField3 = this$0.B0;
                            if (gestaltTextField3 != null) {
                                hf0.b.k(gestaltTextField3);
                                return;
                            } else {
                                Intrinsics.r("websiteEditText");
                                throw null;
                            }
                        }
                        return;
                }
            }
        });
        GestaltButton gestaltButton2 = this.G0;
        if (gestaltButton2 == null) {
            Intrinsics.r("skipButton");
            throw null;
        }
        final int i14 = 1;
        gestaltButton2.d(e.f130800k).e(new gm1.a(this) { // from class: wq1.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f130795b;

            {
                this.f130795b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                h hVar;
                int i142 = i14;
                f this$0 = this.f130795b;
                switch (i142) {
                    case 0:
                        Map map = f.L0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.g8("signup_next");
                        int i15 = d.f130798a[this$0.f130818k0.ordinal()];
                        if (i15 == 1) {
                            GestaltTextField gestaltTextField = this$0.A0;
                            if (gestaltTextField == null) {
                                Intrinsics.r("profileEditText");
                                throw null;
                            }
                            String B0 = gestaltTextField.B0();
                            if (kotlin.text.z.j(B0)) {
                                this$0.c8().i(this$0.getString(vq1.d.business_profile_name_error));
                                return;
                            }
                            this$0.f130819l0 = B0;
                            h hVar2 = this$0.f130817j0;
                            if (hVar2 != null) {
                                ((n) hVar2).u3();
                                return;
                            }
                            return;
                        }
                        if (i15 == 2) {
                            this$0.f8(false);
                            return;
                        }
                        if (i15 == 3) {
                            if (kotlin.text.z.j(this$0.f130821n0)) {
                                this$0.c8().i(this$0.getString(vq1.d.business_describe_missing_option));
                                return;
                            }
                            h hVar3 = this$0.f130817j0;
                            if (hVar3 != null) {
                                ((n) hVar3).r3();
                                return;
                            }
                            return;
                        }
                        if (i15 != 4) {
                            if (i15 != 5) {
                                return;
                            }
                            this$0.e8(false);
                            return;
                        }
                        String str = Intrinsics.d(this$0.f130822o0, xq1.a.YES.getValue()) ? "mobile_nux_yes_intent" : "mobile_nux";
                        String str2 = this$0.f130826s0;
                        if (Intrinsics.d(str2, "CREATE")) {
                            h hVar4 = this$0.f130817j0;
                            if (hVar4 != null) {
                                ((n) hVar4).s3(str, this$0.f130824q0, this$0.f130819l0, this$0.f130825r0, this$0.f130821n0, this$0.f130822o0, this$0.f130820m0);
                                return;
                            }
                            return;
                        }
                        if (!Intrinsics.d(str2, "CONVERTED") || (hVar = this$0.f130817j0) == null) {
                            return;
                        }
                        ((n) hVar).q3(str, this$0.f130819l0, this$0.f130821n0, this$0.f130822o0, this$0.f130820m0);
                        return;
                    case 1:
                        Map map2 = f.L0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.g8("signup_next");
                        int i16 = d.f130798a[this$0.f130818k0.ordinal()];
                        if (i16 == 2) {
                            this$0.f8(true);
                            return;
                        } else {
                            if (i16 != 5) {
                                return;
                            }
                            this$0.e8(true);
                            return;
                        }
                    case 2:
                        Map map3 = f.L0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "event");
                        if (it instanceof xn1.i) {
                            this$0.d8(kotlin.text.z.j(((xn1.i) it).f135454c));
                            return;
                        }
                        return;
                    case 3:
                        Map map4 = f.L0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "event");
                        if (it instanceof xn1.i) {
                            this$0.d8(kotlin.text.z.j(((xn1.i) it).f135454c));
                            return;
                        }
                        if (it instanceof xn1.f) {
                            GestaltButton gestaltButton22 = this$0.G0;
                            if (gestaltButton22 == null) {
                                Intrinsics.r("skipButton");
                                throw null;
                            }
                            gestaltButton22.d(new rc0.z0(8, it));
                            if (((xn1.f) it).f135448c) {
                                return;
                            }
                            GestaltTextField gestaltTextField2 = this$0.C0;
                            if (gestaltTextField2 != null) {
                                hf0.b.k(gestaltTextField2);
                                return;
                            } else {
                                Intrinsics.r("launchAdsEditText");
                                throw null;
                            }
                        }
                        return;
                    default:
                        Map map5 = f.L0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "event");
                        if (it instanceof xn1.i) {
                            this$0.d8(kotlin.text.z.j(((xn1.i) it).f135454c));
                            return;
                        }
                        if (it instanceof xn1.f) {
                            GestaltButton gestaltButton3 = this$0.G0;
                            if (gestaltButton3 == null) {
                                Intrinsics.r("skipButton");
                                throw null;
                            }
                            gestaltButton3.d(new rc0.z0(9, it));
                            if (((xn1.f) it).f135448c) {
                                return;
                            }
                            GestaltTextField gestaltTextField3 = this$0.B0;
                            if (gestaltTextField3 != null) {
                                hf0.b.k(gestaltTextField3);
                                return;
                            } else {
                                Intrinsics.r("websiteEditText");
                                throw null;
                            }
                        }
                        return;
                }
            }
        });
        RadioGroup radioGroup = this.H0;
        if (radioGroup == null) {
            Intrinsics.r("descriptionRadioGroup");
            throw null;
        }
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(this) { // from class: wq1.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f130797b;

            {
                this.f130797b = this;
            }

            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup2, int i15) {
                int i16 = i13;
                f this$0 = this.f130797b;
                switch (i16) {
                    case 0:
                        Map map = f.L0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.getClass();
                        if (i15 == vq1.b.business_describe_option_blogger_id) {
                            this$0.f130821n0 = xq1.b.BLOGGER.getValue();
                        } else if (i15 == vq1.b.business_describe_option_other_id) {
                            this$0.f130821n0 = xq1.b.OTHER.getValue();
                        } else if (i15 == vq1.b.business_describe_option_consumer_id) {
                            this$0.f130821n0 = xq1.b.CONSUMER_GOOD_PRODUCT.getValue();
                        } else if (i15 == vq1.b.business_describe_option_contractor_id) {
                            this$0.f130821n0 = xq1.b.CONSTRACTOR_OR_SERVICE.getValue();
                        } else if (i15 == vq1.b.business_describe_option_publisher_id) {
                            this$0.f130821n0 = xq1.b.PUBLISHER_OR_MEDIA.getValue();
                        } else if (i15 == vq1.b.business_describe_option_not_sure_id) {
                            this$0.f130821n0 = xq1.b.NOT_SURE.getValue();
                        } else if (i15 == vq1.b.business_describe_option_marketplace_id) {
                            this$0.f130821n0 = xq1.b.ONLINE_RETAIL.getValue();
                        } else if (i15 == vq1.b.business_describe_option_local_retail_id) {
                            this$0.f130821n0 = xq1.b.LOCAL_RETAIL.getValue();
                        } else if (i15 == vq1.b.business_describe_option_creator_id) {
                            this$0.f130821n0 = xq1.b.INFLUENCER_OR_CELEBRITY.getValue();
                        } else if (i15 == -1) {
                            this$0.f130821n0 = "";
                        }
                        this$0.d8(kotlin.text.z.j(this$0.f130821n0));
                        break;
                    default:
                        Map map2 = f.L0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.getClass();
                        if (i15 == vq1.b.business_ads_option_yes) {
                            this$0.f130822o0 = xq1.a.YES.getValue();
                        } else if (i15 == vq1.b.business_ads_option_no) {
                            this$0.f130822o0 = xq1.a.NO.getValue();
                        } else if (i15 == vq1.b.business_ads_option_not_sure) {
                            this$0.f130822o0 = xq1.a.NOT_SURE.getValue();
                        } else if (i15 == -1) {
                            this$0.f130822o0 = "";
                        }
                        this$0.d8(kotlin.text.z.j(this$0.f130822o0));
                        break;
                }
            }
        });
        RadioGroup radioGroup2 = this.I0;
        if (radioGroup2 == null) {
            Intrinsics.r("runAdsRadioGroup");
            throw null;
        }
        radioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(this) { // from class: wq1.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f130797b;

            {
                this.f130797b = this;
            }

            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup22, int i15) {
                int i16 = i14;
                f this$0 = this.f130797b;
                switch (i16) {
                    case 0:
                        Map map = f.L0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.getClass();
                        if (i15 == vq1.b.business_describe_option_blogger_id) {
                            this$0.f130821n0 = xq1.b.BLOGGER.getValue();
                        } else if (i15 == vq1.b.business_describe_option_other_id) {
                            this$0.f130821n0 = xq1.b.OTHER.getValue();
                        } else if (i15 == vq1.b.business_describe_option_consumer_id) {
                            this$0.f130821n0 = xq1.b.CONSUMER_GOOD_PRODUCT.getValue();
                        } else if (i15 == vq1.b.business_describe_option_contractor_id) {
                            this$0.f130821n0 = xq1.b.CONSTRACTOR_OR_SERVICE.getValue();
                        } else if (i15 == vq1.b.business_describe_option_publisher_id) {
                            this$0.f130821n0 = xq1.b.PUBLISHER_OR_MEDIA.getValue();
                        } else if (i15 == vq1.b.business_describe_option_not_sure_id) {
                            this$0.f130821n0 = xq1.b.NOT_SURE.getValue();
                        } else if (i15 == vq1.b.business_describe_option_marketplace_id) {
                            this$0.f130821n0 = xq1.b.ONLINE_RETAIL.getValue();
                        } else if (i15 == vq1.b.business_describe_option_local_retail_id) {
                            this$0.f130821n0 = xq1.b.LOCAL_RETAIL.getValue();
                        } else if (i15 == vq1.b.business_describe_option_creator_id) {
                            this$0.f130821n0 = xq1.b.INFLUENCER_OR_CELEBRITY.getValue();
                        } else if (i15 == -1) {
                            this$0.f130821n0 = "";
                        }
                        this$0.d8(kotlin.text.z.j(this$0.f130821n0));
                        break;
                    default:
                        Map map2 = f.L0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.getClass();
                        if (i15 == vq1.b.business_ads_option_yes) {
                            this$0.f130822o0 = xq1.a.YES.getValue();
                        } else if (i15 == vq1.b.business_ads_option_no) {
                            this$0.f130822o0 = xq1.a.NO.getValue();
                        } else if (i15 == vq1.b.business_ads_option_not_sure) {
                            this$0.f130822o0 = xq1.a.NOT_SURE.getValue();
                        } else if (i15 == -1) {
                            this$0.f130822o0 = "";
                        }
                        this$0.d8(kotlin.text.z.j(this$0.f130822o0));
                        break;
                }
            }
        });
        GestaltTextField gestaltTextField = this.A0;
        if (gestaltTextField == null) {
            Intrinsics.r("profileEditText");
            throw null;
        }
        final int i15 = 2;
        gestaltTextField.Z(new gm1.a(this) { // from class: wq1.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f130795b;

            {
                this.f130795b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                h hVar;
                int i142 = i15;
                f this$0 = this.f130795b;
                switch (i142) {
                    case 0:
                        Map map = f.L0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.g8("signup_next");
                        int i152 = d.f130798a[this$0.f130818k0.ordinal()];
                        if (i152 == 1) {
                            GestaltTextField gestaltTextField2 = this$0.A0;
                            if (gestaltTextField2 == null) {
                                Intrinsics.r("profileEditText");
                                throw null;
                            }
                            String B0 = gestaltTextField2.B0();
                            if (kotlin.text.z.j(B0)) {
                                this$0.c8().i(this$0.getString(vq1.d.business_profile_name_error));
                                return;
                            }
                            this$0.f130819l0 = B0;
                            h hVar2 = this$0.f130817j0;
                            if (hVar2 != null) {
                                ((n) hVar2).u3();
                                return;
                            }
                            return;
                        }
                        if (i152 == 2) {
                            this$0.f8(false);
                            return;
                        }
                        if (i152 == 3) {
                            if (kotlin.text.z.j(this$0.f130821n0)) {
                                this$0.c8().i(this$0.getString(vq1.d.business_describe_missing_option));
                                return;
                            }
                            h hVar3 = this$0.f130817j0;
                            if (hVar3 != null) {
                                ((n) hVar3).r3();
                                return;
                            }
                            return;
                        }
                        if (i152 != 4) {
                            if (i152 != 5) {
                                return;
                            }
                            this$0.e8(false);
                            return;
                        }
                        String str = Intrinsics.d(this$0.f130822o0, xq1.a.YES.getValue()) ? "mobile_nux_yes_intent" : "mobile_nux";
                        String str2 = this$0.f130826s0;
                        if (Intrinsics.d(str2, "CREATE")) {
                            h hVar4 = this$0.f130817j0;
                            if (hVar4 != null) {
                                ((n) hVar4).s3(str, this$0.f130824q0, this$0.f130819l0, this$0.f130825r0, this$0.f130821n0, this$0.f130822o0, this$0.f130820m0);
                                return;
                            }
                            return;
                        }
                        if (!Intrinsics.d(str2, "CONVERTED") || (hVar = this$0.f130817j0) == null) {
                            return;
                        }
                        ((n) hVar).q3(str, this$0.f130819l0, this$0.f130821n0, this$0.f130822o0, this$0.f130820m0);
                        return;
                    case 1:
                        Map map2 = f.L0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.g8("signup_next");
                        int i16 = d.f130798a[this$0.f130818k0.ordinal()];
                        if (i16 == 2) {
                            this$0.f8(true);
                            return;
                        } else {
                            if (i16 != 5) {
                                return;
                            }
                            this$0.e8(true);
                            return;
                        }
                    case 2:
                        Map map3 = f.L0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "event");
                        if (it instanceof xn1.i) {
                            this$0.d8(kotlin.text.z.j(((xn1.i) it).f135454c));
                            return;
                        }
                        return;
                    case 3:
                        Map map4 = f.L0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "event");
                        if (it instanceof xn1.i) {
                            this$0.d8(kotlin.text.z.j(((xn1.i) it).f135454c));
                            return;
                        }
                        if (it instanceof xn1.f) {
                            GestaltButton gestaltButton22 = this$0.G0;
                            if (gestaltButton22 == null) {
                                Intrinsics.r("skipButton");
                                throw null;
                            }
                            gestaltButton22.d(new rc0.z0(8, it));
                            if (((xn1.f) it).f135448c) {
                                return;
                            }
                            GestaltTextField gestaltTextField22 = this$0.C0;
                            if (gestaltTextField22 != null) {
                                hf0.b.k(gestaltTextField22);
                                return;
                            } else {
                                Intrinsics.r("launchAdsEditText");
                                throw null;
                            }
                        }
                        return;
                    default:
                        Map map5 = f.L0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "event");
                        if (it instanceof xn1.i) {
                            this$0.d8(kotlin.text.z.j(((xn1.i) it).f135454c));
                            return;
                        }
                        if (it instanceof xn1.f) {
                            GestaltButton gestaltButton3 = this$0.G0;
                            if (gestaltButton3 == null) {
                                Intrinsics.r("skipButton");
                                throw null;
                            }
                            gestaltButton3.d(new rc0.z0(9, it));
                            if (((xn1.f) it).f135448c) {
                                return;
                            }
                            GestaltTextField gestaltTextField3 = this$0.B0;
                            if (gestaltTextField3 != null) {
                                hf0.b.k(gestaltTextField3);
                                return;
                            } else {
                                Intrinsics.r("websiteEditText");
                                throw null;
                            }
                        }
                        return;
                }
            }
        });
        GestaltTextField gestaltTextField2 = this.C0;
        if (gestaltTextField2 == null) {
            Intrinsics.r("launchAdsEditText");
            throw null;
        }
        final int i16 = 3;
        gestaltTextField2.Z(new gm1.a(this) { // from class: wq1.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f130795b;

            {
                this.f130795b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                h hVar;
                int i142 = i16;
                f this$0 = this.f130795b;
                switch (i142) {
                    case 0:
                        Map map = f.L0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.g8("signup_next");
                        int i152 = d.f130798a[this$0.f130818k0.ordinal()];
                        if (i152 == 1) {
                            GestaltTextField gestaltTextField22 = this$0.A0;
                            if (gestaltTextField22 == null) {
                                Intrinsics.r("profileEditText");
                                throw null;
                            }
                            String B0 = gestaltTextField22.B0();
                            if (kotlin.text.z.j(B0)) {
                                this$0.c8().i(this$0.getString(vq1.d.business_profile_name_error));
                                return;
                            }
                            this$0.f130819l0 = B0;
                            h hVar2 = this$0.f130817j0;
                            if (hVar2 != null) {
                                ((n) hVar2).u3();
                                return;
                            }
                            return;
                        }
                        if (i152 == 2) {
                            this$0.f8(false);
                            return;
                        }
                        if (i152 == 3) {
                            if (kotlin.text.z.j(this$0.f130821n0)) {
                                this$0.c8().i(this$0.getString(vq1.d.business_describe_missing_option));
                                return;
                            }
                            h hVar3 = this$0.f130817j0;
                            if (hVar3 != null) {
                                ((n) hVar3).r3();
                                return;
                            }
                            return;
                        }
                        if (i152 != 4) {
                            if (i152 != 5) {
                                return;
                            }
                            this$0.e8(false);
                            return;
                        }
                        String str = Intrinsics.d(this$0.f130822o0, xq1.a.YES.getValue()) ? "mobile_nux_yes_intent" : "mobile_nux";
                        String str2 = this$0.f130826s0;
                        if (Intrinsics.d(str2, "CREATE")) {
                            h hVar4 = this$0.f130817j0;
                            if (hVar4 != null) {
                                ((n) hVar4).s3(str, this$0.f130824q0, this$0.f130819l0, this$0.f130825r0, this$0.f130821n0, this$0.f130822o0, this$0.f130820m0);
                                return;
                            }
                            return;
                        }
                        if (!Intrinsics.d(str2, "CONVERTED") || (hVar = this$0.f130817j0) == null) {
                            return;
                        }
                        ((n) hVar).q3(str, this$0.f130819l0, this$0.f130821n0, this$0.f130822o0, this$0.f130820m0);
                        return;
                    case 1:
                        Map map2 = f.L0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.g8("signup_next");
                        int i162 = d.f130798a[this$0.f130818k0.ordinal()];
                        if (i162 == 2) {
                            this$0.f8(true);
                            return;
                        } else {
                            if (i162 != 5) {
                                return;
                            }
                            this$0.e8(true);
                            return;
                        }
                    case 2:
                        Map map3 = f.L0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "event");
                        if (it instanceof xn1.i) {
                            this$0.d8(kotlin.text.z.j(((xn1.i) it).f135454c));
                            return;
                        }
                        return;
                    case 3:
                        Map map4 = f.L0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "event");
                        if (it instanceof xn1.i) {
                            this$0.d8(kotlin.text.z.j(((xn1.i) it).f135454c));
                            return;
                        }
                        if (it instanceof xn1.f) {
                            GestaltButton gestaltButton22 = this$0.G0;
                            if (gestaltButton22 == null) {
                                Intrinsics.r("skipButton");
                                throw null;
                            }
                            gestaltButton22.d(new rc0.z0(8, it));
                            if (((xn1.f) it).f135448c) {
                                return;
                            }
                            GestaltTextField gestaltTextField222 = this$0.C0;
                            if (gestaltTextField222 != null) {
                                hf0.b.k(gestaltTextField222);
                                return;
                            } else {
                                Intrinsics.r("launchAdsEditText");
                                throw null;
                            }
                        }
                        return;
                    default:
                        Map map5 = f.L0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "event");
                        if (it instanceof xn1.i) {
                            this$0.d8(kotlin.text.z.j(((xn1.i) it).f135454c));
                            return;
                        }
                        if (it instanceof xn1.f) {
                            GestaltButton gestaltButton3 = this$0.G0;
                            if (gestaltButton3 == null) {
                                Intrinsics.r("skipButton");
                                throw null;
                            }
                            gestaltButton3.d(new rc0.z0(9, it));
                            if (((xn1.f) it).f135448c) {
                                return;
                            }
                            GestaltTextField gestaltTextField3 = this$0.B0;
                            if (gestaltTextField3 != null) {
                                hf0.b.k(gestaltTextField3);
                                return;
                            } else {
                                Intrinsics.r("websiteEditText");
                                throw null;
                            }
                        }
                        return;
                }
            }
        });
        GestaltTextField gestaltTextField3 = this.B0;
        if (gestaltTextField3 == null) {
            Intrinsics.r("websiteEditText");
            throw null;
        }
        final int i17 = 4;
        gestaltTextField3.Z(new gm1.a(this) { // from class: wq1.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f130795b;

            {
                this.f130795b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                h hVar;
                int i142 = i17;
                f this$0 = this.f130795b;
                switch (i142) {
                    case 0:
                        Map map = f.L0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.g8("signup_next");
                        int i152 = d.f130798a[this$0.f130818k0.ordinal()];
                        if (i152 == 1) {
                            GestaltTextField gestaltTextField22 = this$0.A0;
                            if (gestaltTextField22 == null) {
                                Intrinsics.r("profileEditText");
                                throw null;
                            }
                            String B0 = gestaltTextField22.B0();
                            if (kotlin.text.z.j(B0)) {
                                this$0.c8().i(this$0.getString(vq1.d.business_profile_name_error));
                                return;
                            }
                            this$0.f130819l0 = B0;
                            h hVar2 = this$0.f130817j0;
                            if (hVar2 != null) {
                                ((n) hVar2).u3();
                                return;
                            }
                            return;
                        }
                        if (i152 == 2) {
                            this$0.f8(false);
                            return;
                        }
                        if (i152 == 3) {
                            if (kotlin.text.z.j(this$0.f130821n0)) {
                                this$0.c8().i(this$0.getString(vq1.d.business_describe_missing_option));
                                return;
                            }
                            h hVar3 = this$0.f130817j0;
                            if (hVar3 != null) {
                                ((n) hVar3).r3();
                                return;
                            }
                            return;
                        }
                        if (i152 != 4) {
                            if (i152 != 5) {
                                return;
                            }
                            this$0.e8(false);
                            return;
                        }
                        String str = Intrinsics.d(this$0.f130822o0, xq1.a.YES.getValue()) ? "mobile_nux_yes_intent" : "mobile_nux";
                        String str2 = this$0.f130826s0;
                        if (Intrinsics.d(str2, "CREATE")) {
                            h hVar4 = this$0.f130817j0;
                            if (hVar4 != null) {
                                ((n) hVar4).s3(str, this$0.f130824q0, this$0.f130819l0, this$0.f130825r0, this$0.f130821n0, this$0.f130822o0, this$0.f130820m0);
                                return;
                            }
                            return;
                        }
                        if (!Intrinsics.d(str2, "CONVERTED") || (hVar = this$0.f130817j0) == null) {
                            return;
                        }
                        ((n) hVar).q3(str, this$0.f130819l0, this$0.f130821n0, this$0.f130822o0, this$0.f130820m0);
                        return;
                    case 1:
                        Map map2 = f.L0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.g8("signup_next");
                        int i162 = d.f130798a[this$0.f130818k0.ordinal()];
                        if (i162 == 2) {
                            this$0.f8(true);
                            return;
                        } else {
                            if (i162 != 5) {
                                return;
                            }
                            this$0.e8(true);
                            return;
                        }
                    case 2:
                        Map map3 = f.L0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "event");
                        if (it instanceof xn1.i) {
                            this$0.d8(kotlin.text.z.j(((xn1.i) it).f135454c));
                            return;
                        }
                        return;
                    case 3:
                        Map map4 = f.L0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "event");
                        if (it instanceof xn1.i) {
                            this$0.d8(kotlin.text.z.j(((xn1.i) it).f135454c));
                            return;
                        }
                        if (it instanceof xn1.f) {
                            GestaltButton gestaltButton22 = this$0.G0;
                            if (gestaltButton22 == null) {
                                Intrinsics.r("skipButton");
                                throw null;
                            }
                            gestaltButton22.d(new rc0.z0(8, it));
                            if (((xn1.f) it).f135448c) {
                                return;
                            }
                            GestaltTextField gestaltTextField222 = this$0.C0;
                            if (gestaltTextField222 != null) {
                                hf0.b.k(gestaltTextField222);
                                return;
                            } else {
                                Intrinsics.r("launchAdsEditText");
                                throw null;
                            }
                        }
                        return;
                    default:
                        Map map5 = f.L0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "event");
                        if (it instanceof xn1.i) {
                            this$0.d8(kotlin.text.z.j(((xn1.i) it).f135454c));
                            return;
                        }
                        if (it instanceof xn1.f) {
                            GestaltButton gestaltButton3 = this$0.G0;
                            if (gestaltButton3 == null) {
                                Intrinsics.r("skipButton");
                                throw null;
                            }
                            gestaltButton3.d(new rc0.z0(9, it));
                            if (((xn1.f) it).f135448c) {
                                return;
                            }
                            GestaltTextField gestaltTextField32 = this$0.B0;
                            if (gestaltTextField32 != null) {
                                hf0.b.k(gestaltTextField32);
                                return;
                            } else {
                                Intrinsics.r("websiteEditText");
                                throw null;
                            }
                        }
                        return;
                }
            }
        });
        i8(this.f130818k0);
    }
}
