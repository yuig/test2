package com.pinterest.feature.ideaPinCreation.drawing;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import c0.d;
import com.pinterest.api.model.go;
import com.pinterest.api.model.mp;
import hf0.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ou0.i;
import ou0.m;
import ou0.n;
import ql2.k;
import ql2.s;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/feature/ideaPinCreation/drawing/IdeaPinHandDrawingView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ideaPinCreationLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class IdeaPinHandDrawingView extends View {

    /* renamed from: a, reason: collision with root package name */
    public go f46509a;

    /* renamed from: b, reason: collision with root package name */
    public String f46510b;

    /* renamed from: c, reason: collision with root package name */
    public float f46511c;

    /* renamed from: d, reason: collision with root package name */
    public final int f46512d;

    /* renamed from: e, reason: collision with root package name */
    public final int f46513e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f46514f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f46515g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f46516h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f46517i;

    /* renamed from: j, reason: collision with root package name */
    public n f46518j;

    /* renamed from: k, reason: collision with root package name */
    public Float f46519k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdeaPinHandDrawingView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f46509a = go.GLOW;
        this.f46510b = "#FFFFFF";
        this.f46511c = b.f69001a * 4.0f;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int v13 = (int) d.v(32.0f, context2);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        int v14 = (int) d.v(4.0f, context3);
        this.f46512d = v14;
        this.f46513e = v13 - v14;
        this.f46515g = new ArrayList();
        this.f46516h = new ArrayList();
        this.f46517i = new ArrayList();
        setLayerType(1, null);
    }

    public static Paint b(String str, float f13) {
        Paint paint = new Paint();
        paint.setColor(Color.parseColor(str));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(f13);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setAntiAlias(true);
        paint.setDither(true);
        return paint;
    }

    public static Path c(List list) {
        Path path = new Path();
        PointF pointF = (PointF) d7.b.F(list);
        path.moveTo(pointF.x, pointF.y);
        k it = s.q(0, list.size() - 1).iterator();
        while (it.f104109c) {
            int b13 = it.b();
            PointF pointF2 = (PointF) list.get(b13);
            PointF pointF3 = (PointF) list.get(b13 + 1);
            float f13 = pointF2.x;
            float f14 = 2;
            float f15 = ((pointF3.x - f13) / f14) + f13;
            float f16 = pointF2.y;
            PointF pointF4 = new PointF(f15, ((pointF3.y - f16) / f14) + f16);
            path.quadTo(pointF2.x, pointF2.y, pointF4.x, pointF4.y);
        }
        return path;
    }

    public final void a(Canvas canvas, Paint paint, Path path) {
        Unit unit;
        Float f13 = this.f46519k;
        if (f13 != null) {
            float floatValue = f13.floatValue();
            Path path2 = new Path(path);
            Matrix matrix = new Matrix();
            matrix.postScale(floatValue, floatValue);
            path2.transform(matrix);
            canvas.drawPath(path2, paint);
            unit = Unit.f80348a;
        } else {
            unit = null;
        }
        if (unit == null) {
            canvas.drawPath(path, paint);
        }
    }

    public final void d(List input, Float f13) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.f46519k = f13;
        ArrayList arrayList = this.f46517i;
        arrayList.clear();
        List list = input;
        arrayList.addAll(list);
        ArrayList arrayList2 = this.f46516h;
        arrayList2.clear();
        arrayList2.addAll(list);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        Bitmap bitmap;
        Object obj;
        Canvas canvas3;
        int i13 = 0;
        int i14 = 2;
        int i15 = 1;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        boolean isOpaque = canvas.isOpaque();
        ArrayList arrayList = this.f46517i;
        if (isOpaque && (!(arrayList instanceof Collection) || !arrayList.isEmpty())) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((mp) it.next()).getBrushType() == go.ERASER) {
                    bitmap = Bitmap.createBitmap(canvas.getWidth(), canvas.getHeight(), Bitmap.Config.ARGB_8888);
                    canvas2 = new Canvas(bitmap);
                    break;
                }
            }
        }
        canvas2 = canvas;
        bitmap = null;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            mp mpVar = (mp) it2.next();
            float brushWidth = mpVar.getBrushWidth();
            Float f13 = this.f46519k;
            float floatValue = brushWidth * (f13 != null ? f13.floatValue() : 1.0f);
            int i16 = m.f97717a[mpVar.getBrushType().ordinal()];
            if (i16 == i15) {
                List pointList = mpVar.getPointList();
                String brushColor = mpVar.getBrushColor();
                if (!pointList.isEmpty()) {
                    Intrinsics.checkNotNullParameter(pointList, "<this>");
                    PointF pointF = (PointF) CollectionsKt.b0(pointList);
                    int i17 = (pointF.x == -1.0f && pointF.y == -1.0f) ? i15 : i13;
                    if (i17 != 0) {
                        pointList = pointList.subList(i13, f0.i(pointList));
                    }
                    Path c13 = c(pointList);
                    Paint b13 = b(brushColor, floatValue);
                    a(canvas2, b13, c13);
                    if (i17 != 0) {
                        Float f14 = this.f46519k;
                        float floatValue2 = ((((floatValue / (f14 != null ? f14.floatValue() : 1.0f)) - this.f46512d) / this.f46513e) * 40.0f) + 16.0f;
                        Context context = getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                        float v13 = d.v(floatValue2, context);
                        PointF pointF2 = (PointF) ep.b.i(pointList, i15);
                        ListIterator listIterator = pointList.listIterator(pointList.size());
                        while (true) {
                            if (!listIterator.hasPrevious()) {
                                obj = null;
                                break;
                            }
                            obj = listIterator.previous();
                            PointF pointF3 = (PointF) obj;
                            if (pointF3.x != pointF2.x || pointF3.y != pointF2.y) {
                                break;
                            }
                        }
                        if (((PointF) obj) != null) {
                            double atan2 = Math.atan2(r13.y - pointF2.y, r13.x - pointF2.x);
                            double d2 = atan2 - 0.7853981633974483d;
                            double d13 = atan2 + 0.7853981633974483d;
                            Path path = new Path();
                            path.moveTo(pointF2.x, pointF2.y);
                            path.lineTo((((float) Math.cos(d2)) * v13) + pointF2.x, (((float) Math.sin(d2)) * v13) + pointF2.y);
                            path.moveTo(pointF2.x, pointF2.y);
                            path.lineTo((((float) Math.cos(d13)) * v13) + pointF2.x, (v13 * ((float) Math.sin(d13))) + pointF2.y);
                            canvas3 = canvas2;
                            a(canvas3, b13, path);
                            canvas2 = canvas3;
                            i13 = 0;
                            i14 = 2;
                            i15 = 1;
                        }
                    }
                }
            } else if (i16 == i14) {
                List pointList2 = mpVar.getPointList();
                String brushColor2 = mpVar.getBrushColor();
                if (!pointList2.isEmpty()) {
                    Path c14 = c(pointList2);
                    Paint b14 = b("#FFFFFF", floatValue);
                    Paint b15 = b(brushColor2, floatValue);
                    b15.setMaskFilter(new BlurMaskFilter(floatValue, BlurMaskFilter.Blur.OUTER));
                    a(canvas2, b14, c14);
                    a(canvas2, b15, c14);
                }
            } else if (i16 == 3) {
                List pointList3 = mpVar.getPointList();
                String brushColor3 = mpVar.getBrushColor();
                if (!pointList3.isEmpty()) {
                    a(canvas2, b(brushColor3, floatValue), c(pointList3));
                }
            } else if (i16 == 4) {
                List pointList4 = mpVar.getPointList();
                String brushColor4 = mpVar.getBrushColor();
                if (!pointList4.isEmpty()) {
                    Path c15 = c(pointList4);
                    Paint b16 = b(brushColor4, floatValue);
                    float[] fArr = new float[i14];
                    fArr[i13] = 0.0f;
                    fArr[i15] = floatValue * 2.5f;
                    b16.setPathEffect(new DashPathEffect(fArr, 0.0f));
                    a(canvas2, b16, c15);
                }
            } else if (i16 == 5) {
                List pointList5 = mpVar.getPointList();
                if (!pointList5.isEmpty()) {
                    Path c16 = c(pointList5);
                    Paint b17 = b("#FFFFFF", floatValue);
                    b17.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    a(canvas2, b17, c16);
                }
            }
            canvas3 = canvas2;
            canvas2 = canvas3;
            i13 = 0;
            i14 = 2;
            i15 = 1;
        }
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!this.f46514f) {
            return super.onTouchEvent(event);
        }
        PointF pointF = new PointF(event.getX(), event.getY());
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            ArrayList l13 = f0.l(pointF);
            this.f46515g = l13;
            this.f46517i.add(new mp(l13, this.f46509a, this.f46510b, this.f46511c));
        } else if (actionMasked == 1) {
            if (this.f46509a == go.ARROW) {
                this.f46515g.add(new PointF(-1.0f, -1.0f));
                invalidate();
            }
            n nVar = this.f46518j;
            if (nVar != null) {
                ((IdeaPinHandDrawingEditor) nVar).f46484b.t(i.f97714l);
            }
        } else if (actionMasked == 2) {
            this.f46515g.add(pointF);
            invalidate();
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdeaPinHandDrawingView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f46509a = go.GLOW;
        this.f46510b = "#FFFFFF";
        this.f46511c = b.f69001a * 4.0f;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int v13 = (int) d.v(32.0f, context2);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        int v14 = (int) d.v(4.0f, context3);
        this.f46512d = v14;
        this.f46513e = v13 - v14;
        this.f46515g = new ArrayList();
        this.f46516h = new ArrayList();
        this.f46517i = new ArrayList();
        setLayerType(1, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdeaPinHandDrawingView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f46509a = go.GLOW;
        this.f46510b = "#FFFFFF";
        this.f46511c = b.f69001a * 4.0f;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int v13 = (int) d.v(32.0f, context2);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        int v14 = (int) d.v(4.0f, context3);
        this.f46512d = v14;
        this.f46513e = v13 - v14;
        this.f46515g = new ArrayList();
        this.f46516h = new ArrayList();
        this.f46517i = new ArrayList();
        setLayerType(1, null);
    }
}
