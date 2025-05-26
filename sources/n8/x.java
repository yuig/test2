package n8;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import d7.n0;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final w f89904a;

    /* renamed from: b, reason: collision with root package name */
    public final a0 f89905b;

    /* renamed from: c, reason: collision with root package name */
    public final long f89906c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f89907d;

    /* renamed from: g, reason: collision with root package name */
    public long f89910g;

    /* renamed from: j, reason: collision with root package name */
    public boolean f89913j;

    /* renamed from: m, reason: collision with root package name */
    public boolean f89916m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f89917n;

    /* renamed from: e, reason: collision with root package name */
    public int f89908e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f89909f = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    public long f89911h = -9223372036854775807L;

    /* renamed from: i, reason: collision with root package name */
    public long f89912i = -9223372036854775807L;

    /* renamed from: k, reason: collision with root package name */
    public float f89914k = 1.0f;

    /* renamed from: l, reason: collision with root package name */
    public d7.e f89915l = d7.e.f53809a;

    public x(Context context, w wVar, long j13) {
        this.f89904a = wVar;
        this.f89906c = j13;
        this.f89905b = new a0(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x0141, code lost:
    
        if (r18 > 100000) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x014c, code lost:
    
        if (r24 >= r28) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0151, code lost:
    
        if (r21.f89907d != false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006e, code lost:
    
        if (r10.f89776g[(int) ((r14 - 1) % 15)] != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(long r22, long r24, long r26, long r28, boolean r30, boolean r31, h6.c0 r32) {
        /*
            Method dump skipped, instructions count: 597
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n8.x.a(long, long, long, long, boolean, boolean, h6.c0):int");
    }

    public final boolean b(boolean z13) {
        if (z13 && (this.f89908e == 3 || (!this.f89916m && this.f89917n))) {
            this.f89912i = -9223372036854775807L;
            return true;
        }
        if (this.f89912i == -9223372036854775807L) {
            return false;
        }
        ((d7.g0) this.f89915l).getClass();
        if (SystemClock.elapsedRealtime() < this.f89912i) {
            return true;
        }
        this.f89912i = -9223372036854775807L;
        return false;
    }

    public final void c(boolean z13) {
        long j13;
        this.f89913j = z13;
        long j14 = this.f89906c;
        if (j14 > 0) {
            ((d7.g0) this.f89915l).getClass();
            j13 = SystemClock.elapsedRealtime() + j14;
        } else {
            j13 = -9223372036854775807L;
        }
        this.f89912i = j13;
    }

    public final void d(int i13) {
        this.f89908e = Math.min(this.f89908e, i13);
    }

    public final void e() {
        this.f89907d = true;
        ((d7.g0) this.f89915l).getClass();
        this.f89910g = n0.X(SystemClock.elapsedRealtime());
        a0 a0Var = this.f89905b;
        a0Var.f89732d = true;
        a0Var.f89741m = 0L;
        a0Var.f89744p = -1L;
        a0Var.f89742n = -1L;
        y yVar = a0Var.f89730b;
        if (yVar != null) {
            z zVar = a0Var.f89731c;
            zVar.getClass();
            zVar.f89922b.sendEmptyMessage(2);
            Handler n13 = n0.n(null);
            DisplayManager displayManager = yVar.f89918a;
            displayManager.registerDisplayListener(yVar, n13);
            a0.a(yVar.f89919b, displayManager.getDisplay(0));
        }
        a0Var.d(false);
    }

    public final void f() {
        this.f89907d = false;
        this.f89912i = -9223372036854775807L;
        a0 a0Var = this.f89905b;
        a0Var.f89732d = false;
        y yVar = a0Var.f89730b;
        if (yVar != null) {
            yVar.f89918a.unregisterDisplayListener(yVar);
            z zVar = a0Var.f89731c;
            zVar.getClass();
            zVar.f89922b.sendEmptyMessage(3);
        }
        a0Var.b();
    }

    public final void g(float f13) {
        a0 a0Var = this.f89905b;
        a0Var.f89734f = f13;
        e eVar = a0Var.f89729a;
        eVar.f89782a.c();
        eVar.f89783b.c();
        eVar.f89784c = false;
        eVar.f89785d = -9223372036854775807L;
        eVar.f89786e = 0;
        a0Var.c();
    }

    public final void h(Surface surface) {
        this.f89916m = surface != null;
        this.f89917n = false;
        a0 a0Var = this.f89905b;
        if (a0Var.f89733e != surface) {
            a0Var.b();
            a0Var.f89733e = surface;
            a0Var.d(true);
        }
        d(1);
    }

    public final void i(float f13) {
        bf.b.i(f13 > 0.0f);
        if (f13 == this.f89914k) {
            return;
        }
        this.f89914k = f13;
        a0 a0Var = this.f89905b;
        a0Var.f89737i = f13;
        a0Var.f89741m = 0L;
        a0Var.f89744p = -1L;
        a0Var.f89742n = -1L;
        a0Var.d(false);
    }
}
