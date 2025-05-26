package va2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.text.StaticLayout;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import rm1.q;

/* loaded from: classes4.dex */
public final class g extends wa2.l {

    /* renamed from: l, reason: collision with root package name */
    public final BitmapDrawable f125347l;

    /* renamed from: m, reason: collision with root package name */
    public final l f125348m;

    /* renamed from: n, reason: collision with root package name */
    public final l f125349n;

    /* renamed from: o, reason: collision with root package name */
    public final Paint f125350o;

    /* renamed from: p, reason: collision with root package name */
    public final int f125351p;

    /* renamed from: q, reason: collision with root package name */
    public final RectF f125352q;

    /* renamed from: r, reason: collision with root package name */
    public final int f125353r;

    /* renamed from: s, reason: collision with root package name */
    public final int f125354s;

    /* renamed from: t, reason: collision with root package name */
    public final int f125355t;

    /* renamed from: u, reason: collision with root package name */
    public final int f125356u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, int i13) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f125347l = com.bumptech.glide.d.C(new rm1.d(new rm1.f(q.ALERT, rm1.i.LG), rm1.c.DEFAULT, null, 0, null, 28), context);
        l lVar = new l(context);
        vn1.b bVar = vn1.b.CENTER;
        lVar.m(bVar);
        tn1.c cVar = lVar.f125401m;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        cVar.a(new tn1.a(cVar, 2));
        String string = context.getResources().getString(x0.deleted_idea_pin_unavailable);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        lVar.o(string);
        this.f125348m = lVar;
        l lVar2 = new l(context);
        lVar2.m(bVar);
        lVar2.n(e0.b(vn1.e.REGULAR));
        tn1.c cVar2 = lVar2.f125401m;
        Intrinsics.checkNotNullParameter(cVar2, "<this>");
        cVar2.a(new tn1.a(cVar2, 0));
        String string2 = context.getResources().getString(x0.deleted_idea_pin_message);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        lVar2.o(string2);
        this.f125349n = lVar2;
        this.f125350o = new Paint();
        int i14 = eo1.b.color_themed_light_gray;
        Object obj = d5.a.f53679a;
        this.f125351p = context.getColor(i14);
        this.f125352q = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.f125353r = context.getResources().getDimensionPixelSize(i13);
        this.f125354s = context.getResources().getDimensionPixelOffset(eo1.c.space_100);
        this.f125355t = context.getResources().getDimensionPixelOffset(eo1.c.space_400);
        this.f125356u = context.getResources().getDimensionPixelOffset(eo1.c.space_500);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        l lVar = this.f125348m;
        int i13 = lVar.f128842e;
        l lVar2 = this.f125349n;
        int i14 = lVar2.f128842e;
        BitmapDrawable bitmapDrawable = this.f125347l;
        int intrinsicHeight = bitmapDrawable.getIntrinsicHeight() + i13 + i14;
        int i15 = this.f125354s;
        int i16 = this.f125355t;
        int i17 = (this.f128842e - ((intrinsicHeight + i15) + i16)) / 2;
        Paint paint = this.f125350o;
        paint.setColor(this.f125351p);
        RectF rectF = this.f125352q;
        rectF.set(0.0f, 0.0f, this.f128841d, this.f128842e);
        float f13 = this.f125353r;
        canvas.drawRoundRect(rectF, f13, f13, paint);
        int i18 = this.f128841d;
        int i19 = this.f125356u;
        int i23 = (i18 - i19) / 2;
        bitmapDrawable.setBounds(i23, i17, i19 + i23, i19 + i17);
        bitmapDrawable.draw(canvas);
        int i24 = bitmapDrawable.getBounds().bottom + i16;
        lVar.k();
        StaticLayout staticLayout = lVar.f125410v;
        lVar.setBounds(0, i24, staticLayout != null ? staticLayout.getWidth() : 0, i13 + i24);
        lVar.draw(canvas);
        int i25 = lVar.getBounds().bottom + i15;
        lVar2.k();
        StaticLayout staticLayout2 = lVar2.f125410v;
        lVar2.setBounds(0, i25, staticLayout2 != null ? staticLayout2.getWidth() : 0, i14 + i25);
        lVar2.draw(canvas);
    }

    public final void h() {
        l lVar = this.f125348m;
        if (lVar.f125403o.length() > 0) {
            lVar.f125407s = this.f128841d;
            lVar.l();
        }
        l lVar2 = this.f125349n;
        if (lVar2.f125403o.length() > 0) {
            lVar2.f125407s = this.f128841d;
            lVar2.l();
        }
    }
}
