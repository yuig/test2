package wa2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import df.j1;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;

/* loaded from: classes4.dex */
public final class f0 extends l {

    /* renamed from: l, reason: collision with root package name */
    public final View f128695l;

    /* renamed from: m, reason: collision with root package name */
    public final int f128696m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f128697n;

    /* renamed from: o, reason: collision with root package name */
    public final d0 f128698o;

    /* renamed from: p, reason: collision with root package name */
    public final tn1.c f128699p;

    /* renamed from: q, reason: collision with root package name */
    public String f128700q;

    /* renamed from: r, reason: collision with root package name */
    public final int f128701r;

    /* renamed from: s, reason: collision with root package name */
    public final Rect f128702s;

    /* renamed from: t, reason: collision with root package name */
    public final e0 f128703t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(SbaPinRep parentView, Context context, vn1.c defaultTextColor, int i13) {
        super(context);
        Intrinsics.checkNotNullParameter(parentView, "parentView");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(defaultTextColor, "defaultTextColor");
        this.f128695l = parentView;
        this.f128696m = i13;
        this.f128697n = j1.Y0(context);
        this.f128698o = new d0(context);
        tn1.c cVar = new tn1.c(context);
        bs1.c.u(cVar, defaultTextColor, 2);
        this.f128699p = cVar;
        this.f128700q = "";
        this.f128701r = context.getResources().getDimensionPixelSize(r0.margin_quarter);
        this.f128702s = new Rect();
        this.f128703t = e0.f128692i;
    }

    @Override // wa2.l
    public final void c() {
        super.c();
        e(0);
        this.f128700q = "";
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        d0 d0Var = this.f128698o;
        boolean z13 = this.f128697n;
        float intrinsicWidth = z13 ? getBounds().right - d0Var.getIntrinsicWidth() : this.f128696m;
        float f13 = this.f128840c;
        canvas.save();
        canvas.translate(intrinsicWidth, f13);
        d0Var.draw(canvas);
        canvas.restore();
        int i13 = this.f128701r;
        int intrinsicWidth2 = z13 ? (-this.f128702s.width()) - i13 : d0Var.getIntrinsicWidth() + i13;
        float f14 = f13 + (d0Var.f128689c / 2);
        String str = this.f128700q;
        tn1.c cVar = this.f128699p;
        canvas.drawText(str, intrinsicWidth + intrinsicWidth2, f14 - ((cVar.descent() + cVar.ascent()) / 2), cVar);
    }

    @Override // wa2.l, android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f128698o.getIntrinsicWidth() + this.f128702s.width() + this.f128701r;
    }
}
