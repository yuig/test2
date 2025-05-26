package yq1;

import android.app.DatePickerDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.gestalt.banner.GestaltBanner;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.identity.authentication.view.TouchInterceptor;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import so.sb;
import so.tb;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyq1/s1;", "Lyq1/l2;", "<init>", "()V", "identity_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class s1 extends j0 {
    public static final /* synthetic */ int I0 = 0;
    public tb C0;
    public il1.a D0;
    public DatePickerDialog F0;
    public boolean H0;
    public final Calendar E0 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    public String G0 = "";

    @Override // yq1.l2, zq1.h0
    public final void G1(int i13, boolean z13) {
        super.G1(i13, true);
        GestaltText gestaltText = this.f139911q0;
        if (gestaltText == null) {
            Intrinsics.r("errorTextView");
            throw null;
        }
        gestaltText.i(c.F);
        d8().i(c.G);
    }

    @Override // zq1.h0
    public final void N2() {
        long timeInMillis = this.E0.getTimeInMillis() / 1000;
        ar1.a aVar = this.f139907m0;
        if (aVar != null) {
            aVar.I0(String.valueOf(timeInMillis), ar1.d.BIRTHDAY_STEP);
        }
    }

    @Override // yq1.l2, zq1.h0
    public final void W() {
        tb tbVar = this.C0;
        if (tbVar == null) {
            Intrinsics.r("identityAlertUtils");
            throw null;
        }
        String string = getResources().getString(m60.x0.text_birthday_dialog_confirm, o8(true));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        tbVar.a(string, Integer.valueOf(m60.x0.text_age_dialog_confirm_subtitle), m60.x0.edit_info, new r1(this), sb.f114624i);
    }

    @Override // yq1.l2
    public final String f8() {
        String string = getString(vq1.d.enter_your_age_hint);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @Override // yq1.l2
    public final String g8() {
        String string = getString(vq1.d.signup_require_birthdate_description);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @Override // uk1.c
    /* renamed from: getAuxData */
    public final HashMap getO0() {
        Map map = tr1.b.f119038a;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        return ep.b.o("value", tr1.b.f(n8(), qb0.b.e(requireContext)) ? "isUnderAge" : "isNotUnderAge");
    }

    @Override // yq1.l2
    public final String h8() {
        String string = getString(vq1.d.get_user_birthday, this.G0);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @Override // yq1.l2
    public final void l8() {
        e8().Z(new o1(this, 0));
    }

    public final int n8() {
        int i13 = Calendar.getInstance().get(1);
        Calendar calendar = this.E0;
        int i14 = i13 - calendar.get(1);
        return Calendar.getInstance().get(6) < calendar.get(6) ? i14 - 1 : i14;
    }

    public final String o8(boolean z13) {
        DateFormat dateInstance = z13 ? DateFormat.getDateInstance(1) : DateFormat.getDateInstance();
        Calendar calendar = this.E0;
        dateInstance.setTimeZone(calendar.getTimeZone());
        String format = dateInstance.format(calendar.getTime());
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    @Override // yq1.l2, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        List split$default;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (arguments.getLong("EXTRA_SIGNUP_BIRTHDATE", 0L) != 0) {
                this.E0.setTimeInMillis(arguments.getLong("EXTRA_SIGNUP_BIRTHDATE", 0L) * 1000);
                arguments.remove("EXTRA_SIGNUP_BIRTHDATE");
            }
            String string = arguments.getString("EXTRA_SIGNUP_NAME", this.G0);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            split$default = StringsKt__StringsKt.split$default(string, new String[]{" "}, false, 0, 6, null);
            this.G0 = (String) split$default.get(0);
            this.H0 = arguments.getBoolean("EXTRA_IS_GOOGLE_AUTH");
            arguments.remove("EXTRA_SIGNUP_NAME");
        }
    }

    @Override // yq1.l2, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        e8().X(c.C);
        e8().X(c.E);
        int i13 = eo1.f.DatePickerDialog;
        final int i14 = 1;
        q91.l0 l0Var = new q91.l0(this, i14);
        Context requireContext = requireContext();
        Calendar calendar = this.E0;
        int i15 = 2;
        DatePickerDialog datePickerDialog = new DatePickerDialog(requireContext, i13, l0Var, calendar.get(1), calendar.get(2), calendar.get(5));
        datePickerDialog.setOnCancelListener(new df.m1(this, i15));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        final int i16 = 0;
        datePickerDialog.setCanceledOnTouchOutside(false);
        ViewGroup.LayoutParams layoutParams = datePickerDialog.getDatePicker().getCalendarView().getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        ((LinearLayout.LayoutParams) layoutParams).height = -2;
        datePickerDialog.show();
        this.F0 = datePickerDialog;
        d8().i(new q1(this, i15)).j(new o1(this, i14));
        j8(new View.OnClickListener(this) { // from class: yq1.p1

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s1 f139942b;

            {
                this.f139942b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i17 = i16;
                s1 this$0 = this.f139942b;
                switch (i17) {
                    case 0:
                        int i18 = s1.I0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        zq1.g0 g0Var = this$0.f139908n0;
                        if (g0Var != null) {
                            ((zq1.j0) g0Var).q3(this$0.e8().B0(), ar1.d.BIRTHDAY_STEP);
                            return;
                        }
                        return;
                    default:
                        int i19 = s1.I0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        zq1.g0 g0Var2 = this$0.f139908n0;
                        if (g0Var2 != null) {
                            ((zq1.j0) g0Var2).p3(this$0.generateLoggingContext());
                        }
                        il1.a aVar = this$0.D0;
                        if (aVar == null) {
                            Intrinsics.r("fragmentFactory");
                            throw null;
                        }
                        nl1.d dVar = (nl1.d) aVar.e((ScreenLocation) com.pinterest.screens.j2.f51010c.getValue());
                        androidx.fragment.app.w0 supportFragmentManager = this$0.requireActivity().getSupportFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                        mo1.c.c(supportFragmentManager, vq1.b.fragment_wrapper, dVar, false, mo1.a.FADE, 32);
                        return;
                }
            }
        });
        GestaltText gestaltText = this.f139913s0;
        if (gestaltText == null) {
            Intrinsics.r("explanationTextView");
            throw null;
        }
        gestaltText.i(c.D);
        i8();
        h32.i0 generateLoggingContext = generateLoggingContext();
        s7().K(h32.f1.VIEW, null, com.bumptech.glide.d.z0(generateLoggingContext, c.B), null, false);
        if (this.H0) {
            View findViewById = v13.findViewById(vq1.b.google_signup_info_banner);
            Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
            GestaltBanner gestaltBanner = (GestaltBanner) findViewById;
            if (gestaltBanner == null) {
                Intrinsics.r("signupBanner");
                throw null;
            }
            gestaltBanner.L(new q1(this, i14));
            ((TouchInterceptor) v13.findViewById(vq1.b.google_signup_info_banner_container)).setOnClickListener(new View.OnClickListener(this) { // from class: yq1.p1

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ s1 f139942b;

                {
                    this.f139942b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i17 = i14;
                    s1 this$0 = this.f139942b;
                    switch (i17) {
                        case 0:
                            int i18 = s1.I0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            zq1.g0 g0Var = this$0.f139908n0;
                            if (g0Var != null) {
                                ((zq1.j0) g0Var).q3(this$0.e8().B0(), ar1.d.BIRTHDAY_STEP);
                                return;
                            }
                            return;
                        default:
                            int i19 = s1.I0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            zq1.g0 g0Var2 = this$0.f139908n0;
                            if (g0Var2 != null) {
                                ((zq1.j0) g0Var2).p3(this$0.generateLoggingContext());
                            }
                            il1.a aVar = this$0.D0;
                            if (aVar == null) {
                                Intrinsics.r("fragmentFactory");
                                throw null;
                            }
                            nl1.d dVar = (nl1.d) aVar.e((ScreenLocation) com.pinterest.screens.j2.f51010c.getValue());
                            androidx.fragment.app.w0 supportFragmentManager = this$0.requireActivity().getSupportFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                            mo1.c.c(supportFragmentManager, vq1.b.fragment_wrapper, dVar, false, mo1.a.FADE, 32);
                            return;
                    }
                }
            });
        }
    }
}
