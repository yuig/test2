package u60;

import com.pinterest.api.model.f30;
import dl1.s0;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f120762i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e f120763j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(e eVar, int i13) {
        super(1);
        this.f120762i = i13;
        this.f120763j = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f120762i;
        boolean z13 = false;
        int i14 = 0;
        z13 = false;
        z13 = false;
        e eVar = this.f120763j;
        switch (i13) {
            case 0:
                s0 update = (s0) obj;
                Intrinsics.checkNotNullParameter(update, "update");
                eVar.R = eVar.L.t();
                if (b.f120761a[update.f55285a.ordinal()] == 1) {
                    Intrinsics.checkNotNullParameter(eVar, "<this>");
                    new l(eVar, 4).h((f30) update.f55286b);
                }
                return Unit.f80348a;
            case 1:
                Intrinsics.checkNotNullParameter((Throwable) obj, "it");
                ((hl0.v) eVar.M).N3();
                return Unit.f80348a;
            case 2:
                gb2.i it = (gb2.i) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (it.f64754b == wa2.p.STATE_REPORTED) {
                    if (it.f64755c.compareTo(wa2.o.UI_ONLY) > 0 && eVar.Q) {
                        z13 = true;
                    }
                }
                return Boolean.valueOf(z13);
            default:
                gb2.i iVar = (gb2.i) obj;
                Iterator it2 = eVar.d().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        i14 = -1;
                    } else if (!Intrinsics.d(((dl1.s) it2.next()).getUid(), iVar.f64753a)) {
                        i14++;
                    }
                }
                dl1.s item = eVar.getItem(i14);
                if (item != null) {
                    eVar.u1(i14, item);
                }
                return Unit.f80348a;
        }
    }
}
