package ul0;

import android.graphics.Bitmap;
import android.os.SystemClock;
import com.pinterest.api.model.f30;
import com.pinterest.feature.board.grid.view.BoardGridCellImageView;
import com.pinterest.ui.grid.LegoPinGridCellImpl;
import ey.o2;
import h32.z1;
import hs1.x;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import py.g;
import ua2.k0;

/* loaded from: classes5.dex */
public final class a extends l0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f122444c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f122445d;

    public a(Object obj, int i13) {
        this.f122444c = i13;
        this.f122445d = obj;
    }

    @Override // lb.l0
    public final void O0() {
        String str;
        switch (this.f122444c) {
            case 0:
                break;
            default:
                k0 k0Var = (k0) this.f122445d;
                if (k0Var.f121538p < k0Var.f121546x.a() && (str = k0Var.E) != null && str.length() != 0) {
                    String str2 = k0Var.E;
                    if (str2 == null) {
                        str2 = "";
                    }
                    new o2(str2, false, false, s92.c.UNKNOWN, null).i();
                }
                f30 f30Var = ((LegoPinGridCellImpl) k0Var.f121539q).C0;
                String pinUid = f30Var != null ? f30Var.getUid() : null;
                if (pinUid != null && pinUid.length() != 0) {
                    Intrinsics.checkNotNullParameter(pinUid, "pinUid");
                    new py.c(pinUid).i();
                    break;
                }
                break;
        }
    }

    @Override // lb.l0
    public final void P0(Bitmap bitmap, x loadedFrom) {
        String str;
        int i13 = this.f122444c;
        Object obj = this.f122445d;
        switch (i13) {
            case 0:
                int i14 = BoardGridCellImageView.f45255s;
                ((BoardGridCellImageView) obj).n();
                return;
            default:
                if (loadedFrom != null) {
                    k0 k0Var = (k0) obj;
                    if (k0Var.f121538p < k0Var.f121546x.a() && (str = k0Var.E) != null && str.length() != 0) {
                        String str2 = k0Var.E;
                        if (str2 == null) {
                            str2 = "";
                        }
                        new o2(str2, loadedFrom == x.DISK || loadedFrom == x.MEMORY, true, dl2.b.C0(loadedFrom, null), null).i();
                    }
                    LegoPinGridCellImpl legoPinGridCellImpl = (LegoPinGridCellImpl) k0Var.f121539q;
                    f30 pin = legoPinGridCellImpl.C0;
                    if (pin != null) {
                        k0Var.B = true;
                        k0Var.I = System.currentTimeMillis() * 1000000;
                        z1 source = k0Var.H;
                        if (source != null) {
                            Intrinsics.checkNotNullParameter(source, "source");
                            k0Var.H = new z1(source.f67478a, Long.valueOf(k0Var.I), source.f67482c, source.f67484d, source.f67486e, source.f67488f, source.f67490g, source.f67492h, source.f67494i, source.f67496j, source.f67498k, source.f67500l, source.f67502m, source.f67503n, source.f67504o, source.f67505p, source.f67506q, source.f67507r, source.f67508s, source.f67509t, source.f67510u, source.f67511v, source.f67512w, source.f67513x, source.f67514y, source.f67515z, source.A, source.B, source.C, source.D, source.E, source.F, source.G, source.H, source.I, source.f67477J, source.K, source.L, source.M, source.N, source.O, source.P, source.Q, source.R, source.S, source.T, source.U, source.V, source.W, source.X, source.Y, source.Z, source.f67479a0, source.f67481b0, source.f67483c0, source.f67485d0, source.f67487e0, source.f67489f0, source.f67491g0, source.f67493h0, source.f67495i0, source.f67497j0, source.f67499k0, source.f67501l0);
                        }
                        LegoPinGridCellImpl legoPinGridCellImpl2 = (LegoPinGridCellImpl) k0Var.f121541s;
                        legoPinGridCellImpl2.getClass();
                        Intrinsics.checkNotNullParameter(pin, "pin");
                        if (legoPinGridCellImpl2.A1 == null) {
                            Intrinsics.r("impressionDebugUtils");
                            throw null;
                        }
                        Intrinsics.checkNotNullParameter(pin, "pin");
                    }
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j13 = k0Var.F;
                    k0Var.G = j13 > 0 ? elapsedRealtime - j13 : 0L;
                    k0Var.f121545w.getClass();
                    Intrinsics.checkNotNullParameter(loadedFrom, "loadedFrom");
                    k0Var.D = loadedFrom == x.MEMORY || loadedFrom == x.DISK;
                    f30 f30Var = legoPinGridCellImpl.C0;
                    String pinUid = f30Var != null ? f30Var.getUid() : null;
                    Intrinsics.f(pinUid);
                    Intrinsics.checkNotNullParameter(pinUid, "pinUid");
                    new g(pinUid).i();
                    k0Var.f121531J.l();
                    return;
                }
                return;
        }
    }
}
