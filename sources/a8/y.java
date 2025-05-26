package a8;

import androidx.media3.exoplayer.rtsp.RtspMediaSource$RtspPlaybackException;
import g8.a1;
import g8.b1;

/* loaded from: classes3.dex */
public final class y implements b1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1476a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f1477b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g8.c0 f1478c;

    public y(z zVar, int i13) {
        this.f1478c = zVar;
        this.f1477b = i13;
    }

    @Override // g8.b1
    public final void b() {
        int i13 = this.f1476a;
        g8.c0 c0Var = this.f1478c;
        switch (i13) {
            case 0:
                RtspMediaSource$RtspPlaybackException rtspMediaSource$RtspPlaybackException = ((z) c0Var).f1490l;
                if (rtspMediaSource$RtspPlaybackException != null) {
                    throw rtspMediaSource$RtspPlaybackException;
                }
                return;
            default:
                ((g8.s) c0Var).getClass();
                throw null;
        }
    }

    @Override // g8.b1
    public final int i(qq2.c cVar, k7.e eVar, int i13) {
        int i14 = this.f1476a;
        g8.c0 c0Var = this.f1478c;
        switch (i14) {
            case 0:
                z zVar = (z) c0Var;
                int i15 = this.f1477b;
                if (zVar.f1495q) {
                    return -3;
                }
                x xVar = (x) zVar.f1483e.get(i15);
                return xVar.f1472c.C(cVar, eVar, i13, xVar.f1473d);
            default:
                int i16 = this.f1477b;
                if (i16 == 2) {
                    eVar.e(4);
                    return -4;
                }
                if ((i13 & 2) != 0 || i16 == 0) {
                    ((g8.s) c0Var).getClass();
                    throw null;
                }
                ((g8.s) c0Var).getClass();
                throw null;
        }
    }

    @Override // g8.b1
    public final boolean j() {
        int i13 = this.f1476a;
        g8.c0 c0Var = this.f1478c;
        switch (i13) {
            case 0:
                z zVar = (z) c0Var;
                int i14 = this.f1477b;
                if (!zVar.f1495q) {
                    x xVar = (x) zVar.f1483e.get(i14);
                    if (xVar.f1472c.x(xVar.f1473d)) {
                        return true;
                    }
                }
                return false;
            default:
                ((g8.s) c0Var).getClass();
                throw null;
        }
    }

    @Override // g8.b1
    public final int o(long j13) {
        switch (this.f1476a) {
            case 0:
                z zVar = (z) this.f1478c;
                int i13 = this.f1477b;
                if (zVar.f1495q) {
                    return -3;
                }
                x xVar = (x) zVar.f1483e.get(i13);
                a1 a1Var = xVar.f1472c;
                int t13 = a1Var.t(j13, xVar.f1473d);
                a1Var.H(t13);
                return t13;
            default:
                return 0;
        }
    }
}
