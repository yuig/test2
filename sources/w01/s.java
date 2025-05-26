package w01;

import com.pinterest.api.model.v7;
import com.pinterest.feature.pin.closeup.presenter.PinCloseupPresenter;
import com.pinterest.feature.pin.closeup.view.PinCloseupFragment;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.z3;
import o82.v2;

/* loaded from: classes5.dex */
public final class s implements sq0.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f127106a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f127107b;

    public /* synthetic */ s(Object obj, int i13) {
        this.f127106a = i13;
        this.f127107b = obj;
    }

    @Override // sq0.z
    public final void j3(int i13) {
        lh0.a0 a0Var;
        lh0.a0 a0Var2;
        switch (this.f127106a) {
            case 0:
                PinCloseupPresenter pinCloseupPresenter = (PinCloseupPresenter) this.f127107b;
                if (((PinCloseupFragment) PinCloseupPresenter.access$getView(pinCloseupPresenter)).y9(i13)) {
                    a0Var = pinCloseupPresenter.experiments;
                    a0Var.getClass();
                    z3 z3Var = a4.f83298b;
                    g1 g1Var = (g1) a0Var.f83294a;
                    if (g1Var.o("android_reset_stopwatch_on_spinner_offscreen", "enabled", z3Var) || g1Var.l("android_reset_stopwatch_on_spinner_offscreen")) {
                        new hy.e(4, 0).i();
                    }
                    a0Var2 = pinCloseupPresenter.experiments;
                    if (a0Var2.N()) {
                        new ry.f(19, 0).i();
                        break;
                    }
                }
                break;
        }
    }

    @Override // sq0.z
    public final void r1(int i13, sq0.y scrollDirection) {
        int i14 = this.f127106a;
        Object obj = this.f127107b;
        switch (i14) {
            case 0:
                Intrinsics.checkNotNullParameter(scrollDirection, "scrollDirection");
                return;
            case 1:
                Intrinsics.checkNotNullParameter(scrollDirection, "scrollDirection");
                x01.c cVar = (x01.c) obj;
                if (((PinCloseupFragment) cVar.f131280a).y9(i13)) {
                    cVar.f131282c.getClass();
                    new ry.g(19, 0).i();
                    return;
                }
                return;
            case 2:
                Intrinsics.checkNotNullParameter(scrollDirection, "scrollDirection");
                i11.m mVar = (i11.m) obj;
                if (!mVar.f71008j0) {
                    return;
                }
                my1.a aVar = mVar.f71000f0;
                if (aVar == null) {
                    Intrinsics.r("boardPickerBoardCoverImagePrefetcher");
                    throw null;
                }
                List d2 = mVar.d();
                ArrayList boardList = new ArrayList();
                for (Object obj2 : d2) {
                    if (obj2 instanceof v7) {
                        boardList.add(obj2);
                    }
                }
                Intrinsics.checkNotNullParameter(boardList, "boardList");
                Intrinsics.checkNotNullParameter(scrollDirection, "scrollDirection");
                int min = Math.min(i13 + 5, boardList.size() - 1);
                if (scrollDirection == sq0.y.UNKNOWN || scrollDirection == sq0.y.UP || i13 > min) {
                    return;
                }
                while (true) {
                    if (i13 >= 0 && i13 <= boardList.size() - 1) {
                        String v13 = kh2.d.v((v7) boardList.get(i13));
                        LinkedHashSet linkedHashSet = aVar.f88499a;
                        if (!linkedHashSet.contains(v13)) {
                            ((hs1.m) hs1.t.a()).q(v13, null, null);
                            linkedHashSet.add(v13);
                        }
                    }
                    if (i13 == min) {
                        return;
                    } else {
                        i13++;
                    }
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(scrollDirection, "scrollDirection");
                v2 v2Var = (v2) obj;
                if (v2Var.A4(i13)) {
                    v2Var.e9().d();
                    return;
                }
                return;
        }
    }
}
