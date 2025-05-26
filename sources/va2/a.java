package va2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import ql2.s;

/* loaded from: classes4.dex */
public final class a extends wa2.l {
    public final Rect A;
    public final Path B;

    /* renamed from: l, reason: collision with root package name */
    public final Context f125296l;

    /* renamed from: m, reason: collision with root package name */
    public String f125297m;

    /* renamed from: n, reason: collision with root package name */
    public int f125298n;

    /* renamed from: o, reason: collision with root package name */
    public int f125299o;

    /* renamed from: p, reason: collision with root package name */
    public int f125300p;

    /* renamed from: q, reason: collision with root package name */
    public float f125301q;

    /* renamed from: r, reason: collision with root package name */
    public final Function0 f125302r;

    /* renamed from: s, reason: collision with root package name */
    public vn1.c f125303s;

    /* renamed from: t, reason: collision with root package name */
    public int f125304t;

    /* renamed from: u, reason: collision with root package name */
    public float f125305u;

    /* renamed from: v, reason: collision with root package name */
    public float f125306v;

    /* renamed from: w, reason: collision with root package name */
    public final Rect f125307w;

    /* renamed from: x, reason: collision with root package name */
    public final Paint f125308x;

    /* renamed from: y, reason: collision with root package name */
    public final tn1.c f125309y;

    /* renamed from: z, reason: collision with root package name */
    public final Paint f125310z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, int i13, String buttonText, vn1.c buttonTextColor, int i14, int i15, int i16, int i17, float f13, Function0 function0) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        Intrinsics.checkNotNullParameter(buttonTextColor, "buttonTextColor");
        this.f125296l = context;
        this.f125297m = buttonText;
        this.f125298n = i15;
        this.f125299o = i16;
        this.f125300p = i17;
        this.f125301q = f13;
        this.f125302r = function0;
        this.f125303s = buttonTextColor;
        this.f125304t = i14;
        this.f125307w = new Rect();
        Paint paint = new Paint(1);
        paint.setColor(i13);
        paint.setAlpha(s.g(ml2.c.c(dl2.b.K0(context, eo1.a.opacity_300) * 255), 0, 255));
        this.f125308x = paint;
        tn1.c cVar = new tn1.c(context);
        bs1.c.v2(cVar, buttonTextColor, vn1.b.CENTER);
        this.f125309y = cVar;
        Paint paint2 = new Paint(1);
        paint2.setColor(i14);
        this.f125310z = paint2;
        this.A = new Rect();
        this.B = new Path();
    }

    @Override // wa2.l
    public final void c() {
        super.c();
        this.f125309y.b(this.f125303s);
        this.f125310z.setColor(this.f125304t);
        Function0 function0 = this.f125302r;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.f128846i) {
            return;
        }
        Paint paint = this.f125308x;
        int alpha = paint.getAlpha();
        Path path = this.B;
        if (alpha != 0) {
            float f13 = this.f125305u;
            float f14 = this.f125306v;
            path.reset();
            path.addRoundRect(new RectF(this.f125307w), new float[]{f13, f13, f13, f13, f14, f14, f14, f14}, Path.Direction.CW);
            canvas.drawPath(path, paint);
        }
        Paint paint2 = this.f125310z;
        int alpha2 = paint2.getAlpha();
        Rect rect = this.A;
        if (alpha2 != 0) {
            float f15 = this.f125301q;
            path.reset();
            path.addRoundRect(new RectF(rect), new float[]{f15, f15, f15, f15, f15, f15, f15, f15}, Path.Direction.CW);
            canvas.drawPath(path, paint2);
        }
        if (z.j(this.f125297m)) {
            return;
        }
        tn1.c cVar = this.f125309y;
        canvas.drawText(this.f125297m, rect.centerX(), rect.centerY() + (((cVar.descent() - cVar.ascent()) / 2) - cVar.descent()), cVar);
    }

    public final boolean h(int i13, int i14) {
        return this.A.contains(i13, i14);
    }

    public final void i() {
        int i13 = (this.f128841d - (this.f125300p * 2)) - (this.f125299o * 2);
        tn1.c cVar = this.f125309y;
        String a13 = wa2.l.a(this.f125297m, cVar, i13);
        Intrinsics.checkNotNullExpressionValue(a13, "ellipsize(...)");
        this.f125297m = a13;
        Rect rect = new Rect();
        String str = this.f125297m;
        cVar.getTextBounds(str, 0, str.length(), rect);
        int width = rect.width();
        int height = rect.height();
        int i14 = this.f125298n * 2;
        int i15 = (this.f125299o * 2) + width;
        int i16 = height + i14;
        int i17 = this.f128842e;
        int i18 = (i17 - i16) / 2;
        int i19 = this.f128841d;
        int i23 = (i19 - i15) / 2;
        setBounds(0, 0, i19, i17);
        int i24 = this.f128841d;
        int i25 = this.f128842e;
        Rect rect2 = this.f125307w;
        rect2.left = 0;
        rect2.top = 0;
        rect2.right = i24;
        rect2.bottom = i25;
        Rect rect3 = this.A;
        rect3.left = i23;
        rect3.top = i18;
        rect3.right = i15 + i23;
        rect3.bottom = i16 + i18;
    }
}
