package va2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import kotlin.jvm.internal.Intrinsics;
import m60.q0;
import m60.r0;
import rm1.q;
import xk2.v;

/* loaded from: classes4.dex */
public final class h extends wa2.l {

    /* renamed from: l, reason: collision with root package name */
    public final Context f125357l;

    /* renamed from: m, reason: collision with root package name */
    public final int f125358m;

    /* renamed from: n, reason: collision with root package name */
    public int f125359n;

    /* renamed from: o, reason: collision with root package name */
    public int f125360o;

    /* renamed from: p, reason: collision with root package name */
    public int f125361p;

    /* renamed from: q, reason: collision with root package name */
    public final RectF f125362q;

    /* renamed from: r, reason: collision with root package name */
    public BitmapDrawable f125363r;

    /* renamed from: s, reason: collision with root package name */
    public StaticLayout f125364s;

    /* renamed from: t, reason: collision with root package name */
    public float f125365t;

    /* renamed from: u, reason: collision with root package name */
    public float f125366u;

    /* renamed from: v, reason: collision with root package name */
    public CharSequence f125367v;

    /* renamed from: w, reason: collision with root package name */
    public final tn1.c f125368w;

    /* renamed from: x, reason: collision with root package name */
    public final Paint f125369x;

    /* renamed from: y, reason: collision with root package name */
    public final v f125370y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f125357l = context;
        this.f125358m = context.getResources().getDimensionPixelSize(r0.margin_quarter);
        this.f125362q = new RectF();
        tn1.c cVar = new tn1.c(context);
        bs1.c.v2(cVar, vn1.c.LIGHT, tn1.c.f118615g);
        this.f125368w = cVar;
        Paint paint = new Paint(1);
        paint.setColor(dl2.b.x0(context, eo1.a.color_background_dark_opacity_300));
        this.f125369x = paint;
        this.f125370y = xk2.m.b(new c72.o(this, 16));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        CharSequence charSequence = this.f125367v;
        if (charSequence == null) {
            Intrinsics.r("description");
            throw null;
        }
        if (charSequence.length() == 0 || this.f128846i) {
            return;
        }
        RectF rectF = this.f125362q;
        rectF.set(this.f128839b, this.f128840c, r3 + this.f128841d, r5 + this.f128842e);
        canvas.save();
        float f13 = this.f125365t;
        float f14 = this.f125366u;
        Paint paint = this.f125369x;
        float[] fArr = {f13, f13, f13, f13, f14, f14, f14, f14};
        Path path = new Path();
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas.drawPath(path, paint);
        BitmapDrawable bitmapDrawable = this.f125363r;
        if (bitmapDrawable != null) {
            int i13 = this.f125359n;
            int i14 = this.f125361p;
            bitmapDrawable.setBounds(i13, i14, bitmapDrawable.getIntrinsicWidth() + i13, bitmapDrawable.getIntrinsicHeight() + i14);
            bitmapDrawable.draw(canvas);
        }
        canvas.translate(this.f125359n, 0);
        canvas.translate((this.f125363r != null ? r1.getIntrinsicWidth() : 0) + this.f125358m + ((Number) this.f125370y.getValue()).intValue(), this.f125360o);
        StaticLayout staticLayout = this.f125364s;
        if (staticLayout == null) {
            Intrinsics.r("descriptionLayout");
            throw null;
        }
        staticLayout.draw(canvas);
        canvas.restore();
    }

    public final void h() {
        this.f128846i = true;
        invalidateSelf();
    }

    public final void i() {
        int i13 = this.f128841d;
        int i14 = this.f125358m;
        v vVar = this.f125370y;
        int intValue = (i13 - (i14 * 2)) - (((Number) vVar.getValue()).intValue() * 2);
        CharSequence charSequence = this.f125367v;
        if (charSequence == null) {
            Intrinsics.r("description");
            throw null;
        }
        this.f125364s = com.bumptech.glide.d.z(charSequence, charSequence.length(), this.f125368w, intValue, Layout.Alignment.ALIGN_NORMAL, TextUtils.TruncateAt.END, intValue, 2);
        this.f125359n = (((Number) vVar.getValue()).intValue() + i14) * 2;
        int i15 = this.f128842e / 2;
        StaticLayout staticLayout = this.f125364s;
        if (staticLayout == null) {
            Intrinsics.r("descriptionLayout");
            throw null;
        }
        this.f125360o = i15 - (staticLayout.getHeight() / 2);
        int i16 = this.f128842e / 2;
        BitmapDrawable bitmapDrawable = this.f125363r;
        this.f125361p = i16 - ((bitmapDrawable != null ? bitmapDrawable.getIntrinsicWidth() : 0) / 2);
    }

    public final void j(float f13) {
        this.f125366u = f13;
    }

    public final void k(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<set-?>");
        this.f125367v = charSequence;
    }

    public final void l(float f13) {
        this.f125365t = f13;
    }

    public final void m() {
        vn1.c cVar = vn1.c.LIGHT;
        int i13 = q0.video_end_frame;
        this.f125368w.b(cVar);
        Paint paint = this.f125369x;
        Object obj = d5.a.f53679a;
        Context context = this.f125357l;
        paint.setColor(context.getColor(i13));
        this.f125363r = pm1.a.b(context, new om1.c(q.REFRESH, om1.e.SM, om1.f.DEFAULT_ALWAYS_LIGHT, null, null, false, 0, 1016));
        this.f128846i = false;
        invalidateSelf();
        i();
    }
}
