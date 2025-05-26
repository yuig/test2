package com.pinterest.gestalt.radioGroup;

import an1.l;
import an1.n;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import bn1.d;
import com.google.firebase.messaging.q;
import com.pinterest.gestalt.text.GestaltText;
import df.j1;
import ed1.m;
import fm1.c;
import gm1.a;
import gm1.b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u50.h0;
import u50.o;
import xk2.v;
import xm1.k;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00000\u0002:\u0002\f\u0003B'\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/pinterest/gestalt/radioGroup/GestaltRadioGroup;", "Landroidx/appcompat/widget/LinearLayoutCompat;", "Lgm1/b;", "Lan1/l;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "al1/n", "radiogroup_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class GestaltRadioGroup extends LinearLayoutCompat implements b {
    public static final h0 A;
    public static final h0 B;
    public static final int C;

    /* renamed from: x, reason: collision with root package name */
    public static final c f49488x = c.VISIBLE;

    /* renamed from: y, reason: collision with root package name */
    public static final h0 f49489y;

    /* renamed from: z, reason: collision with root package name */
    public static final h0 f49490z;

    /* renamed from: p, reason: collision with root package name */
    public final q f49491p;

    /* renamed from: q, reason: collision with root package name */
    public final v f49492q;

    /* renamed from: r, reason: collision with root package name */
    public GestaltText f49493r;

    /* renamed from: s, reason: collision with root package name */
    public GestaltText f49494s;

    /* renamed from: t, reason: collision with root package name */
    public final v f49495t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f49496u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f49497v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f49498w;

    static {
        h0 h0Var = h0.f120562a;
        f49489y = h0Var;
        f49490z = h0Var;
        A = h0Var;
        B = h0Var;
        C = -1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GestaltRadioGroup(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final GestaltRadioGroup t(Function1 nextState) {
        Intrinsics.checkNotNullParameter(nextState, "nextState");
        q qVar = this.f49491p;
        return (GestaltRadioGroup) qVar.d(nextState, new k(4, this, (l) ((o) qVar.f33803a)));
    }

    public final GestaltRadioGroup u(a eventHandler) {
        Intrinsics.checkNotNullParameter(eventHandler, "eventHandler");
        return (GestaltRadioGroup) this.f49491p.c(eventHandler, new an1.k(this, 1));
    }

    public final void v(l lVar, l lVar2) {
        j1.v(lVar, lVar2, an1.c.f15718z, new an1.k(this, 5));
        j1.v(lVar, lVar2, an1.c.A, new an1.k(this, 6));
        j1.v(lVar, lVar2, an1.c.B, new an1.k(this, 7));
        j1.v(lVar, lVar2, an1.c.C, new an1.k(this, 8));
        j1.v(lVar, lVar2, an1.c.D, new m(this, lVar, lVar2, 29));
        j1.v(lVar, lVar2, an1.c.f15715w, new an1.k(this, 2));
        j1.v(lVar, lVar2, an1.c.f15716x, new an1.k(this, 3));
        if (lVar2.f15750h != Integer.MIN_VALUE) {
            j1.v(lVar, lVar2, an1.c.f15717y, new an1.k(this, 4));
        }
    }

    public /* synthetic */ GestaltRadioGroup(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GestaltRadioGroup(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        int i14 = 0;
        this.f49492q = xk2.m.b(new n(this, i14));
        this.f49495t = xk2.m.b(new n(this, 1));
        int[] GestaltRadioGroup = d.GestaltRadioGroup;
        Intrinsics.checkNotNullExpressionValue(GestaltRadioGroup, "GestaltRadioGroup");
        q qVar = new q(this, attributeSet, i13, GestaltRadioGroup, new an1.k(this, i14));
        this.f49491p = qVar;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.f49496u = dl2.b.w0(context2, eo1.a.comp_iconbutton_label_visibility);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.f49497v = dl2.b.w0(context3, eo1.a.comp_radiogroup_legend_uses_subtle_color);
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        this.f49498w = dl2.b.w0(context4, eo1.a.comp_radiogroup_error_text_uses_small_icon);
        s(1);
        View.inflate(getContext(), bn1.c.gestalt_radio_group_layout, this);
        v(null, (l) ((o) qVar.f33803a));
    }
}
