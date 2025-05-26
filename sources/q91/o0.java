package q91;

import android.app.DatePickerDialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.pinterest.api.model.wy0;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import com.pinterest.navigation.Navigation;
import df.m1;
import h32.a4;
import h32.d4;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import so.tb;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lq91/o0;", "Lnl1/d;", "<init>", "()V", "personalInformation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class o0 extends a0 {

    /* renamed from: s0, reason: collision with root package name */
    public static final /* synthetic */ int f103151s0 = 0;

    /* renamed from: c0, reason: collision with root package name */
    public DatePickerDialog f103152c0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f103154e0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f103155f0;

    /* renamed from: g0, reason: collision with root package name */
    public i92.k f103156g0;

    /* renamed from: h0, reason: collision with root package name */
    public mr1.a f103157h0;

    /* renamed from: i0, reason: collision with root package name */
    public tb f103158i0;

    /* renamed from: j0, reason: collision with root package name */
    public GestaltIcon f103159j0;

    /* renamed from: k0, reason: collision with root package name */
    public GestaltText f103160k0;

    /* renamed from: l0, reason: collision with root package name */
    public GestaltText f103161l0;

    /* renamed from: m0, reason: collision with root package name */
    public GestaltText f103162m0;

    /* renamed from: n0, reason: collision with root package name */
    public GestaltText f103163n0;

    /* renamed from: o0, reason: collision with root package name */
    public GestaltButton f103164o0;

    /* renamed from: p0, reason: collision with root package name */
    public Calendar f103165p0;

    /* renamed from: d0, reason: collision with root package name */
    public String f103153d0 = lp1.a.IN_APP_BIRTHDAY_PROMPT.getValue();

    /* renamed from: q0, reason: collision with root package name */
    public final d4 f103166q0 = d4.SETTINGS;

    /* renamed from: r0, reason: collision with root package name */
    public final a4 f103167r0 = a4.USER_SIGNAL_BIRTHDAY;

    public o0() {
        h32.e0 e0Var = h32.g0.Companion;
    }

    @Override // nl1.d
    public final void S7(fo1.a toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Navigation navigation = this.I;
        if (navigation != null && navigation.i0("com.pinterest.EXTRA_SETTINGS_BIRTHDAY") != null) {
            rm1.q qVar = rm1.q.ARROW_BACK;
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            Context requireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
            Drawable e03 = bs1.c.e0(this, qVar.drawableRes(requireContext, dl2.b.f1(requireContext2)), Integer.valueOf(eo1.b.color_themed_text_default), Integer.valueOf(eo1.c.space_600));
            String string = getString(m60.x0.back);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            ((GestaltToolbarImpl) toolbar).T(e03, string);
            Intrinsics.checkNotNullParameter(h32.g0.USER_BIRTHDAY_COLLECTION, "<set-?>");
        }
        Navigation navigation2 = this.I;
        if (navigation2 != null && navigation2.i0("com.pinterest.EXTRA_IS_BIRTHDATE_COLLECTION") != null) {
            ((GestaltToolbarImpl) toolbar).S(null);
            this.f103154e0 = true;
            Navigation navigation3 = this.I;
            Object i03 = navigation3 != null ? navigation3.i0("com.pinterest.EXTRA_IS_BIRTHDAY_COLLECTION_DISMISSIBLE") : null;
            Boolean bool = i03 instanceof Boolean ? (Boolean) i03 : null;
            this.f103155f0 = bool != null ? bool.booleanValue() : false;
        }
        GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) toolbar;
        gestaltToolbarImpl.E();
        gestaltToolbarImpl.m();
        gestaltToolbarImpl.U(new x61.e(this, 28));
    }

    public final int Y7() {
        int i13 = Calendar.getInstance().get(1);
        Calendar calendar = this.f103165p0;
        if (calendar == null) {
            Intrinsics.r("cal");
            throw null;
        }
        int i14 = i13 - calendar.get(1);
        int i15 = Calendar.getInstance().get(6);
        Calendar calendar2 = this.f103165p0;
        if (calendar2 != null) {
            return i15 < calendar2.get(6) ? i14 - 1 : i14;
        }
        Intrinsics.r("cal");
        throw null;
    }

    public final void Z7() {
        int i13 = eo1.f.DatePickerDialog;
        l0 l0Var = new l0(this, 0);
        Context requireContext = requireContext();
        Calendar calendar = this.f103165p0;
        if (calendar == null) {
            Intrinsics.r("cal");
            throw null;
        }
        int i14 = 1;
        int i15 = calendar.get(1);
        Calendar calendar2 = this.f103165p0;
        if (calendar2 == null) {
            Intrinsics.r("cal");
            throw null;
        }
        int i16 = calendar2.get(2);
        Calendar calendar3 = this.f103165p0;
        if (calendar3 == null) {
            Intrinsics.r("cal");
            throw null;
        }
        DatePickerDialog datePickerDialog = new DatePickerDialog(requireContext, i13, l0Var, i15, i16, calendar3.get(5));
        datePickerDialog.getDatePicker().setMaxDate(Calendar.getInstance(TimeZone.getTimeZone("GMT")).getTimeInMillis());
        datePickerDialog.setCanceledOnTouchOutside(false);
        datePickerDialog.setOnCancelListener(new m1(this, i14));
        this.f103152c0 = datePickerDialog;
    }

    public final void a8(h32.g0 g0Var, h32.u0 u0Var) {
        s7().h(g0Var, u0Var, getO0());
    }

    @Override // nl1.d, nx.i1
    public final h32.g0 b2() {
        return h32.g0.USER_BIRTHDAY_PROMPT;
    }

    public final String b8(boolean z13) {
        DateFormat dateInstance = z13 ? DateFormat.getDateInstance(1) : DateFormat.getDateInstance();
        Calendar calendar = this.f103165p0;
        if (calendar == null) {
            Intrinsics.r("cal");
            throw null;
        }
        dateInstance.setTimeZone(calendar.getTimeZone());
        Calendar calendar2 = this.f103165p0;
        if (calendar2 == null) {
            Intrinsics.r("cal");
            throw null;
        }
        String format = dateInstance.format(calendar2.getTime());
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    public final void c8(int i13, int i14, int i15, Function0 function0) {
        m60.w f73 = f7();
        u50.k0 k0Var = new u50.k0(i13);
        int i16 = 1;
        String[] strArr = new String[1];
        wy0 f13 = ((b60.d) getActiveUserManager()).f();
        String N2 = f13 != null ? f13.N2() : null;
        if (N2 == null) {
            N2 = "";
        }
        strArr[0] = N2;
        f73.d(new yb0.f(k0Var, new u50.k0(strArr, i14), new u50.k0(i15), (u50.k0) null, new androidx.appcompat.widget.q(function0, i16), 8));
    }

    public final void d8(boolean z13) {
        FragmentActivity E4 = E4();
        if (E4 != null) {
            hf0.b.l(E4);
        }
        f8(h32.g0.CONFIRM_USER_BIRTHDAY_PROMPT);
        tb tbVar = this.f103158i0;
        if (tbVar == null) {
            Intrinsics.r("identityAlertUtils");
            throw null;
        }
        String string = getResources().getString(m60.x0.text_birthday_dialog_confirm, b8(true));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        tbVar.a(string, Integer.valueOf(m60.x0.text_age_dialog_confirm_subtitle), m60.x0.edit_info, new e.e(this, z13, 2), new n0(this, 1));
    }

    public final void e8(boolean z13) {
        Pair[] pairArr = new Pair[3];
        pairArr[0] = new Pair("surface_tag", this.f103153d0);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        Calendar calendar = this.f103165p0;
        if (calendar == null) {
            Intrinsics.r("cal");
            throw null;
        }
        Pair pair = new Pair("birthdate", simpleDateFormat.format(calendar.getTime()));
        int i13 = 1;
        pairArr[1] = pair;
        Calendar calendar2 = this.f103165p0;
        if (calendar2 == null) {
            Intrinsics.r("cal");
            throw null;
        }
        pairArr[2] = new Pair("birthday", calendar2.getTime().toString());
        Map g13 = kotlin.collections.z0.g(pairArr);
        wy0 f13 = ((b60.d) getActiveUserManager()).f();
        if (f13 != null) {
            A7().j0(f13, g13).i(new w01.n(this, z13, i13), new p91.y(4, new m0(this, 4)));
        }
    }

    public final void f8(h32.g0 g0Var) {
        s7().U(new h32.i0(d4.SETTINGS, this.f103167r0, null, g0Var, null, null), h32.f1.VIEW, null, null, getO0(), false);
    }

    @Override // nl1.d, com.pinterest.framework.screens.b
    /* renamed from: g, reason: from getter */
    public final boolean getF103154e0() {
        return this.f103154e0;
    }

    @Override // uk1.c
    /* renamed from: getAuxData */
    public final HashMap getO0() {
        HashMap hashMap = new HashMap();
        if (this.f103154e0) {
            hashMap.put("dismissible", String.valueOf(this.f103155f0));
        }
        return hashMap;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getS0() {
        return this.f103167r0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getW0() {
        return this.f103166q0;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = h52.b.fragment_birthday_settings;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Unit unit;
        Object i03;
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        Calendar calendar = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(calendar, "getInstance(...)");
        this.f103165p0 = calendar;
        if (calendar == null) {
            Intrinsics.r("cal");
            throw null;
        }
        calendar.setTimeZone(TimeZone.getTimeZone("GMT"));
        Calendar calendar2 = this.f103165p0;
        if (calendar2 == null) {
            Intrinsics.r("cal");
            throw null;
        }
        calendar2.add(5, -1);
        View findViewById = v13.findViewById(h52.a.birthday_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f103159j0 = (GestaltIcon) findViewById;
        final int i13 = 1;
        this.f103160k0 = ((GestaltText) v13.findViewById(h52.a.birthday_collection_title)).i(new m0(this, i13));
        this.f103161l0 = ((GestaltText) v13.findViewById(h52.a.birthday_collection_details)).i(new m0(this, 2));
        View findViewById2 = v13.findViewById(h52.a.birthday_collection_yoti_error);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f103162m0 = (GestaltText) findViewById2;
        final int i14 = 0;
        this.f103163n0 = ((GestaltText) v13.findViewById(h52.a.date)).j(new gm1.a(this) { // from class: q91.k0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o0 f103139b;

            {
                this.f103139b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                String str;
                int i15 = i14;
                o0 this$0 = this.f103139b;
                switch (i15) {
                    case 0:
                        int i16 = o0.f103151s0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.a8(null, h32.u0.DATE_PICKER_SELECTION);
                        DatePickerDialog datePickerDialog = this$0.f103152c0;
                        if (datePickerDialog != null) {
                            datePickerDialog.show();
                            return;
                        } else {
                            Intrinsics.r("datePickerDialog");
                            throw null;
                        }
                    default:
                        int i17 = o0.f103151s0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.a8(h32.g0.USER_BIRTHDAY_PROMPT, h32.u0.UPDATE_BUTTON);
                        GestaltText gestaltText = this$0.f103162m0;
                        if (gestaltText == null) {
                            Intrinsics.r("birthdayYotiError");
                            throw null;
                        }
                        gestaltText.setVisibility(8);
                        if (this$0.Y7() < 5 || this$0.Y7() > 120) {
                            i92.k kVar = this$0.f103156g0;
                            if (kVar != null) {
                                kVar.i(this$0.getString(h52.c.age_collection_invalid_age_error));
                                return;
                            } else {
                                Intrinsics.r("toastUtils");
                                throw null;
                            }
                        }
                        Map map = tr1.b.f119038a;
                        wy0 f13 = ((b60.d) this$0.getActiveUserManager()).f();
                        if (f13 == null || (str = f13.G2()) == null) {
                            str = "";
                        }
                        if (tr1.b.f(this$0.Y7(), str)) {
                            this$0.d8(false);
                            return;
                        }
                        wy0 f14 = ((b60.d) this$0.getActiveUserManager()).f();
                        if (com.bumptech.glide.d.o0(f14 != null ? f14.G3() : null) && tr1.b.b(this$0.Y7())) {
                            this$0.d8(true);
                            return;
                        } else {
                            this$0.e8(false);
                            return;
                        }
                }
            }
        });
        this.f103164o0 = ((GestaltButton) v13.findViewById(h52.a.actionPromptCompleteButton)).d(new m0(this, 3)).e(new gm1.a(this) { // from class: q91.k0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o0 f103139b;

            {
                this.f103139b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                String str;
                int i15 = i13;
                o0 this$0 = this.f103139b;
                switch (i15) {
                    case 0:
                        int i16 = o0.f103151s0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.a8(null, h32.u0.DATE_PICKER_SELECTION);
                        DatePickerDialog datePickerDialog = this$0.f103152c0;
                        if (datePickerDialog != null) {
                            datePickerDialog.show();
                            return;
                        } else {
                            Intrinsics.r("datePickerDialog");
                            throw null;
                        }
                    default:
                        int i17 = o0.f103151s0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.a8(h32.g0.USER_BIRTHDAY_PROMPT, h32.u0.UPDATE_BUTTON);
                        GestaltText gestaltText = this$0.f103162m0;
                        if (gestaltText == null) {
                            Intrinsics.r("birthdayYotiError");
                            throw null;
                        }
                        gestaltText.setVisibility(8);
                        if (this$0.Y7() < 5 || this$0.Y7() > 120) {
                            i92.k kVar = this$0.f103156g0;
                            if (kVar != null) {
                                kVar.i(this$0.getString(h52.c.age_collection_invalid_age_error));
                                return;
                            } else {
                                Intrinsics.r("toastUtils");
                                throw null;
                            }
                        }
                        Map map = tr1.b.f119038a;
                        wy0 f13 = ((b60.d) this$0.getActiveUserManager()).f();
                        if (f13 == null || (str = f13.G2()) == null) {
                            str = "";
                        }
                        if (tr1.b.f(this$0.Y7(), str)) {
                            this$0.d8(false);
                            return;
                        }
                        wy0 f14 = ((b60.d) this$0.getActiveUserManager()).f();
                        if (com.bumptech.glide.d.o0(f14 != null ? f14.G3() : null) && tr1.b.b(this$0.Y7())) {
                            this$0.d8(true);
                            return;
                        } else {
                            this$0.e8(false);
                            return;
                        }
                }
            }
        });
        Navigation navigation = this.I;
        if (navigation == null || (i03 = navigation.i0("com.pinterest.EXTRA_SETTINGS_BIRTHDAY")) == null) {
            unit = null;
        } else {
            this.f103153d0 = lp1.a.SETTINGS.getValue();
            if (!(i03 instanceof Long)) {
                Z7();
                return;
            }
            Calendar calendar3 = this.f103165p0;
            if (calendar3 == null) {
                Intrinsics.r("cal");
                throw null;
            }
            calendar3.setTimeInMillis(((Number) i03).longValue() * 1000);
            GestaltIcon gestaltIcon = this.f103159j0;
            if (gestaltIcon == null) {
                Intrinsics.r("birthdayIcon");
                throw null;
            }
            gestaltIcon.g2(b.f103072s);
            GestaltText gestaltText = this.f103160k0;
            if (gestaltText == null) {
                Intrinsics.r("birthdayTitle");
                throw null;
            }
            gestaltText.i(b.f103073t);
            fo1.a i73 = i7();
            if (i73 != null) {
                ((GestaltToolbarImpl) i73).b0(getString(h52.c.settings_personal_information_birthdate));
            }
            GestaltText gestaltText2 = this.f103161l0;
            if (gestaltText2 == null) {
                Intrinsics.r("birthdayDetail");
                throw null;
            }
            gestaltText2.i(b.f103074u);
            Z7();
            DatePickerDialog datePickerDialog = this.f103152c0;
            if (datePickerDialog == null) {
                Intrinsics.r("datePickerDialog");
                throw null;
            }
            datePickerDialog.dismiss();
            unit = Unit.f80348a;
        }
        if (unit == null) {
            Z7();
        }
        GestaltText gestaltText3 = this.f103163n0;
        if (gestaltText3 != null) {
            pk.a0.p(gestaltText3, b8(false));
        } else {
            Intrinsics.r("dateTextView");
            throw null;
        }
    }

    @Override // nl1.d, nx.i1
    /* renamed from: t5 */
    public final HashMap getF63135d0() {
        HashMap hashMap = new HashMap();
        hashMap.put("dismissible", String.valueOf(this.f103155f0));
        return hashMap;
    }
}
