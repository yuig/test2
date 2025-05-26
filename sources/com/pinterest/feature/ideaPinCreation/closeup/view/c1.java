package com.pinterest.feature.ideaPinCreation.closeup.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.pinterest.api.model.aq0;
import com.pinterest.api.model.er;
import com.pinterest.api.model.oq;
import com.pinterest.api.model.qq;
import com.pinterest.api.model.rq;
import com.pinterest.api.model.uq;
import kh2.g3;
import kh2.k3;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c1 extends FrameLayout implements fu0.i, g1, m1, l1 {

    /* renamed from: a, reason: collision with root package name */
    public final oq f46097a;

    /* renamed from: b, reason: collision with root package name */
    public final float f46098b;

    /* renamed from: c, reason: collision with root package name */
    public final float f46099c;

    /* renamed from: d, reason: collision with root package name */
    public final v1 f46100d;

    /* renamed from: e, reason: collision with root package name */
    public final yt0.e f46101e;

    /* renamed from: f, reason: collision with root package name */
    public final yt0.f f46102f;

    /* renamed from: g, reason: collision with root package name */
    public final o1 f46103g;

    /* renamed from: h, reason: collision with root package name */
    public final xk2.v f46104h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f46105i;

    /* renamed from: j, reason: collision with root package name */
    public final ImageView f46106j;

    /* renamed from: k, reason: collision with root package name */
    public final String f46107k;

    /* renamed from: l, reason: collision with root package name */
    public final er f46108l;

    /* renamed from: m, reason: collision with root package name */
    public final aq0 f46109m;

    /* renamed from: n, reason: collision with root package name */
    public final String f46110n;

    /* renamed from: o, reason: collision with root package name */
    public final float f46111o;

    /* renamed from: p, reason: collision with root package name */
    public Bitmap f46112p;

    /* renamed from: q, reason: collision with root package name */
    public Matrix f46113q;

    /* renamed from: r, reason: collision with root package name */
    public final xk2.v f46114r;

    /* renamed from: s, reason: collision with root package name */
    public final String f46115s;

    /* renamed from: t, reason: collision with root package name */
    public final uq f46116t;

    /* renamed from: u, reason: collision with root package name */
    public final String f46117u;

    /* renamed from: v, reason: collision with root package name */
    public final xk2.v f46118v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(Context context, oq overlayBlock, float f13, float f14, v1 v1Var, yt0.e eVar, yt0.f fVar, o1 o1Var) {
        super(context);
        Unit unit;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(overlayBlock, "overlayBlock");
        this.f46097a = overlayBlock;
        this.f46098b = f13;
        this.f46099c = f14;
        this.f46100d = v1Var;
        this.f46101e = eVar;
        this.f46102f = fVar;
        this.f46103g = o1Var;
        this.f46104h = xk2.m.b(l0.f46224o);
        xk2.m.b(l0.f46223n);
        int i13 = 1;
        xk2.v b13 = xk2.m.b(new b1(this, i13));
        TextView textView = new TextView(context);
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        int i14 = eo1.b.sema_color_background_transparent;
        Object obj = d5.a.f53679a;
        textView.setBackgroundColor(context.getColor(i14));
        this.f46105i = textView;
        ImageView imageView = new ImageView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 8388659;
        imageView.setLayoutParams(layoutParams);
        imageView.setScaleType(ImageView.ScaleType.MATRIX);
        this.f46106j = imageView;
        this.f46107k = "#FFFFFF";
        this.f46108l = er.NONE;
        this.f46109m = aq0.CENTER;
        this.f46110n = "6";
        this.f46111o = c0.d.v(36.0f, context);
        this.f46113q = new Matrix();
        this.f46114r = xk2.m.b(new b1(this, 2));
        setTag(aq1.d.idea_pin_tag_id, overlayBlock.getConfig().getId());
        addView(imageView);
        rq config = overlayBlock.getConfig();
        String w23 = g3.w2(overlayBlock);
        String colorHex = config.getColorHex();
        er highlightType = overlayBlock.getHighlightType();
        textView.setTextColor(Color.parseColor(w23));
        this.f46107k = colorHex;
        this.f46108l = highlightType;
        aq0 alignment = overlayBlock.getAlignment();
        int i15 = a1.f46086a[alignment.ordinal()];
        if (i15 == 1) {
            i13 = 3;
        } else if (i15 == 2) {
            i13 = 5;
        }
        textView.setGravity(i13 | 80);
        this.f46109m = alignment;
        String fontId = overlayBlock.getFontId();
        Typeface c13 = ((zf1.e) b13.getValue()).c(fontId);
        if (c13 != null) {
            textView.setTypeface(c13);
            this.f46110n = fontId;
        }
        zf1.e eVar2 = (zf1.e) b13.getValue();
        eVar2.getClass();
        Intrinsics.checkNotNullParameter(fontId, "fontId");
        cw0.a aVar = (cw0.a) eVar2.f141931g.get(fontId);
        Unit unit2 = null;
        Double valueOf = aVar != null ? Double.valueOf(aVar.f53329d) : null;
        if (valueOf != null) {
            textView.setLineSpacing(0.0f, (float) valueOf.doubleValue());
        }
        float fontSize = overlayBlock.getFontSize();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        float s22 = c0.d.s2(fontSize, (int) f13, context2);
        textView.setTextSize(0, s22);
        this.f46111o = s22;
        String text = overlayBlock.getText();
        textView.setText(text == null ? "" : text);
        String w24 = g3.w2(overlayBlock);
        aq0 alignment2 = overlayBlock.getAlignment();
        Intrinsics.checkNotNullParameter(overlayBlock, "<this>");
        String o03 = k3.o0(overlayBlock.getHighlightType(), overlayBlock.getConfig().getColorHex());
        Intrinsics.checkNotNullParameter(textView, "textView");
        textView.setText(textView.getText().toString());
        if (o03 != null) {
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            kh2.b0.L1(context3, o03, Integer.valueOf(alignment2.getType()), textView);
            unit = Unit.f80348a;
        } else {
            unit = null;
        }
        if (unit == null) {
            kg.p.Y(textView, 0.0f);
            Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            kg.p.P(context4, textView, w24, null);
        }
        Matrix matrix = config.getMatrix();
        if (matrix != null) {
            Bitmap a13 = a();
            this.f46112p = a13;
            this.f46113q = matrix;
            imageView.setImageBitmap(a13);
            imageView.setImageMatrix(matrix);
            unit2 = Unit.f80348a;
        }
        if (unit2 == null) {
            Bitmap a14 = a();
            float f15 = 2;
            float width = (f13 - a14.getWidth()) / f15;
            float height = (f14 - a14.getHeight()) / f15;
            Matrix matrix2 = new Matrix();
            matrix2.postScale(1.0f, 1.0f);
            matrix2.postTranslate(width, height);
            this.f46113q = matrix2;
            imageView.setImageBitmap(a14);
            imageView.setImageMatrix(matrix2);
            if (getVisibility() == 0) {
                RectF rectF = new RectF(0.0f, 0.0f, a14.getWidth(), a14.getHeight());
                if (o1Var != null) {
                    String id3 = overlayBlock.getConfig().getId();
                    Matrix matrix3 = this.f46113q;
                    ((f0) o1Var).L0(id3, matrix3, ig1.b.J0(matrix3, rectF));
                }
            }
            this.f46112p = a14;
        }
        this.f46115s = overlayBlock.getConfig().getId();
        this.f46116t = uq.TEXT;
        this.f46117u = textView.getText().toString();
        this.f46118v = xk2.m.b(new b1(this, 0));
    }

    @Override // com.pinterest.feature.ideaPinCreation.closeup.view.g1
    public final Path I0() {
        return (Path) this.f46118v.getValue();
    }

    @Override // com.pinterest.feature.ideaPinCreation.closeup.view.g1
    public final String L0() {
        return this.f46117u;
    }

    @Override // com.pinterest.feature.ideaPinCreation.closeup.view.m1
    public final float S0(float f13, Matrix viewMatrix) {
        Intrinsics.checkNotNullParameter(viewMatrix, "viewMatrix");
        float b03 = ig1.b.b0(viewMatrix);
        return ql2.s.f(f13 * b03, 0.33f, 6.0f) / b03;
    }

    @Override // fu0.i
    public final boolean T0() {
        return true;
    }

    @Override // com.pinterest.feature.ideaPinCreation.closeup.view.g1
    public final String X1() {
        return this.f46115s;
    }

    public final Bitmap a() {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(ml2.c.c(this.f46098b), Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        TextView textView = this.f46105i;
        textView.measure(makeMeasureSpec, makeMeasureSpec2);
        textView.layout(0, 0, textView.getMeasuredWidth(), textView.getMeasuredHeight());
        if (textView.getMeasuredWidth() <= 0 || textView.getMeasuredHeight() <= 0) {
            Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
            return createBitmap;
        }
        Bitmap createBitmap2 = Bitmap.createBitmap(textView.getMeasuredWidth(), textView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(createBitmap2, "createBitmap(...)");
        textView.draw(new Canvas(createBitmap2));
        return createBitmap2;
    }

    @Override // com.pinterest.feature.ideaPinCreation.closeup.view.g1
    public final uq a0() {
        return this.f46116t;
    }

    public final n1 b() {
        return (n1) this.f46114r.getValue();
    }

    @Override // fu0.i
    public final void d0() {
        b().g();
    }

    @Override // com.pinterest.feature.ideaPinCreation.closeup.view.l1
    public final void d2(Matrix viewMatrix) {
        Intrinsics.checkNotNullParameter(viewMatrix, "viewMatrix");
        this.f46113q.set(viewMatrix);
    }

    @Override // fu0.i
    public final void e(MotionEvent ev2) {
        Intrinsics.checkNotNullParameter(ev2, "ev");
        b().b(ev2);
    }

    @Override // fu0.i
    public final void i(MotionEvent ev2) {
        Intrinsics.checkNotNullParameter(ev2, "ev");
        b().c(ev2);
    }

    @Override // fu0.i
    public final void l(MotionEvent ev2) {
        Intrinsics.checkNotNullParameter(ev2, "ev");
        b().d(ev2);
    }

    @Override // fu0.i
    public final boolean n(MotionEvent ev2) {
        Intrinsics.checkNotNullParameter(ev2, "ev");
        if (getVisibility() == 0) {
            CharSequence text = this.f46105i.getText();
            Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
            if (text.length() > 0 && b().j(ev2)) {
                return true;
            }
        }
        return false;
    }

    @Override // fu0.i
    public final void o(MotionEvent ev2) {
        Intrinsics.checkNotNullParameter(ev2, "ev");
        b().e(ev2);
    }

    @Override // fu0.i
    public final void q(MotionEvent ev2) {
        Intrinsics.checkNotNullParameter(ev2, "ev");
        b().f(ev2);
    }

    @Override // com.pinterest.feature.ideaPinCreation.closeup.view.g1
    public final qq r0() {
        return this.f46097a;
    }

    @Override // com.pinterest.feature.ideaPinCreation.closeup.view.m1
    public final PointF r1(float f13, float f14, Matrix viewMatrix) {
        float f15;
        Intrinsics.checkNotNullParameter(viewMatrix, "viewMatrix");
        Matrix matrix = new Matrix(viewMatrix);
        matrix.postTranslate(f13, f14);
        RectF S = kh2.p2.S(matrix, I0());
        float W = bs1.c.W(this, eo1.c.space_400);
        float f16 = this.f46098b - W;
        float f17 = this.f46099c - W;
        float f18 = S.left;
        float f19 = 0.0f;
        if (f18 > f16) {
            f15 = f16 - f18;
        } else {
            float f23 = S.right;
            f15 = f23 < W ? W - f23 : 0.0f;
        }
        float f24 = S.top;
        if (f24 > f17) {
            f19 = f17 - f24;
        } else {
            float f25 = S.bottom;
            if (f25 < W) {
                f19 = W - f25;
            }
        }
        return new PointF(f13 + f15, f14 + f19);
    }

    @Override // fu0.i
    public final boolean t() {
        return true;
    }

    @Override // com.pinterest.feature.ideaPinCreation.closeup.view.g1
    public final void t1(Matrix matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        Bitmap a13 = a();
        this.f46112p = a13;
        this.f46113q = matrix;
        ImageView imageView = this.f46106j;
        imageView.setImageBitmap(a13);
        imageView.setImageMatrix(matrix);
    }

    public /* synthetic */ c1(Context context, oq oqVar, float f13, float f14) {
        this(context, oqVar, f13, f14, null, null, null, null);
    }
}
