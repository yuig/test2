package oq;

import android.text.TextUtils;
import com.pinterest.activity.pin.view.modules.PinCloseupBaseModule;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.fi0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import rq.r1;

/* loaded from: classes3.dex */
public final class s0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f97134i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ x0 f97135j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s0(x0 x0Var, int i13) {
        super(1);
        this.f97134i = i13;
        this.f97135j = x0Var;
    }

    public final void b(PinCloseupBaseModule it) {
        int i13 = this.f97134i;
        x0 x0Var = this.f97135j;
        switch (i13) {
            case 5:
                Intrinsics.checkNotNullParameter(it, "it");
                ArrayList arrayList = x0Var.I;
                if (arrayList != null) {
                    arrayList.add(it);
                    break;
                }
                break;
            case 6:
                Intrinsics.checkNotNullParameter(it, "it");
                ArrayList arrayList2 = x0Var.I;
                if (arrayList2 != null) {
                    arrayList2.add(it);
                    break;
                }
                break;
            case 7:
                Intrinsics.checkNotNullParameter(it, "it");
                ArrayList arrayList3 = x0Var.I;
                if (arrayList3 != null) {
                    arrayList3.add(it);
                    break;
                }
                break;
            case 8:
                Intrinsics.checkNotNullParameter(it, "it");
                ArrayList arrayList4 = x0Var.I;
                if (arrayList4 != null) {
                    arrayList4.add(it);
                    break;
                }
                break;
            case 9:
                Intrinsics.checkNotNullParameter(it, "it");
                ArrayList arrayList5 = x0Var.I;
                if (arrayList5 != null) {
                    arrayList5.add(it);
                    break;
                }
                break;
            case 10:
                Intrinsics.checkNotNullParameter(it, "it");
                ArrayList arrayList6 = x0Var.I;
                if (arrayList6 != null) {
                    arrayList6.add(it);
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                ArrayList arrayList7 = x0Var.I;
                if (arrayList7 != null) {
                    arrayList7.add(it);
                    break;
                }
                break;
        }
    }

    public final void e(Throwable th3) {
        int i13 = this.f97134i;
        x0 x0Var = this.f97135j;
        switch (i13) {
            case 1:
                r1 t03 = x0Var.t0();
                if (t03 != null) {
                    t03.showLoadingSpinner(false);
                }
                r1 t04 = x0Var.t0();
                if (t04 != null) {
                    t04.openPinOverflowMenuModal(false);
                    return;
                }
                return;
            default:
                String message = th3 != null ? th3.getMessage() : null;
                int i14 = x0.O0;
                if (((es.c) x0Var.X()).x(x0Var.F)) {
                    nx.k kVar = x0Var.C;
                    if (kVar == null) {
                        Intrinsics.r("collageAdsLogger");
                        throw null;
                    }
                    f30 f30Var = x0Var.F;
                    String uid = f30Var != null ? f30Var.getUid() : null;
                    String str = uid == null ? "" : uid;
                    x0Var.a0();
                    nx.k.b(kVar, str, null, false, Long.valueOf(System.currentTimeMillis() - x0Var.E), message, 96);
                    return;
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List M;
        int i13 = this.f97134i;
        r1 = null;
        Integer num = null;
        x0 x0Var = this.f97135j;
        switch (i13) {
            case 0:
                Boolean bool = (Boolean) obj;
                r1 t03 = x0Var.t0();
                if (t03 != null) {
                    t03.showLoadingSpinner(false);
                }
                r1 t04 = x0Var.t0();
                if (t04 != null) {
                    Intrinsics.f(bool);
                    t04.openPinOverflowMenuModal(bool.booleanValue());
                }
                return Unit.f80348a;
            case 1:
                e((Throwable) obj);
                return Unit.f80348a;
            case 2:
                f30 updatedPin = (f30) obj;
                Intrinsics.checkNotNullParameter(updatedPin, "updatedPin");
                String uid = updatedPin.getUid();
                f30 f30Var = x0Var.F;
                return Boolean.valueOf(TextUtils.equals(uid, f30Var != null ? f30Var.getUid() : null));
            case 3:
                f30 pin = (f30) obj;
                Intrinsics.checkNotNullParameter(pin, "pin");
                x0Var.p1(pin);
                if (((es.c) x0Var.X()).x(pin)) {
                    nx.k kVar = x0Var.C;
                    if (kVar == null) {
                        Intrinsics.r("collageAdsLogger");
                        throw null;
                    }
                    String uid2 = pin.getUid();
                    x0Var.a0();
                    long currentTimeMillis = System.currentTimeMillis() - x0Var.E;
                    fi0 r63 = pin.r6();
                    if (r63 != null && (M = r63.M()) != null) {
                        num = Integer.valueOf(M.size());
                    }
                    Intrinsics.f(uid2);
                    nx.k.b(kVar, uid2, num, true, Long.valueOf(currentTimeMillis), null, RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER);
                }
                return Unit.f80348a;
            case 4:
                e((Throwable) obj);
                return Unit.f80348a;
            case 5:
                b((PinCloseupBaseModule) obj);
                return Unit.f80348a;
            case 6:
                b((PinCloseupBaseModule) obj);
                return Unit.f80348a;
            case 7:
                b((PinCloseupBaseModule) obj);
                return Unit.f80348a;
            case 8:
                b((PinCloseupBaseModule) obj);
                return Unit.f80348a;
            case 9:
                b((PinCloseupBaseModule) obj);
                return Unit.f80348a;
            case 10:
                b((PinCloseupBaseModule) obj);
                return Unit.f80348a;
            default:
                b((PinCloseupBaseModule) obj);
                return Unit.f80348a;
        }
    }
}
