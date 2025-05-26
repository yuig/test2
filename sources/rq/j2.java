package rq;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class j2 extends j {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f109287n = 0;

    /* renamed from: c, reason: collision with root package name */
    public i92.k f109288c;

    /* renamed from: d, reason: collision with root package name */
    public so.p f109289d;

    /* renamed from: e, reason: collision with root package name */
    public is1.i0 f109290e;

    /* renamed from: f, reason: collision with root package name */
    public LinearLayout f109291f;

    /* renamed from: g, reason: collision with root package name */
    public GestaltText f109292g;

    /* renamed from: h, reason: collision with root package name */
    public oq.q0 f109293h;

    /* renamed from: i, reason: collision with root package name */
    public String f109294i;

    /* renamed from: j, reason: collision with root package name */
    public StringBuilder f109295j;

    /* renamed from: k, reason: collision with root package name */
    public t10.f f109296k;

    /* renamed from: l, reason: collision with root package name */
    public oq.q f109297l;

    /* renamed from: m, reason: collision with root package name */
    public final xj2.b f109298m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(Context context) {
        super(context, 7);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f109298m = new xj2.b();
    }

    public final is1.i0 b() {
        is1.i0 i0Var = this.f109290e;
        if (i0Var != null) {
            return i0Var;
        }
        Intrinsics.r("translationsTracker");
        throw null;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final void createView() {
        setOrientation(1);
        setVisibility(8);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        int W = bs1.c.W(linearLayout, eo1.c.lego_spacing_horizontal_medium);
        linearLayout.setPaddingRelative(W, bs1.c.W(linearLayout, eo1.c.space_600), W, bs1.c.W(linearLayout, n80.a.lego_recipe_module_bottom_padding));
        this.f109291f = linearLayout;
        maybeUpdateLayoutForTabletPortrait(linearLayout);
        if (!e()) {
            addView(linearLayout);
            return;
        }
        linearLayout.setPaddingRelative(linearLayout.getPaddingStart(), 0, linearLayout.getPaddingEnd(), linearLayout.getPaddingBottom());
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        oq.q qVar = new oq.q(context, linearLayout, false, new e(this, 3), new e(this, 4));
        if (e()) {
            maybeUpdateLayoutForTabletPortrait(qVar);
        }
        this.f109297l = qVar;
        removeAllViews();
        addView(this.f109297l);
    }

    public final boolean e() {
        if (hf0.b.q()) {
            lh0.n1 n1Var = a11.o.f334a;
            if (!a11.o.b(getPin())) {
                return false;
            }
        }
        return true;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final HashMap getCardViewAuxData() {
        Pair[] pairArr = new Pair[1];
        t10.f fVar = this.f109296k;
        pairArr[0] = new Pair("from_aggregated_data", String.valueOf(fVar != null ? Boolean.valueOf(fVar.f115777i) : null));
        return kotlin.collections.z0.f(pairArr);
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final h32.g0 getComponentType() {
        return h32.g0.PIN_CLOSEUP_RECIPE;
    }

    @Override // rq.j, com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean hasContent() {
        return kh2.g0.p0(getPin());
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f109298m.d();
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule, android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i13, int i14) {
        super.onMeasure(i13, i14);
        kh2.r.u(this.f109291f, "PinCloseupRecipeModule.innerLayout");
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final void renderLandscapeConfiguration() {
        GestaltText gestaltText = this.f109292g;
        if (gestaltText != null) {
            gestaltText.setGravity(8388611);
            ViewGroup.LayoutParams layoutParams = gestaltText.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            gestaltText.setGravity(8388611);
            gestaltText.setLayoutParams(layoutParams);
        }
        int W = bs1.c.W(this, eo1.c.lego_spacing_horizontal_large);
        LinearLayout linearLayout = this.f109291f;
        if (linearLayout != null) {
            linearLayout.setPaddingRelative(W, W, W, W);
        }
    }

    @Override // rq.j, com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean shouldShowForPin() {
        return kh2.g0.p0(getPin());
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean shouldUpdateView() {
        String str;
        t10.f fVar = this.f109296k;
        if (fVar == null || (str = fVar.f41481a) == null) {
            return true;
        }
        return true ^ Intrinsics.d(str, this.f109294i);
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final void updatePin(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        t10.f fVar = this.f109296k;
        if (fVar != null) {
            this.f109294i = fVar.f41481a;
        }
        this.f109296k = b40.Y0(pin);
        super.updatePin(pin);
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final void updateView() {
        t10.f fVar;
        String sb3;
        LinearLayout linearLayout;
        t10.f fVar2;
        super.updateView();
        LinearLayout linearLayout2 = this.f109291f;
        if (linearLayout2 != null) {
            linearLayout2.removeAllViews();
        }
        f30 pin = getPin();
        String uid = pin != null ? pin.getUid() : null;
        if (uid == null) {
            uid = "";
        }
        f30 pin2 = getPin();
        if (pin2 != null && Intrinsics.d(pin2.j5(), Boolean.TRUE) && b().d(uid)) {
            is1.h0 b13 = b().b(uid);
            t10.g gVar = b13 != null ? b13.f73601f : null;
            fVar = (gVar == null || (fVar2 = this.f109296k) == null) ? null : kh2.s0.H0(fVar2, gVar);
        } else {
            fVar = this.f109296k;
        }
        if (fVar == null) {
            return;
        }
        String str = fVar.f115782n;
        StringBuilder sb4 = new StringBuilder(str == null ? "" : str);
        sb4.append("\n");
        this.f109295j = sb4;
        int i13 = 0;
        if (fVar.f115777i) {
            if (str == null) {
                str = "";
            }
            LinearLayout linearLayout3 = this.f109291f;
            if (linearLayout3 != null) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                GestaltText G = c0.d.G(context);
                pk.a0.q(G, bs1.c.h2(str));
                G.i(new i2(this, i13));
                linearLayout3.addView(G);
            }
        } else {
            if (this.f109292g == null) {
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                this.f109292g = c0.d.E(context2, false);
            }
            Resources resources = getResources();
            int i14 = r80.e.pin_recipe_ingredients_with_count;
            int i15 = fVar.f115785q;
            String quantityString = resources.getQuantityString(i14, i15, Integer.valueOf(i15));
            Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
            GestaltText gestaltText = this.f109292g;
            if (gestaltText != null) {
                gestaltText.i(new k1.j1(quantityString, 29));
            }
            StringBuilder sb5 = this.f109295j;
            if (sb5 != null) {
                sb5.append(quantityString);
                sb5.append("\n");
            }
            if (e()) {
                GestaltText gestaltText2 = this.f109292g;
                if (gestaltText2 != null) {
                    pk.a0.k0(gestaltText2);
                }
                oq.q qVar = this.f109297l;
                if (qVar != null) {
                    qVar.a(quantityString);
                }
            }
            GestaltText gestaltText3 = this.f109292g;
            if (gestaltText3 != null) {
                ViewGroup.LayoutParams layoutParams = gestaltText3.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.bottomMargin = bs1.c.W(gestaltText3, eo1.c.space_400);
                gestaltText3.setLayoutParams(marginLayoutParams);
                gestaltText3.setTextAlignment(2);
                gestaltText3.i(f2.f109186n);
                kh2.j1.q1(gestaltText3, eo1.c.font_size_300);
            }
        }
        int i16 = -2;
        List<t10.a> list = fVar.f115778j;
        if (list != null) {
            for (t10.a aVar : list) {
                String str2 = aVar.f115765b;
                String str3 = str2 == null ? "" : str2;
                Context context3 = getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                Intrinsics.checkNotNullParameter(context3, "context");
                int i17 = i16;
                String str4 = str3;
                GestaltText C = c0.d.C(context3, i17, 0, 0, 0, bs1.c.V(context3, eo1.c.space_100), true, 380);
                C.setText(str4);
                LinearLayout linearLayout4 = this.f109291f;
                if (linearLayout4 != null) {
                    linearLayout4.addView(C);
                }
                StringBuilder sb6 = this.f109295j;
                if (sb6 != null) {
                    sb6.append("\n");
                    sb6.append(str4);
                    sb6.append("\n");
                }
                List<t10.d> list2 = aVar.f115766c;
                if (list2 != null) {
                    for (t10.d dVar : list2) {
                        Context context4 = getContext();
                        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                        Intrinsics.checkNotNullParameter(dVar, "<this>");
                        Intrinsics.checkNotNullParameter(context4, "context");
                        StringBuilder sb7 = new StringBuilder();
                        String d2 = bs1.c.d2(context4, pq1.f.idea_pin_list_display_dot);
                        String str5 = dVar.f115768b;
                        if (str5 == null) {
                            str5 = "";
                        }
                        String str6 = dVar.f115767a;
                        String str7 = str6 == null ? "" : str6;
                        boolean Q1 = dl2.b.Q1();
                        String str8 = dVar.f115768b;
                        if (Q1) {
                            if (str8 != null) {
                                sb7.append(str8.concat(" "));
                            }
                            if (str6 != null) {
                                sb7.append(str6.concat(" "));
                            }
                            sb7.append(d2);
                        } else {
                            sb7.append(d2);
                            if (str6 != null) {
                                sb7.append(" ".concat(str6));
                            }
                            if (str8 != null) {
                                sb7.append(" ".concat(str8));
                            }
                        }
                        if (str7.length() == 0 && str5.length() == 0) {
                            sb3 = "";
                        } else {
                            sb3 = sb7.toString();
                            Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
                        }
                        if (sb3.length() > 0 && (linearLayout = this.f109291f) != null) {
                            Context context5 = getContext();
                            Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                            GestaltText C2 = c0.d.C(context5, -2, 0, 0, 0, 0, false, 1020);
                            C2.setText(sb3);
                            linearLayout.addView(C2);
                        }
                        StringBuilder sb8 = this.f109295j;
                        if (sb8 != null) {
                            sb8.append(sb3);
                            sb8.append("\n");
                        }
                    }
                }
                LinearLayout linearLayout5 = this.f109291f;
                if (linearLayout5 != null) {
                    View view = new View(getContext());
                    view.setLayoutParams(new LinearLayout.LayoutParams(-1, bs1.c.W(view, eo1.c.space_400)));
                    linearLayout5.addView(view);
                }
                i16 = -2;
            }
        }
        f30 pin3 = getPin();
        if (pin3 != null && Intrinsics.d(pin3.j5(), Boolean.TRUE)) {
            is1.i0 b14 = b();
            f30 pin4 = getPin();
            String uid2 = pin4 != null ? pin4.getUid() : null;
            boolean d13 = b14.d(uid2 != null ? uid2 : "");
            Context context6 = getContext();
            Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
            oq.q0 q0Var = new oq.q0(context6, 0);
            db.m action = new db.m(this, 15);
            Intrinsics.checkNotNullParameter(action, "action");
            ((GestaltText) q0Var.f97131a).setOnClickListener(new co.a(12, q0Var, action));
            q0Var.a(d13 ? oq.p0.SHOW_ORIGINAL : oq.p0.SHOW_TRANSLATION);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams2.bottomMargin = bs1.c.W(q0Var, eo1.c.space_400);
            q0Var.setLayoutParams(layoutParams2);
            this.f109293h = q0Var;
            LinearLayout linearLayout6 = this.f109291f;
            if (linearLayout6 != null) {
                linearLayout6.addView(q0Var);
            }
        }
        String valueOf = String.valueOf(this.f109295j);
        int i18 = 1;
        if (!kotlin.text.z.j(valueOf)) {
            Context context7 = getContext();
            Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
            GestaltButton.SmallSecondaryButton smallSecondaryButton = new GestaltButton.SmallSecondaryButton(6, context7, (AttributeSet) null);
            int W = bs1.c.W(smallSecondaryButton, eo1.c.space_400);
            smallSecondaryButton.setPaddingRelative(W, 0, W, 0);
            LinearLayout linearLayout7 = this.f109291f;
            if (linearLayout7 != null) {
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams3.gravity = isTabletLandscapeMode() ? 8388611 : 1;
                smallSecondaryButton.setLayoutParams(layoutParams3);
                smallSecondaryButton.d(f2.f109185m);
                smallSecondaryButton.e(new m1(this, smallSecondaryButton, valueOf, i18));
                linearLayout7.addView(smallSecondaryButton);
            }
        }
    }
}
