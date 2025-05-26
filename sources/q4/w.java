package q4;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.platform.AbstractComposeView;
import i2.f2;
import i2.o0;
import i2.y3;
import j1.q0;
import j1.t0;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.i0;
import lb.l0;

/* loaded from: classes3.dex */
public final class w extends AbstractComposeView {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f102367z = 0;

    /* renamed from: h, reason: collision with root package name */
    public Function0 f102368h;

    /* renamed from: i, reason: collision with root package name */
    public z f102369i;

    /* renamed from: j, reason: collision with root package name */
    public final View f102370j;

    /* renamed from: k, reason: collision with root package name */
    public final org.chromium.net.y f102371k;

    /* renamed from: l, reason: collision with root package name */
    public final WindowManager f102372l;

    /* renamed from: m, reason: collision with root package name */
    public final WindowManager.LayoutParams f102373m;

    /* renamed from: n, reason: collision with root package name */
    public y f102374n;

    /* renamed from: o, reason: collision with root package name */
    public n4.k f102375o;

    /* renamed from: p, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f102376p;

    /* renamed from: q, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f102377q;

    /* renamed from: r, reason: collision with root package name */
    public n4.i f102378r;

    /* renamed from: s, reason: collision with root package name */
    public final o0 f102379s;

    /* renamed from: t, reason: collision with root package name */
    public final Rect f102380t;

    /* renamed from: u, reason: collision with root package name */
    public final s2.w f102381u;

    /* renamed from: v, reason: collision with root package name */
    public Object f102382v;

    /* renamed from: w, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f102383w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f102384x;

    /* renamed from: y, reason: collision with root package name */
    public final int[] f102385y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(Function0 function0, z zVar, View view, n4.b bVar, y yVar, UUID uuid) {
        super(6, view.getContext(), (AttributeSet) null);
        org.chromium.net.y xVar = Build.VERSION.SDK_INT >= 29 ? new x() : new org.chromium.net.y();
        this.f102368h = function0;
        this.f102369i = zVar;
        this.f102370j = view;
        this.f102371k = xVar;
        Object systemService = view.getContext().getSystemService("window");
        Intrinsics.g(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.f102372l = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        z zVar2 = this.f102369i;
        boolean c13 = l.c(view);
        boolean z13 = zVar2.f102387b;
        int i13 = zVar2.f102386a;
        if (z13 && c13) {
            i13 |= 8192;
        } else if (z13 && !c13) {
            i13 &= -8193;
        }
        layoutParams.flags = i13;
        layoutParams.type = 1002;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(u2.t.default_popup_window_title));
        this.f102373m = layoutParams;
        this.f102374n = yVar;
        this.f102375o = n4.k.Ltr;
        y3 y3Var = y3.f71400a;
        this.f102376p = bs1.c.u1(null, y3Var);
        this.f102377q = bs1.c.u1(null, y3Var);
        this.f102379s = bs1.c.S(new q0(this, 26));
        this.f102380t = new Rect();
        this.f102381u = new s2.w(new k(this, 2));
        setId(R.id.content);
        b7.c.Q(this, b7.c.r(view));
        d7.b.t0(this, d7.b.J(view));
        l0.i1(this, l0.l0(view));
        setTag(u2.s.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(bVar.l0((float) 8));
        setOutlineProvider(new e3.p(2));
        this.f102383w = bs1.c.u1(p.f102349a, y3Var);
        this.f102385y = new int[2];
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void b(i2.o oVar, int i13) {
        int i14;
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-857613600);
        if ((i13 & 6) == 0) {
            i14 = (sVar.j(this) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i14 & 3) == 2 && sVar.z()) {
            sVar.Q();
        } else {
            ((Function2) this.f102383w.getValue()).invoke(sVar, 0);
        }
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new t0(this, i13, 7);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        KeyEvent.DispatcherState keyDispatcherState;
        if (keyEvent.getKeyCode() == 4 && this.f102369i.f102388c) {
            if (getKeyDispatcherState() == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                }
                return true;
            }
            if (keyEvent.getAction() == 1 && (keyDispatcherState = getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                Function0 function0 = this.f102368h;
                if (function0 != null) {
                    function0.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    /* renamed from: j */
    public final boolean getF17461i() {
        return this.f102384x;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void k(boolean z13, int i13, int i14, int i15, int i16) {
        super.k(z13, i13, i14, i15, i16);
        this.f102369i.getClass();
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        WindowManager.LayoutParams layoutParams = this.f102373m;
        layoutParams.width = childAt.getMeasuredWidth();
        layoutParams.height = childAt.getMeasuredHeight();
        this.f102371k.getClass();
        this.f102372l.updateViewLayout(this, layoutParams);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void l(int i13, int i14) {
        this.f102369i.getClass();
        super.l(View.MeasureSpec.makeMeasureSpec(Math.round(getContext().getResources().getConfiguration().screenWidthDp * getContext().getResources().getDisplayMetrics().density), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(Math.round(getContext().getResources().getConfiguration().screenHeightDp * getContext().getResources().getDisplayMetrics().density), Integer.MIN_VALUE));
    }

    public final void o(Function0 function0, z zVar, n4.k kVar) {
        this.f102368h = function0;
        if (!Intrinsics.d(this.f102369i, zVar)) {
            zVar.getClass();
            WindowManager.LayoutParams layoutParams = this.f102373m;
            this.f102369i = zVar;
            boolean c13 = l.c(this.f102370j);
            boolean z13 = zVar.f102387b;
            int i13 = zVar.f102386a;
            if (z13 && c13) {
                i13 |= 8192;
            } else if (z13 && !c13) {
                i13 &= -8193;
            }
            layoutParams.flags = i13;
            this.f102371k.getClass();
            this.f102372l.updateViewLayout(this, layoutParams);
        }
        int i14 = u.f102361a[kVar.ordinal()];
        int i15 = 1;
        if (i14 == 1) {
            i15 = 0;
        } else if (i14 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        super.setLayoutDirection(i15);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f102381u.e();
        if (!this.f102369i.f102388c || Build.VERSION.SDK_INT < 33) {
            return;
        }
        if (this.f102382v == null) {
            this.f102382v = m.a(this.f102368h);
        }
        m.b(this, this.f102382v);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        s2.w wVar = this.f102381u;
        s2.h hVar = wVar.f110703g;
        if (hVar != null) {
            hVar.a();
        }
        wVar.b();
        if (Build.VERSION.SDK_INT >= 33) {
            m.c(this, this.f102382v);
        }
        this.f102382v = null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f102369i.f102389d) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            Function0 function0 = this.f102368h;
            if (function0 != null) {
                function0.invoke();
            }
            return true;
        }
        if (motionEvent == null || motionEvent.getAction() != 4) {
            return super.onTouchEvent(motionEvent);
        }
        Function0 function02 = this.f102368h;
        if (function02 != null) {
            function02.invoke();
        }
        return true;
    }

    public final void q() {
        q3.x xVar = (q3.x) this.f102377q.getValue();
        if (xVar != null) {
            if (!xVar.h()) {
                xVar = null;
            }
            if (xVar == null) {
                return;
            }
            long j13 = xVar.j();
            long E = xVar.E(0L);
            long a13 = d7.b.a(Math.round(a3.c.d(E)), Math.round(a3.c.e(E)));
            int i13 = (int) (a13 >> 32);
            int i14 = (int) (a13 & 4294967295L);
            n4.i iVar = new n4.i(i13, i14, ((int) (j13 >> 32)) + i13, ((int) (j13 & 4294967295L)) + i14);
            if (Intrinsics.d(iVar, this.f102378r)) {
                return;
            }
            this.f102378r = iVar;
            s();
        }
    }

    public final void s() {
        n4.j jVar;
        n4.i iVar = this.f102378r;
        if (iVar == null || (jVar = (n4.j) this.f102376p.getValue()) == null) {
            return;
        }
        org.chromium.net.y yVar = this.f102371k;
        yVar.getClass();
        View view = this.f102370j;
        Rect rect = this.f102380t;
        view.getWindowVisibleDisplayFrame(rect);
        long d2 = l0.d(rect.right - rect.left, rect.bottom - rect.top);
        i0 i0Var = new i0();
        i0Var.f80432a = 0L;
        this.f102381u.c(this, c.f102315o, new v(i0Var, this, iVar, d2, jVar.f89186a));
        WindowManager.LayoutParams layoutParams = this.f102373m;
        long j13 = i0Var.f80432a;
        layoutParams.x = (int) (j13 >> 32);
        layoutParams.y = (int) (j13 & 4294967295L);
        if (this.f102369i.f102390e) {
            yVar.Z(this, (int) (d2 >> 32), (int) (d2 & 4294967295L));
        }
        this.f102372l.updateViewLayout(this, layoutParams);
    }

    @Override // android.view.View
    public final void setLayoutDirection(int i13) {
    }
}
