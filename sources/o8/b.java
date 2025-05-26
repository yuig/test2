package o8;

import d7.d0;
import d7.n0;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class b extends m7.h {

    /* renamed from: r, reason: collision with root package name */
    public final k7.e f93418r;

    /* renamed from: s, reason: collision with root package name */
    public final d0 f93419s;

    /* renamed from: t, reason: collision with root package name */
    public a f93420t;

    /* renamed from: u, reason: collision with root package name */
    public long f93421u;

    public b() {
        super(6);
        this.f93418r = new k7.e(1);
        this.f93419s = new d0();
    }

    @Override // m7.h
    public final void A(long j13, long j14) {
        float[] fArr;
        while (!n() && this.f93421u < 100000 + j13) {
            k7.e eVar = this.f93418r;
            eVar.n();
            qq2.c cVar = this.f86172c;
            cVar.c();
            if (z(cVar, eVar, 0) != -4 || eVar.i(4)) {
                return;
            }
            long j15 = eVar.f78456g;
            this.f93421u = j15;
            boolean z13 = j15 < this.f86181l;
            if (this.f93420t != null && !z13) {
                eVar.q();
                ByteBuffer byteBuffer = eVar.f78454e;
                int i13 = n0.f53866a;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    byte[] array = byteBuffer.array();
                    int limit = byteBuffer.limit();
                    d0 d0Var = this.f93419s;
                    d0Var.I(limit, array);
                    d0Var.K(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i14 = 0; i14 < 3; i14++) {
                        fArr2[i14] = Float.intBitsToFloat(d0Var.m());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    this.f93420t.a(this.f93421u - this.f86180k, fArr);
                }
            }
        }
    }

    @Override // m7.h
    public final int F(androidx.media3.common.b bVar) {
        return "application/x-camera-motion".equals(bVar.f18765o) ? m7.h.f(4, 0, 0, 0) : m7.h.f(0, 0, 0, 0);
    }

    @Override // m7.h, m7.q1
    public final void b(int i13, Object obj) {
        if (i13 == 8) {
            this.f93420t = (a) obj;
        }
    }

    @Override // m7.h
    public final String m() {
        return "CameraMotionRenderer";
    }

    @Override // m7.h
    public final boolean o() {
        return n();
    }

    @Override // m7.h
    public final boolean q() {
        return true;
    }

    @Override // m7.h
    public final void r() {
        a aVar = this.f93420t;
        if (aVar != null) {
            aVar.c();
        }
    }

    @Override // m7.h
    public final void t(long j13, boolean z13) {
        this.f93421u = Long.MIN_VALUE;
        a aVar = this.f93420t;
        if (aVar != null) {
            aVar.c();
        }
    }
}
