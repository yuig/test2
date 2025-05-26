package m7;

import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class n implements w0 {

    /* renamed from: a */
    public final l8.m f86300a;

    /* renamed from: b */
    public final long f86301b;

    /* renamed from: c */
    public final long f86302c;

    /* renamed from: d */
    public final long f86303d;

    /* renamed from: e */
    public final long f86304e;

    /* renamed from: f */
    public final int f86305f;

    /* renamed from: g */
    public final boolean f86306g;

    /* renamed from: h */
    public final long f86307h;

    /* renamed from: i */
    public final boolean f86308i;

    /* renamed from: j */
    public final HashMap f86309j;

    /* renamed from: k */
    public long f86310k;

    /* renamed from: l */
    public long f86311l = -1;

    public n(l8.m mVar, int i13, int i14, int i15, int i16, boolean z13) {
        a("bufferForPlaybackMs", i15, 0, "0");
        a("bufferForPlaybackAfterRebufferMs", i16, 0, "0");
        a("minBufferMs", i13, i15, "bufferForPlaybackMs");
        a("minBufferMs", i13, i16, "bufferForPlaybackAfterRebufferMs");
        a("maxBufferMs", i14, i13, "minBufferMs");
        a("backBufferDurationMs", 0, 0, "0");
        this.f86300a = mVar;
        this.f86301b = d7.n0.X(i13);
        this.f86302c = d7.n0.X(i14);
        this.f86303d = d7.n0.X(i15);
        this.f86304e = d7.n0.X(i16);
        this.f86305f = -1;
        this.f86306g = z13;
        this.f86307h = d7.n0.X(0);
        this.f86308i = false;
        this.f86309j = new HashMap();
        this.f86310k = -1L;
    }

    public static void a(String str, int i13, int i14, String str2) {
        bf.b.h(str + " cannot be less than " + str2, i13 >= i14);
    }

    public final int b() {
        Iterator it = this.f86309j.values().iterator();
        int i13 = 0;
        while (it.hasNext()) {
            i13 += ((m) it.next()).f86298b;
        }
        return i13;
    }

    public final boolean c(v0 v0Var) {
        int i13;
        this.f86311l = v0Var.f86439b;
        m mVar = (m) this.f86309j.get(v0Var.f86438a);
        mVar.getClass();
        l8.m mVar2 = this.f86300a;
        synchronized (mVar2) {
            i13 = mVar2.f82049d * mVar2.f82047b;
        }
        boolean z13 = true;
        boolean z14 = i13 >= b();
        float f13 = v0Var.f86440c;
        long j13 = this.f86301b;
        long j14 = this.f86302c;
        if (f13 > 1.0f) {
            j13 = Math.min(d7.n0.D(j13, f13), j14);
        }
        long max = Math.max(j13, 500000L);
        long j15 = v0Var.f86439b;
        if (j15 < max) {
            if (!this.f86306g && z14) {
                z13 = false;
            }
            mVar.f86297a = z13;
            if (!z13 && j15 < 500000) {
                d7.u.g("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j15 >= j14 || z14) {
            mVar.f86297a = false;
        }
        return mVar.f86297a;
    }

    public final void d() {
        boolean z13 = true;
        if (!this.f86309j.isEmpty()) {
            l8.m mVar = this.f86300a;
            int b13 = b();
            synchronized (mVar) {
                if (b13 >= mVar.f82048c) {
                    z13 = false;
                }
                mVar.f82048c = b13;
                if (z13) {
                    mVar.a();
                }
            }
            return;
        }
        l8.m mVar2 = this.f86300a;
        synchronized (mVar2) {
            if (mVar2.f82046a) {
                synchronized (mVar2) {
                    if (mVar2.f82048c <= 0) {
                        z13 = false;
                    }
                    mVar2.f82048c = 0;
                    if (z13) {
                        mVar2.a();
                    }
                }
            }
        }
    }
}
