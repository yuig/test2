package y92;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final b f138286a;

    /* renamed from: b, reason: collision with root package name */
    public final int f138287b;

    /* renamed from: c, reason: collision with root package name */
    public final int f138288c;

    /* renamed from: d, reason: collision with root package name */
    public final int f138289d;

    /* renamed from: e, reason: collision with root package name */
    public int f138290e;

    /* renamed from: f, reason: collision with root package name */
    public final a f138291f;

    /* renamed from: g, reason: collision with root package name */
    public final b f138292g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f138293h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f138294i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f138295j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f138296k;

    /* renamed from: l, reason: collision with root package name */
    public MotionEvent f138297l;

    /* renamed from: m, reason: collision with root package name */
    public MotionEvent f138298m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f138299n;

    /* renamed from: o, reason: collision with root package name */
    public float f138300o;

    /* renamed from: p, reason: collision with root package name */
    public float f138301p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f138302q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f138303r;

    public c(Context context, b listener) {
        int i13;
        int i14;
        Handler handler = new Handler(Looper.getMainLooper());
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f138286a = listener;
        int i15 = 100;
        this.f138290e = 100;
        this.f138291f = new a(this, handler);
        MotionEvent obtain = MotionEvent.obtain(0L, 0L, 255, 0.0f, 0.0f, 0);
        Intrinsics.checkNotNullExpressionValue(obtain, "obtain(...)");
        this.f138297l = obtain;
        MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(obtain);
        Intrinsics.checkNotNullExpressionValue(obtainNoHistory, "obtainNoHistory(...)");
        this.f138298m = obtainNoHistory;
        if (listener instanceof b) {
            this.f138292g = listener;
        }
        this.f138302q = true;
        this.f138303r = true;
        if (context == null) {
            i14 = ViewConfiguration.getTouchSlop();
            i13 = i14 + 2;
        } else {
            float f13 = context.getResources().getDisplayMetrics().density;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            i13 = (int) ((f13 * 18) + 0.5f);
            i15 = viewConfiguration.getScaledDoubleTapSlop();
            i14 = scaledTouchSlop;
        }
        this.f138287b = i14 * i14;
        this.f138288c = i13 * i13;
        this.f138289d = i15 * i15;
    }

    public final void a() {
        a aVar = this.f138291f;
        aVar.removeMessages(1);
        aVar.removeMessages(2);
        aVar.removeMessages(3);
        this.f138295j = false;
        this.f138299n = false;
        this.f138293h = false;
        if (this.f138294i) {
            this.f138294i = false;
            this.f138286a.d();
        }
    }

    public final boolean b() {
        return this.f138302q && this.f138294i;
    }

    /* JADX WARN: Removed duplicated region for block: B:94:0x019f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(android.view.MotionEvent r20) {
        /*
            Method dump skipped, instructions count: 451
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y92.c.c(android.view.MotionEvent):boolean");
    }
}
