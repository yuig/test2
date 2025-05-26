package androidx.appcompat.widget;

import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: classes2.dex */
public abstract class l1 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final float f16629a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16630b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16631c;

    /* renamed from: d, reason: collision with root package name */
    public final View f16632d;

    /* renamed from: e, reason: collision with root package name */
    public k1 f16633e;

    /* renamed from: f, reason: collision with root package name */
    public k1 f16634f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f16635g;

    /* renamed from: h, reason: collision with root package name */
    public int f16636h;

    /* renamed from: i, reason: collision with root package name */
    public final int[] f16637i = new int[2];

    public l1(View view) {
        this.f16632d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f16629a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f16630b = tapTimeout;
        this.f16631c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        k1 k1Var = this.f16634f;
        View view = this.f16632d;
        if (k1Var != null) {
            view.removeCallbacks(k1Var);
        }
        k1 k1Var2 = this.f16633e;
        if (k1Var2 != null) {
            view.removeCallbacks(k1Var2);
        }
    }

    public abstract n.e0 b();

    public abstract boolean c();

    public abstract boolean d();

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005b, code lost:
    
        if (r14 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007d, code lost:
    
        if (r4 != 3) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0100  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.l1.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f16635g = false;
        this.f16636h = -1;
        k1 k1Var = this.f16633e;
        if (k1Var != null) {
            this.f16632d.removeCallbacks(k1Var);
        }
    }
}
