package com.pinterest.feature.ideaPinCreation.closeup.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.pinterest.api.model.qq;
import com.pinterest.api.model.uq;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class z0 extends AppCompatImageView implements fu0.i, g1, b, a, m1, l1 {

    /* renamed from: a, reason: collision with root package name */
    public final qq f46388a;

    /* renamed from: b, reason: collision with root package name */
    public final String f46389b;

    /* renamed from: c, reason: collision with root package name */
    public final float f46390c;

    /* renamed from: d, reason: collision with root package name */
    public final float f46391d;

    /* renamed from: e, reason: collision with root package name */
    public final RectF f46392e;

    /* renamed from: f, reason: collision with root package name */
    public final v1 f46393f;

    /* renamed from: g, reason: collision with root package name */
    public final yt0.e f46394g;

    /* renamed from: h, reason: collision with root package name */
    public final yt0.f f46395h;

    /* renamed from: i, reason: collision with root package name */
    public final o1 f46396i;

    /* renamed from: j, reason: collision with root package name */
    public final xk2.v f46397j;

    /* renamed from: k, reason: collision with root package name */
    public final xk2.v f46398k;

    /* renamed from: l, reason: collision with root package name */
    public final float f46399l;

    /* renamed from: m, reason: collision with root package name */
    public final u2 f46400m;

    /* renamed from: n, reason: collision with root package name */
    public final xk2.v f46401n;

    /* renamed from: o, reason: collision with root package name */
    public final Paint f46402o;

    /* renamed from: p, reason: collision with root package name */
    public final xk2.v f46403p;

    /* renamed from: q, reason: collision with root package name */
    public String f46404q;

    /* renamed from: r, reason: collision with root package name */
    public String f46405r;

    /* renamed from: s, reason: collision with root package name */
    public dl1.s f46406s;

    /* renamed from: t, reason: collision with root package name */
    public Matrix f46407t;

    /* renamed from: u, reason: collision with root package name */
    public float f46408u;

    /* renamed from: v, reason: collision with root package name */
    public final Bitmap f46409v;

    /* renamed from: w, reason: collision with root package name */
    public final String f46410w;

    /* renamed from: x, reason: collision with root package name */
    public final uq f46411x;

    /* renamed from: y, reason: collision with root package name */
    public final String f46412y;

    /* renamed from: z, reason: collision with root package name */
    public final xk2.v f46413z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(Context context, a2 tagType, qq overlayBlock, String tagText, float f13, float f14, RectF tagMovementBounds, v1 v1Var, yt0.e eVar, yt0.f fVar, o1 o1Var) {
        super(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(tagType, "tagType");
        Intrinsics.checkNotNullParameter(overlayBlock, "overlayBlock");
        Intrinsics.checkNotNullParameter(tagText, "tagText");
        Intrinsics.checkNotNullParameter(tagMovementBounds, "tagMovementBounds");
        this.f46388a = overlayBlock;
        this.f46389b = tagText;
        this.f46390c = f13;
        this.f46391d = f14;
        this.f46392e = tagMovementBounds;
        this.f46393f = v1Var;
        this.f46394g = eVar;
        this.f46395h = fVar;
        this.f46396i = o1Var;
        this.f46397j = xk2.m.b(l0.f46222m);
        int i13 = 1;
        this.f46398k = xk2.m.b(new y0(this, i13));
        float f15 = (f13 / hf0.b.f69001a) / 375;
        this.f46399l = f15;
        u2 tagSpec = tagType.tagSpec(context);
        u2 a13 = u2.a(tagSpec, ml2.c.c(tagSpec.f46329a * f15), ml2.c.c(tagSpec.f46330b * f15), ml2.c.c(tagSpec.f46331c * f15), tagSpec.f46332d * f15, ml2.c.c(tagSpec.f46333e * f15), ml2.c.c(tagSpec.f46334f * f15), null, 0, 448);
        this.f46400m = a13;
        xk2.v b13 = xk2.m.b(new y0(this, 3));
        this.f46401n = b13;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.f46402o = paint;
        this.f46403p = xk2.m.b(new y0(this, 2));
        this.f46407t = new Matrix();
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        setScaleType(ImageView.ScaleType.MATRIX);
        setTag(aq1.d.idea_pin_tag_id, overlayBlock.getConfig().getId());
        String colorHex = overlayBlock.getConfig().getColorHex();
        ((TextPaint) b13.getValue()).setColor(Color.parseColor(kh2.m2.V0(colorHex)));
        paint.setColor(Color.parseColor(colorHex));
        Bitmap g23 = g2();
        this.f46409v = g23;
        setImageBitmap(g23);
        Matrix matrix = overlayBlock.getConfig().getMatrix();
        int i14 = 0;
        if (matrix == null) {
            matrix = new Matrix();
            matrix.postScale(1.0f, 1.0f);
            matrix.postTranslate((f13 - g23.getWidth()) / 2, (f14 - g23.getHeight()) * 0.5f);
        } else {
            i13 = 0;
        }
        setImageMatrix(matrix);
        this.f46407t = matrix;
        if (i13 != 0) {
            RectF rectF = new RectF(0.0f, 0.0f, g23.getWidth(), g23.getHeight());
            if (o1Var != null) {
                String id3 = overlayBlock.getConfig().getId();
                Matrix matrix2 = this.f46407t;
                ((f0) o1Var).L0(id3, matrix2, ig1.b.J0(matrix2, rectF));
            }
        }
        this.f46410w = overlayBlock.getConfig().getId();
        this.f46411x = tagType.getOverlayType();
        this.f46412y = k2(a13.f46337i, tagText);
        this.f46413z = xk2.m.b(new y0(this, i14));
    }

    public static String k2(Integer num, String str) {
        if (num == null || str.length() <= num.intValue()) {
            return str;
        }
        String substring = str.substring(0, 17);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring + "...";
    }

    @Override // com.pinterest.feature.ideaPinCreation.closeup.view.a
    public final RectF C() {
        return this.f46392e;
    }

    @Override // com.pinterest.feature.ideaPinCreation.closeup.view.a
    public final float D() {
        return this.f46390c;
    }

    @Override // com.pinterest.feature.ideaPinCreation.closeup.view.b
    public final void H1(String str, String str2, dl1.s sVar) {
        this.f46405r = str;
        this.f46404q = str2;
        this.f46406s = sVar;
    }

    @Override // com.pinterest.feature.ideaPinCreation.closeup.view.g1
    public final Path I0() {
        return (Path) this.f46413z.getValue();
    }

    @Override // com.pinterest.feature.ideaPinCreation.closeup.view.b
    public final dl1.s L() {
        return this.f46406s;
    }

    @Override // com.pinterest.feature.ideaPinCreation.closeup.view.g1
    public final String L0() {
        return this.f46412y;
    }

    @Override // com.pinterest.feature.ideaPinCreation.closeup.view.m1
    public final float S0(float f13, Matrix viewMatrix) {
        Intrinsics.checkNotNullParameter(viewMatrix, "viewMatrix");
        float b03 = ig1.b.b0(viewMatrix);
        return ql2.s.f(f13 * b03, 0.75f, Math.min(1.75f, this.f46408u)) / b03;
    }

    @Override // com.pinterest.feature.ideaPinCreation.closeup.view.a
    public final float T() {
        return this.f46391d;
    }

    @Override // fu0.i
    public final boolean T0() {
        return true;
    }

    @Override // com.pinterest.feature.ideaPinCreation.closeup.view.g1
    public final String X1() {
        return this.f46410w;
    }

    @Override // com.pinterest.feature.ideaPinCreation.closeup.view.g1
    public final uq a0() {
        return this.f46411x;
    }

    @Override // fu0.i
    public final void d0() {
        i2().g();
    }

    @Override // com.pinterest.feature.ideaPinCreation.closeup.view.l1
    public final void d2(Matrix viewMatrix) {
        Intrinsics.checkNotNullParameter(viewMatrix, "viewMatrix");
        this.f46407t.set(viewMatrix);
    }

    @Override // fu0.i
    public final void e(MotionEvent ev2) {
        Intrinsics.checkNotNullParameter(ev2, "ev");
        i2().b(ev2);
    }

    public final Bitmap f2(String str, TextPaint textPaint, Paint paint, u2 u2Var) {
        Object next;
        Rect bounds;
        Rect bounds2;
        int i13 = u2Var.f46329a;
        String k23 = k2(u2Var.f46337i, str);
        RectF rectF = this.f46392e;
        int i14 = i13 * 2;
        int width = ((int) rectF.width()) - i14;
        StaticLayout z13 = com.bumptech.glide.d.z(k23, k23.length(), textPaint, width, Layout.Alignment.ALIGN_NORMAL, TextUtils.TruncateAt.END, width, u2Var.f46336h);
        int i15 = 0;
        ql2.k it = ql2.s.q(0, z13.getLineCount()).iterator();
        Drawable drawable = null;
        if (it.f104109c) {
            next = it.next();
            if (it.f104109c) {
                float lineWidth = z13.getLineWidth(((Number) next).intValue());
                do {
                    Object next2 = it.next();
                    float lineWidth2 = z13.getLineWidth(((Number) next2).intValue());
                    if (Float.compare(lineWidth, lineWidth2) < 0) {
                        next = next2;
                        lineWidth = lineWidth2;
                    }
                } while (it.f104109c);
            }
        } else {
            next = null;
        }
        Integer num = (Integer) next;
        int c13 = ml2.c.c(Math.min(num == null ? 0.0f : z13.getLineWidth(num.intValue()), rectF.width()));
        Integer num2 = u2Var.f46335g;
        if (num2 != null) {
            int intValue = num2.intValue();
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            drawable = bs1.c.c0(context, intValue);
            drawable.setBounds(0, 0, u2Var.f46333e, u2Var.f46334f);
        }
        int width2 = (drawable == null || (bounds2 = drawable.getBounds()) == null) ? 0 : bounds2.width();
        if (drawable != null && (bounds = drawable.getBounds()) != null) {
            i15 = bounds.height();
        }
        int i16 = drawable != null ? c13 + width2 + i14 + u2Var.f46331c : c13 + i14;
        int i17 = u2Var.f46330b;
        int max = (i17 * 2) + (drawable != null ? Math.max(i15, z13.getHeight()) : z13.getHeight());
        Bitmap createBitmap = Bitmap.createBitmap(i16, max, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        float f13 = i16;
        this.f46408u = rectF.width() / f13;
        Canvas canvas = new Canvas(createBitmap);
        float f14 = u2Var.f46332d;
        canvas.drawRoundRect(0.0f, 0.0f, f13, max, f14, f14, paint);
        if (drawable != null) {
            float f15 = (max - i15) / 2.0f;
            canvas.translate(i13, f15);
            drawable.setTint(textPaint.getColor());
            drawable.draw(canvas);
            canvas.translate(r9 + width2, ((max - z13.getHeight()) / 2.0f) - f15);
        } else {
            canvas.translate(i13, i17);
        }
        z13.draw(canvas);
        return createBitmap;
    }

    public final Bitmap g2() {
        return f2(this.f46389b, (TextPaint) this.f46401n.getValue(), this.f46402o, this.f46400m);
    }

    @Override // fu0.i
    public final void i(MotionEvent ev2) {
        Intrinsics.checkNotNullParameter(ev2, "ev");
        i2().c(ev2);
    }

    public final n1 i2() {
        return (n1) this.f46403p.getValue();
    }

    @Override // fu0.i
    public final void l(MotionEvent ev2) {
        Intrinsics.checkNotNullParameter(ev2, "ev");
        i2().d(ev2);
    }

    @Override // fu0.i
    public final boolean n(MotionEvent ev2) {
        Intrinsics.checkNotNullParameter(ev2, "ev");
        return getVisibility() == 0 && i2().j(ev2);
    }

    @Override // fu0.i
    public final void o(MotionEvent ev2) {
        Intrinsics.checkNotNullParameter(ev2, "ev");
        i2().e(ev2);
    }

    @Override // fu0.i
    public final void q(MotionEvent ev2) {
        Intrinsics.checkNotNullParameter(ev2, "ev");
        i2().f(ev2);
    }

    @Override // com.pinterest.feature.ideaPinCreation.closeup.view.g1
    public final qq r0() {
        return this.f46388a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0034  */
    @Override // com.pinterest.feature.ideaPinCreation.closeup.view.m1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.PointF r1(float r7, float r8, android.graphics.Matrix r9) {
        /*
            r6 = this;
            java.lang.String r0 = "viewMatrix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>(r9)
            r0.postTranslate(r7, r8)
            android.graphics.Path r9 = r6.I0()
            android.graphics.RectF r9 = kh2.p2.S(r0, r9)
            float r0 = r9.left
            android.graphics.RectF r1 = r6.f46392e
            float r2 = r1.left
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r4 = 0
            if (r3 >= 0) goto L22
        L20:
            float r2 = r2 - r0
            goto L2c
        L22:
            float r0 = r9.right
            float r2 = r1.right
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 <= 0) goto L2b
            goto L20
        L2b:
            r2 = r4
        L2c:
            float r0 = r9.top
            float r3 = r1.top
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 >= 0) goto L37
            float r4 = r3 - r0
            goto L41
        L37:
            float r9 = r9.bottom
            float r0 = r1.bottom
            int r1 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r1 <= 0) goto L41
            float r4 = r0 - r9
        L41:
            android.graphics.PointF r9 = new android.graphics.PointF
            float r7 = r7 + r2
            float r8 = r8 + r4
            r9.<init>(r7, r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.feature.ideaPinCreation.closeup.view.z0.r1(float, float, android.graphics.Matrix):android.graphics.PointF");
    }

    @Override // fu0.i
    public final boolean t() {
        return true;
    }

    @Override // com.pinterest.feature.ideaPinCreation.closeup.view.g1
    public final void t1(Matrix matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        setImageMatrix(matrix);
        this.f46407t = matrix;
    }

    public /* synthetic */ z0(Context context, a2 a2Var, qq qqVar, String str, float f13, float f14, RectF rectF) {
        this(context, a2Var, qqVar, str, f13, f14, rectF, null, null, null, null);
    }
}
