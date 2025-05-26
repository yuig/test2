package com.pinterest.gestalt.divider;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.google.firebase.messaging.q;
import df.j1;
import fm1.c;
import gm1.b;
import i2.i;
import jm1.a;
import jm1.e;
import jm1.g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u50.n;
import u50.o;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00000\u0002:\u0003\f\u0003\rB'\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/pinterest/gestalt/divider/GestaltDivider;", "Landroid/view/View;", "Lgm1/b;", "Ljm1/b;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ps0/y", "jm1/c", "divider_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class GestaltDivider extends View implements b {

    /* renamed from: d, reason: collision with root package name */
    public static final c f49365d = c.VISIBLE;

    /* renamed from: e, reason: collision with root package name */
    public static final int f49366e = eo1.c.space_0;

    /* renamed from: f, reason: collision with root package name */
    public static final jm1.c f49367f = jm1.c.HORIZONTAL;

    /* renamed from: a, reason: collision with root package name */
    public final q f49368a;

    /* renamed from: b, reason: collision with root package name */
    public final int f49369b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f49370c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GestaltDivider(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final GestaltDivider a(Function1 nextState) {
        Intrinsics.checkNotNullParameter(nextState, "nextState");
        return (GestaltDivider) this.f49368a.d(nextState, new i(25, this, b()));
    }

    public final jm1.b b() {
        return (jm1.b) ((o) this.f49368a.f33803a);
    }

    public final void c(jm1.b bVar, jm1.b bVar2) {
        j1.v(bVar, bVar2, e.f77031j, new a(this, 1));
        j1.v(bVar, bVar2, e.f77032k, new a(this, 2));
        if (Intrinsics.d(bVar != null ? bVar.f77021b : null, bVar2.f77021b) && Intrinsics.d(bVar.f(), bVar2.f()) && Intrinsics.d(bVar.h(), bVar2.h()) && Intrinsics.d(bVar.g(), bVar2.g())) {
            return;
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        jm1.c cVar = b().f77025f;
        jm1.c cVar2 = jm1.c.HORIZONTAL;
        Paint paint = this.f49370c;
        int i13 = this.f49369b;
        if (cVar == cVar2) {
            n nVar = b().f77021b;
            Intrinsics.checkNotNullExpressionValue(getContext(), "getContext(...)");
            float intValue = nVar.a(r1).intValue() + (i13 / 2);
            canvas.drawLine(0.0f, intValue, getWidth(), intValue, paint);
            return;
        }
        n nVar2 = b().f77023d;
        Intrinsics.checkNotNullExpressionValue(getContext(), "getContext(...)");
        float intValue2 = nVar2.a(r1).intValue() + (i13 / 2);
        canvas.drawLine(intValue2, 0.0f, intValue2, getHeight(), paint);
    }

    @Override // android.view.View
    public final void onMeasure(int i13, int i14) {
        super.onMeasure(i13, i14);
        jm1.c cVar = b().f77025f;
        jm1.c cVar2 = jm1.c.HORIZONTAL;
        int i15 = this.f49369b;
        if (cVar == cVar2) {
            n nVar = b().f77021b;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            int intValue = nVar.a(context).intValue();
            n nVar2 = b().f77022c;
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            setMeasuredDimension(i13, nVar2.a(context2).intValue() + intValue + i15);
            return;
        }
        n nVar3 = b().f77023d;
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        int intValue2 = nVar3.a(context3).intValue();
        n nVar4 = b().f77024e;
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        setMeasuredDimension(nVar4.a(context4).intValue() + intValue2 + i15, i14);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GestaltDivider(Context context, jm1.b initialDisplayState) {
        super(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initialDisplayState, "initialDisplayState");
        int G0 = dl2.b.G0(this, eo1.a.comp_divider_stroke_height);
        this.f49369b = G0;
        Paint paint = new Paint();
        paint.setColor(dl2.b.y0(this, eo1.a.comp_divider_background_color));
        paint.setStrokeWidth(G0);
        this.f49370c = paint;
        this.f49368a = new q(this, initialDisplayState);
        c(null, initialDisplayState);
    }

    public /* synthetic */ GestaltDivider(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GestaltDivider(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        int G0 = dl2.b.G0(this, eo1.a.comp_divider_stroke_height);
        this.f49369b = G0;
        Paint paint = new Paint();
        paint.setColor(dl2.b.y0(this, eo1.a.comp_divider_background_color));
        paint.setStrokeWidth(G0);
        this.f49370c = paint;
        int[] GestaltDivider = g.GestaltDivider;
        Intrinsics.checkNotNullExpressionValue(GestaltDivider, "GestaltDivider");
        this.f49368a = new q(this, attributeSet, i13, GestaltDivider, new a(this, 0));
        c(null, b());
    }
}
