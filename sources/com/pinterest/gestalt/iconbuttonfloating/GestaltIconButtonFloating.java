package com.pinterest.gestalt.iconbuttonfloating;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import df.j1;
import fm1.c;
import gm1.a;
import gm1.b;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qm1.d;
import qm1.e;
import qm1.f;
import qm1.g;
import qm1.h;
import qm1.n;
import rm1.q;
import u50.o;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00000\u0002:\u0005\r\u0003\u000e\u000f\u0010B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB'\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/pinterest/gestalt/iconbuttonfloating/GestaltIconButtonFloating;", "Landroidx/appcompat/widget/AppCompatButton;", "Lgm1/b;", "Lqm1/b;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "al1/n", "qm1/d", "qm1/e", "qm1/f", "iconbuttonfloating_release"}, k = 1, mv = {1, 9, 0})
@SuppressLint({"GestaltComponentUnsafeSetterCall"})
/* loaded from: classes5.dex */
public final class GestaltIconButtonFloating extends AppCompatButton implements b {

    /* renamed from: f, reason: collision with root package name */
    public static final q f49395f = q.FILL_TRANSPARENT;

    /* renamed from: g, reason: collision with root package name */
    public static final c f49396g = c.VISIBLE;

    /* renamed from: h, reason: collision with root package name */
    public static final d f49397h = d.DEFAULT;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f49398d;

    /* renamed from: e, reason: collision with root package name */
    public final com.google.firebase.messaging.q f49399e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GestaltIconButtonFloating(Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final GestaltIconButtonFloating c(a eventHandler) {
        Intrinsics.checkNotNullParameter(eventHandler, "eventHandler");
        return (GestaltIconButtonFloating) this.f49399e.c(eventHandler, new qm1.a(this, 1));
    }

    public final void d(qm1.b bVar, qm1.b bVar2) {
        Pair pair;
        Context context = getContext();
        int i13 = f.f104390a;
        Drawable drawable = context.getDrawable(f.f104390a);
        if (drawable == null) {
            throw new Exception("GestaltIconButtonFloating: Invalid display state");
        }
        j1.v(bVar, bVar2, h.f104395j, new g(this, bVar2, 1));
        if (bVar2.f104385d) {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            d dVar = bVar2.f104383b;
            Integer valueOf = Integer.valueOf(dl2.b.x0(context2, dVar.getBackgroundColor$iconbuttonfloating_release()));
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            pair = new Pair(valueOf, Integer.valueOf(dl2.b.x0(context3, dVar.getIconColor$iconbuttonfloating_release())));
        } else {
            Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            Integer valueOf2 = Integer.valueOf(dl2.b.x0(context4, eo1.a.comp_iconbuttonfloating_container_color_disabled));
            Context context5 = getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
            pair = new Pair(valueOf2, Integer.valueOf(dl2.b.x0(context5, eo1.a.comp_iconbuttonfloating_icon_color_disabled)));
        }
        int intValue = ((Number) pair.f80346a).intValue();
        int intValue2 = ((Number) pair.f80347b).intValue();
        float E0 = bVar2.f104385d ? dl2.b.E0(this, f.f104391b) : dl2.b.E0(this, eo1.a.space_0);
        int i14 = e.f104388a;
        int G0 = dl2.b.G0(this, e.f104388a);
        int G02 = dl2.b.G0(this, e.f104389b);
        int i15 = 2;
        int i16 = (G02 - G0) / 2;
        int i17 = i16 + G0;
        GradientDrawable gradientDrawable = (GradientDrawable) drawable;
        gradientDrawable.setCornerRadius(dl2.b.G0(this, eo1.a.comp_iconbuttonfloating_corner_radius));
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        gradientDrawable.setColorFilter(new PorterDuffColorFilter(intValue, mode));
        setBackground(drawable);
        setElevation(E0);
        setMinHeight(G02);
        setMaxHeight(G02);
        setMinWidth(G02);
        setMaxWidth(G02);
        Drawable drawable2 = this.f49398d;
        if (drawable2 != null) {
            drawable2.setColorFilter(new PorterDuffColorFilter(intValue2, mode));
        }
        Drawable drawable3 = this.f49398d;
        if (drawable3 != null) {
            drawable3.setBounds(i16, 0, i17, G0);
        }
        setCompoundDrawablesRelative(this.f49398d, null, null, null);
        j1.v(bVar, bVar2, h.f104396k, new g(this, bVar2, i15));
        j1.v(bVar, bVar2, h.f104397l, new qm1.a(this, i15));
        j1.v(bVar, bVar2, h.f104398m, new g(bVar2, this));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GestaltIconButtonFloating(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GestaltIconButtonFloating(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        int[] GestaltIconButtonFloating = n.GestaltIconButtonFloating;
        Intrinsics.checkNotNullExpressionValue(GestaltIconButtonFloating, "GestaltIconButtonFloating");
        com.google.firebase.messaging.q qVar = new com.google.firebase.messaging.q(this, attributeSet, i13, GestaltIconButtonFloating, new qm1.a(this, 0));
        this.f49399e = qVar;
        d(null, (qm1.b) ((o) qVar.f33803a));
    }
}
