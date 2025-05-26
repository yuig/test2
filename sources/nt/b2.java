package nt;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.pinterest.ads.feature.owc.leadgen.bottomSheet.SbaAdsLeadGenExpandView;
import com.pinterest.ads.feature.owc.view.base.BaseAdsBottomSheetBehavior;
import com.pinterest.ads.feature.owc.view.base.BaseAdsScrollingModule;
import com.pinterest.ads.feature.owc.view.leadgen.GradientAlphaLinearLayout;
import com.pinterest.ads.feature.owc.view.leadgen.bottomSheet.AdsLeadGenBottomSheetBehavior;
import com.pinterest.ads.feature.owc.view.leadgen.bottomSheet.AdsLeadGenSuccessView;
import com.pinterest.api.model.n90;
import com.pinterest.api.model.r90;
import com.pinterest.api.model.v90;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.browser.view.InAppBrowserView;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.checkbox.GestaltCheckBox;
import com.pinterest.gestalt.text.GestaltText;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class b2 extends qu.a {
    public static final /* synthetic */ int E = 0;
    public final AdsLeadGenBottomSheetBehavior A;
    public GestaltText B;
    public final Map C;
    public x1 D;

    /* renamed from: v, reason: collision with root package name */
    public final u50.r f91989v;

    /* renamed from: w, reason: collision with root package name */
    public String f91990w;

    /* renamed from: x, reason: collision with root package name */
    public final SbaAdsLeadGenExpandView f91991x;

    /* renamed from: y, reason: collision with root package name */
    public final AdsLeadGenSuccessView f91992y;

    /* renamed from: z, reason: collision with root package name */
    public int f91993z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(Context context, mq.z eventIntake, mq.z bottomSheetEventInTake) {
        super(context, null, 0, eventIntake);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        Intrinsics.checkNotNullParameter(bottomSheetEventInTake, "bottomSheetEventInTake");
        this.f91989v = bottomSheetEventInTake;
        View findViewById = findViewById(ps.p.sba_signup_expand_page);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        SbaAdsLeadGenExpandView sbaAdsLeadGenExpandView = (SbaAdsLeadGenExpandView) findViewById;
        this.f91991x = sbaAdsLeadGenExpandView;
        View findViewById2 = findViewById(ps.p.signup_success_page);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        AdsLeadGenSuccessView adsLeadGenSuccessView = (AdsLeadGenSuccessView) findViewById2;
        this.f91992y = adsLeadGenSuccessView;
        Intrinsics.checkNotNullParameter(context, "context");
        AdsLeadGenBottomSheetBehavior adsLeadGenBottomSheetBehavior = new AdsLeadGenBottomSheetBehavior(context, null, false);
        adsLeadGenBottomSheetBehavior.f35375o0 = true;
        this.A = adsLeadGenBottomSheetBehavior;
        Pair[] pairArr = new Pair[4];
        a aVar = a.SIGN_UP_COLLAPSE;
        pairArr[0] = new Pair(aVar, new x1(this.f53208j, false, true, true, false, new y1(this, 1)));
        pairArr[1] = new Pair(a.SIGN_UP_EXPAND, new x1(sbaAdsLeadGenExpandView, false, false, false, true, new y1(this, 2)));
        pairArr[2] = new Pair(a.SIGN_UP_SUCCESS, new x1(adsLeadGenSuccessView, false, false, true, true, new y1(this, 3)));
        a aVar2 = a.BROWSER;
        View view = this.f35366r;
        pairArr[3] = new Pair(aVar2, new x1(view == null ? new View(context) : view, true, false, false, true, new y1(this, 4)));
        Map g13 = kotlin.collections.z0.g(pairArr);
        this.C = g13;
        Object obj = g13.get(aVar);
        Intrinsics.f(obj);
        this.D = (x1) obj;
        Intrinsics.checkNotNullParameter(context, "context");
        GradientAlphaLinearLayout gradientAlphaLinearLayout = new GradientAlphaLinearLayout(context);
        gradientAlphaLinearLayout.f35370a = true;
        gradientAlphaLinearLayout.a();
        gradientAlphaLinearLayout.setOrientation(1);
        GestaltText gestaltText = this.f53203e;
        if (gestaltText == null) {
            Intrinsics.r("bottomSheetTitle");
            throw null;
        }
        gestaltText.i(d1.f92007o);
        this.f53200b.setBackground(bs1.c.f0(this, ps.o.lead_ad_bottom_sheet_background, null, null, 6));
        setVisibility(4);
    }

    public final void B0(v displayState) {
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        if (displayState.f92201h) {
            return;
        }
        P0(a.BROWSER);
    }

    @Override // cu.i
    public final void C(int i13) {
        this.A.W(i13);
    }

    public final void F0(v displayState, a firstState) {
        String str;
        final int i13;
        String d2;
        boolean z13;
        ju.c[] cVarArr;
        List list;
        ju.c cVar;
        Pair pair;
        Pair pair2;
        String str2;
        Pair pair3;
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        Intrinsics.checkNotNullParameter(firstState, "firstState");
        Map map = this.C;
        x1 x1Var = (x1) map.get(firstState);
        if (x1Var == null) {
            Object obj = map.get(a.SIGN_UP_COLLAPSE);
            Intrinsics.f(obj);
            x1Var = (x1) obj;
        }
        this.D = x1Var;
        this.f91990w = displayState.f92194a;
        x();
        i().i(d1.f92008p);
        GestaltText gestaltText = this.f53203e;
        Throwable th3 = null;
        if (gestaltText == null) {
            Intrinsics.r("bottomSheetTitle");
            throw null;
        }
        int dimensionPixelOffset = gestaltText.getResources().getDimensionPixelOffset(eo1.c.space_200) * (-1);
        ViewGroup.LayoutParams layoutParams = gestaltText.getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        int i14 = 0;
        com.bumptech.glide.c.a1((LinearLayout.LayoutParams) layoutParams, 0, dimensionPixelOffset, 0, 0);
        LinearLayout linearLayout = this.f53208j;
        ViewGroup.LayoutParams layoutParams2 = linearLayout.getLayoutParams();
        Intrinsics.g(layoutParams2, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        com.bumptech.glide.c.a1((FrameLayout.LayoutParams) layoutParams2, 0, 0, 0, 0);
        View inflate = View.inflate(getContext(), ps.q.view_leadad_description, null);
        Intrinsics.g(inflate, "null cannot be cast to non-null type com.pinterest.gestalt.text.GestaltText");
        GestaltText gestaltText2 = (GestaltText) inflate;
        String str3 = displayState.f92196c;
        gestaltText2.i(new rq.l2(str3, 12));
        linearLayout.addView(gestaltText2);
        boolean z14 = displayState.f92207n;
        int i15 = (z14 && us.c.a().c()) ? ps.s.signup_sponsored_by : ps.s.signup_promoted_by;
        View inflate2 = View.inflate(getContext(), ps.q.view_leadad_promoted_by, null);
        Intrinsics.g(inflate2, "null cannot be cast to non-null type com.pinterest.gestalt.text.GestaltText");
        GestaltText gestaltText3 = (GestaltText) inflate2;
        this.B = gestaltText3;
        wy0 wy0Var = displayState.f92197d;
        gestaltText3.i(new z1(i15, wy0Var, i14));
        linearLayout.addView(this.B);
        final SbaAdsLeadGenExpandView sbaAdsLeadGenExpandView = this.f91991x;
        sbaAdsLeadGenExpandView.getClass();
        u50.r eventIntake = this.f91989v;
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        sbaAdsLeadGenExpandView.f35285n = eventIntake;
        n90 n90Var = displayState.f92198e;
        sbaAdsLeadGenExpandView.f35283l = n90Var != null ? n90Var.x() : null;
        sbaAdsLeadGenExpandView.f35284m = n90Var != null ? n90Var.y() : null;
        String str4 = displayState.f92195b;
        String str5 = "";
        if (str4 == null) {
            str4 = "";
        }
        pk.a0.p(sbaAdsLeadGenExpandView.f35275d, str4);
        if (str3 == null) {
            str3 = "";
        }
        pk.a0.p(sbaAdsLeadGenExpandView.f35276e, str3);
        List w13 = n90Var != null ? n90Var.w() : null;
        if (w13 == null) {
            w13 = kotlin.collections.q0.f80391a;
        }
        List y13 = n90Var != null ? n90Var.y() : null;
        sbaAdsLeadGenExpandView.f35293v.clear();
        String str6 = "getContext(...)";
        boolean z15 = true;
        if (y13 != null) {
            Iterator it = y13.iterator();
            int i16 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i17 = i16 + 1;
                if (i16 < 0) {
                    Throwable th4 = th3;
                    kotlin.collections.f0.p();
                    throw th4;
                }
                v90 question = (v90) next;
                Context context = sbaAdsLeadGenExpandView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, str6);
                String str7 = str6;
                Iterator it2 = it;
                String str8 = str5;
                j2 hideKeyboardIfEditTextLostFocus = new j2(1, sbaAdsLeadGenExpandView, SbaAdsLeadGenExpandView.class, "hideKeyboardIfEditTextLostFocus", "hideKeyboardIfEditTextLostFocus(Z)V", 0);
                u50.r rVar = sbaAdsLeadGenExpandView.f35285n;
                if (rVar == null) {
                    Intrinsics.r("eventIntake");
                    throw null;
                }
                zq.a aVar = sbaAdsLeadGenExpandView.f35292u;
                aVar.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(question, "question");
                LinearLayoutCompat parentView = sbaAdsLeadGenExpandView.f35278g;
                Intrinsics.checkNotNullParameter(parentView, "parentView");
                Intrinsics.checkNotNullParameter(hideKeyboardIfEditTextLostFocus, "hideKeyboardIfEditTextLostFocus");
                ju.d dVar = ju.e.Companion;
                u50.r rVar2 = eventIntake;
                Integer h10 = question.h();
                Intrinsics.checkNotNullExpressionValue(h10, "getQuestionType(...)");
                int intValue = h10.intValue();
                dVar.getClass();
                ju.e a13 = ju.d.a(intValue);
                int i18 = a13 == null ? -1 : q1.f92147b[a13.ordinal()];
                m60.w wVar = sbaAdsLeadGenExpandView.f35286o;
                switch (i18) {
                    case 1:
                        z13 = z14;
                        ju.b bVar = ju.c.Companion;
                        Integer e13 = question.e();
                        Intrinsics.checkNotNullExpressionValue(e13, "getQuestionFieldType(...)");
                        int intValue2 = e13.intValue();
                        bVar.getClass();
                        cVarArr = ju.c.VALUES;
                        int length = cVarArr.length;
                        list = w13;
                        int i19 = 0;
                        while (true) {
                            if (i19 < length) {
                                cVar = cVarArr[i19];
                                ju.c[] cVarArr2 = cVarArr;
                                if (cVar.getValue() != intValue2) {
                                    i19++;
                                    cVarArr = cVarArr2;
                                }
                            } else {
                                cVar = null;
                            }
                        }
                        int i23 = cVar == null ? -1 : q1.f92146a[cVar.ordinal()];
                        if (i23 != 1) {
                            if (i23 != 2) {
                                if (i23 != 3) {
                                    if (i23 != 4) {
                                        pair2 = new Pair(null, null);
                                        break;
                                    } else {
                                        k1 k1Var = new k1(i16);
                                        String f13 = question.f();
                                        if (f13 == null) {
                                            f13 = str8;
                                        }
                                        List<String> g13 = question.g();
                                        if (g13 == null) {
                                            g13 = new ArrayList();
                                        }
                                        h32.u0 u0Var = h32.u0.LEAD_FORM_CUSTOM_CHECKBOX;
                                        View inflate3 = View.inflate(context, ps.q.field_header, null);
                                        View findViewById = inflate3.findViewById(ps.p.field_header);
                                        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
                                        pk.a0.p((GestaltText) findViewById, f13.toString());
                                        parentView.addView(inflate3);
                                        GestaltText gestaltText4 = new GestaltText(6, context, (AttributeSet) null);
                                        gestaltText4.i(d1.f92004l);
                                        gestaltText4.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                                        a1 a1Var = new a1(k1Var, inflate3);
                                        for (String str9 : g13) {
                                            View inflate4 = View.inflate(context, ps.q.field_checkbox_input, null);
                                            Intrinsics.g(inflate4, "null cannot be cast to non-null type com.pinterest.gestalt.checkbox.GestaltCheckBox");
                                            GestaltCheckBox gestaltCheckBox = (GestaltCheckBox) inflate4;
                                            c0.d.l(gestaltCheckBox, new e.c(gestaltText4, a1Var, rVar, u0Var, f13, 7));
                                            gestaltCheckBox.L(new rq.l2(str9, 11));
                                            a1Var.f91980d.add(gestaltCheckBox);
                                            parentView.addView(gestaltCheckBox);
                                        }
                                        parentView.addView(gestaltText4);
                                        pair2 = new Pair(a1Var, null);
                                        break;
                                    }
                                } else {
                                    String f14 = question.f();
                                    String str10 = f14 == null ? str8 : f14;
                                    List g14 = question.g();
                                    if (g14 == null) {
                                        g14 = new ArrayList();
                                    }
                                    pair = new Pair(zq.a.e(context, str10, g14, parentView, new l1(i16), h32.u0.LEAD_FORM_CUSTOM_RADIO_LIST, true, rVar), null);
                                }
                            } else {
                                m1 m1Var = new m1(i16);
                                String f15 = question.f();
                                String str11 = f15 == null ? str8 : f15;
                                CharSequence text = context.getText(ps.s.custom_question_hint);
                                h32.u0 u0Var2 = h32.u0.LEAD_FORM_CUSTOM_TEXT_AREA;
                                Intrinsics.f(text);
                                pair = new Pair(zq.a.f(aVar, context, str11, text, parentView, null, true, m1Var, null, hideKeyboardIfEditTextLostFocus, u0Var2, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_GRID_CELL, RecyclerViewTypes.VIEW_TYPE_VTO_CAROUSEL_ITEM), null);
                            }
                        } else {
                            m1 m1Var2 = new m1(i16);
                            String f16 = question.f();
                            String str12 = f16 == null ? str8 : f16;
                            CharSequence text2 = context.getText(ps.s.custom_question_hint);
                            Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                            pair = new Pair(zq.a.f(aVar, context, str12, text2, parentView, null, false, m1Var2, null, hideKeyboardIfEditTextLostFocus, h32.u0.LEAD_FORM_CUSTOM_TEXT_FIELD, 80, RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_APP_INSTALL_IMAGE_FULL_SPAN), null);
                        }
                        pair2 = pair;
                        break;
                    case 2:
                        z13 = z14;
                        str2 = str8;
                        CharSequence text3 = context.getText(ps.s.full_name);
                        Intrinsics.checkNotNullExpressionValue(text3, "getText(...)");
                        CharSequence text4 = context.getText(ps.s.full_name_hint);
                        Intrinsics.checkNotNullExpressionValue(text4, "getText(...)");
                        pair3 = new Pair(zq.a.f(aVar, context, text3, text4, parentView, null, false, i1.f92062h, Integer.valueOf(ps.p.lead_ad_full_name_input), hideKeyboardIfEditTextLostFocus, h32.u0.LEAD_FORM_NAME, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_GRID_CELL, 48), null);
                        list = w13;
                        pair2 = pair3;
                        str8 = str2;
                        break;
                    case 3:
                        z13 = z14;
                        str2 = str8;
                        CharSequence text5 = context.getText(ps.s.first_name);
                        Intrinsics.checkNotNullExpressionValue(text5, "getText(...)");
                        CharSequence text6 = context.getText(ps.s.first_name_hint);
                        Intrinsics.checkNotNullExpressionValue(text6, "getText(...)");
                        pair3 = new Pair(zq.a.f(aVar, context, text5, text6, parentView, null, false, i1.f92061g, Integer.valueOf(ps.p.lead_ad_first_name_input), hideKeyboardIfEditTextLostFocus, h32.u0.LEAD_FORM_FIRST_NAME, 40, 48), null);
                        list = w13;
                        pair2 = pair3;
                        str8 = str2;
                        break;
                    case 4:
                        z13 = z14;
                        str2 = str8;
                        CharSequence text7 = context.getText(ps.s.last_name);
                        Intrinsics.checkNotNullExpressionValue(text7, "getText(...)");
                        CharSequence text8 = context.getText(ps.s.last_name_hint);
                        Intrinsics.checkNotNullExpressionValue(text8, "getText(...)");
                        pair3 = new Pair(zq.a.f(aVar, context, text7, text8, parentView, null, false, i1.f92064j, Integer.valueOf(ps.p.lead_ad_last_name_input), hideKeyboardIfEditTextLostFocus, h32.u0.LEAD_FORM_LAST_NAME, 80, 48), null);
                        list = w13;
                        pair2 = pair3;
                        str8 = str2;
                        break;
                    case 5:
                        z13 = z14;
                        str2 = str8;
                        CharSequence text9 = context.getText(ps.s.email);
                        CharSequence text10 = context.getText(ps.s.email_hint);
                        i1 i1Var = i1.f92060f;
                        int i24 = ps.p.lead_ad_email_input;
                        h32.u0 u0Var3 = h32.u0.LEAD_FORM_EMAIL;
                        Intrinsics.f(text9);
                        Intrinsics.f(text10);
                        pair3 = new Pair(zq.a.f(aVar, context, text9, text10, parentView, 33, false, i1Var, Integer.valueOf(i24), hideKeyboardIfEditTextLostFocus, u0Var3, 80, 32), null);
                        list = w13;
                        pair2 = pair3;
                        str8 = str2;
                        break;
                    case 6:
                        z13 = z14;
                        str2 = str8;
                        CharSequence text11 = context.getText(ps.s.phone_number_non_optional);
                        CharSequence text12 = context.getText(ps.s.phone_number_hint);
                        i1 i1Var2 = i1.f92067m;
                        int i25 = ps.p.lead_ad_phone_number_input;
                        h32.u0 u0Var4 = h32.u0.LEAD_FORM_PHONE_NUMBER;
                        Intrinsics.f(text11);
                        Intrinsics.f(text12);
                        pair3 = new Pair(zq.a.f(aVar, context, text11, text12, parentView, 3, false, i1Var2, Integer.valueOf(i25), hideKeyboardIfEditTextLostFocus, u0Var4, 40, 32), null);
                        list = w13;
                        pair2 = pair3;
                        str8 = str2;
                        break;
                    case 7:
                        z13 = z14;
                        str2 = str8;
                        CharSequence text13 = context.getText(ps.s.zip_code_non_optional);
                        Intrinsics.checkNotNullExpressionValue(text13, "getText(...)");
                        CharSequence text14 = context.getText(ps.s.zip_code_hint);
                        Intrinsics.checkNotNullExpressionValue(text14, "getText(...)");
                        pair3 = new Pair(zq.a.f(aVar, context, text13, text14, parentView, null, false, i1.f92069o, Integer.valueOf(ps.p.lead_ad_zip_code_input), hideKeyboardIfEditTextLostFocus, h32.u0.LEAD_FORM_ZIPCODE, 20, 48), null);
                        list = w13;
                        pair2 = pair3;
                        str8 = str2;
                        break;
                    case 8:
                        z13 = z14;
                        CharSequence text15 = context.getText(ps.s.address_non_optional);
                        Intrinsics.checkNotNullExpressionValue(text15, "getText(...)");
                        CharSequence text16 = context.getText(ps.s.address_non_optional_hint);
                        Intrinsics.checkNotNullExpressionValue(text16, "getText(...)");
                        i1 i1Var3 = i1.f92055a;
                        h32.u0 u0Var5 = h32.u0.LEAD_FORM_ADDRESS;
                        f1 f17 = zq.a.f(aVar, context, text15, text16, parentView, null, false, i1Var3, null, hideKeyboardIfEditTextLostFocus, u0Var5, 80, RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_APP_INSTALL_IMAGE_FULL_SPAN);
                        CharSequence text17 = context.getText(ps.s.address_optional);
                        Intrinsics.checkNotNullExpressionValue(text17, "getText(...)");
                        CharSequence text18 = context.getText(ps.s.address_optional_hint);
                        Intrinsics.checkNotNullExpressionValue(text18, "getText(...)");
                        list = w13;
                        str8 = str8;
                        pair2 = new Pair(f17, zq.a.f(aVar, context, text17, text18, parentView, null, false, i1.f92066l, null, hideKeyboardIfEditTextLostFocus, u0Var5, 80, RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_APP_INSTALL_IMAGE_FULL_SPAN));
                        break;
                    case 9:
                        z13 = z14;
                        str2 = str8;
                        CharSequence text19 = context.getText(ps.s.lead_gen_age);
                        CharSequence text20 = context.getText(ps.s.lead_gen_age_hint);
                        i1 i1Var4 = i1.f92056b;
                        int i26 = ps.p.lead_ad_age_input;
                        h32.u0 u0Var6 = h32.u0.LEAD_FORM_AGE;
                        Intrinsics.f(text19);
                        Intrinsics.f(text20);
                        pair3 = new Pair(zq.a.f(aVar, context, text19, text20, parentView, 2, false, i1Var4, Integer.valueOf(i26), hideKeyboardIfEditTextLostFocus, u0Var6, 80, 32), null);
                        list = w13;
                        pair2 = pair3;
                        str8 = str2;
                        break;
                    case 10:
                        z13 = z14;
                        str2 = str8;
                        String obj2 = context.getText(ps.s.gender).toString();
                        List g15 = question.g();
                        if (g15 == null) {
                            g15 = kotlin.collections.f0.j(context.getText(ps.s.gender_other).toString(), context.getText(ps.s.gender_female).toString(), context.getText(ps.s.gender_male).toString());
                        }
                        pair3 = new Pair(zq.a.e(context, obj2, g15, parentView, i1.f92063i, h32.u0.LEAD_FORM_GENDER, false, rVar), null);
                        list = w13;
                        pair2 = pair3;
                        str8 = str2;
                        break;
                    case 11:
                        z13 = z14;
                        str2 = str8;
                        CharSequence text21 = context.getText(ps.s.lead_gen_city);
                        Intrinsics.checkNotNullExpressionValue(text21, "getText(...)");
                        CharSequence text22 = context.getText(ps.s.lead_gen_city_hint);
                        Intrinsics.checkNotNullExpressionValue(text22, "getText(...)");
                        pair3 = new Pair(zq.a.f(aVar, context, text21, text22, parentView, null, false, i1.f92057c, Integer.valueOf(ps.p.lead_ad_city_input), hideKeyboardIfEditTextLostFocus, h32.u0.LEAD_FORM_CITY, 40, 48), null);
                        list = w13;
                        pair2 = pair3;
                        str8 = str2;
                        break;
                    case 12:
                        z13 = z14;
                        str2 = str8;
                        CharSequence text23 = context.getText(ps.s.lead_gen_state_province);
                        Intrinsics.checkNotNullExpressionValue(text23, "getText(...)");
                        CharSequence text24 = context.getText(ps.s.lead_gen_state_province_hint);
                        Intrinsics.checkNotNullExpressionValue(text24, "getText(...)");
                        pair3 = new Pair(zq.a.f(aVar, context, text23, text24, parentView, null, false, i1.f92068n, Integer.valueOf(ps.p.lead_ad_state_province_input), hideKeyboardIfEditTextLostFocus, h32.u0.LEAD_FORM_STATE_PROVINCE, 80, 48), null);
                        list = w13;
                        pair2 = pair3;
                        str8 = str2;
                        break;
                    case 13:
                        z13 = z14;
                        str2 = str8;
                        CharSequence text25 = context.getText(ps.s.country);
                        Intrinsics.checkNotNullExpressionValue(text25, "getText(...)");
                        b1 b1Var = new b1(zq.a.d(context, text25, parentView, ju.g.COUNTRY, j1.f92079a, ps.s.country_hint, null, h32.u0.LEAD_FORM_COUNTRY, rVar, r1.f92161j, new t1(aVar, wVar, 0)));
                        b1Var.b(str2);
                        pair2 = new Pair(b1Var, null);
                        list = w13;
                        str8 = str2;
                        break;
                    case 14:
                        CharSequence text26 = context.getText(ps.s.lead_gen_date_of_birth);
                        Intrinsics.checkNotNullExpressionValue(text26, "getText(...)");
                        CharSequence text27 = context.getText(ps.s.lead_gen_date_of_birth_day);
                        Intrinsics.checkNotNullExpressionValue(text27, "getText(...)");
                        i1 i1Var5 = i1.f92059e;
                        h32.u0 u0Var7 = h32.u0.LEAD_FORM_DATE_OF_BIRTH;
                        f1 f18 = zq.a.f(aVar, context, text26, text27, parentView, 2, false, i1Var5, null, hideKeyboardIfEditTextLostFocus, u0Var7, 80, 160);
                        CharSequence text28 = context.getText(ps.s.lead_gen_date_of_birth_month);
                        Intrinsics.checkNotNullExpressionValue(text28, "getText(...)");
                        z13 = z14;
                        c1 c1Var = new c1(zq.a.d(context, text28, parentView, ju.g.DATE_OF_BIRTH_MONTH, i1.f92065k, ps.s.lead_gen_date_of_birth_month, null, u0Var7, rVar, r1.f92162k, new t1(aVar, wVar, 1)));
                        str2 = str8;
                        c1Var.b(str2);
                        pair3 = new Pair(f18, c1Var);
                        list = w13;
                        pair2 = pair3;
                        str8 = str2;
                        break;
                    default:
                        pair2 = new Pair(null, null);
                        list = w13;
                        z13 = z14;
                        break;
                }
                sbaAdsLeadGenExpandView.a((h1) pair2.f80346a);
                sbaAdsLeadGenExpandView.a((h1) pair2.f80347b);
                eventIntake = rVar2;
                z14 = z13;
                i16 = i17;
                it = it2;
                str6 = str7;
                str5 = str8;
                w13 = list;
                th3 = null;
                z15 = true;
            }
        }
        List<r90> list2 = w13;
        boolean z16 = z14;
        u50.r rVar3 = eventIntake;
        String str13 = str6;
        String str14 = str5;
        String Z2 = wy0Var != null ? wy0Var.Z2() : null;
        String s13 = n90Var != null ? n90Var.s() : null;
        View inflate5 = View.inflate(sbaAdsLeadGenExpandView.getContext(), ps.q.view_disclaimer, null);
        sbaAdsLeadGenExpandView.f35278g.addView(inflate5);
        GestaltCheckBox gestaltCheckBox2 = (GestaltCheckBox) inflate5.findViewById(ps.p.disclosure_checkbox);
        sbaAdsLeadGenExpandView.f35291t = gestaltCheckBox2;
        if (gestaltCheckBox2 != null) {
            c0.d.l(gestaltCheckBox2, new i2(sbaAdsLeadGenExpandView, 0));
        }
        GestaltCheckBox gestaltCheckBox3 = sbaAdsLeadGenExpandView.f35291t;
        String obj3 = inflate5.getContext().getText(ps.s.signup_disclosure_privacy_policy).toString();
        String obj4 = inflate5.getContext().getText(ps.s.signup_disclosure_privacy_policy_our).toString();
        String concat = (s13 == null || s13.length() == 0) ? str14 : "\n\n".concat(s13);
        if (!list2.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                String c13 = ((r90) it3.next()).c();
                if (c13 != null) {
                    arrayList.add(c13);
                }
            }
            str = a.a.j(" ", CollectionsKt.Z(arrayList, ", ", null, null, 0, null, d1.f92010r, 30));
        } else {
            str = str14;
        }
        String C = a.a.C(concat, str);
        if (gestaltCheckBox3 != null) {
            gestaltCheckBox3.L(new e.c((Object) gestaltCheckBox3, Z2, (Object) obj3, (Object) obj4, (Object) C, 8));
        }
        if (gestaltCheckBox3 != null) {
            b20.c cVar2 = new b20.c(3);
            cVar2.b(new Pair(obj3, new tq.j(sbaAdsLeadGenExpandView, 7)));
            cVar2.b(new Pair(obj4, new co.a(21, gestaltCheckBox3, sbaAdsLeadGenExpandView)));
            ArrayList arrayList2 = new ArrayList();
            for (r90 r90Var : list2) {
                String c14 = r90Var.c();
                Pair pair4 = (c14 == null || (d2 = r90Var.d()) == null) ? null : new Pair(c14, new co.a(22, sbaAdsLeadGenExpandView, d2));
                if (pair4 != null) {
                    arrayList2.add(pair4);
                }
            }
            cVar2.c(arrayList2.toArray(new Pair[0]));
            Pair[] links = (Pair[]) cVar2.D(new Pair[cVar2.C()]);
            Intrinsics.checkNotNullParameter(gestaltCheckBox3, "<this>");
            Intrinsics.checkNotNullParameter(links, "links");
            Intrinsics.checkNotNullParameter(gestaltCheckBox3, "<this>");
            u50.i0 i0Var = gestaltCheckBox3.a0().f59601d;
            Context context2 = gestaltCheckBox3.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, str13);
            SpannableString spannableString = new SpannableString(i0Var.a(context2).toString());
            int length2 = links.length;
            int i27 = -1;
            int i28 = 0;
            while (i28 < length2) {
                Pair pair5 = links[i28];
                j4.f fVar = new j4.f(pair5, 4);
                Intrinsics.checkNotNullParameter(gestaltCheckBox3, "<this>");
                u50.i0 i0Var2 = gestaltCheckBox3.a0().f59601d;
                Context context3 = gestaltCheckBox3.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, str13);
                i27 = StringsKt.L(i0Var2.a(context3).toString().toString(), (String) pair5.f80346a, i27 + 1, false, 4);
                spannableString.setSpan(fVar, i27, ((String) pair5.f80346a).length() + i27, 33);
                i28++;
                links = links;
            }
            i13 = 1;
            gestaltCheckBox3.L(new q71.r0(spannableString, i13));
        } else {
            i13 = 1;
        }
        final int i29 = 0;
        sbaAdsLeadGenExpandView.f35280i.e(new gm1.a() { // from class: nt.d2
            @Override // gm1.a
            public final void h3(gm1.c it4) {
                int i33 = i29;
                SbaAdsLeadGenExpandView this$0 = sbaAdsLeadGenExpandView;
                switch (i33) {
                    case 0:
                        int i34 = SbaAdsLeadGenExpandView.f35271w;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it4, "it");
                        this$0.onClick(this$0.f35280i);
                        break;
                    default:
                        int i35 = SbaAdsLeadGenExpandView.f35271w;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it4, "it");
                        if (it4 instanceof om1.l) {
                            this$0.onClick(this$0.f35281j);
                            break;
                        }
                        break;
                }
            }
        });
        sbaAdsLeadGenExpandView.f35281j.u(new gm1.a() { // from class: nt.d2
            @Override // gm1.a
            public final void h3(gm1.c it4) {
                int i33 = i13;
                SbaAdsLeadGenExpandView this$0 = sbaAdsLeadGenExpandView;
                switch (i33) {
                    case 0:
                        int i34 = SbaAdsLeadGenExpandView.f35271w;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it4, "it");
                        this$0.onClick(this$0.f35280i);
                        break;
                    default:
                        int i35 = SbaAdsLeadGenExpandView.f35271w;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it4, "it");
                        if (it4 instanceof om1.l) {
                            this$0.onClick(this$0.f35281j);
                            break;
                        }
                        break;
                }
            }
        });
        int i33 = (z16 && us.c.a().c()) ? ps.s.signup_sponsored_by : ps.s.signup_promoted_by;
        Resources resources = sbaAdsLeadGenExpandView.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        Object[] formatArgs = new Object[1];
        String Z22 = wy0Var != null ? wy0Var.Z2() : null;
        if (Z22 == null) {
            Z22 = str14;
        }
        formatArgs[0] = Z22;
        Intrinsics.checkNotNullParameter(resources, "<this>");
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        String string = resources.getString(i33, Arrays.copyOf(formatArgs, 1));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        pk.a0.p(sbaAdsLeadGenExpandView.f35282k, string);
        h2 h2Var = new h2();
        ScrollView scrollView = sbaAdsLeadGenExpandView.f35272a;
        scrollView.setOnTouchListener(h2Var);
        scrollView.getViewTreeObserver().addOnScrollChangedListener(new e2(sbaAdsLeadGenExpandView, 0));
        String r13 = n90Var != null ? n90Var.r() : null;
        AdsLeadGenSuccessView adsLeadGenSuccessView = this.f91992y;
        adsLeadGenSuccessView.getClass();
        adsLeadGenSuccessView.f35377a.i(new rq.l2(r13, 18));
        adsLeadGenSuccessView.f35378b.e(new gu.a(rVar3, 0));
        adsLeadGenSuccessView.f35379c.i(new z1((z16 && us.c.a().c()) ? ps.s.signup_sponsored_by : ps.s.signup_promoted_by, wy0Var, 1));
    }

    public final void G0(v displayState) {
        String str;
        Object obj;
        String str2;
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        SbaAdsLeadGenExpandView sbaAdsLeadGenExpandView = this.f91991x;
        f cacheData = displayState.f92203j;
        sbaAdsLeadGenExpandView.getClass();
        Intrinsics.checkNotNullParameter(cacheData, "cacheData");
        sbaAdsLeadGenExpandView.f35290s = true;
        boolean z13 = !cacheData.f92032d.isEmpty();
        j1 j1Var = j1.f92079a;
        if (z13) {
            Object obj2 = sbaAdsLeadGenExpandView.f35293v.get(j1Var);
            b1 b1Var = obj2 instanceof b1 ? (b1) obj2 : null;
            if (b1Var != null) {
                b1Var.f91988c.f92024g = cacheData.f92032d;
            }
        }
        for (Map.Entry entry : cacheData.f92029a.entrySet()) {
            n1 n1Var = (n1) entry.getKey();
            String str3 = (String) entry.getValue();
            if (n1Var instanceof j1) {
                Object obj3 = sbaAdsLeadGenExpandView.f35293v.get(j1Var);
                b1 b1Var2 = obj3 instanceof b1 ? (b1) obj3 : null;
                if (b1Var2 != null) {
                    Iterator it = cacheData.f92032d.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (Intrinsics.d(((m91.b) obj).f86723c, str3)) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    m91.b bVar = (m91.b) obj;
                    if (bVar == null || (str2 = bVar.f86724d) == null) {
                        str2 = "";
                    }
                    b1Var2.b(str2);
                }
            } else {
                h1 h1Var = (h1) sbaAdsLeadGenExpandView.f35293v.get(n1Var);
                if (h1Var != null) {
                    h1Var.b(str3);
                }
            }
        }
        Object obj4 = sbaAdsLeadGenExpandView.f35293v.get(i1.f92065k);
        c1 c1Var = obj4 instanceof c1 ? (c1) obj4 : null;
        if (c1Var != null) {
            c1Var.f91996c.f92024g = cacheData.f92033e;
        }
        e eVar = cacheData.f92030b;
        if (eVar instanceof b) {
            str = ((b) eVar).f91984a;
        } else if (eVar instanceof c) {
            str = bs1.c.f2(sbaAdsLeadGenExpandView, ((c) eVar).f91994a);
        } else {
            if (!(eVar instanceof d)) {
                throw new NoWhenBranchMatchedException();
            }
            str = null;
        }
        if (str != null) {
            LinkedHashMap linkedHashMap = sbaAdsLeadGenExpandView.f35293v;
            i1 i1Var = i1.f92063i;
            h1 h1Var2 = (h1) linkedHashMap.get(i1Var);
            if (h1Var2 != null) {
                h1Var2.b(str);
            }
            Object obj5 = sbaAdsLeadGenExpandView.f35293v.get(i1Var);
            g1 g1Var = obj5 instanceof g1 ? (g1) obj5 : null;
            if (g1Var != null) {
                g1Var.f92044d = true;
            }
        }
        t2 t2Var = new t2(sbaAdsLeadGenExpandView, null);
        androidx.lifecycle.z r13 = b7.c.r(sbaAdsLeadGenExpandView);
        if (r13 != null) {
            kotlin.jvm.internal.j.z(bf.b.S(r13), null, null, new l2(t2Var, null), 3);
        }
        sbaAdsLeadGenExpandView.f35289r = 0;
        System.currentTimeMillis();
    }

    public final void H0(v displayState) {
        LinkedHashMap linkedHashMap;
        i1 i1Var;
        View view;
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        SbaAdsLeadGenExpandView sbaAdsLeadGenExpandView = this.f91991x;
        sbaAdsLeadGenExpandView.getClass();
        List listQuestionErrors = displayState.f92200g;
        Intrinsics.checkNotNullParameter(listQuestionErrors, "listQuestionErrors");
        sbaAdsLeadGenExpandView.b(f2.EnabledState);
        int i13 = 0;
        kh2.s0.w(sbaAdsLeadGenExpandView.f35279h, new k2(ln1.e.LOADED, i13));
        Iterator it = listQuestionErrors.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            linkedHashMap = sbaAdsLeadGenExpandView.f35293v;
            i1Var = i1.f92058d;
            if (!hasNext) {
                break;
            }
            p1 p1Var = (p1) it.next();
            int i14 = 1;
            if (Intrinsics.d(p1Var.f92133a, i1Var)) {
                GestaltCheckBox gestaltCheckBox = sbaAdsLeadGenExpandView.f35291t;
                if (gestaltCheckBox != null) {
                    gestaltCheckBox.L(new i2(sbaAdsLeadGenExpandView, i14));
                }
            } else {
                h1 h1Var = (h1) linkedHashMap.get(p1Var.f92133a);
                if (h1Var != null) {
                    if (h1Var instanceof f1) {
                        f1 f1Var = (f1) h1Var;
                        f1Var.f92036c.X(new hs.a(8, sbaAdsLeadGenExpandView, p1Var));
                        f1Var.f92037d = true;
                    } else if (h1Var instanceof g1) {
                        ((g1) h1Var).f92043c.t(new m2(p1Var, i13));
                    } else if (h1Var instanceof b1) {
                        ((b1) h1Var).f91988c.f92021d.i(new m2(p1Var, i14));
                    } else if (!(h1Var instanceof a1) && (h1Var instanceof c1)) {
                        ((c1) h1Var).f91996c.f92021d.i(new m2(p1Var, 2));
                    }
                }
            }
        }
        p1 p1Var2 = (p1) CollectionsKt.firstOrNull(listQuestionErrors);
        boolean d2 = Intrinsics.d(p1Var2 != null ? p1Var2.f92133a : null, i1Var);
        ScrollView scrollView = sbaAdsLeadGenExpandView.f35272a;
        if (d2) {
            scrollView.post(new c2(sbaAdsLeadGenExpandView, i13));
            return;
        }
        h1 h1Var2 = (h1) linkedHashMap.get(p1Var2 != null ? p1Var2.f92133a : null);
        if (h1Var2 == null || (view = h1Var2.f92050b) == null) {
            return;
        }
        scrollView.post(new dp.a(11, sbaAdsLeadGenExpandView, view));
    }

    public final void I0(View view) {
        Set entrySet = this.C.entrySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : entrySet) {
            if (!Intrinsics.d(((x1) ((Map.Entry) obj).getValue()).f92231a, view)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            bs1.c.X0(((x1) ((Map.Entry) it.next()).getValue()).f92231a);
        }
        bs1.c.U1(view);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0020, code lost:
    
        if (kotlin.text.z.j(r4) != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void K0(nt.v r4) {
        /*
            r3 = this;
            java.lang.String r0 = "displayState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            nt.u2 r4 = r4.f92199f
            if (r4 == 0) goto L14
            android.content.Context r0 = r3.getContext()
            int r4 = r4.f92193a
            java.lang.String r4 = r0.getString(r4)
            goto L15
        L14:
            r4 = 0
        L15:
            com.pinterest.ads.feature.owc.leadgen.bottomSheet.SbaAdsLeadGenExpandView r0 = r3.f91991x
            if (r4 == 0) goto L22
            r0.getClass()
            boolean r1 = kotlin.text.z.j(r4)
            if (r1 == 0) goto L31
        L22:
            android.content.res.Resources r4 = r0.getResources()
            java.lang.String r1 = "getResources(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r1)
            int r1 = ps.s.signup_error
            java.lang.String r4 = bs1.c.c2(r1, r4)
        L31:
            rq.l2 r1 = new rq.l2
            r2 = 13
            r1.<init>(r4, r2)
            com.pinterest.gestalt.text.GestaltText r4 = r0.f35277f
            r4.i(r1)
            nt.f2 r4 = nt.f2.EnabledState
            r0.b(r4)
            ln1.e r4 = ln1.e.LOADED
            nt.k2 r1 = new nt.k2
            r2 = 0
            r1.<init>(r4, r2)
            com.pinterest.gestalt.spinner.GestaltSpinner r4 = r0.f35279h
            kh2.s0.w(r4, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nt.b2.K0(nt.v):void");
    }

    @Override // cu.i
    public final void L(Integer num, int i13) {
        GestaltText gestaltText;
        x1 x1Var = this.D;
        x1Var.f92236f = i13;
        View view = x1Var.f92231a;
        LinearLayout linearLayout = this.f53208j;
        if (!Intrinsics.d(view, linearLayout)) {
            pk.a0.k1(this.D.f92231a, i13);
            return;
        }
        pk.a0.k1(linearLayout, i13);
        GestaltText gestaltText2 = this.B;
        int height = gestaltText2 != null ? gestaltText2.getHeight() : 0;
        if (height <= 0 || num == null || (gestaltText = this.B) == null) {
            return;
        }
        pk.a0.k1(gestaltText, num.intValue() + height);
    }

    public final void L0() {
        setVisibility(0);
        P0(a.SIGN_UP_SUCCESS);
    }

    public final void P0(a aVar) {
        x1 x1Var = (x1) this.C.get(aVar);
        if (x1Var != null) {
            this.D = x1Var;
            boolean z13 = x1Var.f92232b;
            AdsLeadGenBottomSheetBehavior adsLeadGenBottomSheetBehavior = this.A;
            adsLeadGenBottomSheetBehavior.f35311l0 = z13;
            adsLeadGenBottomSheetBehavior.f35375o0 = x1Var.f92233c;
            cu.a aVar2 = this.f53211m;
            if (aVar2 != null) {
                BaseAdsScrollingModule baseAdsScrollingModule = (BaseAdsScrollingModule) aVar2;
                if (baseAdsScrollingModule.z1()) {
                    if (x1Var.f92234d) {
                        baseAdsScrollingModule.n1().q();
                    } else {
                        baseAdsScrollingModule.n1().e();
                    }
                }
            }
            if (x1Var.f92235e) {
                I0(x1Var.f92231a);
            }
            x1Var.f92237g.invoke();
        }
    }

    @Override // com.pinterest.ads.feature.owc.view.core.AdsBrowserBottomSheet, cu.i
    public final void Z(float f13) {
        InAppBrowserView inAppBrowserView = this.f35366r;
        if (inAppBrowserView != null) {
            inAppBrowserView.setAlpha(f13);
        }
        InAppBrowserView inAppBrowserView2 = this.f35366r;
        LinearLayout linearLayout = inAppBrowserView2 != null ? inAppBrowserView2.f45398k : null;
        if (linearLayout == null) {
            return;
        }
        linearLayout.setAlpha(f13);
    }

    @Override // com.pinterest.ads.feature.owc.view.core.AdsBrowserBottomSheet, cu.i
    /* renamed from: g */
    public final BaseAdsBottomSheetBehavior getF35368t() {
        return this.A;
    }

    @Override // cu.i
    public final int j() {
        return m();
    }

    @Override // com.pinterest.ads.feature.owc.view.core.AdsBrowserBottomSheet, cu.i
    public final int k() {
        return ps.q.ads_leadgen_bottom_sheet;
    }

    @Override // cu.i
    public final int m() {
        x1 x1Var = this.D;
        int i13 = x1Var.f92236f;
        return i13 > 0 ? i13 : Intrinsics.d(x1Var.f92231a, this.f35366r) ? this.f53208j.getHeight() : this.D.f92231a.getHeight();
    }

    @Override // qu.a, com.pinterest.ads.feature.owc.view.core.AdsBrowserBottomSheet, cu.i
    public final void o() {
        fu.c cVar;
        cu.a aVar = this.f53211m;
        if (aVar == null || (cVar = ((BaseAdsScrollingModule) aVar).f35327n0) == null) {
            return;
        }
        cVar.d5();
    }

    @Override // cu.i
    public final void t() {
    }

    public final void t0() {
        P0(a.SIGN_UP_COLLAPSE);
    }

    @Override // com.pinterest.ads.feature.owc.view.core.AdsBrowserBottomSheet, cu.i
    public final void x() {
        String str = this.f91990w;
        CharSequence text = (str == null || str.length() == 0) ? getContext().getText(m60.x0.learn_more) : this.f91990w;
        Intrinsics.f(text);
        i().i(new ip.d(6, text));
    }

    @Override // cu.i
    public final void z() {
        n();
    }

    public final void z0() {
        setVisibility(0);
        P0(a.SIGN_UP_EXPAND);
    }
}
