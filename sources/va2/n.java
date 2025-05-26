package va2;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.text.StaticLayout;
import android.view.View;
import df.j1;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import rl1.r;
import rm1.q;
import ua2.c1;

/* loaded from: classes4.dex */
public final class n extends wa2.l {
    public static final /* synthetic */ int C = 0;
    public StaticLayout A;
    public BitmapDrawable B;

    /* renamed from: l, reason: collision with root package name */
    public final View f125415l;

    /* renamed from: m, reason: collision with root package name */
    public final Context f125416m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f125417n;

    /* renamed from: o, reason: collision with root package name */
    public c1 f125418o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f125419p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f125420q;

    /* renamed from: r, reason: collision with root package name */
    public final xk2.k f125421r;

    /* renamed from: s, reason: collision with root package name */
    public int f125422s;

    /* renamed from: t, reason: collision with root package name */
    public final tn1.c f125423t;

    /* renamed from: u, reason: collision with root package name */
    public final tn1.c f125424u;

    /* renamed from: v, reason: collision with root package name */
    public final int f125425v;

    /* renamed from: w, reason: collision with root package name */
    public final int f125426w;

    /* renamed from: x, reason: collision with root package name */
    public int f125427x;

    /* renamed from: y, reason: collision with root package name */
    public int f125428y;

    /* renamed from: z, reason: collision with root package name */
    public StaticLayout f125429z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(View parentView) {
        super(parentView.getContext());
        Intrinsics.checkNotNullParameter(parentView, "parentView");
        this.f125415l = parentView;
        Context context = parentView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.f125416m = context;
        this.f125417n = j1.Y0(context);
        this.f125420q = true;
        this.f125421r = xk2.m.a(xk2.n.NONE, new c72.o(this, 18));
        this.f125422s = dl2.b.F0(context, r.MD.getValue());
        this.f125423t = new tn1.c(context, new tn1.b((vn1.c) null, tn1.c.f118618j, (vn1.g) null, 11));
        this.f125424u = new tn1.c(context, new tn1.b((vn1.c) null, (List) null, (vn1.g) null, 15));
        this.f125425v = context.getResources().getDimensionPixelSize(r0.lego_grid_cell_text_padding);
        this.f125426w = 4;
        this.B = com.bumptech.glide.d.C(new rm1.d(new rm1.f(q.CHECK_CIRCLE), rm1.c.INFO, null, 0, null, 28), context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x01fb, code lost:
    
        if (r12 != false) goto L93;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0216  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void draw(android.graphics.Canvas r25) {
        /*
            Method dump skipped, instructions count: 555
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: va2.n.draw(android.graphics.Canvas):void");
    }
}
