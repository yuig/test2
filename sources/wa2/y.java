package wa2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import com.pinterest.ui.grid.LegoPinGridCellImpl;
import df.j1;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;

/* loaded from: classes4.dex */
public final class y extends l {

    /* renamed from: l, reason: collision with root package name */
    public final View f128954l;

    /* renamed from: m, reason: collision with root package name */
    public final int f128955m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f128956n;

    /* renamed from: o, reason: collision with root package name */
    public final u f128957o;

    /* renamed from: p, reason: collision with root package name */
    public final tn1.c f128958p;

    /* renamed from: q, reason: collision with root package name */
    public String f128959q;

    /* renamed from: r, reason: collision with root package name */
    public final int f128960r;

    /* renamed from: s, reason: collision with root package name */
    public final Rect f128961s;

    /* renamed from: t, reason: collision with root package name */
    public String f128962t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(LegoPinGridCellImpl parentView, Context context, vn1.c defaultTextColor, int i13) {
        super(context);
        Intrinsics.checkNotNullParameter(parentView, "parentView");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(defaultTextColor, "defaultTextColor");
        this.f128954l = parentView;
        this.f128955m = i13;
        this.f128956n = j1.Y0(context);
        this.f128957o = new u(context);
        tn1.c cVar = new tn1.c(context);
        bs1.c.u(cVar, defaultTextColor, 2);
        this.f128958p = cVar;
        this.f128959q = "";
        this.f128960r = context.getResources().getDimensionPixelSize(r0.margin_quarter);
        this.f128961s = new Rect();
    }

    @Override // wa2.l
    public final void c() {
        super.c();
        e(0);
        this.f128959q = "";
        this.f128962t = null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        u uVar = this.f128957o;
        boolean z13 = this.f128956n;
        float intrinsicWidth = z13 ? getBounds().right - uVar.getIntrinsicWidth() : this.f128955m;
        float f13 = this.f128840c;
        canvas.save();
        canvas.translate(intrinsicWidth, f13);
        uVar.draw(canvas);
        canvas.restore();
        int i13 = this.f128960r;
        int intrinsicWidth2 = z13 ? (-this.f128961s.width()) - i13 : uVar.getIntrinsicWidth() + i13;
        float f14 = f13 + (uVar.f128945c / 2);
        String str = this.f128959q;
        tn1.c cVar = this.f128958p;
        canvas.drawText(str, intrinsicWidth + intrinsicWidth2, f14 - ((cVar.descent() + cVar.ascent()) / 2), cVar);
    }

    @Override // wa2.l, android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f128957o.getIntrinsicWidth() + this.f128961s.width() + this.f128960r;
    }

    public final void h(int i13, v32.c reactionByMe, Map reactions) {
        Intrinsics.checkNotNullParameter(reactions, "reactions");
        Intrinsics.checkNotNullParameter(reactionByMe, "reactionByMe");
        u.a(this.f128957o, reactions, reactionByMe, true, 8);
        qb0.j jVar = qb0.j.f103407a;
        qb0.j.c(i13, new ha2.j(this, 7));
    }
}
