package lq0;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.sr;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import io.embrace.android.embracesdk.ViewSwazzledHooks;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ni1.o2;
import ni1.t2;
import ni1.y2;
import so.ba;
import x02.i2;

/* loaded from: classes5.dex */
public final class s0 extends lu.a0 implements q0, View.OnLongClickListener {

    /* renamed from: p, reason: collision with root package name */
    public static final double f84421p = hf0.b.f69001a * 1.3d;

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f84422q = 0;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f84423d;

    /* renamed from: e, reason: collision with root package name */
    public final ni1.d0 f84424e;

    /* renamed from: f, reason: collision with root package name */
    public i2 f84425f;

    /* renamed from: g, reason: collision with root package name */
    public Function0 f84426g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f84427h;

    /* renamed from: i, reason: collision with root package name */
    public final nx.a0 f84428i;

    /* renamed from: j, reason: collision with root package name */
    public final wa2.m f84429j;

    /* renamed from: k, reason: collision with root package name */
    public final o2 f84430k;

    /* renamed from: l, reason: collision with root package name */
    public final SbaPinRep f84431l;

    /* renamed from: m, reason: collision with root package name */
    public View.OnTouchListener f84432m;

    /* renamed from: n, reason: collision with root package name */
    public final qi0.b f84433n;

    /* renamed from: o, reason: collision with root package name */
    public final xk2.v f84434o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(Context context, ao2.j0 scope, boolean z13, qa2.j0 pinGridCellFactory, ni1.d0 vmStateConverterFactory, t2 pinRepViewModelFactory) {
        super(context, null, 0, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(pinGridCellFactory, "pinGridCellFactory");
        Intrinsics.checkNotNullParameter(vmStateConverterFactory, "vmStateConverterFactory");
        Intrinsics.checkNotNullParameter(pinRepViewModelFactory, "pinRepViewModelFactory");
        this.f84423d = z13;
        this.f84424e = vmStateConverterFactory;
        nx.a0 a0Var = new nx.a0();
        this.f84428i = a0Var;
        wa2.m mVar = new wa2.m(-338952194, -33554433, 991, null, null, null, qa2.a.ONTO_BOARD, null, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, !z13, false, z13, true, false, false, true, false, false, false, false, false, false, false, false, false, true);
        this.f84429j = mVar;
        this.f84433n = new qi0.b(this, 3);
        this.f84434o = xk2.m.b(new om0.m1(5, context, this));
        setLongClickable(true);
        setClickable(true);
        Pair q13 = l3.c.q(context, mVar, a0Var, scope, pinGridCellFactory, pinRepViewModelFactory);
        SbaPinRep sbaPinRep = (SbaPinRep) q13.f80346a;
        o2 o2Var = (o2) q13.f80347b;
        this.f84431l = sbaPinRep;
        this.f84430k = o2Var;
        sbaPinRep.addToView(this);
        setOnLongClickListener(this);
    }

    public final void g(int i13, f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        as1.b a13 = as1.b.a();
        Intrinsics.checkNotNullExpressionValue(a13, "get(...)");
        sr b13 = bs1.b.b(pin, a13);
        int E0 = bs1.c.E0(b13);
        int w03 = bs1.c.w0(b13);
        boolean z13 = this.f84423d;
        double d2 = r4 * (z13 ? 0.2d : 0.6d);
        double d13 = E0;
        if (d13 < d2 || z13) {
            double d14 = d2 / d13;
            double d15 = f84421p;
            if (d14 > d15) {
                d14 = d15;
            }
            E0 = ml2.c.b(d13 * d14);
            w03 = ml2.c.b(w03 * d14);
        }
        SbaPinRep sbaPinRep = this.f84431l;
        ViewGroup.LayoutParams layoutParams = sbaPinRep.asView().getLayoutParams();
        layoutParams.width = E0;
        layoutParams.height = w03;
        i2 i2Var = this.f84425f;
        if (i2Var == null) {
            Intrinsics.r("pinRepository");
            throw null;
        }
        i2Var.Z(pin);
        sbaPinRep.bindDisplayState(this.f84430k.b(y2.b(((ba) this.f84424e).a(this.f84429j, new mq.w(this, 5), new a.z0(this, 0)).a(i13, pin), null, null, null, false, false, null, null, true, false, false, false, 0, false, false, null, null, null, null, null, null, null, -4194305, 4194303), false));
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        if (!this.f84427h) {
            return ((y92.c) this.f84434o.getValue()).c(motionEvent);
        }
        View.OnTouchListener onTouchListener = this.f84432m;
        if (onTouchListener != null) {
            return onTouchListener.onTouch(this, motionEvent);
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        si1.a aVar;
        Rect bounds;
        ViewSwazzledHooks.logOnClickEvent(view, th2.n.LONG_PRESS);
        if (this.f84427h) {
            return true;
        }
        Function0 function0 = this.f84426g;
        if (function0 != null) {
            function0.invoke();
        } else {
            SbaPinRep sbaPinRep = this.f84431l;
            View asView = sbaPinRep.asView();
            u50.r c13 = this.f84430k.c();
            Rect rect = new Rect();
            asView.getGlobalVisibleRect(rect);
            Unit unit = Unit.f80348a;
            Intrinsics.checkNotNullParameter(rect, "<this>");
            si1.a aVar2 = new si1.a(rect.left, rect.top, rect.right, rect.bottom);
            wa2.a pinDrawable = sbaPinRep.getPinDrawable();
            if (pinDrawable == null || (bounds = pinDrawable.getBounds()) == null) {
                aVar = null;
            } else {
                Intrinsics.checkNotNullParameter(bounds, "<this>");
                aVar = new si1.a(bounds.left, bounds.top, bounds.right, bounds.bottom);
            }
            Intrinsics.f(aVar);
            int width = asView.getRootView().getWidth();
            int height = asView.getRootView().getHeight();
            ViewParent parent = asView.getParent();
            Intrinsics.checkNotNullExpressionValue(parent, "getParent(...)");
            View O = kh2.r.O(parent);
            Rect rect2 = new Rect();
            if (O != null) {
                O.getGlobalVisibleRect(rect2);
            }
            c13.a(new ni1.t1(aVar2, aVar, width, height, rect2.top));
        }
        return true;
    }

    @Override // android.view.View
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f84432m = onTouchListener;
    }
}
