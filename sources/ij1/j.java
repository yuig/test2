package ij1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.view.View;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import nx.r0;
import ps0.y;
import rm1.q;

/* loaded from: classes2.dex */
public final class j extends wa2.l {
    public static final /* synthetic */ int B = 0;
    public BitmapDrawable A;

    /* renamed from: l, reason: collision with root package name */
    public final View f72356l;

    /* renamed from: m, reason: collision with root package name */
    public rl1.c f72357m;

    /* renamed from: n, reason: collision with root package name */
    public final Context f72358n;

    /* renamed from: o, reason: collision with root package name */
    public o f72359o;

    /* renamed from: p, reason: collision with root package name */
    public TextDirectionHeuristic f72360p;

    /* renamed from: q, reason: collision with root package name */
    public int f72361q;

    /* renamed from: r, reason: collision with root package name */
    public final xk2.k f72362r;

    /* renamed from: s, reason: collision with root package name */
    public final tn1.c f72363s;

    /* renamed from: t, reason: collision with root package name */
    public final tn1.c f72364t;

    /* renamed from: u, reason: collision with root package name */
    public final int f72365u;

    /* renamed from: v, reason: collision with root package name */
    public int f72366v;

    /* renamed from: w, reason: collision with root package name */
    public int f72367w;

    /* renamed from: x, reason: collision with root package name */
    public int f72368x;

    /* renamed from: y, reason: collision with root package name */
    public StaticLayout f72369y;

    /* renamed from: z, reason: collision with root package name */
    public StaticLayout f72370z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(View parentView) {
        super(parentView.getContext());
        Intrinsics.checkNotNullParameter(parentView, "parentView");
        this.f72356l = parentView;
        Context context = parentView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.f72358n = context;
        k kVar = k.f72371a;
        h hVar = new h(kVar, kVar, 4, vn1.h.f126277c);
        a aVar = new a();
        this.f72359o = new o(hVar, aVar, true, false, false, true, e.f72347a);
        this.f72360p = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        this.f72361q = dl2.b.F0(context, aVar.f72344d.getValue());
        this.f72362r = xk2.m.a(xk2.n.NONE, new r0(this, 14));
        vn1.g gVar = vn1.g.BODY_100;
        y yVar = tn1.c.f118612d;
        this.f72363s = new tn1.c(context, new tn1.b(yVar.b(), tn1.c.f118618j, gVar, 2));
        this.f72364t = new tn1.c(context, new tn1.b(yVar.b(), (List) null, gVar, 6));
        this.f72365u = context.getResources().getDimensionPixelSize(m60.r0.lego_grid_cell_text_padding);
        this.A = com.bumptech.glide.d.C(new rm1.d(new rm1.f(q.CHECK_CIRCLE), rm1.c.INFO, null, 0, null, 28), context);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float width;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        boolean z13 = this.f128838a;
        if (this.f72359o.f72380f) {
            canvas.save();
            Rect bounds = getBounds();
            canvas.translate(z13 ? bounds.right - this.f72361q : bounds.left, getBounds().top);
            ((GestaltAvatar) this.f72362r.getValue()).draw(canvas);
            canvas.restore();
        }
        boolean z14 = this.f72359o.f72380f;
        int i13 = this.f72365u;
        int i14 = z14 ? this.f72361q + i13 : 0;
        if (z13) {
            float f13 = getBounds().right - i14;
            StaticLayout staticLayout = this.f72369y;
            width = f13 - ((staticLayout == null && (staticLayout = this.f72370z) == null) ? 0 : staticLayout.getWidth());
        } else {
            width = getBounds().left + i14;
        }
        int centerY = getBounds().centerY();
        int i15 = this.f72367w;
        int i16 = centerY - (i15 / 2);
        if (this.f72369y != null && i15 > 0) {
            canvas.save();
            canvas.translate(width, i16);
            StaticLayout staticLayout2 = this.f72369y;
            if (staticLayout2 != null) {
                staticLayout2.draw(canvas);
            }
            canvas.restore();
        }
        StaticLayout staticLayout3 = this.f72370z;
        if (staticLayout3 != null) {
            if (this.f72369y != null) {
                i16 += this.f72367w - this.f72368x;
            }
            canvas.save();
            float f14 = i16;
            canvas.translate(width, f14);
            staticLayout3.draw(canvas);
            canvas.restore();
            String obj = staticLayout3.getText().toString();
            float width2 = staticLayout3.getWidth();
            tn1.c cVar = this.f72364t;
            String a13 = wa2.l.a(obj, cVar, width2);
            cVar.getTextBounds(a13, 0, a13.length(), new Rect());
            o oVar = this.f72359o;
            if (oVar.f72379e) {
                this.A = com.bumptech.glide.d.C(new rm1.d(new rm1.f(q.CHECK_CIRCLE_FILL), oVar.f72378d ? rm1.c.BRAND : rm1.c.INFO, null, 0, null, 28), this.f72358n);
            }
            o oVar2 = this.f72359o;
            if (oVar2.f72377c || oVar2.f72378d) {
                float width3 = z13 ? (staticLayout3.getWidth() - r9.right) + i13 : r9.right + width + i13;
                BitmapDrawable bitmapDrawable = this.A;
                int i17 = this.f72368x;
                bitmapDrawable.setBounds(0, 0, i17, i17);
                canvas.translate(width3, f14);
                bitmapDrawable.draw(canvas);
            }
        }
    }
}
