package va2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import rm1.q;

/* loaded from: classes4.dex */
public final class i extends wa2.l {

    /* renamed from: l, reason: collision with root package name */
    public final Context f125371l;

    /* renamed from: m, reason: collision with root package name */
    public final Function0 f125372m;

    /* renamed from: n, reason: collision with root package name */
    public final int f125373n;

    /* renamed from: o, reason: collision with root package name */
    public final BitmapDrawable f125374o;

    /* renamed from: p, reason: collision with root package name */
    public final BitmapDrawable f125375p;

    /* renamed from: q, reason: collision with root package name */
    public Drawable f125376q;

    /* renamed from: r, reason: collision with root package name */
    public final xk2.k f125377r;

    /* renamed from: s, reason: collision with root package name */
    public final Rect f125378s;

    /* renamed from: t, reason: collision with root package name */
    public String f125379t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context, c72.o reuseListener) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(reuseListener, "reuseListener");
        this.f125371l = context;
        this.f125372m = reuseListener;
        this.f125373n = context.getResources().getDimensionPixelOffset(eo1.c.space_100);
        this.f125374o = com.bumptech.glide.d.C(new rm1.d(new rm1.f(q.STAR), null, null, 0, null, 30), context);
        BitmapDrawable C = com.bumptech.glide.d.C(new rm1.d(new rm1.f(q.STAR_OUTLINE), null, null, 0, null, 30), context);
        this.f125375p = C;
        this.f125376q = C;
        this.f125377r = xk2.m.a(xk2.n.NONE, new c72.o(this, 17));
        this.f125378s = new Rect();
        this.f125379t = "";
    }

    @Override // wa2.l
    public final void c() {
        super.c();
        this.f125376q = this.f125375p;
        this.f125379t = "";
        this.f125372m.invoke();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int centerY = getBounds().centerY();
        int intrinsicHeight = this.f125376q.getIntrinsicHeight() / 2;
        this.f125376q.setBounds(this.f128838a ? getBounds().left : getBounds().right - this.f125376q.getIntrinsicWidth(), centerY - intrinsicHeight, this.f128838a ? this.f125376q.getIntrinsicWidth() + getBounds().left : getBounds().right, intrinsicHeight + centerY);
        this.f125376q.draw(canvas);
        if (!z.j(this.f125379t)) {
            xk2.k kVar = this.f125377r;
            tn1.c cVar = (tn1.c) kVar.getValue();
            String str = this.f125379t;
            cVar.getTextBounds(str, 0, str.length(), this.f125378s);
            boolean z13 = this.f128838a;
            int i13 = this.f125373n;
            canvas.drawText(this.f125379t, z13 ? r5 + i13 : (r3 - i13) - r9.width(), centerY - ((((tn1.c) kVar.getValue()).descent() + ((tn1.c) kVar.getValue()).ascent()) / 2), (tn1.c) kVar.getValue());
        }
    }
}
