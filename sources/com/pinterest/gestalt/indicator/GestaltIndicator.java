package com.pinterest.gestalt.indicator;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.firebase.messaging.q;
import df.j1;
import fm1.c;
import gm1.b;
import i2.i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u50.h0;
import u50.o;
import um1.a;
import um1.g;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00000\u0002:\u0002\f\u0003B'\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/pinterest/gestalt/indicator/GestaltIndicator;", "Landroidx/appcompat/widget/AppCompatTextView;", "Lgm1/b;", "Lum1/b;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ps0/m", "indicator_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class GestaltIndicator extends AppCompatTextView implements b {

    /* renamed from: b, reason: collision with root package name */
    public static final c f49407b = c.VISIBLE;

    /* renamed from: c, reason: collision with root package name */
    public static final h0 f49408c = h0.f120562a;

    /* renamed from: a, reason: collision with root package name */
    public final q f49409a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GestaltIndicator(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final GestaltIndicator i(Function1 nextState) {
        Intrinsics.checkNotNullParameter(nextState, "nextState");
        q qVar = this.f49409a;
        return (GestaltIndicator) qVar.d(nextState, new i(27, this, (um1.b) ((o) qVar.f33803a)));
    }

    public final void j(um1.b bVar, um1.b bVar2) {
        j1.v(bVar, bVar2, um1.c.f122790j, new a(this, 1));
        j1.v(bVar, bVar2, um1.c.f122791k, new a(this, 2));
        j1.v(bVar, bVar2, um1.c.f122792l, new a(this, 3));
        if (bVar2.f122789d != Integer.MIN_VALUE) {
            j1.v(bVar, bVar2, um1.c.f122793m, new a(this, 4));
        }
    }

    public /* synthetic */ GestaltIndicator(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GestaltIndicator(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        int[] GestaltIndicator = g.GestaltIndicator;
        Intrinsics.checkNotNullExpressionValue(GestaltIndicator, "GestaltIndicator");
        q qVar = new q(this, attributeSet, i13, GestaltIndicator, new a(this, 0));
        this.f49409a = qVar;
        if (getLayoutParams() == null) {
            setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        }
        j(null, (um1.b) ((o) qVar.f33803a));
    }
}
