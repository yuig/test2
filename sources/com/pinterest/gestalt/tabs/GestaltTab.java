package com.pinterest.gestalt.tabs;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.p;
import bs1.c;
import com.google.firebase.messaging.q;
import com.pinterest.gestalt.indicator.GestaltIndicator;
import df.j1;
import eo1.a;
import gm1.b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nx.r0;
import org.jetbrains.annotations.NotNull;
import pn1.d;
import pn1.e;
import pn1.f;
import pn1.i;
import pn1.j;
import u50.o;
import xk2.m;
import xk2.v;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00000\u0002:\u0002\u0003\fB'\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/pinterest/gestalt/tabs/GestaltTab;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lgm1/b;", "Lpn1/b;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "pn1/c", "tabs_release"}, k = 1, mv = {1, 9, 0})
@SuppressLint({"GestaltComponentUnsafeSetterCall"})
/* loaded from: classes2.dex */
public final class GestaltTab extends ConstraintLayout implements b {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f49624g = 0;

    /* renamed from: a, reason: collision with root package name */
    public final q f49625a;

    /* renamed from: b, reason: collision with root package name */
    public final v f49626b;

    /* renamed from: c, reason: collision with root package name */
    public TextView f49627c;

    /* renamed from: d, reason: collision with root package name */
    public GestaltIndicator f49628d;

    /* renamed from: e, reason: collision with root package name */
    public AppCompatImageView f49629e;

    /* renamed from: f, reason: collision with root package name */
    public final p f49630f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GestaltTab(Context context, pn1.b initialDisplayState) {
        super(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initialDisplayState, "initialDisplayState");
        this.f49626b = m.b(new r0(this, 18));
        this.f49630f = new p();
        this.f49625a = new q(this, initialDisplayState);
        X();
    }

    public final void L(Function1 nextState) {
        Intrinsics.checkNotNullParameter(nextState, "nextState");
    }

    public final pn1.b T() {
        return (pn1.b) ((o) this.f49625a.f33803a);
    }

    public final void X() {
        View.inflate(getContext(), j.gestalt_tab, this);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, dl2.b.G0(this, a.comp_tabs_height));
        int G0 = dl2.b.G0(this, a.comp_tabs_horizontal_padding);
        int G02 = dl2.b.G0(this, a.comp_tabs_horizontal_padding);
        int i13 = marginLayoutParams.topMargin;
        int i14 = marginLayoutParams.bottomMargin;
        marginLayoutParams.setMarginStart(G0);
        marginLayoutParams.topMargin = i13;
        marginLayoutParams.setMarginEnd(G02);
        marginLayoutParams.bottomMargin = i14;
        setLayoutParams(marginLayoutParams);
        setMinWidth(c.b0(this, eo1.c.sema_space_600));
        setPaddingRelative(0, 0, 0, dl2.b.G0(this, a.comp_tabs_bottom_padding));
        View findViewById = findViewById(i.tab_text);
        TextView textView = (TextView) findViewById;
        textView.setMaxWidth(j1.O(160));
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        this.f49627c = textView;
        Z(null, T());
    }

    public final void Z(pn1.b bVar, pn1.b bVar2) {
        j1.v(bVar, bVar2, e.f100748l, new d(this, bVar2, 4));
        j1.v(bVar, bVar2, e.f100749m, new f(this, 0));
        j1.v(bVar, bVar2, e.f100750n, new d(bVar2, this));
        int i13 = 1;
        j1.v(bVar, bVar2, e.f100751o, new f(this, i13));
        j1.v(bVar, bVar2, e.f100752p, new d(this, bVar2, i13));
        j1.v(bVar, bVar2, e.f100746j, new d(this, bVar2, 2));
        if (T().f100740f != Integer.MIN_VALUE) {
            j1.v(bVar, bVar2, e.f100747k, new d(this, bVar2, 3));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GestaltTab(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GestaltTab(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f49626b = m.b(new r0(this, 18));
        this.f49630f = new p();
        this.f49625a = new q(this, attributeSet, i13, new int[0], pn1.a.f100732j);
        X();
    }
}
