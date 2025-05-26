package wa2;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class t extends l {

    /* renamed from: l, reason: collision with root package name */
    public final Context f128930l;

    /* renamed from: m, reason: collision with root package name */
    public final int f128931m;

    /* renamed from: n, reason: collision with root package name */
    public final int f128932n;

    /* renamed from: o, reason: collision with root package name */
    public tn1.c f128933o;

    /* renamed from: p, reason: collision with root package name */
    public final int f128934p;

    /* renamed from: q, reason: collision with root package name */
    public final BitmapDrawable f128935q;

    /* renamed from: r, reason: collision with root package name */
    public final BitmapDrawable f128936r;

    /* renamed from: s, reason: collision with root package name */
    public final BitmapDrawable f128937s;

    /* renamed from: t, reason: collision with root package name */
    public int f128938t;

    /* renamed from: u, reason: collision with root package name */
    public float f128939u;

    /* renamed from: v, reason: collision with root package name */
    public StaticLayout f128940v;

    /* renamed from: w, reason: collision with root package name */
    public String f128941w;

    /* renamed from: x, reason: collision with root package name */
    public int f128942x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(Context context, int i13) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f128930l = context;
        this.f128931m = i13;
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        this.f128932n = resources.getDimensionPixelSize(eo1.c.pin_rating_spacer);
        this.f128933o = new tn1.c(context, new tn1.b(vn1.c.DEFAULT, (List) null, vn1.g.BODY_100, 6));
        int dimensionPixelSize = resources.getDimensionPixelSize(eo1.c.pin_rating_default_icon_size);
        this.f128934p = dimensionPixelSize;
        rm1.q qVar = rm1.q.STAR_OUTLINE;
        rm1.i iVar = rm1.i.XS;
        BitmapDrawable C = com.bumptech.glide.d.C(new rm1.d(new rm1.f(qVar, iVar), null, null, 0, null, 30), context);
        C.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        this.f128935q = C;
        BitmapDrawable C2 = com.bumptech.glide.d.C(new rm1.d(new rm1.f(rm1.q.STAR, iVar), null, null, 0, null, 30), context);
        C2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        this.f128936r = C2;
        BitmapDrawable C3 = com.bumptech.glide.d.C(new rm1.d(new rm1.f(rm1.q.STAR_HALF, iVar), null, null, 0, null, 30), context);
        C3.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        this.f128937s = C3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int i13 = this.f128840c;
        canvas.save();
        StaticLayout staticLayout = this.f128940v;
        int height = staticLayout != null ? staticLayout.getHeight() : 0;
        int i14 = this.f128934p;
        float f13 = height > i14 ? (height - i14) / 2.0f : 0.0f;
        float f14 = this.f128931m;
        canvas.translate(f14, i13 + f13);
        double c13 = ml2.c.c((this.f128939u - 1.0f) * 2.0f) / 2.0f;
        int i15 = this.f128932n;
        int i16 = (i15 * 2) + i14;
        int i17 = 0;
        while (i17 < 5) {
            double d2 = i17;
            boolean z13 = d2 <= c13;
            float f15 = f14;
            boolean z14 = c13 > ((double) (i17 + (-1))) && c13 < d2;
            if (z13) {
                BitmapDrawable bitmapDrawable = this.f128936r;
                if (bitmapDrawable != null) {
                    bitmapDrawable.draw(canvas);
                }
            } else if (z14) {
                BitmapDrawable bitmapDrawable2 = this.f128937s;
                if (bitmapDrawable2 != null) {
                    bitmapDrawable2.draw(canvas);
                }
            } else {
                BitmapDrawable bitmapDrawable3 = this.f128935q;
                if (bitmapDrawable3 != null) {
                    bitmapDrawable3.draw(canvas);
                }
            }
            canvas.translate(i16 + i15, 0.0f);
            i17++;
            f14 = f15;
        }
        float f16 = f14;
        float f17 = 0.0f;
        if (this.f128938t != 0) {
            canvas.restore();
            canvas.save();
            canvas.translate(f16, i13 + this.f128938t);
        } else {
            f17 = f13;
        }
        float f18 = -f17;
        canvas.translate(i15, f18);
        StaticLayout staticLayout2 = this.f128940v;
        if (staticLayout2 != null) {
            staticLayout2.draw(canvas);
        }
        canvas.translate(this.f128942x, f18);
        canvas.restore();
    }

    public final void h() {
        tn1.c cVar = this.f128933o;
        this.f128942x = (int) cVar.measureText(this.f128941w);
        String str = this.f128941w;
        String str2 = str == null ? "" : str;
        int length = str != null ? str.length() : 0;
        int i13 = this.f128841d;
        StaticLayout z13 = com.bumptech.glide.d.z(str2, length, cVar, i13, Layout.Alignment.ALIGN_NORMAL, TextUtils.TruncateAt.END, i13, 1);
        this.f128940v = z13;
        int height = z13 != null ? z13.getHeight() : 0;
        int i14 = this.f128934p;
        int max = Math.max(height, i14);
        int i15 = this.f128932n;
        if (((i14 + i15) * 5) + this.f128942x + i15 > Math.max(l.f128836j, this.f128841d - (this.f128931m * 2))) {
            this.f128938t = max + i15;
            StaticLayout staticLayout = this.f128940v;
            max += i15 + (staticLayout != null ? staticLayout.getHeight() : 0);
        }
        e(max);
    }

    public final void i(float f13, Integer num, vn1.c color) {
        Intrinsics.checkNotNullParameter(color, "color");
        this.f128939u = f13;
        this.f128941w = String.valueOf(num);
        this.f128938t = 0;
        tn1.b bVar = new tn1.b(color, (List) null, vn1.g.BODY_100, 6);
        Context context = this.f128930l;
        this.f128933o = new tn1.c(context, bVar);
        if (color != vn1.c.DEFAULT) {
            Intrinsics.checkNotNullParameter(color, "color");
            int i13 = n.f128896a[color.ordinal()];
            int A = bs1.c.A(context, i13 != 1 ? i13 != 2 ? eo1.b.color_themed_text_default : eo1.b.color_themed_text_default : eo1.b.color_themed_text_light);
            this.f128937s.setTint(A);
            this.f128935q.setTint(A);
            this.f128936r.setTint(A);
        }
    }
}
