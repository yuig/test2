package com.pinterest.feature.unifiedcomments.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import c2.m4;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.feature.pin.reactions.view.PinReactionIconButton;
import com.pinterest.gestalt.divider.GestaltDivider;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import df.j1;
import eo1.b;
import h32.d4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import la1.k;
import m60.w;
import nx.d0;
import ob2.c;
import ob2.d;
import org.jetbrains.annotations.NotNull;
import pk.a0;
import rh1.d1;
import rh1.j;
import rh1.z1;
import rq.c2;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/feature/unifiedcomments/view/PinCommentReactionHeaderView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "unifiedcommentsLibrary_release"}, k = 1, mv = {1, 9, 0})
@SuppressLint({"GestaltComponentUnsafeSetterCall"})
/* loaded from: classes5.dex */
public final class PinCommentReactionHeaderView extends d1 {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f48945o = 0;

    /* renamed from: d, reason: collision with root package name */
    public w f48946d;

    /* renamed from: e, reason: collision with root package name */
    public final GestaltText f48947e;

    /* renamed from: f, reason: collision with root package name */
    public final GestaltText f48948f;

    /* renamed from: g, reason: collision with root package name */
    public final PinReactionIconButton f48949g;

    /* renamed from: h, reason: collision with root package name */
    public final GestaltDivider f48950h;

    /* renamed from: i, reason: collision with root package name */
    public Integer f48951i;

    /* renamed from: j, reason: collision with root package name */
    public final GestaltIconButton f48952j;

    /* renamed from: k, reason: collision with root package name */
    public d0 f48953k;

    /* renamed from: l, reason: collision with root package name */
    public d4 f48954l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f48955m;

    /* renamed from: n, reason: collision with root package name */
    public final z1 f48956n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinCommentReactionHeaderView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f48955m = true;
        this.f48956n = new z1(this);
        View.inflate(getContext(), d.pin_comment_reaction_header, this);
        if (Z()) {
            setBackgroundColor(getContext().getColor(b.color_background_elevation_floating_added));
        }
        View findViewById = findViewById(c.comment);
        GestaltText gestaltText = (GestaltText) findViewById;
        if (Z()) {
            Intrinsics.f(gestaltText);
            ViewGroup.LayoutParams layoutParams = gestaltText.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = gestaltText.getResources().getDimensionPixelSize(eo1.c.space_600);
            gestaltText.setLayoutParams(marginLayoutParams);
        }
        gestaltText.i(new c2(gestaltText, 20));
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        this.f48947e = gestaltText;
        View findViewById2 = findViewById(c.comment_header_close_button);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f48952j = (GestaltIconButton) findViewById2;
        View findViewById3 = findViewById(c.pin_reaction_count_simple);
        GestaltText gestaltText2 = (GestaltText) findViewById3;
        Intrinsics.f(gestaltText2);
        dl2.b.A2(gestaltText2);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "apply(...)");
        this.f48948f = gestaltText2;
        View findViewById4 = findViewById(c.pin_reaction_entry_point);
        PinReactionIconButton pinReactionIconButton = (PinReactionIconButton) findViewById4;
        pinReactionIconButton.f47283b = true;
        pinReactionIconButton.f47293l = false;
        pinReactionIconButton.f47294m = true;
        Intrinsics.checkNotNullExpressionValue(findViewById4, "apply(...)");
        this.f48949g = pinReactionIconButton;
        bs1.c.X0(pinReactionIconButton);
        a0.k0(gestaltText2);
        View findViewById5 = findViewById(c.divider);
        GestaltDivider gestaltDivider = (GestaltDivider) findViewById5;
        if (!Z()) {
            ViewGroup.LayoutParams layoutParams2 = gestaltDivider.getLayoutParams();
            Intrinsics.g(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            Context context2 = gestaltDivider.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            marginLayoutParams2.bottomMargin = bs1.c.V(context2, eo1.c.space_100);
            gestaltDivider.setLayoutParams(marginLayoutParams2);
        }
        Intrinsics.checkNotNullExpressionValue(findViewById5, "apply(...)");
        this.f48950h = gestaltDivider;
    }

    public static boolean Z() {
        return !hf0.b.q();
    }

    public final void L(int i13) {
        Integer valueOf = Integer.valueOf(i13);
        this.f48947e.i(new m4(valueOf.intValue(), this, 19));
        this.f48951i = valueOf;
    }

    public final void T(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Boolean Q3 = pin.Q3();
        Intrinsics.checkNotNullExpressionValue(Q3, "getCommentsDisabled(...)");
        if (Q3.booleanValue()) {
            this.f48947e.i(j.f108187y);
        } else {
            L(b40.f0(pin));
        }
        if (b40.e0(pin) > 0) {
            String b13 = qb0.j.b(b40.e0(pin));
            GestaltText gestaltText = this.f48948f;
            a0.p(gestaltText, b13);
            gestaltText.j(new k(11, this, pin));
        }
        String uid = pin.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        this.f48949g.k2(uid);
    }

    public final void X(d4 commentViewType) {
        Intrinsics.checkNotNullParameter(commentViewType, "commentViewType");
        this.f48954l = commentViewType;
    }

    public final void a0() {
        j1.W1(this.f48950h);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        w wVar = this.f48946d;
        if (wVar != null) {
            wVar.h(this.f48956n);
        } else {
            Intrinsics.r("eventManager");
            throw null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        w wVar = this.f48946d;
        if (wVar == null) {
            Intrinsics.r("eventManager");
            throw null;
        }
        wVar.j(this.f48956n);
        super.onDetachedFromWindow();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinCommentReactionHeaderView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f48955m = true;
        this.f48956n = new z1(this);
        View.inflate(getContext(), d.pin_comment_reaction_header, this);
        if (Z()) {
            setBackgroundColor(getContext().getColor(b.color_background_elevation_floating_added));
        }
        View findViewById = findViewById(c.comment);
        GestaltText gestaltText = (GestaltText) findViewById;
        if (Z()) {
            Intrinsics.f(gestaltText);
            ViewGroup.LayoutParams layoutParams = gestaltText.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = gestaltText.getResources().getDimensionPixelSize(eo1.c.space_600);
                gestaltText.setLayoutParams(marginLayoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        gestaltText.i(new c2(gestaltText, 20));
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        this.f48947e = gestaltText;
        View findViewById2 = findViewById(c.comment_header_close_button);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f48952j = (GestaltIconButton) findViewById2;
        View findViewById3 = findViewById(c.pin_reaction_count_simple);
        GestaltText gestaltText2 = (GestaltText) findViewById3;
        Intrinsics.f(gestaltText2);
        dl2.b.A2(gestaltText2);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "apply(...)");
        this.f48948f = gestaltText2;
        View findViewById4 = findViewById(c.pin_reaction_entry_point);
        PinReactionIconButton pinReactionIconButton = (PinReactionIconButton) findViewById4;
        pinReactionIconButton.f47283b = true;
        pinReactionIconButton.f47293l = false;
        pinReactionIconButton.f47294m = true;
        Intrinsics.checkNotNullExpressionValue(findViewById4, "apply(...)");
        this.f48949g = pinReactionIconButton;
        bs1.c.X0(pinReactionIconButton);
        a0.k0(gestaltText2);
        View findViewById5 = findViewById(c.divider);
        GestaltDivider gestaltDivider = (GestaltDivider) findViewById5;
        if (!Z()) {
            ViewGroup.LayoutParams layoutParams2 = gestaltDivider.getLayoutParams();
            Intrinsics.g(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            Context context2 = gestaltDivider.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            marginLayoutParams2.bottomMargin = bs1.c.V(context2, eo1.c.space_100);
            gestaltDivider.setLayoutParams(marginLayoutParams2);
        }
        Intrinsics.checkNotNullExpressionValue(findViewById5, "apply(...)");
        this.f48950h = gestaltDivider;
    }
}
