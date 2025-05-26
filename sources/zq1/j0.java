package zq1;

import h32.f1;
import java.util.Calendar;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import m60.x0;
import yq1.l2;

/* loaded from: classes4.dex */
public final class j0 extends yk1.t implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public rr1.g f142701a;

    @Override // yk1.p, yk1.b
    /* renamed from: onBind */
    public final void r3(yk1.n nVar) {
        h0 view = (h0) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((yk1.r) view);
        Intrinsics.checkNotNullParameter(this, "presenter");
        ((l2) view).f139908n0 = this;
    }

    public final void p3(h32.i0 context) {
        Intrinsics.checkNotNullParameter(context, "context");
        getPinalytics().K(f1.CLICK, null, com.bumptech.glide.d.z0(context, m.f142708l), null, false);
    }

    public final void q3(String arg, ar1.d step) {
        Integer valueOf;
        Intrinsics.checkNotNullParameter(arg, "arg");
        Intrinsics.checkNotNullParameter(step, "step");
        int i13 = i0.f142684a[step.ordinal()];
        Integer num = null;
        if (i13 != 1) {
            if (i13 != 2) {
                if (i13 != 3) {
                    if (i13 == 4) {
                        if (kotlin.text.z.j(arg)) {
                            num = Integer.valueOf(vq1.d.add_your_age);
                        } else if (new Regex("[dmy]").a(arg)) {
                            int hashCode = arg.hashCode();
                            if (hashCode == 100) {
                                if (arg.equals("d")) {
                                    valueOf = Integer.valueOf(vq1.d.enter_valid_day);
                                }
                                valueOf = Integer.valueOf(vq1.d.enter_valid_day_month_year);
                            } else if (hashCode == 109) {
                                if (arg.equals("m")) {
                                    valueOf = Integer.valueOf(vq1.d.enter_valid_month);
                                }
                                valueOf = Integer.valueOf(vq1.d.enter_valid_day_month_year);
                            } else if (hashCode == 121) {
                                if (arg.equals("y")) {
                                    valueOf = Integer.valueOf(vq1.d.enter_valid_year);
                                }
                                valueOf = Integer.valueOf(vq1.d.enter_valid_day_month_year);
                            } else if (hashCode == 3209) {
                                if (arg.equals("dm")) {
                                    valueOf = Integer.valueOf(vq1.d.enter_valid_day_month);
                                }
                                valueOf = Integer.valueOf(vq1.d.enter_valid_day_month_year);
                            } else if (hashCode != 3221) {
                                if (hashCode == 3500 && arg.equals("my")) {
                                    valueOf = Integer.valueOf(vq1.d.enter_valid_month_year);
                                }
                                valueOf = Integer.valueOf(vq1.d.enter_valid_day_month_year);
                            } else {
                                if (arg.equals("dy")) {
                                    valueOf = Integer.valueOf(vq1.d.enter_valid_day_year);
                                }
                                valueOf = Integer.valueOf(vq1.d.enter_valid_day_month_year);
                            }
                            num = valueOf;
                        } else {
                            try {
                                Integer.parseInt(arg);
                                Map map = tr1.b.f119038a;
                                long g13 = ((lb0.b) lb0.n.f82725d.a()).g("PREF_REGISTER_RESTRICT_DATE", 0L);
                                if (g13 != 0) {
                                    Calendar calendar = Calendar.getInstance();
                                    calendar.setTimeInMillis(g13);
                                    calendar.add(2, 6);
                                    if (calendar.after(Calendar.getInstance())) {
                                        num = Integer.valueOf(vq1.d.error_underage_signup);
                                    }
                                }
                                if (Integer.parseInt(arg) < 5) {
                                    num = Integer.valueOf(vq1.d.error_invalid_age);
                                } else if (Integer.parseInt(arg) >= 120) {
                                    num = Integer.valueOf(vq1.d.error_invalid_age);
                                } else if (Integer.parseInt(arg) < 13) {
                                    ((h0) getView()).W();
                                    num = -1;
                                }
                            } catch (NumberFormatException unused) {
                                num = Integer.valueOf(vq1.d.error_invalid_age);
                            }
                        }
                    }
                } else if (kotlin.text.z.j(arg)) {
                    num = Integer.valueOf(vq1.d.add_your_name);
                }
            } else if (kotlin.text.z.j(arg)) {
                num = Integer.valueOf(vq1.d.add_your_password);
            } else {
                rr1.g gVar = this.f142701a;
                if (gVar == null) {
                    Intrinsics.r("passwordValidationUtils");
                    throw null;
                }
                if (!gVar.c(arg, false)) {
                    num = Integer.valueOf(x0.invalid_password_too_short);
                }
            }
        } else if (kotlin.text.z.j(arg)) {
            num = Integer.valueOf(vq1.d.add_your_email);
        } else if (!tr1.b.c(arg)) {
            num = Integer.valueOf(vq1.d.invalid_email);
        }
        if (num == null) {
            ((h0) getView()).N2();
            return;
        }
        int intValue = num.intValue();
        yk1.n view = getView();
        Intrinsics.checkNotNullExpressionValue(view, "<get-view>(...)");
        ((h0) view).G1(intValue, false);
    }

    @Override // yk1.p
    /* renamed from: onBind */
    public final void r3(yk1.r rVar) {
        h0 view = (h0) rVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((yk1.r) view);
        Intrinsics.checkNotNullParameter(this, "presenter");
        ((l2) view).f139908n0 = this;
    }
}
