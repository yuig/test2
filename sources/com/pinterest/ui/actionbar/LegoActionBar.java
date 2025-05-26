package com.pinterest.ui.actionbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import d5.a;
import eo1.b;
import eo1.c;
import gw1.i;
import kh2.j1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import m60.t0;
import m60.x0;
import org.jetbrains.annotations.NotNull;
import rm1.q;
import z92.d;
import z92.f;
import z92.g;
import z92.h;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u000bB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\f"}, d2 = {"Lcom/pinterest/ui/actionbar/LegoActionBar;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "z92/g", "legoActionBarLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class LegoActionBar extends RelativeLayout {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f52202h = 0;

    /* renamed from: a, reason: collision with root package name */
    public final GestaltIconButton f52203a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltIconButton f52204b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltButton.LargePrimaryButton f52205c;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltButton.LargeSecondaryButton f52206d;

    /* renamed from: e, reason: collision with root package name */
    public final LinearLayout f52207e;

    /* renamed from: f, reason: collision with root package name */
    public final int f52208f;

    /* renamed from: g, reason: collision with root package name */
    public final int f52209g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegoActionBar(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(r0.lego_action_bar_secondary_action_padding);
        this.f52208f = getResources().getDimensionPixelOffset(c.space_200);
        this.f52209g = dimensionPixelOffset * 2;
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setGravity(16);
        this.f52203a = e(20);
        this.f52207e = b();
        this.f52205c = c();
        this.f52206d = d();
        this.f52204b = e(21);
        f(this);
    }

    public static final int a(LegoActionBar legoActionBar) {
        return ((legoActionBar.getWidth() - ((legoActionBar.f52204b.getMeasuredWidth() + legoActionBar.f52203a.getMeasuredWidth()) + legoActionBar.f52209g)) - legoActionBar.f52208f) / 2;
    }

    public static void f(LegoActionBar legoActionBar) {
        f onClickAction = f.f141437l;
        Intrinsics.checkNotNullParameter(onClickAction, "onClickAction");
        g gVar = new g(q.ANDROID_SHARE, onClickAction, Integer.valueOf(x0.share));
        f onClickAction2 = f.f141436k;
        Intrinsics.checkNotNullParameter(onClickAction2, "onClickAction");
        g gVar2 = new g(q.ELLIPSIS, onClickAction2, Integer.valueOf(x0.more_options));
        f onClickAction3 = f.f141435j;
        Intrinsics.checkNotNullParameter(onClickAction3, "onClickAction");
        d dVar = new d(b.color_themed_base_red_300, b.color_white_0, x0.follow, t0.profile_follow_btn, onClickAction3);
        legoActionBar.h(gVar);
        legoActionBar.j(gVar2);
        legoActionBar.i(dVar);
    }

    public final LinearLayout b() {
        LinearLayout linearLayout = new LinearLayout(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        linearLayout.setGravity(16);
        layoutParams.addRule(13);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setGravity(14);
        addView(linearLayout);
        return linearLayout;
    }

    public final GestaltButton.LargePrimaryButton c() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        GestaltButton.LargePrimaryButton largePrimaryButton = new GestaltButton.LargePrimaryButton(6, context, (AttributeSet) null);
        largePrimaryButton.d(h.f141444j);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        largePrimaryButton.setGravity(16);
        layoutParams.addRule(13);
        largePrimaryButton.setLayoutParams(layoutParams);
        largePrimaryButton.setMinWidth(largePrimaryButton.getResources().getDimensionPixelSize(r0.lego_action_bar_primary_button_min_width));
        this.f52207e.addView(largePrimaryButton);
        return largePrimaryButton;
    }

    public final GestaltButton.LargeSecondaryButton d() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        GestaltButton.LargeSecondaryButton largeSecondaryButton = new GestaltButton.LargeSecondaryButton(6, context, (AttributeSet) null);
        largeSecondaryButton.d(h.f141445k);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        largeSecondaryButton.setGravity(16);
        layoutParams.addRule(16, t0.primary_action_button_id);
        com.bumptech.glide.c.a1(layoutParams, 0, 0, this.f52208f, 0);
        largeSecondaryButton.setLayoutParams(layoutParams);
        largeSecondaryButton.setMinWidth(largeSecondaryButton.getResources().getDimensionPixelSize(r0.lego_action_bar_primary_button_min_width));
        j1.o1(largeSecondaryButton, 1);
        this.f52207e.addView(largeSecondaryButton, 0);
        return largeSecondaryButton;
    }

    public final GestaltIconButton e(int i13) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        GestaltIconButton gestaltIconButton = new GestaltIconButton(6, context, (AttributeSet) null);
        gestaltIconButton.t(h.f141446l);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        gestaltIconButton.r(16);
        layoutParams.addRule(15);
        layoutParams.addRule(i13);
        gestaltIconButton.setLayoutParams(layoutParams);
        addView(gestaltIconButton);
        return gestaltIconButton;
    }

    public final void g(GestaltButton gestaltButton, d dVar) {
        int i13 = dVar.f141423a;
        int i14 = dVar.f141425c;
        gestaltButton.d(new pn1.g(i14, 14));
        gestaltButton.setId(dVar.f141426d);
        Context context = getContext();
        Object obj = a.f53679a;
        gestaltButton.setBackgroundTintList(ColorStateList.valueOf(context.getColor(i13)));
        gestaltButton.setTextColor(getContext().getColor(dVar.f141424b));
        gestaltButton.setContentDescription(gestaltButton.getResources().getString(i14));
        gestaltButton.e(new ex1.c(5, dVar.f141427e));
        gestaltButton.setGravity(17);
    }

    public final void h(g leftActionItem) {
        Intrinsics.checkNotNullParameter(leftActionItem, "leftActionItem");
        i iVar = new i(29, leftActionItem, this);
        GestaltIconButton gestaltIconButton = this.f52203a;
        gestaltIconButton.t(iVar);
        gestaltIconButton.u(new v02.d(leftActionItem, 2));
    }

    public final void i(d primaryActionItem) {
        Intrinsics.checkNotNullParameter(primaryActionItem, "primaryActionItem");
        g(this.f52205c, primaryActionItem);
    }

    public final void j(g rightActionItem) {
        Intrinsics.checkNotNullParameter(rightActionItem, "rightActionItem");
        i iVar = new i(29, rightActionItem, this);
        GestaltIconButton gestaltIconButton = this.f52204b;
        gestaltIconButton.t(iVar);
        gestaltIconButton.u(new v02.d(rightActionItem, 2));
    }

    public final void k(d secondaryActionItem) {
        Intrinsics.checkNotNullParameter(secondaryActionItem, "secondaryActionItem");
        GestaltButton.LargeSecondaryButton largeSecondaryButton = this.f52206d;
        g(largeSecondaryButton, secondaryActionItem);
        if (!largeSecondaryButton.isLaidOut() || largeSecondaryButton.isLayoutRequested()) {
            largeSecondaryButton.addOnLayoutChangeListener(new n5.h(13, largeSecondaryButton, this));
        } else {
            largeSecondaryButton.setMaxWidth(a(this));
        }
        bs1.c.U1(largeSecondaryButton);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegoActionBar(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(r0.lego_action_bar_secondary_action_padding);
        this.f52208f = getResources().getDimensionPixelOffset(c.space_200);
        this.f52209g = dimensionPixelOffset * 2;
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setGravity(16);
        this.f52203a = e(20);
        this.f52207e = b();
        this.f52205c = c();
        this.f52206d = d();
        this.f52204b = e(21);
        f(this);
    }
}
