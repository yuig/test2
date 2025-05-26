package f90;

import androidx.recyclerview.widget.l2;
import ca2.e;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.fi0;
import com.pinterest.api.model.pi0;
import com.pinterest.collage.cutoutcloseup.view.CutoutCarouselView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import k90.c;
import kotlin.Unit;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import nx.k;

/* loaded from: classes5.dex */
public final class a extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f61436i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ b f61437j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ c90.a f61438k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(b bVar, c90.a aVar, int i13) {
        super(1);
        this.f61436i = i13;
        this.f61437j = bVar;
        this.f61438k = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f61436i;
        c90.a aVar = this.f61438k;
        int i14 = 0;
        b bVar = this.f61437j;
        switch (i13) {
            case 0:
                f30 pin = (f30) obj;
                Intrinsics.checkNotNullParameter(pin, "pin");
                if (bVar.isBound()) {
                    ArrayList items = bVar.f61444f;
                    fi0 r63 = pin.r6();
                    Collection M = r63 != null ? r63.M() : null;
                    items.addAll(M == null ? q0.f80391a : M);
                    Iterator it = items.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            i14 = -1;
                        } else if (!Intrinsics.d(((pi0) it.next()).getUid(), bVar.f61440b)) {
                            i14++;
                        }
                    }
                    bVar.f61446h = pin.i6();
                    bVar.f61445g = i14;
                    c cVar = (c) aVar;
                    cVar.getClass();
                    Intrinsics.checkNotNullParameter(items, "items");
                    CutoutCarouselView cutoutCarouselView = cVar.f78736t1;
                    if (cutoutCarouselView == null) {
                        Intrinsics.r("collagesCarouselView");
                        throw null;
                    }
                    cutoutCarouselView.p3(items);
                    l2 l2Var = cutoutCarouselView.f19242n;
                    if (l2Var != null) {
                        l2Var.M0(i14);
                    }
                    int d2 = (int) (hf0.b.d(cVar.E4()) * (cVar.F9() ? 0.6d : 0.66d));
                    e eVar = cVar.f78734r1;
                    if (eVar == null) {
                        Intrinsics.r("bottomSheetController");
                        throw null;
                    }
                    eVar.f27245d = d2;
                    e.w(eVar, d2, null, null, null, 14);
                    Integer valueOf = Integer.valueOf(items.size());
                    k kVar = cVar.f78729m1;
                    if (kVar == null) {
                        Intrinsics.r("collageAdsLogger");
                        throw null;
                    }
                    String D9 = cVar.D9();
                    cVar.C9();
                    k.c(kVar, D9, true, valueOf, System.currentTimeMillis() - cVar.f78737u1, false, false, 48);
                    bVar.v3(i14);
                }
                return Unit.f80348a;
            default:
                Throwable it2 = (Throwable) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (bVar.isBound()) {
                    c90.a aVar2 = (c90.a) bVar.getViewIfBound();
                    if (aVar2 != null) {
                        c cVar2 = (c) aVar2;
                        k kVar2 = cVar2.f78729m1;
                        if (kVar2 == null) {
                            Intrinsics.r("collageAdsLogger");
                            throw null;
                        }
                        String D92 = cVar2.D9();
                        cVar2.C9();
                        k.c(kVar2, D92, false, null, System.currentTimeMillis() - cVar2.f78737u1, false, false, 48);
                    }
                    ((c) aVar).D5();
                }
                return Unit.f80348a;
        }
    }
}
