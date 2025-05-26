package com.pinterest.shuffles.composer.ui.widget;

import a.a;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import bk.i;
import bk.o;
import h62.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.x;
import org.jetbrains.annotations.NotNull;
import p62.h;
import rl2.u;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\bB\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/pinterest/shuffles/composer/ui/widget/ZOrderIndicator;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "org/chromium/net/y", "shuffles-composer_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ZOrderIndicator extends View {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ u[] f51907n;

    /* renamed from: o, reason: collision with root package name */
    public static final int[] f51908o;

    /* renamed from: a, reason: collision with root package name */
    public final h f51909a;

    /* renamed from: b, reason: collision with root package name */
    public final h f51910b;

    /* renamed from: c, reason: collision with root package name */
    public float f51911c;

    /* renamed from: d, reason: collision with root package name */
    public float f51912d;

    /* renamed from: e, reason: collision with root package name */
    public float f51913e;

    /* renamed from: f, reason: collision with root package name */
    public float f51914f;

    /* renamed from: g, reason: collision with root package name */
    public final float f51915g;

    /* renamed from: h, reason: collision with root package name */
    public float f51916h;

    /* renamed from: i, reason: collision with root package name */
    public ColorStateList f51917i;

    /* renamed from: j, reason: collision with root package name */
    public int f51918j;

    /* renamed from: k, reason: collision with root package name */
    public final Paint f51919k;

    /* renamed from: l, reason: collision with root package name */
    public o f51920l;

    /* renamed from: m, reason: collision with root package name */
    public final i f51921m;

    static {
        x xVar = new x(ZOrderIndicator.class, "currentIndex", "getCurrentIndex()I", 0);
        l0 l0Var = k0.f80436a;
        f51907n = new u[]{l0Var.e(xVar), a.y(ZOrderIndicator.class, "indexCount", "getIndexCount()I", 0, l0Var)};
        f51908o = new int[]{R.attr.state_selected};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZOrderIndicator(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        h hVar = new h(this, 0);
        this.f51909a = hVar;
        h hVar2 = new h(this, 1);
        this.f51910b = hVar2;
        this.f51911c = kg.a.g0(28, context);
        this.f51912d = kg.a.g0(6, context);
        this.f51913e = kg.a.g0(6, context);
        this.f51914f = kg.a.g0(6, context);
        this.f51915g = kg.a.g0(6, context);
        this.f51916h = 1.0f;
        ColorStateList valueOf = ColorStateList.valueOf(-1);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(...)");
        this.f51917i = valueOf;
        this.f51918j = 8388611;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.f51919k = paint;
        o a13 = o.b(0, 0, context, attributeSet).a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        this.f51920l = a13;
        i iVar = new i(this.f51920l);
        this.f51921m = iVar;
        int g03 = kg.a.g0(24, context);
        int g04 = kg.a.g0(12, context);
        setPadding(g04, g03, g04, g03);
        setBackground(iVar);
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, q.ZOrderIndicator, 0, 0);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        int integer = obtainStyledAttributes.getInteger(q.ZOrderIndicator_index, 0);
        u[] uVarArr = f51907n;
        hVar.d(this, uVarArr[0], Integer.valueOf(integer));
        hVar2.d(this, uVarArr[1], Integer.valueOf(obtainStyledAttributes.getInteger(q.ZOrderIndicator_indexCount, 0)));
        Unit unit = Unit.f80348a;
        obtainStyledAttributes.recycle();
    }

    public final int a() {
        return ((Number) this.f51910b.c(this, f51907n[1])).intValue();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f13;
        float f14;
        float strokeWidth;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        float paddingLeft = getPaddingLeft();
        float paddingTop = getPaddingTop();
        int save = canvas.save();
        canvas.translate(paddingLeft, paddingTop);
        try {
            float f15 = this.f51911c - this.f51912d;
            float abs = this.f51918j == 17 ? Math.abs(f15) / 2.0f : 0.0f;
            int a13 = a();
            for (int i13 = 0; i13 < a13; i13++) {
                float a14 = (this.f51915g + this.f51914f) * ((a() - i13) - 1) * this.f51916h;
                int intValue = ((Number) this.f51909a.c(this, f51907n[0])).intValue();
                Paint paint = this.f51919k;
                if (i13 == intValue) {
                    ColorStateList colorStateList = this.f51917i;
                    paint.setColor(colorStateList.getColorForState(f51908o, colorStateList.getDefaultColor()));
                    paint.setStrokeWidth(this.f51913e);
                    f13 = f15 < 0.0f ? abs : 0.0f;
                    f14 = this.f51911c;
                    strokeWidth = paint.getStrokeWidth();
                } else {
                    paint.setColor(this.f51917i.getDefaultColor());
                    paint.setStrokeWidth(this.f51914f * this.f51916h);
                    f13 = f15 > 0.0f ? abs : 0.0f;
                    f14 = this.f51912d;
                    strokeWidth = paint.getStrokeWidth();
                }
                float f16 = f14 - strokeWidth;
                float strokeWidth2 = (paint.getStrokeWidth() / 2.0f) + f13;
                float strokeWidth3 = (paint.getStrokeWidth() / 2.0f) + a14;
                canvas.drawLine(strokeWidth2, strokeWidth3, f16 + strokeWidth2, strokeWidth3, paint);
            }
            canvas.restoreToCount(save);
        } catch (Throwable th3) {
            canvas.restoreToCount(save);
            throw th3;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i13, int i14) {
        int paddingRight = getPaddingRight() + getPaddingLeft() + Math.max((int) this.f51911c, (int) this.f51912d);
        int paddingBottom = getPaddingBottom() + ((a() - 1) * ((int) this.f51915g)) + ((a() - 1) * ((int) this.f51914f)) + getPaddingTop() + ((int) this.f51913e);
        int resolveSize = View.resolveSize(paddingBottom, i14);
        if (resolveSize < paddingBottom) {
            this.f51916h = ((resolveSize - getPaddingTop()) - getPaddingBottom()) / ((paddingBottom - getPaddingTop()) - getPaddingBottom());
        }
        setMeasuredDimension(View.resolveSize(paddingRight, i13), resolveSize);
    }
}
