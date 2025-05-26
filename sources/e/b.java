package e;

import androidx.compose.foundation.lazy.layout.h0;
import androidx.compose.foundation.lazy.layout.l0;
import androidx.compose.foundation.lazy.layout.w;
import androidx.media3.exoplayer.ExoPlayer;
import b2.t0;
import i2.s0;
import kotlin.Unit;
import q4.t;

/* loaded from: classes2.dex */
public final class b implements s0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56662a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f56663b;

    public /* synthetic */ b(Object obj, int i13) {
        this.f56662a = i13;
        this.f56663b = obj;
    }

    @Override // i2.s0
    public final void dispose() {
        int i13 = this.f56662a;
        Unit unit = null;
        Object obj = this.f56663b;
        switch (i13) {
            case 0:
                g.b bVar = ((a) obj).f56661a;
                if (bVar != null) {
                    bVar.b();
                    unit = Unit.f80348a;
                }
                if (unit == null) {
                    throw new IllegalStateException("Launcher has not been initialized".toString());
                }
                return;
            case 1:
                ((h) obj).remove();
                return;
            case 2:
                ((w) obj).f17316d = null;
                return;
            case 3:
                ((l0) obj).f17263d = null;
                return;
            case 4:
                h0 h0Var = (h0) obj;
                int h10 = h0Var.f17249d.h();
                for (int i14 = 0; i14 < h10; i14++) {
                    h0Var.b();
                }
                return;
            case 5:
                ((t0) obj).m();
                return;
            case 6:
                t tVar = (t) obj;
                tVar.dismiss();
                tVar.f102359g.g();
                return;
            case 7:
                q4.w wVar = (q4.w) obj;
                wVar.g();
                b7.c.Q(wVar, null);
                wVar.f102372l.removeViewImmediate(wVar);
                return;
            default:
                m7.l0 l0Var = (m7.l0) ((ExoPlayer) obj);
                l0Var.B0(false);
                l0Var.stop();
                l0Var.a();
                return;
        }
    }
}
