package a8;

import androidx.media3.exoplayer.rtsp.RtspMediaSource$RtspPlaybackException;
import androidx.media3.exoplayer.rtsp.RtspMediaSource$RtspUdpUnsupportedTransportException;
import g8.z0;
import java.io.IOException;
import java.net.BindException;
import java.util.ArrayList;
import pk.c1;
import pk.v2;

/* loaded from: classes3.dex */
public final class u implements l8.r, z0, o, n {

    /* renamed from: a */
    public final /* synthetic */ z f1463a;

    public u(z zVar) {
        this.f1463a = zVar;
    }

    public final void a(RtspMediaSource$RtspPlaybackException rtspMediaSource$RtspPlaybackException) {
        boolean z13 = rtspMediaSource$RtspPlaybackException instanceof RtspMediaSource$RtspUdpUnsupportedTransportException;
        z zVar = this.f1463a;
        if (!z13 || zVar.f1500v) {
            zVar.f1490l = rtspMediaSource$RtspPlaybackException;
        } else {
            z.C(zVar);
        }
    }

    @Override // g8.z0
    public final void b() {
        z zVar = this.f1463a;
        zVar.f1480b.post(new s(zVar, 1));
    }

    public final void c(long j13, c1 c1Var) {
        z zVar;
        ArrayList arrayList;
        long j14;
        boolean z13;
        long j15;
        long j16;
        long j17;
        long j18;
        long j19;
        long j23;
        ArrayList arrayList2;
        q qVar;
        ArrayList arrayList3 = new ArrayList(c1Var.size());
        for (int i13 = 0; i13 < c1Var.size(); i13++) {
            String path = ((m0) c1Var.get(i13)).f1400c.getPath();
            bf.b.n(path);
            arrayList3.add(path);
        }
        int i14 = 0;
        while (true) {
            zVar = this.f1463a;
            arrayList = zVar.f1484f;
            if (i14 >= arrayList.size()) {
                break;
            }
            arrayList2 = zVar.f1484f;
            if (!arrayList3.contains(((w) arrayList2.get(i14)).a().getPath())) {
                qVar = zVar.f1485g;
                qVar.f();
                if (z.o(zVar)) {
                    zVar.f1495q = true;
                    zVar.f1492n = -9223372036854775807L;
                    zVar.f1491m = -9223372036854775807L;
                    zVar.f1493o = -9223372036854775807L;
                }
            }
            i14++;
        }
        for (int i15 = 0; i15 < c1Var.size(); i15++) {
            m0 m0Var = (m0) c1Var.get(i15);
            f x13 = z.x(zVar, m0Var.f1400c);
            if (x13 != null) {
                long j24 = m0Var.f1398a;
                x13.c(j24);
                x13.b(m0Var.f1399b);
                if (z.o(zVar)) {
                    j19 = zVar.f1492n;
                    j23 = zVar.f1491m;
                    if (j19 == j23) {
                        x13.a(j13, j24);
                    }
                }
            }
        }
        if (z.o(zVar)) {
            j16 = zVar.f1492n;
            j17 = zVar.f1491m;
            if (j16 == j17) {
                zVar.f1492n = -9223372036854775807L;
                zVar.f1491m = -9223372036854775807L;
                return;
            } else {
                zVar.f1492n = -9223372036854775807L;
                j18 = zVar.f1491m;
                zVar.f(j18);
                return;
            }
        }
        j14 = zVar.f1493o;
        if (j14 != -9223372036854775807L) {
            z13 = zVar.f1500v;
            if (z13) {
                j15 = zVar.f1493o;
                zVar.f(j15);
                zVar.f1493o = -9223372036854775807L;
            }
        }
    }

    @Override // l8.r
    public final void d(l8.u uVar, long j13, long j14) {
        f fVar = (f) uVar;
        z zVar = this.f1463a;
        if (zVar.t() == 0) {
            if (zVar.f1500v) {
                return;
            }
            z.C(zVar);
            return;
        }
        int i13 = 0;
        while (true) {
            ArrayList arrayList = zVar.f1483e;
            if (i13 >= arrayList.size()) {
                break;
            }
            x xVar = (x) arrayList.get(i13);
            if (xVar.f1470a.f1467b == fVar) {
                xVar.c();
                break;
            }
            i13++;
        }
        zVar.f1482d.f1440p = 1;
    }

    @Override // l8.r
    public final l8.s e(l8.u uVar, long j13, long j14, IOException iOException, int i13) {
        f fVar = (f) uVar;
        z zVar = this.f1463a;
        if (!zVar.f1497s) {
            zVar.f1489k = iOException;
        } else if (iOException.getCause() instanceof BindException) {
            int i14 = zVar.f1499u;
            zVar.f1499u = i14 + 1;
            if (i14 < 3) {
                return l8.w.f82094d;
            }
        } else {
            zVar.f1490l = new IOException(fVar.f1312b.f1309b.toString(), iOException) { // from class: androidx.media3.exoplayer.rtsp.RtspMediaSource$RtspPlaybackException
                public RtspMediaSource$RtspPlaybackException(Exception exc) {
                    super(exc);
                }
            };
        }
        return l8.w.f82095e;
    }

    public final void f(String str, IOException iOException) {
        this.f1463a.f1489k = iOException == null ? new IOException(str) : new IOException(str, iOException);
    }

    public final void g(l0 l0Var, v2 v2Var) {
        q qVar;
        d dVar;
        ArrayList arrayList;
        int i13 = 0;
        while (true) {
            int size = v2Var.size();
            z zVar = this.f1463a;
            if (i13 >= size) {
                qVar = zVar.f1485g;
                qVar.g(l0Var);
                return;
            }
            c0 c0Var = (c0) v2Var.get(i13);
            dVar = zVar.f1486h;
            x xVar = new x(zVar, c0Var, i13, dVar);
            arrayList = zVar.f1483e;
            arrayList.add(xVar);
            xVar.d();
            i13++;
        }
    }

    @Override // l8.r
    public final /* bridge */ /* synthetic */ void s(l8.u uVar, long j13, long j14, boolean z13) {
    }
}
