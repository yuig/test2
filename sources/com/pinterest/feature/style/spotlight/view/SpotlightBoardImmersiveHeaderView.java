package com.pinterest.feature.style.spotlight.view;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import bb2.j;
import bs1.c;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.gestalt.text.GestaltText;
import dl2.b;
import eo1.a;
import i82.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pk.a0;
import we1.n1;
import wg1.h;
import xk2.m;
import xk2.v;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/pinterest/feature/style/spotlight/view/SpotlightBoardImmersiveHeaderView;", "Lcom/pinterest/feature/style/spotlight/view/SpotlightBoardBaseView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "spotlightLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SpotlightBoardImmersiveHeaderView extends SpotlightBoardBaseView {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f48587q = 0;

    /* renamed from: i, reason: collision with root package name */
    public final j f48588i;

    /* renamed from: j, reason: collision with root package name */
    public final GestaltText f48589j;

    /* renamed from: k, reason: collision with root package name */
    public final GestaltText f48590k;

    /* renamed from: l, reason: collision with root package name */
    public final ViewGroup f48591l;

    /* renamed from: m, reason: collision with root package name */
    public final GestaltAvatar f48592m;

    /* renamed from: n, reason: collision with root package name */
    public final GestaltText f48593n;

    /* renamed from: o, reason: collision with root package name */
    public final v f48594o;

    /* renamed from: p, reason: collision with root package name */
    public final v f48595p;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SpotlightBoardImmersiveHeaderView(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.pinterest.feature.style.spotlight.view.SpotlightBoardBaseView
    /* renamed from: D, reason: from getter */
    public final GestaltText getF48598k() {
        return this.f48590k;
    }

    @Override // com.pinterest.feature.style.spotlight.view.SpotlightBoardBaseView
    /* renamed from: L, reason: from getter */
    public final GestaltText getF48597j() {
        return this.f48589j;
    }

    @Override // com.pinterest.feature.style.spotlight.view.SpotlightBoardBaseView
    /* renamed from: T, reason: from getter */
    public final GestaltAvatar getF48601n() {
        return this.f48592m;
    }

    @Override // com.pinterest.feature.style.spotlight.view.SpotlightBoardBaseView
    /* renamed from: X, reason: from getter */
    public final ViewGroup getF48599l() {
        return this.f48591l;
    }

    @Override // com.pinterest.feature.style.spotlight.view.SpotlightBoardBaseView
    /* renamed from: Y, reason: from getter */
    public final GestaltText getF48600m() {
        return this.f48593n;
    }

    @Override // android.view.View
    public final void setBackground(Drawable drawable) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int i13 = a0.q0(context) ? a.color_background_dark_opacity_300 : a.color_background_dark_opacity_200;
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(b.y0(this, i13), PorterDuff.Mode.SRC_ATOP));
        }
        super.setBackground(drawable);
    }

    @Override // com.pinterest.feature.style.spotlight.view.SpotlightBoardBaseView
    /* renamed from: x, reason: from getter */
    public final j getF48596i() {
        return this.f48588i;
    }

    public /* synthetic */ SpotlightBoardImmersiveHeaderView(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpotlightBoardImmersiveHeaderView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        v b13 = m.b(h.f129775k);
        this.f48594o = b13;
        v b14 = m.b(h.f129774j);
        this.f48595p = b14;
        t(c.b0(this, eo1.c.space_0));
        setElevation(c.b0(this, eo1.c.space_0));
        View.inflate(context, e.view_spotlight_board_immersive_header_view, this);
        KeyEvent.Callback findViewById = findViewById(i82.c.spotlight_board_image);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f48588i = (j) findViewById;
        View findViewById2 = findViewById(i82.c.spotlight_board_title);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f48589j = (GestaltText) findViewById2;
        View findViewById3 = findViewById(i82.c.spotlight_board_subtitle);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        GestaltText gestaltText = (GestaltText) findViewById3;
        this.f48590k = gestaltText;
        View findViewById4 = findViewById(i82.c.spotlight_board_owner_container);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f48591l = (ViewGroup) findViewById4;
        View findViewById5 = findViewById(i82.c.spotlight_board_avatar);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f48592m = (GestaltAvatar) findViewById5;
        View findViewById6 = findViewById(i82.c.spotlight_board_user_name);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        GestaltText gestaltText2 = (GestaltText) findViewById6;
        this.f48593n = gestaltText2;
        gestaltText.i(new sq.b((((Boolean) b13.getValue()).booleanValue() && ((Boolean) b14.getValue()).booleanValue()) ? vn1.e.BOLD : vn1.e.REGULAR, 2));
        gestaltText2.i(new n1(this, 11));
        ViewGroup.LayoutParams layoutParams = gestaltText2.getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).setMarginStart(c.W(this, eo1.c.space_100));
        getF48596i().setColorFilter(b.y0(this, a.color_background_dark_opacity_300));
    }
}
