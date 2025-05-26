package com.pinterest.shuffles.composer.ui.effects;

import a.c;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import et1.r0;
import g4.u;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m62.i1;
import org.jetbrains.annotations.NotNull;
import ql2.g;
import ql2.s;
import xk2.m;
import xk2.v;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\b\tB\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/pinterest/shuffles/composer/ui/effects/PointPicker;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "org/chromium/net/y", "m62/i1", "shuffles-composer_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class PointPicker extends View {

    /* renamed from: n, reason: collision with root package name */
    public static final int f51865n = Color.argb(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);

    /* renamed from: o, reason: collision with root package name */
    public static final int f51866o = -1;

    /* renamed from: p, reason: collision with root package name */
    public static final int f51867p = Color.argb(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN, 255, 255, 255);

    /* renamed from: a, reason: collision with root package name */
    public i1 f51868a;

    /* renamed from: b, reason: collision with root package name */
    public final PointF[] f51869b;

    /* renamed from: c, reason: collision with root package name */
    public final RectF f51870c;

    /* renamed from: d, reason: collision with root package name */
    public final Paint f51871d;

    /* renamed from: e, reason: collision with root package name */
    public final Paint f51872e;

    /* renamed from: f, reason: collision with root package name */
    public final v f51873f;

    /* renamed from: g, reason: collision with root package name */
    public final v f51874g;

    /* renamed from: h, reason: collision with root package name */
    public final RectF[] f51875h;

    /* renamed from: i, reason: collision with root package name */
    public PointF f51876i;

    /* renamed from: j, reason: collision with root package name */
    public Integer f51877j;

    /* renamed from: k, reason: collision with root package name */
    public float f51878k;

    /* renamed from: l, reason: collision with root package name */
    public int f51879l;

    /* renamed from: m, reason: collision with root package name */
    public final v f51880m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PointPicker(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f51868a = new u();
        PointF[] pointFArr = new PointF[2];
        for (int i13 = 0; i13 < 2; i13++) {
            pointFArr[i13] = new PointF();
        }
        this.f51869b = pointFArr;
        RectF rectF = new RectF();
        rectF.inset(-1.0f, -1.0f);
        this.f51870c = rectF;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.f51871d = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setColor(f51867p);
        paint2.setAlpha(0);
        this.f51872e = paint2;
        this.f51873f = c.n(context, 13);
        this.f51874g = c.n(context, 12);
        RectF[] rectFArr = new RectF[2];
        for (int i14 = 0; i14 < 2; i14++) {
            rectFArr[i14] = new RectF();
        }
        this.f51875h = rectFArr;
        this.f51878k = 1.0f;
        this.f51879l = 2;
        this.f51880m = m.b(new r0(11, context, this));
        int a13 = (int) (a() * 1.2f);
        setPadding(a13, a13, a13, a13);
        this.f51872e.setStrokeWidth(((Number) this.f51874g.getValue()).floatValue());
    }

    public final float a() {
        return ((Number) this.f51873f.getValue()).floatValue();
    }

    public final void b(int i13, PointF point) {
        Intrinsics.checkNotNullParameter(point, "point");
        RectF rectF = this.f51870c;
        float f13 = rectF.left;
        float f14 = rectF.right;
        if (f13 < f14) {
            float f15 = rectF.top;
            float f16 = rectF.bottom;
            if (f15 < f16) {
                float f17 = point.x;
                if (f17 >= f13 && f17 <= f14) {
                    float f18 = point.y;
                    if (f18 >= f15 && f18 <= f16) {
                        this.f51869b[i13].set(point);
                        invalidate();
                        return;
                    }
                }
            }
        }
        throw new IllegalArgumentException((point + " in not in range " + rectF).toString());
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        RectF[] rectFArr;
        float f13;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        int i13 = 0;
        while (true) {
            rectFArr = this.f51875h;
            if (i13 >= 2) {
                break;
            }
            PointF pointF = this.f51869b[i13];
            RectF rectF = rectFArr[i13];
            float width = getWidth();
            float f14 = pointF.x;
            RectF rectF2 = this.f51870c;
            float f15 = s.f(((f14 - rectF2.left) * width) / rectF2.width(), getPaddingLeft(), getWidth() - getPaddingRight());
            float f16 = s.f(((pointF.y - rectF2.top) * getHeight()) / rectF2.height(), getPaddingTop(), getHeight() - getPaddingBottom());
            rectF.set(f15 - a(), f16 - a(), a() + f15, a() + f16);
            i13++;
        }
        float paddingLeft = getPaddingLeft();
        float paddingTop = getPaddingTop();
        int save = canvas.save();
        canvas.translate(paddingLeft, paddingTop);
        try {
            canvas.drawRect(0.0f, 0.0f, (canvas.getWidth() - getPaddingLeft()) - getPaddingRight(), (canvas.getHeight() - getPaddingTop()) - getPaddingBottom(), this.f51872e);
            canvas.restoreToCount(save);
            int i14 = this.f51879l;
            for (int i15 = 0; i15 < i14; i15++) {
                float centerX = rectFArr[i15].centerX();
                float centerY = rectFArr[i15].centerY();
                save = canvas.save();
                canvas.translate(centerX, centerY);
                try {
                    Integer num = this.f51877j;
                    if (num != null && num.intValue() == i15) {
                        f13 = this.f51878k;
                        Paint paint = this.f51871d;
                        paint.setColor(f51865n);
                        canvas.drawCircle(0.0f, 0.0f, a() * f13, paint);
                        paint.setColor(f51866o);
                        canvas.drawCircle(0.0f, 0.0f, a() * 0.65f * f13, paint);
                        canvas.restoreToCount(save);
                    }
                    f13 = 1.0f;
                    Paint paint2 = this.f51871d;
                    paint2.setColor(f51865n);
                    canvas.drawCircle(0.0f, 0.0f, a() * f13, paint2);
                    paint2.setColor(f51866o);
                    canvas.drawCircle(0.0f, 0.0f, a() * 0.65f * f13, paint2);
                    canvas.restoreToCount(save);
                } finally {
                }
            }
        } finally {
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int i13 = 0;
        if (!isEnabled()) {
            return false;
        }
        int action = event.getAction();
        v vVar = this.f51880m;
        if (action == 0) {
            PointF pointF = new PointF(event.getX(), event.getY());
            while (true) {
                if (i13 >= 2) {
                    break;
                }
                if (this.f51875h[i13].contains(pointF.x, pointF.y)) {
                    this.f51877j = Integer.valueOf(i13);
                    this.f51876i = pointF;
                    ((ValueAnimator) vVar.getValue()).start();
                    break;
                }
                i13++;
            }
            if (this.f51877j != null) {
                return true;
            }
            this.f51876i = null;
            return true;
        }
        if (action != 1) {
            if (action == 2) {
                PointF pointF2 = this.f51876i;
                if (pointF2 == null) {
                    return true;
                }
                Integer num = this.f51877j;
                int intValue = num != null ? num.intValue() : 0;
                PointF pointF3 = new PointF(event.getX(), event.getY());
                float width = (pointF3.x - pointF2.x) / ((getWidth() - getPaddingLeft()) - getPaddingRight());
                float height = (pointF3.y - pointF2.y) / ((getHeight() - getPaddingTop()) - getPaddingBottom());
                this.f51876i = pointF3;
                PointF[] pointFArr = this.f51869b;
                PointF pointF4 = pointFArr[intValue];
                float f13 = pointF4.x;
                RectF rectF = this.f51870c;
                pointF4.x = ((Number) s.k(Float.valueOf((rectF.width() * width) + f13), new g(rectF.left, rectF.right))).floatValue();
                PointF pointF5 = pointFArr[intValue];
                pointF5.y = ((Number) s.k(Float.valueOf((rectF.height() * height) + pointF5.y), new g(rectF.top, rectF.bottom))).floatValue();
                i1 i1Var = this.f51868a;
                ArrayList arrayList = new ArrayList(pointFArr.length);
                int length = pointFArr.length;
                while (i13 < length) {
                    PointF pointF6 = pointFArr[i13];
                    arrayList.add(new PointF(pointF6.x, pointF6.y));
                    i13++;
                }
                i1Var.S(arrayList);
                invalidate();
                return true;
            }
            if (action != 3) {
                return super.onTouchEvent(event);
            }
        }
        this.f51876i = null;
        ((ValueAnimator) vVar.getValue()).reverse();
        return true;
    }
}
