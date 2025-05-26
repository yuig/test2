package n;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;

/* loaded from: classes2.dex */
public class y {

    /* renamed from: a, reason: collision with root package name */
    public final Context f88713a;

    /* renamed from: b, reason: collision with root package name */
    public final o f88714b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f88715c;

    /* renamed from: d, reason: collision with root package name */
    public final int f88716d;

    /* renamed from: e, reason: collision with root package name */
    public final int f88717e;

    /* renamed from: f, reason: collision with root package name */
    public View f88718f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f88720h;

    /* renamed from: i, reason: collision with root package name */
    public z f88721i;

    /* renamed from: j, reason: collision with root package name */
    public w f88722j;

    /* renamed from: k, reason: collision with root package name */
    public PopupWindow.OnDismissListener f88723k;

    /* renamed from: g, reason: collision with root package name */
    public int f88719g = 8388611;

    /* renamed from: l, reason: collision with root package name */
    public final x f88724l = new x(this);

    public y(int i13, int i14, Context context, View view, o oVar, boolean z13) {
        this.f88713a = context;
        this.f88714b = oVar;
        this.f88718f = view;
        this.f88715c = z13;
        this.f88716d = i13;
        this.f88717e = i14;
    }

    public final w a() {
        w f0Var;
        if (this.f88722j == null) {
            Context context = this.f88713a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(i.d.abc_cascading_menus_min_smallest_width)) {
                f0Var = new i(this.f88713a, this.f88718f, this.f88716d, this.f88717e, this.f88715c);
            } else {
                View view = this.f88718f;
                f0Var = new f0(this.f88716d, this.f88717e, this.f88713a, view, this.f88714b, this.f88715c);
            }
            f0Var.n(this.f88714b);
            f0Var.t(this.f88724l);
            f0Var.p(this.f88718f);
            f0Var.m(this.f88721i);
            f0Var.q(this.f88720h);
            f0Var.r(this.f88719g);
            this.f88722j = f0Var;
        }
        return this.f88722j;
    }

    public final boolean b() {
        w wVar = this.f88722j;
        return wVar != null && wVar.a();
    }

    public void c() {
        this.f88722j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f88723k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i13, int i14, boolean z13, boolean z14) {
        w a13 = a();
        a13.u(z14);
        if (z13) {
            if ((Gravity.getAbsoluteGravity(this.f88719g, this.f88718f.getLayoutDirection()) & 7) == 5) {
                i13 -= this.f88718f.getWidth();
            }
            a13.s(i13);
            a13.v(i14);
            int i15 = (int) ((this.f88713a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a13.f88711a = new Rect(i13 - i15, i14 - i15, i13 + i15, i14 + i15);
        }
        a13.k();
    }
}
