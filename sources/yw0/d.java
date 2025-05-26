package yw0;

import a.z0;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.api.model.f30;
import com.pinterest.design.components.images.ImageStack;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;
import mq.w;
import ni1.c0;
import qv0.d0;
import so.ba;
import u50.o;
import u50.r;

/* loaded from: classes5.dex */
public final /* synthetic */ class d implements o82.b, kotlin.jvm.internal.m {

    /* renamed from: a, reason: collision with root package name */
    public static final d f140271a = new d();

    @Override // kotlin.jvm.internal.m
    public final xk2.g c() {
        return new p(3, ax0.h.class, "bindDisplayState", "bindDisplayState(Lcom/pinterest/feature/modules/seeItStyled/scenePin/SeeItStyledScenePinDisplayState;Lcom/pinterest/architecture/primitives/EventIntake;)V", 0);
    }

    @Override // o82.b
    public final void d(View view, o oVar, r eventIntake) {
        ax0.h p03 = (ax0.h) view;
        ax0.a displayState = (ax0.a) oVar;
        Intrinsics.checkNotNullParameter(p03, "p0");
        Intrinsics.checkNotNullParameter(displayState, "p1");
        Intrinsics.checkNotNullParameter(eventIntake, "p2");
        p03.getClass();
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        boolean z13 = (displayState.f20594b.isEmpty() ^ true) || displayState.f20600h;
        boolean z14 = displayState.f20599g;
        boolean z15 = displayState.f20598f;
        boolean z16 = z15 && !z14 && z13;
        p03.f20632q = (int) (hf0.b.f69002b * 0.43d);
        float f13 = displayState.f20595c;
        FrameLayout frameLayout = p03.f20626k;
        if (z13) {
            LinearLayout linearLayout = p03.f20623h;
            bs1.c.R1(linearLayout, true);
            int i13 = f62.a.see_it_styled_image_stack_size;
            ImageStack imageStack = p03.f20624i;
            ImageStack.b(imageStack, bs1.c.W(imageStack, i13), bs1.c.W(imageStack, f62.a.see_it_styled_image_stack_size), 0, 0.0f, bs1.c.W(imageStack, eo1.c.sema_space_25), 0, 3, 44);
            float f14 = p03.f20632q * f13;
            if (z15) {
                linearLayout.setGravity(8388611);
                ConstraintLayout.LayoutParams layoutParams = p03.f20627l;
                if (layoutParams != null) {
                    layoutParams.f17671i = -1;
                    layoutParams.f17673j = frameLayout.getId();
                    ((ViewGroup.MarginLayoutParams) layoutParams).width = frameLayout.getMeasuredWidth();
                }
                ConstraintLayout.LayoutParams layoutParams2 = p03.f20628m;
                if (layoutParams2 != null) {
                    layoutParams2.f17675k = linearLayout.getId();
                }
                LinearLayout.LayoutParams layoutParams3 = p03.f20631p;
                LinearLayout.LayoutParams layoutParams4 = p03.f20629n;
                if (z14) {
                    Drawable background = linearLayout.getBackground();
                    Context context = p03.getContext();
                    int i14 = eo1.b.sema_color_background_wash_scrims_opaque;
                    Object obj = d5.a.f53679a;
                    background.setTint(context.getColor(i14));
                    if (layoutParams != null) {
                        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = p03.getResources().getDimensionPixelOffset(eo1.c.space_100);
                    }
                    p03.f20625j.i(ax0.g.f20617i);
                    LinearLayout.LayoutParams layoutParams5 = p03.f20630o;
                    if (layoutParams5 != null) {
                        layoutParams5.weight = 90.0f;
                    }
                    ImageStack.b(p03.f20624i, 0, 0, ml2.c.c(bs1.c.W(p03, f62.a.see_it_styled_image_stack_size) * 0.25f), 0.0f, 0, 0, 0, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_CAROUSEL);
                    if (layoutParams4 != null) {
                        layoutParams4.width = 0;
                        layoutParams4.weight = 63.0f;
                    }
                    if (layoutParams3 != null) {
                        layoutParams3.width = 0;
                        layoutParams3.weight = 5.0f;
                    }
                } else {
                    Context context2 = p03.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    Drawable c03 = bs1.c.c0(context2, f62.b.see_it_styled_squared_top_rounded_bottom_dropdown);
                    GradientDrawable gradientDrawable = c03 instanceof GradientDrawable ? (GradientDrawable) c03 : null;
                    if (gradientDrawable != null) {
                        Context context3 = p03.getContext();
                        int i15 = eo1.b.color_background_inverse_strong;
                        Object obj2 = d5.a.f53679a;
                        gradientDrawable.setStroke(4, context3.getColor(i15));
                    } else {
                        gradientDrawable = null;
                    }
                    linearLayout.setBackground(gradientDrawable);
                    if (layoutParams != null) {
                        ((ViewGroup.MarginLayoutParams) layoutParams).height = p03.getResources().getDimensionPixelOffset(f62.a.see_it_styled_dropdown_height);
                    }
                    ImageStack.b(p03.f20624i, p03.getResources().getDimensionPixelOffset(f62.a.see_it_styled_dropdown_image_size), p03.getResources().getDimensionPixelOffset(f62.a.see_it_styled_dropdown_image_size), ml2.c.c(bs1.c.W(p03, f62.a.see_it_styled_image_stack_size) * 0.95f), bs1.c.W(p03, eo1.c.space_300), 0, 0, 0, RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER);
                    if (layoutParams4 != null) {
                        layoutParams4.width = 0;
                        layoutParams4.weight = 143.0f;
                    }
                    if (layoutParams3 != null) {
                        layoutParams3.width = 0;
                        layoutParams3.weight = 15.0f;
                    }
                }
            } else {
                ViewGroup.LayoutParams layoutParams6 = linearLayout.getLayoutParams();
                Intrinsics.g(layoutParams6, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.LayoutParams) layoutParams6)).topMargin = (int) (f14 * 0.75d);
            }
            List list = displayState.f20594b;
            ArrayList arrayList = new ArrayList(g0.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new xe0.c((String) it.next(), null, true, 5));
            }
            imageStack.a(arrayList);
            linearLayout.setOnClickListener(new d0(3, eventIntake, p03));
        }
        int i16 = (int) (p03.f20632q * f13);
        int i17 = z16 ? f62.b.see_it_styled_squared_bottom_rounded_top_pin : f62.b.see_it_styled_all_rounded_corners_pin;
        SbaPinRep sbaPinRep = p03.f20634s;
        sbaPinRep.asView().setLayoutParams(new FrameLayout.LayoutParams(p03.f20632q, i16));
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(p03.f20632q, i16));
        frameLayout.setBackgroundResource(i17);
        frameLayout.setClipToOutline(true);
        f30 f30Var = displayState.f20593a;
        String uid = f30Var.getUid();
        if (uid == null || uid.length() == 0) {
            return;
        }
        int i18 = 6;
        wa2.m a13 = wa2.m.a(p03.f20633r, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, null, false, false, null, new bb2.e(f13, (bb2.f) null, 6), null, false, null, null, false, false, null, null, z16 ? true : p03.f20633r.f128891v0, -1, -4194305, 511);
        p03.f20633r = a13;
        c0 c0Var = p03.f20636u;
        if (c0Var == null || !Intrinsics.d(c0Var.f90606a, a13)) {
            ni1.d0 d0Var = p03.f20621f;
            if (d0Var == null) {
                Intrinsics.r("pinModelToVMStateConverterFactory");
                throw null;
            }
            c0Var = ((ba) d0Var).a(p03.f20633r, new w(p03, i18), new z0(p03, 3));
        }
        p03.f20636u = c0Var;
        sbaPinRep.bindDisplayState(p03.f20635t.b(c0Var.a(displayState.f20596d, f30Var), false));
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof o82.b) && (obj instanceof kotlin.jvm.internal.m)) {
            return Intrinsics.d(c(), ((kotlin.jvm.internal.m) obj).c());
        }
        return false;
    }

    public final int hashCode() {
        return c().hashCode();
    }
}
