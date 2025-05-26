package sz0;

import a.z0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import b01.o;
import c01.e;
import c2.m4;
import com.bumptech.glide.d;
import com.pinterest.api.model.af0;
import com.pinterest.api.model.cd0;
import com.pinterest.api.model.h20;
import com.pinterest.api.model.hf0;
import com.pinterest.api.model.kg0;
import com.pinterest.api.model.lf0;
import com.pinterest.api.model.mf0;
import com.pinterest.api.model.p20;
import com.pinterest.api.model.rg0;
import com.pinterest.api.model.sf0;
import com.pinterest.api.model.sr;
import com.pinterest.api.model.tg0;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.vh;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.pin.edit.view.AttributeActionView;
import com.pinterest.feature.pin.edit.view.AttributeCompoundView;
import com.pinterest.feature.pin.edit.view.AttributeDividerView;
import com.pinterest.feature.pin.edit.view.AttributeInputTextViewLegacy;
import com.pinterest.feature.pincells.fixedsize.view.FixedSizePinOverlayView;
import com.pinterest.feature.scheduledpins.view.ScheduledPinCellView;
import com.pinterest.feature.search.results.goldstandard.views.GoldStandardActionView;
import com.pinterest.feature.search.results.goldstandard.views.GoldStandardImageAndTextView;
import com.pinterest.feature.search.results.goldstandard.views.GoldStandardTextView;
import com.pinterest.feature.search.results.view.SearchMoreIdeasView;
import com.pinterest.feature.search.results.view.i0;
import com.pinterest.feature.search.results.view.j0;
import com.pinterest.feature.settings.shared.view.SettingsHeaderView;
import com.pinterest.feature.settings.shared.view.SettingsPageItemView;
import com.pinterest.feature.settings.shared.view.SettingsSectionHeaderView;
import com.pinterest.feature.settings.shared.view.SettingsTextItemView;
import com.pinterest.feature.settings.shared.view.SettingsToggleItemView;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.listAction.GestaltListAction;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import com.pinterest.ui.imageview.WebImageView;
import dl1.s;
import h01.k;
import h32.f1;
import h32.g0;
import h32.u0;
import iy1.f;
import j41.i;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import k71.p;
import kg.t;
import kh2.j;
import kh2.j1;
import kh2.r;
import kh2.s0;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.z;
import ky0.b;
import lh0.a4;
import lh0.g1;
import lh0.o2;
import lh0.z3;
import nx.d0;
import pk.a0;
import q5.m0;
import q5.v0;
import q91.g;
import rm1.q;
import rq.l4;
import rq.t0;
import s32.c;
import va1.m1;
import vq0.h;
import w01.e0;
import y01.p1;
import y81.l;
import yk1.n;
import zp.y0;

/* loaded from: classes5.dex */
public final class a extends h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f115647a;

    public a(int i13) {
        this.f115647a = i13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v2, types: [int] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r3v108, types: [android.view.View, com.pinterest.ui.imageview.WebImageView] */
    /* JADX WARN: Type inference failed for: r6v17, types: [android.view.View, android.widget.TextView, com.pinterest.design.brio.widget.PinterestEditText] */
    @Override // vq0.h
    public final void c(n view, Object obj, int i13) {
        String M;
        Object obj2;
        sr srVar;
        int i14;
        int i15 = 20;
        int i16 = this.f115647a;
        int i17 = 17;
        int i18 = 12;
        int i19 = 2;
        int i23 = 1;
        ?? r112 = 0;
        int i24 = 0;
        switch (i16) {
            case 0:
                e view2 = (e) view;
                p20 pearStyle = (p20) obj;
                Intrinsics.checkNotNullParameter(view2, "view");
                Intrinsics.checkNotNullParameter(pearStyle, "model");
                view2.getClass();
                Intrinsics.checkNotNullParameter(pearStyle, "pearStyle");
                String k13 = pearStyle.k();
                boolean o03 = d.o0(k13 != null ? Boolean.valueOf(z.p(k13, "pinny", false)) : null);
                GestaltText gestaltText = view2.f24429f;
                GestaltText gestaltText2 = view2.f24430g;
                GestaltText gestaltText3 = view2.f24428e;
                if (o03) {
                    String q13 = pearStyle.q();
                    r5 = q13 != null ? StringsKt.d0('|', q13, q13) : null;
                    if (r5 == null) {
                        r5 = "";
                    }
                    a0.p(gestaltText, r5);
                    String m13 = pearStyle.m();
                    if (m13 == null) {
                        m13 = "";
                    }
                    a0.p(gestaltText2, m13);
                    d0 d0Var = view2.f24432i;
                    if (d0Var != null) {
                        c0.d.u2(d0Var, f1.VIEW, g0.PEAR_STYLE_PILLS, u0.PEAR_STYLE_PILL, null, 8);
                    }
                    a0.k0(gestaltText3);
                    a0.k0(view2.f24431h);
                    return;
                }
                s32.a aVar = c.Companion;
                Integer s13 = pearStyle.s();
                Intrinsics.checkNotNullExpressionValue(s13, "getVertical(...)");
                int intValue = s13.intValue();
                aVar.getClass();
                c a13 = s32.a.a(intValue);
                int i25 = a13 == null ? -1 : c01.d.f24422a[a13.ordinal()];
                if (i25 == 1) {
                    a0.o(gestaltText3, f.pear_style_fashion, new Object[0]);
                } else if (i25 != 2) {
                    a0.k0(gestaltText3);
                } else {
                    a0.o(gestaltText3, f.pear_style_home_decor, new Object[0]);
                }
                String q14 = pearStyle.q();
                if (q14 == null) {
                    q14 = "";
                }
                a0.p(gestaltText, q14);
                o2 o2Var = view2.f24427d;
                if (o2Var == null) {
                    Intrinsics.r("experiments");
                    throw null;
                }
                z3 activate = a4.f83297a;
                Intrinsics.checkNotNullParameter("enabled_no_description", "group");
                Intrinsics.checkNotNullParameter(activate, "activate");
                if (((g1) o2Var.f83448a).o("android_closeup_pear_styles", "enabled_no_description", activate)) {
                    a0.k0(gestaltText2);
                } else {
                    String m14 = pearStyle.m();
                    if (m14 == null) {
                        m14 = "";
                    }
                    a0.p(gestaltText2, m14);
                }
                List o13 = pearStyle.o();
                if (o13 != null) {
                    view2.T(o13, new b(i19, view2, pearStyle));
                }
                d0 d0Var2 = view2.f24432i;
                if (d0Var2 != null) {
                    c0.d.u2(d0Var2, f1.VIEW, g0.PEAR_STYLE_PILLS, u0.PEAR_STYLE_PILL, null, 8);
                    return;
                }
                return;
            case 1:
                b01.d view3 = (b01.d) view;
                zz0.a model = (zz0.a) obj;
                Intrinsics.checkNotNullParameter(view3, "view");
                Intrinsics.checkNotNullParameter(model, "model");
                view3.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                if (model.f143148d == null) {
                    view3.setVisibility(8);
                    return;
                }
                view3.setVisibility(0);
                String str = model.f143147c;
                if (str == null) {
                    str = "";
                }
                a0.p(view3.f20729c, str);
                v7 v7Var = model.f143148d;
                String j13 = v7Var.j1();
                Intrinsics.checkNotNullExpressionValue(j13, "getName(...)");
                GestaltText gestaltText4 = view3.f20730d;
                a0.p(gestaltText4, j13);
                String v13 = kh2.d.v(v7Var);
                WebImageView webImageView = view3.f20731e;
                webImageView.loadUrl(v13);
                for (View view4 : f0.j(gestaltText4, webImageView, view3.f20732f)) {
                    b01.c cVar = new b01.c(r112 == true ? 1 : 0, view3, model);
                    if (view4 instanceof GestaltText) {
                        ((GestaltText) view4).j(new defpackage.a(15, cVar));
                    } else if (view4 instanceof GestaltIconButton) {
                        ((GestaltIconButton) view4).u(new defpackage.a(16, cVar));
                    } else {
                        view4.setOnClickListener(new t0(18, cVar));
                    }
                }
                c0.d.u2(view3.f20728b, f1.VIEW, g0.PEAR_BOARD, null, null, 12);
                return;
            case 2:
                o view5 = (o) view;
                zz0.c item = (zz0.c) obj;
                Intrinsics.checkNotNullParameter(view5, "view");
                Intrinsics.checkNotNullParameter(item, "model");
                view5.getClass();
                Intrinsics.checkNotNullParameter(item, "item");
                p20 p20Var = item.f143152e;
                String q15 = p20Var.q();
                if (q15 == null) {
                    q15 = "";
                }
                a0.p(view5.f20767f, q15);
                String p13 = p20Var.p();
                if (p13 == null) {
                    p13 = "";
                }
                GestaltText gestaltText5 = view5.f20768g;
                a0.p(gestaltText5, p13);
                String p14 = p20Var.p();
                if (p14 == null || p14.length() == 0) {
                    bs1.c.X0(gestaltText5);
                }
                for (Object obj3 : view5.f20769h) {
                    int i26 = r112 + 1;
                    if (r112 < 0) {
                        f0.p();
                        throw null;
                    }
                    WebImageView webImageView2 = (WebImageView) obj3;
                    List l13 = p20Var.l();
                    webImageView2.V1(l13 != null ? (String) CollectionsKt.U(r112, l13) : null, (r18 & 2) != 0 ? true : true, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? 0 : 0, (r18 & 16) != 0 ? 0 : 0, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, null);
                    r112 = i26;
                }
                view5.setOnClickListener(new y0(view5, item, p20Var, 17));
                view5.L(f1.VIEW, item);
                return;
            case 3:
                e view6 = (e) view;
                zz0.b model2 = (zz0.b) obj;
                Intrinsics.checkNotNullParameter(view6, "view");
                Intrinsics.checkNotNullParameter(model2, "model");
                view6.X(model2);
                return;
            case 4:
                s model3 = (s) obj;
                switch (i16) {
                    case 4:
                        Intrinsics.checkNotNullParameter(view, "view");
                        Intrinsics.checkNotNullParameter(model3, "model");
                        return;
                    default:
                        Intrinsics.checkNotNullParameter(view, "view");
                        Intrinsics.checkNotNullParameter(model3, "model");
                        return;
                }
            case 5:
                k view7 = (k) view;
                vh story = (vh) obj;
                Intrinsics.checkNotNullParameter(view7, "view");
                Intrinsics.checkNotNullParameter(story, "model");
                view7.getClass();
                Intrinsics.checkNotNullParameter(story, "story");
                List list = story.f42865w;
                Intrinsics.checkNotNullExpressionValue(list, "getObjects(...)");
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : list) {
                    if (obj4 instanceof h20) {
                        arrayList.add(obj4);
                    }
                }
                h20 h20Var = (h20) CollectionsKt.firstOrNull(arrayList);
                if (h20Var == null || (M = h20Var.M()) == null || M.length() == 0) {
                    bs1.c.X0(view7);
                    return;
                }
                String G = h20Var.G();
                String str2 = (G != null && G.hashCode() == -1387975912 && G.equals("style_summary")) ? "Style Summary" : "";
                Map a14 = story.a();
                if (a14 != null && (obj2 = a14.get("referrer")) != null) {
                    r5 = obj2.toString();
                }
                b bVar = new b(4, h20Var, str2);
                GestaltListAction gestaltListAction = view7.f66444e;
                kg.a.h(gestaltListAction, bVar);
                gestaltListAction.a0(new y0(view7, h20Var, r5, 18));
                f1 f1Var = f1.VIEW;
                g0 g0Var = g0.PEAR_INSIGHT_STORY_ENTRY_POINT_CONTAINER;
                u0 u0Var = u0.PEAR_INSIGHT_STORY_ENTRY_POINT;
                String uid = h20Var.getUid();
                HashMap hashMap = new HashMap();
                if (r5 == null) {
                    r5 = "";
                }
                hashMap.put("referrer", r5);
                view7.f66442c.h0((r18 & 1) != 0 ? f1.TAP : f1Var, (r18 & 2) != 0 ? null : u0Var, (r18 & 4) != 0 ? null : g0Var, (r18 & 8) != 0 ? null : uid, (r18 & 32) != 0 ? null : hashMap, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                return;
            case 6:
                rq.f0 view8 = (rq.f0) view;
                u01.d model4 = (u01.d) obj;
                Intrinsics.checkNotNullParameter(view8, "view");
                Intrinsics.checkNotNullParameter(model4, "model");
                view8.updatePin(model4.f119882b);
                return;
            case 7:
                AttributeActionView view9 = (AttributeActionView) view;
                s11.a model5 = (s11.a) obj;
                Intrinsics.checkNotNullParameter(view9, "view");
                Intrinsics.checkNotNullParameter(model5, "model");
                Integer num = model5.f110577c;
                if (num != null) {
                    a0.o(view9.f47162d, num.intValue(), new Object[0]);
                }
                view9.getClass();
                view9.f47164f.i(new zu0.c(model5.f110581g, 24));
                String str3 = model5.f110582h;
                if (str3 == null) {
                    str3 = "";
                }
                a0.p(view9.f47163e, str3);
                e0 action = new e0(model5, 6);
                Intrinsics.checkNotNullParameter(action, "action");
                view9.f47168j.i(new dv0.n(r112, i15));
                view9.f47167i.g2(new dv0.n(r112, 21));
                view9.f47169k = action;
                Integer num2 = model5.f110580f;
                if (num2 != null) {
                    view9.L(num2.intValue(), true);
                    return;
                }
                return;
            case 8:
                Intrinsics.checkNotNullParameter((AttributeDividerView) view, "view");
                Intrinsics.checkNotNullParameter((s11.a) obj, "model");
                return;
            case 9:
                final AttributeInputTextViewLegacy view10 = (AttributeInputTextViewLegacy) view;
                s11.a model6 = (s11.a) obj;
                Intrinsics.checkNotNullParameter(view10, "view");
                Intrinsics.checkNotNullParameter(model6, "model");
                y90.b bVar2 = view10.f47203f;
                ?? r63 = view10.f47198a;
                if (bVar2 != null) {
                    r63.removeTextChangedListener(bVar2);
                }
                view10.f47203f = null;
                r63.setOnFocusChangeListener(null);
                r63.f44844p = null;
                r63.setOnEditorActionListener(null);
                Integer num3 = model6.f110577c;
                GestaltText gestaltText6 = view10.f47202e;
                if (num3 == null) {
                    gestaltText6.i(y11.a.f136634v);
                } else {
                    gestaltText6.i(new l4(num3, 5));
                }
                Integer num4 = model6.f110578d;
                if (num4 != null) {
                    r63.setHint(num4.intValue());
                }
                String str4 = model6.f110582h;
                if (str4 == null) {
                    str4 = "";
                }
                r63.setText(str4, TextView.BufferType.EDITABLE);
                Integer num5 = model6.f110583i;
                r63.setTextAppearance(num5 != null ? num5.intValue() : eo1.f.LegoText_Size200);
                r63.setHintTextColor(bs1.c.B(view10, eo1.b.color_gray_500));
                view10.L(model6.f110579e);
                q11.c cVar2 = model6.f110586l;
                if (cVar2 != null) {
                    r11.b textListener = new r11.b(cVar2, model6, r112 == true ? 1 : 0);
                    Intrinsics.checkNotNullParameter(textListener, "textListener");
                    y90.b bVar3 = new y90.b(1, textListener);
                    r63.addTextChangedListener(bVar3);
                    view10.f47203f = bVar3;
                    r11.b focusChangedListener = new r11.b(cVar2, model6, i23);
                    Intrinsics.checkNotNullParameter(focusChangedListener, "focusChangedListener");
                    r63.f44842n = true;
                    r63.f44844p = new z0(view10, 9);
                    r63.setOnFocusChangeListener(new com.google.android.material.datepicker.h(focusChangedListener, 5));
                    final r11.b onEditorDoneActionListener = new r11.b(cVar2, model6, i19);
                    Intrinsics.checkNotNullParameter(onEditorDoneActionListener, "onEditorDoneActionListener");
                    r63.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: y11.j
                        @Override // android.widget.TextView.OnEditorActionListener
                        public final boolean onEditorAction(TextView textView, int i27, KeyEvent keyEvent) {
                            int i28 = AttributeInputTextViewLegacy.f47197g;
                            AttributeInputTextViewLegacy this$0 = AttributeInputTextViewLegacy.this;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Function1 onEditorDoneActionListener2 = onEditorDoneActionListener;
                            Intrinsics.checkNotNullParameter(onEditorDoneActionListener2, "$onEditorDoneActionListener");
                            if (i27 != 6) {
                                return false;
                            }
                            hf0.b.k(this$0.f47198a);
                            this$0.f47198a.clearFocus();
                            this$0.f47201d.requestFocus();
                            onEditorDoneActionListener2.invoke(Boolean.TRUE);
                            return true;
                        }
                    });
                    return;
                }
                return;
            case 10:
                AttributeCompoundView view11 = (AttributeCompoundView) view;
                s11.a model7 = (s11.a) obj;
                Intrinsics.checkNotNullParameter(view11, "view");
                Intrinsics.checkNotNullParameter(model7, "model");
                view11.f47187b.L(ao1.d.f20053j);
                Integer num6 = model7.f110577c;
                GestaltTextField gestaltTextField = view11.f47187b;
                if (num6 != null) {
                    ph.a.p(gestaltTextField, new zx0.d(num6.intValue(), 8));
                }
                Integer num7 = model7.f110578d;
                if (num7 != null) {
                    ph.a.p(gestaltTextField, new zx0.d(num7.intValue(), 7));
                }
                ph.a.p(gestaltTextField, new zu0.c(model7.f110582h, 25));
                view11.f47186a.loadUrl(model7.f110585k);
                p1 textListener2 = new p1(model7, 9);
                Intrinsics.checkNotNullParameter(textListener2, "textListener");
                gestaltTextField.Z(new lq0.o(19, textListener2, view11));
                return;
            case 11:
                j21.a view12 = (j21.a) view;
                h21.c model8 = (h21.c) obj;
                Intrinsics.checkNotNullParameter(view12, "view");
                Intrinsics.checkNotNullParameter(model8, "model");
                String imageUrl = model8.f66554c;
                int i27 = j21.a.f74483e;
                view12.getClass();
                Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
                view12.f74485b.e4(imageUrl, null);
                FixedSizePinOverlayView fixedSizePinOverlayView = view12.f74486c;
                Integer num8 = model8.f66558g;
                if (num8 != null) {
                    ColorStateList b13 = d5.a.b(fixedSizePinOverlayView.getContext(), num8.intValue());
                    WeakHashMap weakHashMap = v0.f102521a;
                    m0.j(fixedSizePinOverlayView.f47437a, b13);
                }
                String messageText = model8.f66556e;
                if (messageText != null) {
                    Intrinsics.checkNotNullParameter(messageText, "text");
                    fixedSizePinOverlayView.getClass();
                    Intrinsics.checkNotNullParameter(messageText, "messageText");
                    fixedSizePinOverlayView.f47438b.setText(messageText);
                }
                Integer num9 = model8.f66559h;
                if (num9 != null) {
                    int intValue2 = num9.intValue();
                    Context context = fixedSizePinOverlayView.getContext();
                    Object obj5 = d5.a.f53679a;
                    fixedSizePinOverlayView.f47438b.setTextColor(context.getColor(intValue2));
                }
                Integer num10 = model8.f66562k;
                if (num10 != null) {
                    int intValue3 = num10.intValue();
                    Context context2 = fixedSizePinOverlayView.getContext();
                    Object obj6 = d5.a.f53679a;
                    fixedSizePinOverlayView.f47439c.setImageDrawable(context2.getDrawable(intValue3));
                }
                Integer num11 = model8.f66563l;
                if (num11 != null) {
                    int intValue4 = num11.intValue();
                    Context context3 = fixedSizePinOverlayView.getContext();
                    Object obj7 = d5.a.f53679a;
                    fixedSizePinOverlayView.f47439c.f2(context3.getColor(intValue4));
                }
                re0.a aVar2 = model8.f66564m;
                if (aVar2 != null) {
                    Resources resources = view12.getResources();
                    hf0.b.q();
                    int Q = r.Q(aVar2, resources);
                    view12.a(Q, Q);
                } else {
                    view12.a(model8.f66552a, model8.f66553b);
                }
                if (model8.f66557f) {
                    bs1.c.X0(fixedSizePinOverlayView.f47439c);
                }
                Integer num12 = model8.f66560i;
                if (num12 != null) {
                    j1.q1(fixedSizePinOverlayView.f47438b, num12.intValue());
                }
                lm1.b actionTextFont = model8.f66561j;
                if (actionTextFont != null) {
                    Intrinsics.checkNotNullParameter(actionTextFont, "actionTextFont");
                    fixedSizePinOverlayView.getClass();
                    Intrinsics.checkNotNullParameter(actionTextFont, "actionTextFont");
                    dl2.b.B2(fixedSizePinOverlayView.f47438b, actionTextFont);
                }
                k21.b actionListener = new k21.b(model8);
                Intrinsics.checkNotNullParameter(actionListener, "actionListener");
                fixedSizePinOverlayView.a(actionListener);
                return;
            case 12:
                s model9 = (s) obj;
                switch (i16) {
                    case 4:
                        Intrinsics.checkNotNullParameter(view, "view");
                        Intrinsics.checkNotNullParameter(model9, "model");
                        return;
                    default:
                        Intrinsics.checkNotNullParameter(view, "view");
                        Intrinsics.checkNotNullParameter(model9, "model");
                        return;
                }
            case 13:
                u51.f view13 = (u51.f) view;
                r51.b item2 = (r51.b) obj;
                Intrinsics.checkNotNullParameter(view13, "view");
                Intrinsics.checkNotNullParameter(item2, "model");
                view13.getClass();
                Intrinsics.checkNotNullParameter(item2, "item");
                String H = item2.f106255b.H();
                Intrinsics.checkNotNullExpressionValue(H, "getPrimaryText(...)");
                a0.p(view13.f120625b, H);
                cd0 cd0Var = item2.f106255b;
                String J2 = cd0Var.J();
                GestaltText gestaltText7 = view13.f120626c;
                if (J2 == null || J2.length() == 0) {
                    a0.k0(gestaltText7);
                } else {
                    String J3 = cd0Var.J();
                    if (J3 == null) {
                        J3 = "";
                    }
                    a0.p(gestaltText7, J3);
                }
                view13.setOnClickListener(new qv0.d0(18, view13, item2));
                return;
            case 14:
                ScheduledPinCellView view14 = (ScheduledPinCellView) view;
                kg0 model10 = (kg0) obj;
                Intrinsics.checkNotNullParameter(view14, "view");
                Intrinsics.checkNotNullParameter(model10, "model");
                view14.getClass();
                Intrinsics.checkNotNullParameter(model10, "model");
                Map D = model10.D();
                if (D != null && (srVar = (sr) D.get("750x")) != null) {
                    ?? r33 = view14.f47594a;
                    ViewGroup.LayoutParams layoutParams = r33.getLayoutParams();
                    if (layoutParams == null) {
                        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    }
                    ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                    Double k14 = srVar.k();
                    Intrinsics.checkNotNullExpressionValue(k14, "getWidth(...)");
                    double doubleValue = k14.doubleValue();
                    Double h10 = srVar.h();
                    Intrinsics.checkNotNullExpressionValue(h10, "getHeight(...)");
                    double doubleValue2 = h10.doubleValue();
                    layoutParams2.G = (doubleValue <= 0.0d || doubleValue2 <= 0.0d) ? "1:1" : doubleValue + ":" + doubleValue2;
                    r33.setLayoutParams(layoutParams2);
                    view14.f47594a.V1(srVar.j(), (r18 & 2) != 0 ? true : true, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? 0 : 0, (r18 & 16) != 0 ? 0 : 0, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, null);
                }
                rg0 E = model10.E();
                r5 = E != null ? E.P() : null;
                if (r5 == null) {
                    r5 = "";
                }
                int length = r5.length();
                GestaltText gestaltText8 = view14.f47595b;
                if (length > 0) {
                    gestaltText8.i(new b31.f(r5, 11));
                } else {
                    a0.k0(gestaltText8);
                }
                Date X0 = ig1.b.X0(model10);
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(X0);
                a0.p(view14.f47596c, df.j1.U(bs1.c.f2(view14, calendar.get(12) > 0 ? q22.c.scheduled_pin_publish_time_with_minutes : q22.c.scheduled_pin_publish_time_without_minutes), new Object[]{X0}));
                view14.f47597d = model10;
                return;
            case 15:
                z51.h view15 = (z51.h) view;
                tg0 model11 = (tg0) obj;
                Intrinsics.checkNotNullParameter(view15, "view");
                Intrinsics.checkNotNullParameter(model11, "model");
                view15.getClass();
                Intrinsics.checkNotNullParameter(model11, "model");
                Date date = model11.f42207a;
                Date date2 = model11.f42208b;
                a0.p(view15.f140871b, s0.D0(date, date2) ? df.j1.U(bs1.c.f2(view15, q22.c.scheduled_pin_feed_section_header_date), new Object[]{date}) : df.j1.U(bs1.c.f2(view15, q22.c.scheduled_pin_feed_section_header_date_range), new Object[]{date, date2}));
                view15.f140872c.i(new i(model11, 10));
                view15.f140873d.u(new lq0.o(25, model11, view15));
                return;
            case 16:
                GoldStandardTextView view16 = (GoldStandardTextView) view;
                lf0 content = (lf0) obj;
                Intrinsics.checkNotNullParameter(view16, "view");
                Intrinsics.checkNotNullParameter(content, "model");
                view16.getClass();
                Intrinsics.checkNotNullParameter(content, "content");
                j.C2(view16.f47650a, content);
                return;
            case 17:
                GoldStandardImageAndTextView view17 = (GoldStandardImageAndTextView) view;
                sf0 content2 = (sf0) obj;
                Intrinsics.checkNotNullParameter(view17, "view");
                Intrinsics.checkNotNullParameter(content2, "model");
                view17.getClass();
                Intrinsics.checkNotNullParameter(content2, "content");
                view17.L(content2);
                view17.setOnClickListener(new qv0.d0(22, view17, content2));
                return;
            case 18:
                GoldStandardImageAndTextView view18 = (GoldStandardImageAndTextView) view;
                hf0 content3 = (hf0) obj;
                Intrinsics.checkNotNullParameter(view18, "view");
                Intrinsics.checkNotNullParameter(content3, "model");
                view18.getClass();
                Intrinsics.checkNotNullParameter(content3, "content");
                Intrinsics.checkNotNullParameter(content3, "<this>");
                mf0 mf0Var = new mf0(0);
                boolean[] zArr = mf0Var.f40103q;
                mf0Var.f40092f = content3.G();
                if (zArr.length > 5) {
                    zArr[5] = true;
                }
                mf0Var.f40091e = content3.F();
                if (zArr.length > 4) {
                    zArr[4] = true;
                }
                mf0Var.f40101o = content3.O();
                if (zArr.length > 14) {
                    zArr[14] = true;
                }
                mf0Var.f40100n = content3.N();
                if (zArr.length > 13) {
                    zArr[13] = true;
                }
                mf0Var.f40097k = content3.L();
                if (zArr.length > 10) {
                    zArr[10] = true;
                }
                mf0Var.f40096j = content3.K();
                if (zArr.length > 9) {
                    zArr[9] = true;
                }
                mf0Var.f40102p = content3.P();
                if (zArr.length > 15) {
                    zArr[15] = true;
                }
                mf0Var.f40095i = content3.J();
                if (zArr.length > 8) {
                    zArr[8] = true;
                }
                sf0 a15 = mf0Var.a();
                Intrinsics.checkNotNullExpressionValue(a15, "build(...)");
                view18.L(a15);
                t.e1(view18.f47646b);
                view18.setOnClickListener(new qv0.d0(21, view18, content3));
                return;
            case 19:
                GoldStandardActionView view19 = (GoldStandardActionView) view;
                af0 content4 = (af0) obj;
                Intrinsics.checkNotNullParameter(view19, "view");
                Intrinsics.checkNotNullParameter(content4, "model");
                view19.getClass();
                Intrinsics.checkNotNullParameter(content4, "content");
                view19.setOnClickListener(new qv0.d0(i15, view19, content4));
                String q16 = content4.q();
                if (q16 == null) {
                    q16 = "";
                }
                a0.p(view19.f47640a, q16);
                String l14 = content4.l();
                if (l14 == null) {
                    l14 = "";
                }
                a0.p(view19.f47641b, l14);
                int intValue5 = content4.k().intValue();
                dl2.b.z(view19.f47642c, new rq.o2(intValue5 != 1 ? intValue5 != 2 ? intValue5 != 3 ? q.PHONE : q.INFO_CIRCLE : q.SPEECH_ELLIPSIS : q.PHONE, i17));
                return;
            case 20:
                SearchMoreIdeasView view20 = (SearchMoreIdeasView) view;
                b71.c model12 = (b71.c) obj;
                Intrinsics.checkNotNullParameter(view20, "view");
                Intrinsics.checkNotNullParameter(model12, "model");
                view20.getClass();
                Intrinsics.checkNotNullParameter(model12, "model");
                String str5 = model12.f22089a;
                String string = view20.getResources().getString(l42.e.search_more_ideas_for_you_about_query, str5);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                Context context4 = view20.getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                a0.q(view20.f47749c, bs1.c.h2(SearchMoreIdeasView.a(context4, str5, string)));
                int i28 = i0.f47805a[model12.f22090b.ordinal()];
                GestaltText gestaltText9 = view20.f47750d;
                GestaltText gestaltText10 = view20.f47751e;
                if (i28 == 1) {
                    if (gestaltText10 != null) {
                        gestaltText10.i(new j0(view20, str5, r112 == true ? 1 : 0));
                    }
                    if (gestaltText9 != null) {
                        a0.k0(gestaltText9);
                        return;
                    }
                    return;
                }
                if (i28 != 2) {
                    return;
                }
                if (gestaltText10 != null) {
                    a0.k0(gestaltText10);
                }
                if (gestaltText9 != null) {
                    gestaltText9.i(new j0(view20, str5, i23));
                    return;
                }
                return;
            case 21:
                Intrinsics.checkNotNullParameter((p) view, "view");
                Intrinsics.checkNotNullParameter((n71.a) obj, "model");
                return;
            case 22:
                y81.c view21 = (y81.c) view;
                Intrinsics.checkNotNullParameter(view21, "view");
                Intrinsics.checkNotNullParameter((s) obj, "model");
                ((l) view21).a(null);
                return;
            case 23:
                SettingsHeaderView view22 = (SettingsHeaderView) view;
                m91.d model13 = (m91.d) obj;
                Intrinsics.checkNotNullParameter(view22, "view");
                Intrinsics.checkNotNullParameter(model13, "model");
                view22.getClass();
                Intrinsics.checkNotNullParameter(model13, "model");
                a0.o(view22.f48344a, model13.f86728b, new Object[0]);
                return;
            case 24:
                q91.i view23 = (q91.i) view;
                m91.j item3 = (m91.j) obj;
                Intrinsics.checkNotNullParameter(view23, "view");
                Intrinsics.checkNotNullParameter(item3, "model");
                view23.getClass();
                Intrinsics.checkNotNullParameter(item3, "item");
                view23.f103131g = item3.f86737f;
                view23.f103132h = item3.f86735d;
                i iVar = new i(item3, 29);
                GestaltTextField gestaltTextField2 = view23.f103129e;
                gestaltTextField2.X(iVar);
                gestaltTextField2.Z(new l11.p(view23, 23));
                gestaltTextField2.g0();
                bd1.b bVar4 = view23.f103132h;
                if (bVar4 == null) {
                    Intrinsics.r("apiFieldName");
                    throw null;
                }
                if (bVar4 == bd1.b.AGE_FIELD) {
                    gestaltTextField2.X(q91.b.f103064k);
                    if (item3.f86736e == b52.c.edit_age_hint_for_business_accounts) {
                        gestaltTextField2.X(q91.b.f103065l);
                        view23.f103130f.i(q91.b.f103066m);
                    }
                    gestaltTextField2.d0();
                }
                view23.setVisibility(item3.f86740c ? 0 : 8);
                return;
            case 25:
                g view24 = (g) view;
                m91.h model14 = (m91.h) obj;
                Intrinsics.checkNotNullParameter(view24, "view");
                Intrinsics.checkNotNullParameter(model14, "model");
                view24.getClass();
                Intrinsics.checkNotNullParameter(model14, "model");
                Iterator it = model14.f86734d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i14 = -1;
                    } else if (((m91.g) it.next()).f86733f) {
                        i14 = i24;
                    } else {
                        i24++;
                    }
                }
                view24.a().t(new m4(model14, i14, i18));
                return;
            case 26:
                SettingsSectionHeaderView view25 = (SettingsSectionHeaderView) view;
                va1.j1 model15 = (va1.j1) obj;
                Intrinsics.checkNotNullParameter(view25, "view");
                Intrinsics.checkNotNullParameter(model15, "model");
                view25.a(model15);
                return;
            case 27:
                SettingsTextItemView view26 = (SettingsTextItemView) view;
                va1.j1 model16 = (va1.j1) obj;
                Intrinsics.checkNotNullParameter(view26, "view");
                Intrinsics.checkNotNullParameter(model16, "model");
                view26.a(model16);
                return;
            case 28:
                SettingsPageItemView view27 = (SettingsPageItemView) view;
                va1.f1 model17 = (va1.f1) obj;
                Intrinsics.checkNotNullParameter(view27, "view");
                Intrinsics.checkNotNullParameter(model17, "model");
                view27.a(model17);
                return;
            default:
                SettingsToggleItemView view28 = (SettingsToggleItemView) view;
                m1 model18 = (m1) obj;
                Intrinsics.checkNotNullParameter(view28, "view");
                Intrinsics.checkNotNullParameter(model18, "model");
                view28.a(model18);
                return;
        }
    }

    @Override // vq0.h
    public final String g(int i13, Object obj) {
        int i14 = this.f115647a;
        switch (i14) {
            case 0:
                p20 model = (p20) obj;
                Intrinsics.checkNotNullParameter(model, "model");
                break;
            case 1:
                zz0.a model2 = (zz0.a) obj;
                Intrinsics.checkNotNullParameter(model2, "model");
                break;
            case 2:
                zz0.c model3 = (zz0.c) obj;
                Intrinsics.checkNotNullParameter(model3, "model");
                break;
            case 3:
                zz0.b model4 = (zz0.b) obj;
                Intrinsics.checkNotNullParameter(model4, "model");
                break;
            case 4:
                h(i13, (s) obj);
                break;
            case 5:
                vh model5 = (vh) obj;
                Intrinsics.checkNotNullParameter(model5, "model");
                break;
            case 6:
                u01.d model6 = (u01.d) obj;
                Intrinsics.checkNotNullParameter(model6, "model");
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                h21.c model7 = (h21.c) obj;
                Intrinsics.checkNotNullParameter(model7, "model");
                break;
            case 12:
                h(i13, (s) obj);
                break;
            case 13:
                r51.b model8 = (r51.b) obj;
                Intrinsics.checkNotNullParameter(model8, "model");
                break;
            case 14:
                kg0 model9 = (kg0) obj;
                Intrinsics.checkNotNullParameter(model9, "model");
                break;
            case 15:
                tg0 model10 = (tg0) obj;
                Intrinsics.checkNotNullParameter(model10, "model");
                break;
            case 16:
                lf0 model11 = (lf0) obj;
                Intrinsics.checkNotNullParameter(model11, "model");
                break;
            case 17:
                sf0 model12 = (sf0) obj;
                Intrinsics.checkNotNullParameter(model12, "model");
                break;
            case 18:
                hf0 model13 = (hf0) obj;
                Intrinsics.checkNotNullParameter(model13, "model");
                break;
            case 19:
                af0 model14 = (af0) obj;
                Intrinsics.checkNotNullParameter(model14, "model");
                break;
            case 20:
                b71.c model15 = (b71.c) obj;
                Intrinsics.checkNotNullParameter(model15, "model");
                break;
            case 21:
                n71.a model16 = (n71.a) obj;
                Intrinsics.checkNotNullParameter(model16, "model");
                break;
            case 22:
                h(i13, (s) obj);
                break;
            case 23:
                m91.d model17 = (m91.d) obj;
                Intrinsics.checkNotNullParameter(model17, "model");
                break;
            case 24:
                m91.j model18 = (m91.j) obj;
                Intrinsics.checkNotNullParameter(model18, "model");
                break;
            case 25:
                m91.h model19 = (m91.h) obj;
                Intrinsics.checkNotNullParameter(model19, "model");
                break;
            case 26:
                va1.j1 model20 = (va1.j1) obj;
                switch (i14) {
                    case 26:
                        Intrinsics.checkNotNullParameter(model20, "model");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(model20, "model");
                        break;
                }
            case 27:
                va1.j1 model21 = (va1.j1) obj;
                switch (i14) {
                    case 26:
                        Intrinsics.checkNotNullParameter(model21, "model");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(model21, "model");
                        break;
                }
            case 28:
                va1.f1 model22 = (va1.f1) obj;
                Intrinsics.checkNotNullParameter(model22, "model");
                break;
            default:
                m1 model23 = (m1) obj;
                Intrinsics.checkNotNullParameter(model23, "model");
                break;
        }
        return null;
    }

    public final String h(int i13, s model) {
        switch (this.f115647a) {
            case 4:
                Intrinsics.checkNotNullParameter(model, "model");
                break;
            case 12:
                Intrinsics.checkNotNullParameter(model, "model");
                break;
            default:
                Intrinsics.checkNotNullParameter(model, "model");
                break;
        }
        return null;
    }

    public final String i(s11.a model) {
        switch (this.f115647a) {
            case 7:
                Intrinsics.checkNotNullParameter(model, "model");
                break;
            case 8:
                Intrinsics.checkNotNullParameter(model, "model");
                break;
            case 9:
                Intrinsics.checkNotNullParameter(model, "model");
                break;
            default:
                Intrinsics.checkNotNullParameter(model, "model");
                break;
        }
        return model.f110582h;
    }
}
