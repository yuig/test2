package sq0;

import android.app.Activity;
import android.net.TrafficStats;
import android.os.Handler;
import android.os.Process;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.tabs.TabLayout;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import com.pinterest.navigation.view.lego.LegoFloatingBottomNavBar;
import com.pinterest.ui.grid.videopin.PinVideoGridCell;
import ey.t4;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.net.impl.CronetUrlRequest;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f114978a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f114979b;

    public /* synthetic */ a(Object obj, int i13) {
        this.f114978a = i13;
        this.f114979b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f114978a;
        Object obj = this.f114979b;
        switch (i13) {
            case 0:
                e this$0 = (e) obj;
                tq0.b[] bVarArr = e.I0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                RecyclerView recyclerView = this$0.g8();
                if (recyclerView != null) {
                    tq0.h hVar = this$0.C0;
                    hVar.getClass();
                    Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                    hVar.v(recyclerView);
                    hVar.w(recyclerView);
                    this$0.q8().b(recyclerView);
                    return;
                }
                return;
            case 1:
                kt0.q this$02 = (kt0.q) obj;
                int i14 = kt0.q.R0;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                int i15 = this$02.getResources().getDisplayMetrics().widthPixels;
                TabLayout tabLayout = this$02.f80855z0;
                if (tabLayout != null) {
                    tabLayout.setScrollX(i15);
                    return;
                } else {
                    Intrinsics.r("tabLayout");
                    throw null;
                }
            case 2:
                SbaPinRep.handleClickThroughAction$lambda$72((SbaPinRep) obj);
                return;
            case 3:
                ep1.a this$03 = (ep1.a) obj;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                if (this$03.f59900j) {
                    Process.killProcess(Process.myPid());
                }
                Activity activity = this$03.f59897g;
                if (activity != null && activity.isDestroyed()) {
                    this$03.f59897g = null;
                }
                int i16 = this$03.f59893c;
                long uidRxBytes = TrafficStats.getUidRxBytes(i16) - this$03.f59898h;
                long uidTxBytes = TrafficStats.getUidTxBytes(i16) - this$03.f59899i;
                long j13 = this$03.f59892b;
                if (uidRxBytes > j13) {
                    this$03.a(uidRxBytes, true);
                } else if (uidTxBytes > j13) {
                    this$03.a(uidTxBytes, false);
                }
                Handler handler = this$03.f59894d;
                a aVar = this$03.f59895e;
                if (aVar != null) {
                    handler.postDelayed(aVar, this$03.f59891a);
                    return;
                } else {
                    Intrinsics.r("runnable");
                    throw null;
                }
            case 4:
                ip1.b this$04 = (ip1.b) obj;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                if (((b60.d) this$04.f73369a).i()) {
                    ip1.c cVar = (ip1.c) this$04.f73370b.get();
                    cVar.a(new yj1.d(this$04, 15));
                    this$04.f73372d = cVar;
                    ((ip1.c) this$04.f73371c.get()).a(ip1.a.f73366j);
                    return;
                }
                t4 t4Var = this$04.f73373e;
                if (t4Var != null) {
                    LinkedHashSet linkedHashSet = ey.d0.f60468a;
                    ey.d0.d(t4Var.f60451b);
                    return;
                }
                return;
            case 5:
                LegoFloatingBottomNavBar this$05 = (LegoFloatingBottomNavBar) obj;
                int i17 = LegoFloatingBottomNavBar.N;
                Intrinsics.checkNotNullParameter(this$05, "this$0");
                this$05.f49973u.f106358h.c(Integer.valueOf((int) this$05.getTranslationY()));
                return;
            case 6:
                PinVideoGridCell.setVideoPin$lambda$4((PinVideoGridCell) obj);
                return;
            case 7:
                cb2.o this$06 = (cb2.o) obj;
                int i18 = cb2.o.f27340m;
                Intrinsics.checkNotNullParameter(this$06, "this$0");
                LottieAnimationView b13 = this$06.b();
                b13.k2();
                bs1.c.U1(b13);
                return;
            case 8:
                ac2.i cronetEngineOwner = (ac2.i) obj;
                ac2.f fVar = ac2.f.f1945a;
                Intrinsics.checkNotNullParameter(cronetEngineOwner, "$cronetEngineOwner");
                ac2.f fVar2 = ac2.f.f1945a;
                ac2.f.e(cronetEngineOwner);
                return;
            case 9:
                hc2.d dVar = (hc2.d) obj;
                dVar.f68750j = true;
                dVar.e();
                return;
            default:
                ((CronetUrlRequest) obj).f97394g.f97418d.decrementAndGet();
                return;
        }
    }
}
