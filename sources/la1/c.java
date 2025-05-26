package la1;

import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import m60.x0;
import u50.k0;

/* loaded from: classes5.dex */
public final class c extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final c f82495j = new c(0);

    /* renamed from: k, reason: collision with root package name */
    public static final c f82496k = new c(1);

    /* renamed from: l, reason: collision with root package name */
    public static final c f82497l = new c(2);

    /* renamed from: m, reason: collision with root package name */
    public static final c f82498m = new c(3);

    /* renamed from: n, reason: collision with root package name */
    public static final c f82499n = new c(4);

    /* renamed from: o, reason: collision with root package name */
    public static final c f82500o = new c(5);

    /* renamed from: p, reason: collision with root package name */
    public static final c f82501p = new c(6);

    /* renamed from: q, reason: collision with root package name */
    public static final c f82502q = new c(7);

    /* renamed from: r, reason: collision with root package name */
    public static final c f82503r = new c(8);

    /* renamed from: s, reason: collision with root package name */
    public static final c f82504s = new c(9);

    /* renamed from: t, reason: collision with root package name */
    public static final c f82505t = new c(10);

    /* renamed from: u, reason: collision with root package name */
    public static final c f82506u = new c(11);

    /* renamed from: v, reason: collision with root package name */
    public static final c f82507v = new c(12);

    /* renamed from: w, reason: collision with root package name */
    public static final c f82508w = new c(13);

    /* renamed from: x, reason: collision with root package name */
    public static final c f82509x = new c(14);

    /* renamed from: y, reason: collision with root package name */
    public static final c f82510y = new c(15);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f82511i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i13) {
        super(1);
        this.f82511i = i13;
    }

    public final rn1.a b(rn1.a state) {
        switch (this.f82511i) {
            case 4:
                Intrinsics.checkNotNullParameter(state, "state");
                return rn1.a.y(state, null, null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097087);
            case 5:
                Intrinsics.checkNotNullParameter(state, "state");
                return rn1.a.y(state, null, null, null, null, null, 0, fm1.c.GONE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097087);
            case 6:
                Intrinsics.checkNotNullParameter(state, "it");
                int i13 = b52.c.close_account_heading_message;
                String[] formatArgs = new String[0];
                Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
                return rn1.a.y(state, new k0(i13, new ArrayList(0)), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            case 7:
                Intrinsics.checkNotNullParameter(state, "it");
                int i14 = b52.c.deleting_accounts_message;
                String[] formatArgs2 = new String[0];
                Intrinsics.checkNotNullParameter(formatArgs2, "formatArgs");
                return rn1.a.y(state, new k0(i14, new ArrayList(0)), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            case 8:
                Intrinsics.checkNotNullParameter(state, "it");
                int i15 = b52.c.single_user_account_close_message;
                String[] formatArgs3 = new String[0];
                Intrinsics.checkNotNullParameter(formatArgs3, "formatArgs");
                return rn1.a.y(state, new k0(i15, new ArrayList(0)), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            case 9:
                Intrinsics.checkNotNullParameter(state, "it");
                int i16 = b52.c.linked_business_account_delete_message;
                String[] formatArgs4 = new String[0];
                Intrinsics.checkNotNullParameter(formatArgs4, "formatArgs");
                return rn1.a.y(state, new k0(i16, new ArrayList(0)), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            case 10:
                Intrinsics.checkNotNullParameter(state, "it");
                int i17 = b52.c.deactivate_account_heading_message;
                String[] formatArgs5 = new String[0];
                Intrinsics.checkNotNullParameter(formatArgs5, "formatArgs");
                return rn1.a.y(state, new k0(i17, new ArrayList(0)), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            case 11:
                Intrinsics.checkNotNullParameter(state, "it");
                int i18 = b52.c.deactivating_accounts_subheading_message;
                String[] formatArgs6 = new String[0];
                Intrinsics.checkNotNullParameter(formatArgs6, "formatArgs");
                return rn1.a.y(state, new k0(i18, new ArrayList(0)), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            case 12:
                Intrinsics.checkNotNullParameter(state, "it");
                int i19 = b52.c.single_user_account_deactivate_explanation_message;
                String[] formatArgs7 = new String[0];
                Intrinsics.checkNotNullParameter(formatArgs7, "formatArgs");
                return rn1.a.y(state, new k0(i19, new ArrayList(0)), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            default:
                Intrinsics.checkNotNullParameter(state, "it");
                int i23 = b52.c.linked_business_account_deactivate_explanation_message;
                String[] formatArgs8 = new String[0];
                Intrinsics.checkNotNullParameter(formatArgs8, "formatArgs");
                return rn1.a.y(state, new k0(i23, new ArrayList(0)), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
        }
    }

    public final yl1.b e(yl1.b it) {
        switch (this.f82511i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                int i13 = b52.c.close_account_survey_send_email;
                String[] formatArgs = new String[0];
                Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
                return yl1.b.f(it, new k0(i13, new ArrayList(0)), false, null, null, null, null, null, null, 0, null, 1020);
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                int i14 = x0.cancel;
                String[] formatArgs2 = new String[0];
                Intrinsics.checkNotNullParameter(formatArgs2, "formatArgs");
                return yl1.b.f(it, new k0(i14, new ArrayList(0)), false, null, null, null, null, null, null, 0, null, 1022);
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, null, true, null, null, null, null, null, null, 0, null, 1021);
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.j2(new String[0], b52.c.deactivate_account_continue_button_text), false, fm1.c.VISIBLE, null, null, null, null, null, 0, null, 1018);
            case 14:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.j2(new String[0], b52.c.close_account_contact_us_button), false, null, null, null, null, null, null, 0, null, 1022);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.j2(new String[0], b52.c.close_account_cancel_button), false, null, null, null, null, null, null, 0, null, 1022);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f82511i) {
        }
        return e((yl1.b) obj);
    }
}
