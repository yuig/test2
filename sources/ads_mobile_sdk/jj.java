package ads_mobile_sdk;

import a.zb;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.view.WindowMetrics;
import ao2.j0;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class jj implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: j, reason: collision with root package name */
    public static final long f6829j;

    /* renamed from: a, reason: collision with root package name */
    public final j0 f6830a;

    /* renamed from: b, reason: collision with root package name */
    public final ky2 f6831b;

    /* renamed from: c, reason: collision with root package name */
    public final r90 f6832c;

    /* renamed from: d, reason: collision with root package name */
    public final zb f6833d;

    /* renamed from: e, reason: collision with root package name */
    public View f6834e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f6835f;

    /* renamed from: g, reason: collision with root package name */
    public WeakReference f6836g;

    /* renamed from: h, reason: collision with root package name */
    public long f6837h;

    /* renamed from: i, reason: collision with root package name */
    public Boolean f6838i;

    static {
        zn2.a aVar = zn2.b.f142311b;
        f6829j = dl2.b.P2(200, zn2.d.MILLISECONDS);
    }

    public jj(j0 uiScope, ky2 viewabilityEventEmitter, r90 displayUtil, zb clock) {
        Intrinsics.checkNotNullParameter(uiScope, "uiScope");
        Intrinsics.checkNotNullParameter(viewabilityEventEmitter, "viewabilityEventEmitter");
        Intrinsics.checkNotNullParameter(displayUtil, "displayUtil");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.f6830a = uiScope;
        this.f6831b = viewabilityEventEmitter;
        this.f6832c = displayUtil;
        this.f6833d = clock;
        this.f6836g = new WeakReference(null);
        zn2.b.f142311b.getClass();
        this.f6837h = 0L;
    }

    public static final Object a(jj jjVar, py2 py2Var, bl2.c cVar) {
        hy2 a13 = jjVar.a(py2Var);
        zn2.a aVar = zn2.b.f142311b;
        jjVar.f6833d.getClass();
        long Q2 = dl2.b.Q2(SystemClock.elapsedRealtime(), zn2.d.MILLISECONDS);
        if (py2Var == py2.f9859c && Intrinsics.d(Boolean.valueOf(a13.f6144b), jjVar.f6838i) && zn2.b.c(Q2, zn2.b.k(jjVar.f6837h, f6829j)) < 0) {
            return Unit.f80348a;
        }
        jjVar.f6838i = Boolean.valueOf(a13.f6144b);
        jjVar.f6837h = Q2;
        ky2 ky2Var = jjVar.f6831b;
        ky2Var.getClass();
        Object a14 = ky2.a(ky2Var, a13, cVar);
        return a14 == cl2.a.COROUTINE_SUSPENDED ? a14 : Unit.f80348a;
    }

    public final void b(py2 py2Var) {
        kotlin.jvm.internal.j.H(kotlin.coroutines.j.f80412a, new gj(this, py2Var, null));
        if (py2Var == py2.f9859c) {
            kotlin.jvm.internal.j.z(this.f6830a, null, null, new hj(this, null), 3);
        } else {
            kotlin.jvm.internal.j.z(this.f6830a, null, null, new ij(this, null), 3);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        b(py2.f9857a);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        b(py2.f9859c);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f6836g = new WeakReference(viewTreeObserver);
            try {
                viewTreeObserver.addOnGlobalLayoutListener(this);
                viewTreeObserver.addOnScrollChangedListener(this);
            } catch (IllegalStateException unused) {
            }
        }
        b(py2.f9858b);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        b(py2.f9858b);
        a();
    }

    public final void b(View view) {
        this.f6834e = view;
    }

    public final hy2 a(py2 py2Var) {
        Context context;
        Context context2;
        Context context3;
        Context context4;
        Context context5;
        WindowMetrics currentWindowMetrics;
        Rect bounds;
        Rect bounds2;
        Rect rect = new Rect();
        int[] iArr = new int[2];
        try {
            View view = this.f6834e;
            if (view != null) {
                view.getLocationOnScreen(iArr);
            }
            int i13 = iArr[0];
            rect.left = i13;
            rect.top = iArr[1];
            View view2 = this.f6834e;
            if (view2 != null) {
                rect.right = i13 + view2.getWidth();
                rect.bottom = rect.top + view2.getHeight();
            }
        } catch (Exception e13) {
            ok.e0 e0Var = gk0.f5596a;
            gk0.d("Failed to get view location: " + e13.getMessage(), null);
        }
        Rect rect2 = new Rect();
        View view3 = this.f6834e;
        if (view3 != null && (context5 = view3.getContext()) != null) {
            if (Build.VERSION.SDK_INT >= 30) {
                currentWindowMetrics = ((WindowManager) context5.getSystemService(WindowManager.class)).getCurrentWindowMetrics();
                Intrinsics.checkNotNullExpressionValue(currentWindowMetrics, "getCurrentWindowMetrics(...)");
                bounds = currentWindowMetrics.getBounds();
                rect2.right = bounds.width();
                bounds2 = currentWindowMetrics.getBounds();
                rect2.bottom = bounds2.height();
            } else {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                ((WindowManager) context5.getSystemService(WindowManager.class)).getDefaultDisplay().getMetrics(displayMetrics);
                rect2.right = displayMetrics.widthPixels;
                rect2.bottom = displayMetrics.heightPixels;
            }
        }
        Rect rect3 = new Rect();
        View view4 = this.f6834e;
        boolean globalVisibleRect = view4 != null ? view4.getGlobalVisibleRect(rect3) : false;
        Rect rect4 = new Rect();
        View view5 = this.f6834e;
        boolean localVisibleRect = view5 != null ? view5.getLocalVisibleRect(rect4) : false;
        Rect rect5 = new Rect();
        View view6 = this.f6834e;
        if (view6 != null) {
            view6.getHitRect(rect5);
        }
        View view7 = this.f6834e;
        boolean a13 = view7 != null ? this.f6832c.a(view7, this.f6835f) : false;
        View view8 = this.f6834e;
        int windowVisibility = view8 != null ? view8.getWindowVisibility() : 8;
        View view9 = this.f6834e;
        Rect rect6 = (view9 == null || (context4 = view9.getContext()) == null) ? new Rect() : kh2.j1.v(context4, rect);
        View view10 = this.f6834e;
        boolean isAttachedToWindow = view10 != null ? view10.isAttachedToWindow() : false;
        View view11 = this.f6834e;
        Rect rect7 = (view11 == null || (context3 = view11.getContext()) == null) ? new Rect() : kh2.j1.v(context3, rect2);
        View view12 = this.f6834e;
        Rect rect8 = (view12 == null || (context2 = view12.getContext()) == null) ? new Rect() : kh2.j1.v(context2, rect3);
        View view13 = this.f6834e;
        return new hy2(py2Var, a13, windowVisibility, rect6, isAttachedToWindow, rect7, rect8, globalVisibleRect, (view13 == null || (context = view13.getContext()) == null) ? new Rect() : kh2.j1.v(context, rect4), localVisibleRect, rect5);
    }

    public final void a(View targetView) {
        Intrinsics.checkNotNullParameter(targetView, "targetView");
        targetView.addOnAttachStateChangeListener(this);
        if (targetView.isAttachedToWindow()) {
            ViewTreeObserver viewTreeObserver = targetView.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                this.f6836g = new WeakReference(viewTreeObserver);
                try {
                    viewTreeObserver.addOnGlobalLayoutListener(this);
                    viewTreeObserver.addOnScrollChangedListener(this);
                    return;
                } catch (IllegalStateException unused) {
                    return;
                }
            }
            return;
        }
        b(py2.f9858b);
    }

    public final void a() {
        ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f6836g.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            try {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
                viewTreeObserver.removeOnScrollChangedListener(this);
            } catch (IllegalStateException unused) {
            }
        }
        this.f6836g = new WeakReference(null);
    }
}
