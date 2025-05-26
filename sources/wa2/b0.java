package wa2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;

/* loaded from: classes4.dex */
public final class b0 extends l {

    /* renamed from: l, reason: collision with root package name */
    public final Context f128667l;

    /* renamed from: m, reason: collision with root package name */
    public final int f128668m;

    /* renamed from: n, reason: collision with root package name */
    public CharSequence f128669n;

    /* renamed from: o, reason: collision with root package name */
    public CharSequence f128670o;

    /* renamed from: p, reason: collision with root package name */
    public final tn1.c f128671p;

    /* renamed from: q, reason: collision with root package name */
    public final tn1.c f128672q;

    /* renamed from: r, reason: collision with root package name */
    public StaticLayout f128673r;

    /* renamed from: s, reason: collision with root package name */
    public StaticLayout f128674s;

    /* renamed from: t, reason: collision with root package name */
    public final Paint f128675t;

    /* renamed from: u, reason: collision with root package name */
    public final RectF f128676u;

    /* renamed from: v, reason: collision with root package name */
    public final float f128677v;

    /* renamed from: w, reason: collision with root package name */
    public float f128678w;

    /* renamed from: x, reason: collision with root package name */
    public float f128679x;

    /* renamed from: y, reason: collision with root package name */
    public float f128680y;

    /* renamed from: z, reason: collision with root package name */
    public float f128681z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f128667l = context;
        this.f128668m = context.getResources().getDimensionPixelSize(r0.margin_quarter);
        this.f128669n = "";
        this.f128670o = "";
        vn1.g gVar = vn1.g.BODY_100;
        vn1.c cVar = vn1.c.LIGHT;
        this.f128671p = new tn1.c(context, new tn1.b(cVar, kotlin.collections.e0.b(vn1.e.BOLD), gVar, 2));
        this.f128672q = new tn1.c(context, new tn1.b(cVar, (List) null, gVar, 6));
        Paint paint = new Paint(1);
        paint.setColor(dl2.b.x0(context, eo1.a.color_background_dark_opacity_300));
        this.f128675t = paint;
        this.f128676u = new RectF();
        this.f128677v = context.getResources().getDimension(r0.margin_half);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.f128669n.length() == 0 && this.f128670o.length() == 0) {
            return;
        }
        RectF rectF = this.f128676u;
        rectF.set(this.f128839b, this.f128840c, r1 + this.f128841d, r3 + this.f128842e);
        float f13 = this.f128678w;
        canvas.drawRoundRect(rectF, f13, f13, this.f128675t);
        canvas.save();
        canvas.translate(this.f128679x, this.f128680y);
        StaticLayout staticLayout = this.f128673r;
        if (staticLayout != null) {
            staticLayout.draw(canvas);
        }
        canvas.translate(0.0f, this.f128681z);
        StaticLayout staticLayout2 = this.f128674s;
        if (staticLayout2 != null) {
            staticLayout2.draw(canvas);
        }
        canvas.restore();
    }

    public final void h() {
        int i13 = this.f128841d;
        int i14 = this.f128668m;
        float f13 = this.f128677v;
        int i15 = (i13 - (i14 * 2)) - ((int) (2 * f13));
        CharSequence charSequence = this.f128669n;
        int length = charSequence.length();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        this.f128673r = com.bumptech.glide.d.z(charSequence, length, this.f128671p, i15, alignment, truncateAt, i15, 2);
        CharSequence charSequence2 = this.f128670o;
        this.f128674s = com.bumptech.glide.d.z(charSequence2, charSequence2.length(), this.f128672q, i15, alignment, truncateAt, i15, this.f128842e >= this.f128841d ? 4 : 2);
        this.f128679x = i14 + f13;
        this.f128680y = f13;
        this.f128681z = f13 + (this.f128673r != null ? r1.getHeight() : 0.0f);
    }
}
