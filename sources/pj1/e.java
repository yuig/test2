package pj1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import pk.a0;
import rm1.m;
import u50.i0;
import u50.n;
import ua2.b1;
import ua2.f1;
import ua2.z0;

/* loaded from: classes2.dex */
public abstract class e extends f1 implements jj1.e {

    /* renamed from: f, reason: collision with root package name */
    public final i f100282f;

    /* renamed from: g, reason: collision with root package name */
    public int f100283g;

    /* renamed from: h, reason: collision with root package name */
    public c f100284h;

    /* renamed from: i, reason: collision with root package name */
    public d f100285i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f100286j;

    /* renamed from: k, reason: collision with root package name */
    public int f100287k;

    /* renamed from: l, reason: collision with root package name */
    public int f100288l;

    /* renamed from: m, reason: collision with root package name */
    public int f100289m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(View pinRepView) {
        super(pinRepView, b1.FIXED);
        Intrinsics.checkNotNullParameter(pinRepView, "pinRepView");
        Context context = pinRepView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.f100282f = new i(context);
        this.f100284h = c.START;
        this.f100285i = d.TOP;
    }

    public final void A(f displayState) {
        CharSequence a13;
        CharSequence a14;
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        j displayState2 = displayState.f100294e;
        i iVar = this.f100282f;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(displayState2, "displayState");
        iVar.f100301m = displayState2.B;
        iVar.f100302n = displayState2.E;
        iVar.L = displayState2.F;
        tn1.c cVar = iVar.f100303o;
        cVar.b(displayState2.f100316a);
        Paint paint = iVar.f100304p;
        Context context = iVar.f100300l;
        Intrinsics.checkNotNullParameter(context, "context");
        paint.setColor(context.getColor(displayState2.f100317b));
        Integer num = displayState2.f100334s;
        paint.setColorFilter(num != null ? new PorterDuffColorFilter(bs1.c.A(context, num.intValue()), displayState2.f()) : null);
        boolean z13 = iVar.C;
        rm1.c cVar2 = displayState2.f100318c;
        m mVar = displayState2.f100321f;
        boolean z14 = displayState2.f100322g;
        if (z13 != z14 || !Intrinsics.d(iVar.D, mVar) || iVar.f100311w != cVar2) {
            iVar.p(z14);
            iVar.f100311w = cVar2;
            iVar.q(mVar);
        }
        iVar.f100305q = context.getResources().getDimensionPixelSize(displayState2.f100320e);
        iVar.f100306r = context.getResources().getDimensionPixelSize(displayState2.f100319d);
        iVar.G = context.getResources().getDimensionPixelSize(displayState2.f100323h);
        i0 i0Var = displayState2.f100324i;
        if (i0Var != null && (a14 = i0Var.a(context)) != null) {
            iVar.H = a14.toString();
        }
        iVar.I = displayState2.f100325j;
        iVar.f100299J = displayState2.f100326k;
        i0 i0Var2 = displayState2.f100327l;
        if (i0Var2 != null && (a13 = i0Var2.a(context)) != null) {
            iVar.K = a13.toString();
        }
        iVar.M = displayState2.f100329n;
        iVar.N = displayState2.f100330o;
        iVar.O = displayState2.f100331p;
        iVar.B = displayState2.f100332q;
        Integer num2 = displayState2.f100333r;
        iVar.f100312x = num2 != null ? new PorterDuffColorFilter(bs1.c.A(context, num2.intValue()), displayState2.g()) : null;
        int i13 = g.f100296a[displayState2.f100339x.ordinal()];
        iVar.P = i13 != 1 ? i13 != 2 ? i13 != 3 ? null : iVar.m() : iVar.o() : iVar.n();
        iVar.R = displayState2.f100340y;
        iVar.S = displayState2.f100341z;
        u50.c cVar3 = displayState2.A;
        iVar.T = cVar3 != null ? (Integer) cVar3.a(context) : null;
        u50.c cVar4 = displayState2.C;
        if (cVar4 != null) {
            cVar.setAlpha(((Number) cVar4.a(context)).intValue());
        }
        u50.c cVar5 = displayState2.D;
        if (cVar5 != null) {
            paint.setAlpha(((Number) cVar5.a(context)).intValue());
        }
        iVar.Y = displayState2.G;
        iVar.f100307s = displayState2.H;
        n nVar = displayState2.I;
        if (nVar != null) {
            iVar.U = nVar.a(context);
        }
        n nVar2 = displayState2.f100315J;
        if (nVar2 != null) {
            iVar.f100308t = nVar2.a(context).intValue();
        }
        if (displayState2.K != null) {
            iVar.f100309u = r0.a(context).intValue();
        }
        Context context2 = this.f121492a.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.f100283g = bs1.c.V(context2, displayState.f100290a);
        this.f100284h = displayState.f100291b;
        this.f100285i = displayState.f100292c;
        this.f100286j = displayState.f100293d;
    }

    public final void B(boolean z13) {
        i iVar = this.f100282f;
        if (iVar != null) {
            a0.x(this.f121492a, iVar, z13, null);
        }
    }

    public final c C() {
        return this.f100284h;
    }

    public final int D(int i13, int i14, int i15) {
        boolean z13 = this.f121494c;
        return (!(z13 && this.f100284h == c.START) && (z13 || this.f100284h != c.END)) ? i13 : i14 - i15;
    }

    public final int E(int i13, int i14, int i15) {
        boolean z13 = this.f121494c;
        return (z13 && this.f100284h == c.START) ? i14 : (z13 || this.f100284h != c.END) ? i13 + i15 : i14;
    }

    public final void F(int i13) {
        this.f100287k = i13;
    }

    @Override // jj1.e
    public final void b(int i13, int i14, int i15) {
        this.f100288l = i14;
        this.f100289m = i15;
    }

    @Override // ua2.f1
    public final wa2.l k() {
        return this.f100282f;
    }

    @Override // ua2.f1
    public void r(Canvas canvas, int i13, int i14, int i15, int i16) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        i iVar = this.f100282f;
        if (iVar.f128846i) {
            return;
        }
        int w13 = this.f100285i == d.TOP ? this.f100289m + i14 + this.f100283g : ((this.f100289m + this.f100288l) - w()) - this.f100283g;
        boolean z13 = this.f121494c;
        int t13 = (!(z13 && this.f100284h == c.START) && (z13 || this.f100284h != c.END)) ? i13 + this.f100283g + this.f100287k : i15 - ((t() + this.f100283g) + this.f100287k);
        iVar.f100299J = this.f100286j;
        int t14 = t() + t13;
        int w14 = w() + w13;
        iVar.setBounds(t13, w13, t14, w14);
        Rect rect = iVar.f100313y;
        rect.left = t13;
        rect.top = w13;
        rect.right = t14;
        rect.bottom = w14;
        int x13 = x() + t13;
        int w15 = w() + w13;
        iVar.setBounds(t13, w13, x13, w15);
        Rect rect2 = iVar.f100314z;
        rect2.left = t13;
        rect2.top = w13;
        rect2.right = x13;
        rect2.bottom = w15;
        iVar.draw(canvas);
        u(canvas);
    }

    @Override // ua2.f1
    public final z0 y(int i13, int i14) {
        i iVar = this.f100282f;
        iVar.g(i14);
        int i15 = i13 - (this.f100283g * 2);
        iVar.I = i15;
        tn1.c cVar = iVar.f100303o;
        String a13 = wa2.l.a(iVar.H, cVar, i15);
        String str = iVar.K;
        if (str != null) {
            if (!Intrinsics.d(a13, iVar.H)) {
                String a14 = wa2.l.a(str, cVar, iVar.I);
                Intrinsics.checkNotNullExpressionValue(a14, "ellipsize(...)");
                iVar.H = a14;
            }
            Unit unit = Unit.f80348a;
        }
        Rect rect = new Rect();
        String str2 = iVar.H;
        cVar.getTextBounds(str2, 0, str2.length(), rect);
        int i16 = iVar.f100305q * 2;
        iVar.e(Math.max(rect.height(), iVar.G) + i16);
        Integer num = iVar.U;
        int intValue = num != null ? num.intValue() : iVar.f100306r * 2;
        iVar.B = iVar.G + intValue;
        int max = Math.max(rect.width(), iVar.G) + intValue;
        if (iVar.D != null && (!z.j(iVar.H))) {
            if (iVar.G == 0) {
                iVar.G = iVar.f128842e - i16;
            }
            int i17 = iVar.G + iVar.f100308t;
            max += i17;
            iVar.F = i17 / 2.0f;
        } else if (iVar.D == null) {
            iVar.G = 0;
            iVar.F = 0.0f;
        }
        if (iVar.M) {
            max += iVar.G;
        }
        iVar.f(max);
        if (!iVar.f100301m && !iVar.f100307s && !iVar.Y) {
            iVar.f100309u = (iVar.f128842e + 1) / 2;
        }
        return new z0(iVar.f128841d, iVar.f128842e);
    }
}
