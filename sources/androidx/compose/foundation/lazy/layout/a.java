package androidx.compose.foundation.lazy.layout;

import android.view.Choreographer;
import android.view.View;
import i2.q2;

/* loaded from: classes2.dex */
public final class a implements d1, q2, Runnable, Choreographer.FrameCallback {

    /* renamed from: g, reason: collision with root package name */
    public static long f17199g;

    /* renamed from: a, reason: collision with root package name */
    public final View f17200a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f17202c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f17204e;

    /* renamed from: f, reason: collision with root package name */
    public long f17205f;

    /* renamed from: b, reason: collision with root package name */
    public final k2.e f17201b = new k2.e(new a1[16]);

    /* renamed from: d, reason: collision with root package name */
    public final Choreographer f17203d = Choreographer.getInstance();

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0032, code lost:
    
        if (r5 >= 30.0f) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a(android.view.View r5) {
        /*
            r4 = this;
            r4.<init>()
            r4.f17200a = r5
            k2.e r0 = new k2.e
            r1 = 16
            androidx.compose.foundation.lazy.layout.a1[] r1 = new androidx.compose.foundation.lazy.layout.a1[r1]
            r0.<init>(r1)
            r4.f17201b = r0
            android.view.Choreographer r0 = android.view.Choreographer.getInstance()
            r4.f17203d = r0
            long r0 = androidx.compose.foundation.lazy.layout.a.f17199g
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L3f
            android.view.Display r0 = r5.getDisplay()
            boolean r5 = r5.isInEditMode()
            if (r5 != 0) goto L35
            if (r0 == 0) goto L35
            float r5 = r0.getRefreshRate()
            r0 = 1106247680(0x41f00000, float:30.0)
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 < 0) goto L35
            goto L37
        L35:
            r5 = 1114636288(0x42700000, float:60.0)
        L37:
            r0 = 1000000000(0x3b9aca00, float:0.0047237873)
            float r0 = (float) r0
            float r0 = r0 / r5
            long r0 = (long) r0
            androidx.compose.foundation.lazy.layout.a.f17199g = r0
        L3f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.a.<init>(android.view.View):void");
    }

    @Override // i2.q2
    public final void a() {
        this.f17204e = true;
    }

    @Override // i2.q2
    public final void b() {
    }

    @Override // i2.q2
    public final void c() {
        this.f17204e = false;
        this.f17200a.removeCallbacks(this);
        this.f17203d.removeFrameCallback(this);
    }

    @Override // androidx.compose.foundation.lazy.layout.d1
    public final void d(a1 a1Var) {
        this.f17201b.b(a1Var);
        if (this.f17202c) {
            return;
        }
        this.f17202c = true;
        this.f17200a.post(this);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j13) {
        if (this.f17204e) {
            this.f17205f = j13;
            this.f17200a.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        k2.e eVar = this.f17201b;
        if (eVar.l() || !this.f17202c || !this.f17204e || this.f17200a.getWindowVisibility() != 0) {
            this.f17202c = false;
            return;
        }
        a8.t0 t0Var = new a8.t0(this.f17205f + f17199g);
        boolean z13 = false;
        while (eVar.m() && !z13) {
            if (t0Var.d() <= 0 || ((a1) eVar.f78182a[0]).b(t0Var)) {
                z13 = true;
            } else {
                eVar.o(0);
            }
        }
        if (z13) {
            this.f17203d.postFrameCallback(this);
        } else {
            this.f17202c = false;
        }
    }
}
