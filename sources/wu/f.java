package wu;

import androidx.recyclerview.widget.RecyclerView;
import ar0.y;
import de1.l0;
import df.j1;
import i32.l;
import i32.y0;
import kl0.z;
import kotlin.jvm.internal.Intrinsics;
import nt.c2;
import qa2.h0;
import xk2.v;

/* loaded from: classes3.dex */
public final class f implements y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f131134a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f131135b;

    public /* synthetic */ f(Object obj, int i13) {
        this.f131134a = i13;
        this.f131135b = obj;
    }

    @Override // ar0.y
    public final void c(RecyclerView recyclerView, int i13, int i14) {
        switch (this.f131134a) {
            case 0:
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                break;
            case 1:
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                break;
            default:
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                boolean canScrollVertically = recyclerView.canScrollVertically(1);
                Object obj = this.f131135b;
                if (canScrollVertically) {
                    bs1.c.U1(((l0) obj).f54594k);
                } else {
                    bs1.c.X0(((l0) obj).f54594k);
                }
                if (!recyclerView.canScrollVertically(-1)) {
                    bs1.c.X0(((l0) obj).f54593j);
                    break;
                } else {
                    bs1.c.U1(((l0) obj).f54593j);
                    break;
                }
        }
    }

    @Override // ar0.y
    public final void d(RecyclerView recyclerView, int i13) {
        h0 r93;
        int i14 = this.f131134a;
        Object obj = this.f131135b;
        switch (i14) {
            case 0:
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                if (i13 != 0) {
                    i iVar = (i) obj;
                    if (iVar.F0.f135864g != 0) {
                        iVar.I0.setAlpha(0.0f);
                        break;
                    }
                } else {
                    i iVar2 = (i) obj;
                    int i15 = iVar2.n1().f35424k;
                    xt.f fVar = iVar2.F0;
                    fVar.g(i15, true);
                    if (fVar.f135864g != 0) {
                        iVar2.g2();
                    }
                    iVar2.t0(iVar2.getTop());
                    iVar2.postDelayed(new c2(iVar2, 3), 750L);
                    break;
                }
                break;
            case 1:
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                if (i13 == 0) {
                    z zVar = (z) obj;
                    zVar.p9();
                    v vVar = zf0.f.f141903e;
                    if (j1.D0(y0.ANDROID_BOARD_TAKEOVER, l.ANDROID_BOARD_FAVORITE_BUTTON_TOOLTIP) && (r93 = zVar.r9()) != null) {
                        zVar.y9(r93);
                        break;
                    }
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                break;
        }
    }

    @Override // ar0.y
    public final void g(RecyclerView recyclerView) {
        switch (this.f131134a) {
            case 0:
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                break;
            case 1:
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                break;
            default:
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                break;
        }
    }
}
