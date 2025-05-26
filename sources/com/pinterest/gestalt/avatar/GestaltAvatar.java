package com.pinterest.gestalt.avatar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.google.firebase.messaging.q;
import com.pinterest.ui.imageview.WebImageView;
import ff0.j;
import fm1.a;
import gm1.b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ps0.m;
import rl1.c;
import rl1.g;
import rl1.h0;
import rl1.i0;
import rl1.k;
import rl1.l0;
import rl1.m0;
import rl1.p;
import rl1.r;
import rl1.s;
import u50.o;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00000\u0002:\u0003\f\u0003\rB'\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/pinterest/gestalt/avatar/GestaltAvatar;", "Lcom/pinterest/ui/imageview/WebImageView;", "Lgm1/b;", "Lrl1/q;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ps0/m", "rl1/r", "avatar_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class GestaltAvatar extends WebImageView implements b {
    public static final m L = new m(20, 0);
    public static final r M = r.MD;
    public static final a N = a.AUTO;

    /* renamed from: J, reason: collision with root package name */
    public final q f49249J;
    public final k K;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GestaltAvatar(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final GestaltAvatar H2(Function1 nextState) {
        Intrinsics.checkNotNullParameter(nextState, "nextState");
        int i13 = 1;
        if (((rl1.q) nextState.invoke(O2())).f108653g) {
            p1(true);
            nextState = new com.pinterest.framework.screens.q(4, nextState, this);
        }
        return (GestaltAvatar) this.f49249J.d(nextState, new p(this, i13));
    }

    public final GestaltAvatar M2(gm1.a eventHandler) {
        Intrinsics.checkNotNullParameter(eventHandler, "eventHandler");
        return (GestaltAvatar) this.f49249J.c(eventHandler, new p(this, 2));
    }

    @Override // com.pinterest.ui.imageview.GenericWebImageView, bb2.j
    public final boolean O1() {
        if (!super.O1()) {
            k kVar = this.K;
            if (!kVar.f108601d || !kVar.f108602e) {
                return false;
            }
        }
        return true;
    }

    public final rl1.q O2() {
        return (rl1.q) ((o) this.f49249J.f33803a);
    }

    public final g R2() {
        int G0 = dl2.b.G0(this, O2().f108650d.getValue());
        c cVar = O2().f108656j;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int a13 = cVar.a(context);
        String str = O2().f108647a;
        boolean z13 = O2().f108652f;
        h0 h0Var = new h0(O2().f108648b, i0.color_themed_non_image_font, dl2.b.E0(this, O2().f108650d.getTextSize()));
        rl1.o oVar = new rl1.o(O2().f108649c, dl2.b.G0(this, eo1.a.comp_avatar_border_weight), i0.color_themed_avatar_border);
        u50.i0 i0Var = O2().f108651e;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        return new g(G0, str, a13, z13, oVar, (m0) null, h0Var, i0Var.a(context2).toString(), O2().f108654h, O2().f108655i, O2().f108657k, 1056);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        p superDispatchDraw = new p(this, 3);
        k kVar = this.K;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(superDispatchDraw, "superDispatchDraw");
        superDispatchDraw.invoke(canvas);
        if (kVar.i()) {
            if (!j.f62104b) {
                WebImageView webImageView = kVar.f108598a;
                if (webImageView == null) {
                    Intrinsics.r("avatarView");
                    throw null;
                }
                webImageView.clear();
            }
            kVar.a(canvas);
        }
        if (kVar.f108618u && kVar.f108619v != null) {
            kVar.b(canvas);
        }
        kVar.M = false;
    }

    @Override // com.pinterest.ui.imageview.GenericWebImageView, com.makeramen.RoundedImageView, android.widget.ImageView, android.view.View, eo.d
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        p superOnDraw = new p(this, 6);
        k kVar = this.K;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(superOnDraw, "superOnDraw");
        if (kVar.i()) {
            kVar.a(canvas);
        } else {
            if (canvas != null) {
                canvas.drawCircle(kVar.N, kVar.O, kVar.P - (kVar.f108614q ? kVar.f108615r : 0), (Paint) kVar.f108604g.getValue());
            }
            kVar.f108602e = true;
            superOnDraw.invoke(canvas);
        }
        if (kVar.f108618u && kVar.f108619v != null) {
            kVar.b(canvas);
        }
        kVar.M = false;
    }

    @Override // com.pinterest.ui.imageview.GenericWebImageView, android.widget.ImageView, android.view.View
    public final void onMeasure(int i13, int i14) {
        int g13;
        s superOnMeasure = new s(this, 0);
        s setMeasuredDimension = new s(this, 1);
        k kVar = this.K;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(superOnMeasure, "superOnMeasure");
        Intrinsics.checkNotNullParameter(setMeasuredDimension, "setMeasuredDimension");
        if (kVar.f108611n > 0) {
            g13 = Math.min(View.MeasureSpec.getMode(i13) != 1073741824 ? View.resolveSize(kVar.f108611n, i13) : kVar.f108611n, View.MeasureSpec.getMode(i14) != 1073741824 ? View.resolveSize(kVar.f108611n, i14) : kVar.f108611n);
        } else {
            superOnMeasure.invoke(Integer.valueOf(i13), Integer.valueOf(i14));
            g13 = kVar.g();
        }
        kVar.p(g13, false);
        WebImageView webImageView = kVar.f108598a;
        if (webImageView == null) {
            Intrinsics.r("avatarView");
            throw null;
        }
        webImageView.H0(g13, g13);
        setMeasuredDimension.invoke(Integer.valueOf(g13), Integer.valueOf(g13));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GestaltAvatar(Context context, rl1.q initialDisplayState) {
        super(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initialDisplayState, "initialDisplayState");
        k kVar = new k();
        this.K = kVar;
        this.f49249J = new q(this, initialDisplayState);
        kVar.k(this, R2());
    }

    public /* synthetic */ GestaltAvatar(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GestaltAvatar(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        k kVar = new k();
        this.K = kVar;
        int[] GestaltAvatar = l0.GestaltAvatar;
        Intrinsics.checkNotNullExpressionValue(GestaltAvatar, "GestaltAvatar");
        this.f49249J = new q(this, attributeSet, i13, GestaltAvatar, new p(this, 0));
        kVar.k(this, R2());
    }
}
