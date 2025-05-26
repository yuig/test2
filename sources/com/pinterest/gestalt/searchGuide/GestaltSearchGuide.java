package com.pinterest.gestalt.searchGuide;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.firebase.messaging.q;
import com.pinterest.gestalt.avatargroup.GestaltAvatarGroup;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import en1.a0;
import en1.b0;
import en1.c0;
import en1.d;
import en1.d0;
import en1.e0;
import en1.f0;
import en1.h0;
import en1.l;
import en1.l0;
import en1.m;
import en1.m0;
import en1.n0;
import en1.o0;
import en1.t;
import en1.u;
import eo1.a;
import fm1.c;
import gm1.b;
import java.util.List;
import kg.p;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rl2.g0;
import sl1.k;
import u50.e;
import u50.i;
import u50.i0;
import u50.o;
import u50.w;
import xk2.v;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00000\u0002:\u0007\f\r\u000e\u0003\u000f\u0010\u0011B'\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/pinterest/gestalt/searchGuide/GestaltSearchGuide;", "Landroid/widget/LinearLayout;", "Lgm1/b;", "Len1/d;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "en1/b", "en1/c", "al1/n", "en1/b0", "kg/p", "en1/f0", "searchGuide_release"}, k = 1, mv = {1, 9, 0})
@SuppressLint({"GestaltComponentUnsafeSetterCall"})
/* loaded from: classes5.dex */
public final class GestaltSearchGuide extends LinearLayout implements b {

    /* renamed from: l, reason: collision with root package name */
    public static final c f49543l = c.VISIBLE;

    /* renamed from: m, reason: collision with root package name */
    public static final c0 f49544m = new c0(new e(a.comp_searchguide_base_background_color), new e(a.comp_text_color_dark));

    /* renamed from: a, reason: collision with root package name */
    public final q f49545a;

    /* renamed from: b, reason: collision with root package name */
    public final f0 f49546b;

    /* renamed from: c, reason: collision with root package name */
    public final en1.b f49547c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f49548d;

    /* renamed from: e, reason: collision with root package name */
    public final v f49549e;

    /* renamed from: f, reason: collision with root package name */
    public GestaltIcon f49550f;

    /* renamed from: g, reason: collision with root package name */
    public GestaltAvatarGroup f49551g;

    /* renamed from: h, reason: collision with root package name */
    public WebImageView f49552h;

    /* renamed from: i, reason: collision with root package name */
    public GestaltIcon f49553i;

    /* renamed from: j, reason: collision with root package name */
    public final v f49554j;

    /* renamed from: k, reason: collision with root package name */
    public final v f49555k;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GestaltSearchGuide(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a(WebImageView webImageView, boolean z13) {
        if (this.f49548d) {
            float e13 = z13 ? e() - ((Number) this.f49555k.getValue()).floatValue() : e();
            if (bs1.c.l1(this)) {
                webImageView.g2(0.0f, e13, 0.0f, e13);
                return;
            } else {
                webImageView.g2(e13, 0.0f, e13, 0.0f);
                return;
            }
        }
        int G0 = dl2.b.G0(this, a.comp_searchguide_image_margin);
        webImageView.g2(e(), e(), e(), e());
        ViewGroup.LayoutParams layoutParams = webImageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.setMarginStart(G0);
        layoutParams2.topMargin = G0;
        layoutParams2.bottomMargin = G0;
        webImageView.setLayoutParams(layoutParams2);
    }

    public final void b(Function1 nextState) {
        Intrinsics.checkNotNullParameter(nextState, "nextState");
    }

    public final View c(View view, int i13, int i14, boolean z13) {
        if (view != null) {
            return view;
        }
        LayoutInflater.from(getContext()).inflate(i14, (ViewGroup) this, true);
        View findViewById = findViewById(i13);
        if (z13) {
            removeView(findViewById);
            addView(findViewById, 0);
        }
        Intrinsics.f(findViewById);
        return findViewById;
    }

    public final ColorStateList d(p pVar) {
        if (pVar instanceof d0) {
            i iVar = ((d0) pVar).f59663b;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            ColorStateList valueOf = ColorStateList.valueOf(((Number) iVar.a(context)).intValue());
            Intrinsics.f(valueOf);
            return valueOf;
        }
        if (!(pVar instanceof c0)) {
            return dl2.b.z0(this, a.comp_text_color_dark);
        }
        i iVar2 = ((c0) pVar).f59652b;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        ColorStateList valueOf2 = ColorStateList.valueOf(((Number) iVar2.a(context2)).intValue());
        Intrinsics.f(valueOf2);
        return valueOf2;
    }

    public final float e() {
        return ((Number) this.f49554j.getValue()).floatValue();
    }

    public final void f(d dVar) {
        Drawable drawable;
        boolean z13;
        boolean z14;
        String str;
        CharSequence charSequence;
        boolean z15;
        boolean z16;
        boolean z17;
        int F0;
        b0 b0Var = dVar.f59658f;
        boolean z18 = b0Var instanceof t ? true : b0Var instanceof l;
        p pVar = dVar.f59659g;
        boolean z19 = dVar.f59657e;
        if (z19 && this.f49548d) {
            ColorStateList z03 = dl2.b.z0(this, a.comp_searchguide_selected_background_color);
            GradientDrawable gradientDrawable = new GradientDrawable();
            if (z03 != null) {
                gradientDrawable.setColor(z03);
            }
            gradientDrawable.setCornerRadius(dl2.b.E0(this, a.comp_searchguide_rounding));
            setBackground(gradientDrawable);
        } else {
            ColorStateList z04 = dl2.b.z0(this, a.comp_searchguide_neutral_background_color);
            if (!z18 && !(pVar instanceof e0)) {
                if (pVar instanceof c0) {
                    i iVar = ((c0) pVar).f59651a;
                    Context context = getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    z04 = ColorStateList.valueOf(((Number) iVar.a(context)).intValue());
                    Intrinsics.f(z04);
                } else {
                    z04 = dl2.b.z0(this, a.comp_searchguide_base_background_color);
                }
            }
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            boolean z23 = pVar instanceof d0;
            if (z23) {
                List list = ((d0) pVar).f59662a;
                int[] iArr = new int[list.size()];
                int size = list.size();
                for (int i13 = 0; i13 < size; i13++) {
                    i iVar2 = (i) list.get(i13);
                    Context context2 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    iArr[i13] = ((Number) iVar2.a(context2)).intValue();
                }
                gradientDrawable2.setColors(iArr);
                gradientDrawable2.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
                gradientDrawable2.setGradientType(0);
            }
            if (z23) {
                z04 = null;
            }
            if (z19) {
                GradientDrawable[] gradientDrawableArr = new GradientDrawable[2];
                if (z04 != null) {
                    gradientDrawable2.setColor(z04);
                }
                gradientDrawable2.setCornerRadius(dl2.b.E0(this, a.comp_searchguide_rounding));
                gradientDrawable2.setStroke(dl2.b.G0(this, a.comp_searchguide_inner_stroke_width), dl2.b.y0(this, a.comp_searchguide_inner_stroke_color));
                Unit unit = Unit.f80348a;
                gradientDrawableArr[0] = gradientDrawable2;
                GradientDrawable gradientDrawable3 = new GradientDrawable();
                gradientDrawable3.setStroke(dl2.b.G0(this, a.comp_searchguide_stroke_width), dl2.b.y0(this, a.comp_searchguide_stroke_color));
                gradientDrawable3.setCornerRadius(dl2.b.E0(this, a.comp_searchguide_rounding));
                gradientDrawableArr[1] = gradientDrawable3;
                drawable = new LayerDrawable(gradientDrawableArr);
            } else {
                if (z04 != null) {
                    gradientDrawable2.setColor(z04);
                }
                gradientDrawable2.setCornerRadius(dl2.b.E0(this, a.comp_searchguide_rounding));
                drawable = gradientDrawable2;
            }
            setBackground(drawable);
        }
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        i0 i0Var = dVar.f59653a;
        CharSequence a13 = i0Var.a(context3);
        boolean z24 = dVar.f59660h;
        boolean z25 = !z24 && a13.length() == 0;
        b0 b0Var2 = dVar.f59658f;
        boolean z26 = b0Var2 instanceof u;
        boolean z27 = dVar.f59657e;
        if (z26 || (((b0Var2 instanceof en1.v) || z26 || (b0Var2 instanceof m)) && this.f49548d && z27)) {
            GestaltIcon gestaltIcon = (GestaltIcon) c(this.f49550f, m0.search_guide_start_icon, n0.search_guide_start_icon, true);
            this.f49550f = gestaltIcon;
            z14 = z24;
            str = "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams";
            gestaltIcon.g2(new k1.b0(b0Var2, z27, this, (z27 && this.f49548d) ? rm1.c.INVERSE : ((pVar instanceof d0) || !((z13 = this.f49548d) || (pVar instanceof e0)) || z13) ? rm1.c.DARK : rm1.c.DEFAULT, 20));
            if ((z27 && !this.f49548d) || !z27) {
                gestaltIcon.setImageTintList(d(pVar));
            }
            if ((z27 && !this.f49548d) || !z27) {
                gestaltIcon.setImageTintList(d(pVar));
            }
            int G0 = (dl2.b.G0(this, a.comp_searchguide_height) - dl2.b.G0(this, rm1.i.XS.getDimenAttrRes())) / 2;
            ViewGroup.LayoutParams layoutParams = gestaltIcon.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException(str);
            }
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            if (!z25) {
                G0 = dl2.b.G0(this, a.comp_searchguide_horizontal_padding);
            }
            layoutParams2.setMarginStart(G0);
            gestaltIcon.setLayoutParams(layoutParams2);
        } else {
            GestaltIcon gestaltIcon2 = this.f49550f;
            if (gestaltIcon2 != null) {
                kg.t.O(gestaltIcon2);
            }
            z14 = z24;
            str = "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams";
        }
        b0 b0Var3 = dVar.f59658f;
        if (b0Var3 instanceof en1.v) {
            en1.v vVar = (en1.v) b0Var3;
            if (z19 && this.f49548d) {
                WebImageView webImageView = this.f49552h;
                if (!(webImageView instanceof View)) {
                    webImageView = null;
                }
                if (webImageView != null) {
                    webImageView.setVisibility(8);
                }
            } else {
                View view = this.f49552h;
                if (!(view instanceof View)) {
                    view = null;
                }
                WebImageView webImageView2 = (WebImageView) c(view, m0.search_guide_image, n0.search_guide_image, true);
                this.f49552h = webImageView2;
                a(webImageView2, z19);
                ViewGroup.LayoutParams layoutParams3 = webImageView2.getLayoutParams();
                if (layoutParams3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3;
                if (this.f49548d) {
                    F0 = 0;
                } else {
                    Context context4 = webImageView2.getContext();
                    Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                    F0 = dl2.b.F0(context4, a.comp_searchguide_inner_stroke_width);
                }
                Context context5 = webImageView2.getContext();
                Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                pp2.a.P0(marginLayoutParams, dl2.b.F0(context5, this.f49548d ? a.item_spacing_none : a.space_100), F0, 0, F0);
                webImageView2.setLayoutParams(marginLayoutParams);
                webImageView2.setColorFilter(Color.argb(13, 0, 0, 0));
                setGravity(16);
                webImageView2.M1(0);
                g0 g0Var = vVar.f59700a;
                if (g0Var instanceof w) {
                    Context context6 = webImageView2.getContext();
                    Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
                    webImageView2.loadUrl(((w) g0Var).a(context6));
                } else if (g0Var instanceof u50.u) {
                    u50.u uVar = (u50.u) g0Var;
                    Context context7 = webImageView2.getContext();
                    Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
                    uVar.getClass();
                    Intrinsics.checkNotNullParameter(context7, "context");
                    webImageView2.setImageDrawable(uVar.f120582a);
                }
                webImageView2.setVisibility(0);
            }
            charSequence = a13;
        } else if (b0Var3 instanceof t) {
            t tVar = (t) b0Var3;
            View view2 = this.f49552h;
            if (!(view2 instanceof View)) {
                view2 = null;
            }
            WebImageView webImageView3 = (WebImageView) c(view2, m0.search_guide_image, n0.search_guide_image, true);
            this.f49552h = webImageView3;
            Context context8 = getContext();
            Intrinsics.checkNotNullExpressionValue(context8, "getContext(...)");
            int F02 = dl2.b.F0(context8, a.comp_searchguide_hair_horizontal_padding);
            Context context9 = getContext();
            Intrinsics.checkNotNullExpressionValue(context9, "getContext(...)");
            int F03 = dl2.b.F0(context9, a.comp_searchguide_hair_vertical_padding);
            ViewGroup.LayoutParams layoutParams4 = webImageView3.getLayoutParams();
            if (layoutParams4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams4;
            if (this.f49548d) {
                webImageView3.setPaddingRelative(F02, F03, 0, F03);
                Intrinsics.checkNotNullParameter(marginLayoutParams2, "<this>");
                pp2.a.P0(marginLayoutParams2, 0, 0, 0, 0);
                charSequence = a13;
            } else {
                charSequence = a13;
                int i14 = z19 ? 0 : F02;
                webImageView3.setPadding(i14, i14, i14, i14);
                marginLayoutParams2.setMargins(F02, F03, 0, F03);
            }
            webImageView3.setLayoutParams(marginLayoutParams2);
            if (z19 && this.f49548d) {
                Context context10 = webImageView3.getContext();
                int i15 = tVar.f59696a;
                Object obj = d5.a.f53679a;
                webImageView3.setImageDrawable(context10.getDrawable(i15));
                webImageView3.setColorFilter(dl2.b.y0(webImageView3, a.comp_text_color_inverse));
            } else if (z19) {
                Context context11 = webImageView3.getContext();
                int i16 = tVar.f59697b;
                Object obj2 = d5.a.f53679a;
                Drawable drawable2 = context11.getDrawable(i16);
                Intrinsics.g(drawable2, "null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
                LayerDrawable layerDrawable = (LayerDrawable) drawable2;
                i iVar3 = tVar.f59698c;
                if (iVar3 != null) {
                    Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(m0.background);
                    Context context12 = webImageView3.getContext();
                    Intrinsics.checkNotNullExpressionValue(context12, "getContext(...)");
                    findDrawableByLayerId.setTint(((Number) iVar3.a(context12)).intValue());
                }
                webImageView3.setImageDrawable(layerDrawable);
                webImageView3.setColorFilter((ColorFilter) null);
            } else {
                Context context13 = webImageView3.getContext();
                int i17 = l0.ic_hair;
                Object obj3 = d5.a.f53679a;
                webImageView3.setImageDrawable(context13.getDrawable(i17));
                webImageView3.setColorFilter((ColorFilter) null);
            }
            webImageView3.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            webImageView3.setVisibility(0);
        } else {
            charSequence = a13;
            if (b0Var3 instanceof a0) {
                a0 a0Var = (a0) b0Var3;
                View view3 = this.f49552h;
                WebImageView webImageView4 = (WebImageView) c(view3 instanceof View ? view3 : null, m0.search_guide_image, n0.search_guide_image, true);
                this.f49552h = webImageView4;
                a(webImageView4, z19);
                ViewGroup.LayoutParams layoutParams5 = webImageView4.getLayoutParams();
                if (layoutParams5 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams5;
                Context context14 = webImageView4.getContext();
                Intrinsics.checkNotNullExpressionValue(context14, "getContext(...)");
                int F04 = dl2.b.F0(context14, this.f49548d ? a.item_spacing_none : a.space_100);
                pp2.a.P0(marginLayoutParams3, F04, F04, 0, F04);
                webImageView4.setLayoutParams(marginLayoutParams3);
                webImageView4.setColorFilter(Color.argb(13, 0, 0, 0));
                setGravity(16);
                if (z19 && this.f49548d) {
                    webImageView4.o0(dl2.b.y0(webImageView4, a.comp_searchguide_selected_image_border_color));
                    webImageView4.M1(dl2.b.G0(webImageView4, a.comp_searchguide_selected_image_border_width));
                } else {
                    webImageView4.M1(0);
                }
                if (z19) {
                    Context context15 = webImageView4.getContext();
                    int i18 = a0Var.f59650a;
                    Object obj4 = d5.a.f53679a;
                    webImageView4.setImageDrawable(context15.getDrawable(i18));
                } else {
                    Context context16 = webImageView4.getContext();
                    int i19 = l0.ic_square_skin_tone_default;
                    Object obj5 = d5.a.f53679a;
                    webImageView4.setImageDrawable(context16.getDrawable(i19));
                }
                webImageView4.setVisibility(0);
            } else if (b0Var3 instanceof l) {
                l lVar = (l) b0Var3;
                WebImageView webImageView5 = (WebImageView) c(this.f49552h, m0.search_guide_image, n0.search_guide_image, true);
                int i23 = z19 ? lVar.f59688a : l0.ic_color_palette;
                Context context17 = webImageView5.getContext();
                Object obj6 = d5.a.f53679a;
                webImageView5.setImageDrawable(context17.getDrawable(i23));
                webImageView5.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                webImageView5.setVisibility(0);
            } else {
                WebImageView webImageView6 = this.f49552h;
                WebImageView webImageView7 = webImageView6 instanceof View ? webImageView6 : null;
                if (webImageView7 != null) {
                    webImageView7.setVisibility(8);
                }
            }
        }
        boolean z28 = b0Var3 instanceof en1.e;
        if (z28 && (!((en1.e) b0Var3).f59664a.isEmpty()) && (!this.f49548d || z19)) {
            z15 = true;
            GestaltAvatarGroup gestaltAvatarGroup = (GestaltAvatarGroup) c(this.f49551g, m0.search_guide_avatar_group, n0.search_guide_avatar_group, true);
            this.f49551g = gestaltAvatarGroup;
            gestaltAvatarGroup.a(new en1.g0(b0Var3, this));
        } else {
            z15 = true;
            GestaltAvatarGroup gestaltAvatarGroup2 = this.f49551g;
            if (gestaltAvatarGroup2 != null) {
                Intrinsics.checkNotNullParameter(gestaltAvatarGroup2, "<this>");
                gestaltAvatarGroup2.a(k.f113199x);
            }
        }
        Context context18 = getContext();
        Intrinsics.checkNotNullExpressionValue(context18, "getContext(...)");
        int length = i0Var.a(context18).length();
        v vVar2 = this.f49549e;
        if (length > 0) {
            boolean d2 = Intrinsics.d(b0Var3, m.f59689a);
            boolean z29 = dVar.f59657e;
            int G02 = (!d2 || (z29 && this.f49548d)) ? (z28 && this.f49548d && !z29) ? dl2.b.G0(this, a.comp_searchguide_horizontal_padding) : dl2.b.G0(this, a.comp_searchguide_graphic_gap) : dl2.b.G0(this, a.comp_searchguide_horizontal_padding);
            GestaltText gestaltText = (GestaltText) vVar2.getValue();
            Intrinsics.f(gestaltText);
            ViewGroup.LayoutParams layoutParams6 = gestaltText.getLayoutParams();
            if (layoutParams6 == null) {
                throw new NullPointerException(str);
            }
            LinearLayout.LayoutParams layoutParams7 = (LinearLayout.LayoutParams) layoutParams6;
            layoutParams7.setMarginStart(G02);
            gestaltText.setLayoutParams(layoutParams7);
            gestaltText.i(new k1.b0(z29, this, i0Var, (z29 && this.f49548d) ? vn1.c.INVERSE : ((pVar instanceof d0) || !((z17 = this.f49548d) || (pVar instanceof e0)) || z17) ? vn1.c.DARK : vn1.c.DEFAULT, 21));
            if ((z29 && !this.f49548d) || !z29) {
                gestaltText.setTextColor(d(pVar));
            }
        } else {
            GestaltText gestaltText2 = (GestaltText) vVar2.getValue();
            Intrinsics.checkNotNullExpressionValue(gestaltText2, "<get-text>(...)");
            pk.a0.k0(gestaltText2);
        }
        boolean z33 = charSequence.length() > 0 ? z15 : false;
        if (z14) {
            GestaltIcon gestaltIcon3 = (GestaltIcon) c(this.f49553i, m0.search_guide_icon, n0.search_guide_end_icon, false);
            this.f49553i = gestaltIcon3;
            if (z33) {
                ViewGroup.LayoutParams layoutParams8 = gestaltIcon3.getLayoutParams();
                if (layoutParams8 == null) {
                    throw new NullPointerException(str);
                }
                LinearLayout.LayoutParams layoutParams9 = (LinearLayout.LayoutParams) layoutParams8;
                layoutParams9.setMarginStart(dl2.b.G0(this, a.comp_searchguide_dropdown_gap));
                gestaltIcon3.setLayoutParams(layoutParams9);
            } else {
                int G03 = dl2.b.G0(this, a.comp_searchguide_imageonly_gap);
                ViewGroup.LayoutParams layoutParams10 = gestaltIcon3.getLayoutParams();
                if (layoutParams10 == null) {
                    throw new NullPointerException(str);
                }
                LinearLayout.LayoutParams layoutParams11 = (LinearLayout.LayoutParams) layoutParams10;
                layoutParams11.setMarginStart(G03);
                gestaltIcon3.setLayoutParams(layoutParams11);
            }
            gestaltIcon3.g2(new sp.b((z19 && this.f49548d) ? rm1.c.INVERSE : ((pVar instanceof d0) || !((z16 = this.f49548d) || (pVar instanceof e0)) || z16) ? rm1.c.DARK : rm1.c.DEFAULT, 4));
            if ((z19 && !this.f49548d) || !z19) {
                gestaltIcon3.setImageTintList(d(pVar));
            }
        } else {
            GestaltIcon gestaltIcon4 = this.f49553i;
            if (gestaltIcon4 != null) {
                kg.t.O(gestaltIcon4);
            }
        }
        setVisibility(dVar.f59655c.getVisibility());
        Context context19 = getContext();
        Intrinsics.checkNotNullExpressionValue(context19, "getContext(...)");
        setContentDescription(dVar.f59654b.a(context19));
        i0 i0Var2 = ((d) ((o) this.f49545a.f33803a)).f59656d;
        Context context20 = getContext();
        Intrinsics.checkNotNullExpressionValue(context20, "getContext(...)");
        setTag(i0Var2.a(context20));
        int i24 = dVar.f59661i;
        if (i24 != Integer.MIN_VALUE) {
            setId(i24);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent ev2) {
        Intrinsics.checkNotNullParameter(ev2, "ev");
        return true;
    }

    public /* synthetic */ GestaltSearchGuide(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GestaltSearchGuide(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f49549e = xk2.m.b(new h0(this, 2));
        int i14 = 0;
        this.f49554j = xk2.m.b(new h0(this, i14));
        this.f49555k = xk2.m.b(new h0(this, 1));
        int[] GestaltSearchGuide = o0.GestaltSearchGuide;
        Intrinsics.checkNotNullExpressionValue(GestaltSearchGuide, "GestaltSearchGuide");
        q qVar = new q(this, attributeSet, i13, GestaltSearchGuide, new en1.a(this, i14));
        this.f49545a = qVar;
        d dVar = (d) ((o) qVar.f33803a);
        setOrientation(0);
        View.inflate(getContext(), n0.gestalt_searchguide, this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        setPaddingRelative(0, 0, dl2.b.G0(this, a.comp_searchguide_horizontal_padding), 0);
        setLayoutParams(layoutParams);
        setMinimumHeight(dl2.b.G0(this, a.comp_searchguide_height));
        setMinimumWidth(dl2.b.G0(this, a.comp_searchguide_height));
        el2.a entries = f0.getEntries();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.f49546b = (f0) entries.get(dl2.b.O0(context2, a.comp_searchguide_text_variant));
        el2.a entries2 = en1.c.getEntries();
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        el2.a entries3 = en1.b.getEntries();
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        this.f49547c = (en1.b) entries3.get(dl2.b.O0(context4, a.comp_searchguide_avatar_group_size));
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        this.f49548d = dl2.b.w0(context5, a.comp_searchguide_is_vr);
        setGravity(16);
        f(dVar);
    }
}
