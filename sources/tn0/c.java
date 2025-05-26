package tn0;

import com.pinterest.api.model.b40;
import com.pinterest.api.model.ba;
import com.pinterest.api.model.f30;
import gb2.i;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import un0.h;
import wa2.o;
import wa2.p;

/* loaded from: classes5.dex */
public final class c extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f118595i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e f118596j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(e eVar, int i13) {
        super(1);
        this.f118595i = i13;
        this.f118596j = eVar;
    }

    public final Boolean b(f30 it) {
        int i13 = this.f118595i;
        boolean z13 = false;
        e eVar = this.f118596j;
        switch (i13) {
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                if (eVar.f0() && eVar.V) {
                    z13 = true;
                }
                return Boolean.valueOf(z13);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                if (b40.e(it, eVar.M)) {
                    boolean[] zArr = it.f37485h3;
                    if (zArr.length > 179 && zArr[179]) {
                        ba j63 = it.j6();
                        if (Intrinsics.d(j63 != null ? j63.getUid() : null, eVar.N) && eVar.f0() && eVar.V) {
                            z13 = true;
                        }
                    }
                }
                return Boolean.valueOf(z13);
        }
    }

    public final Boolean e(Pair it) {
        int i13 = this.f118595i;
        boolean z13 = false;
        e eVar = this.f118596j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                if (eVar.f0() && eVar.V) {
                    z13 = true;
                }
                return Boolean.valueOf(z13);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                if (eVar.f0() && eVar.V) {
                    z13 = true;
                }
                return Boolean.valueOf(z13);
        }
    }

    public final void f(f30 f30Var) {
        int i13 = this.f118595i;
        e eVar = this.f118596j;
        switch (i13) {
            case 3:
                ((h) eVar.P).D3(true);
                break;
            default:
                Intrinsics.f(f30Var);
                Iterator it = eVar.d().iterator();
                int i14 = 0;
                while (true) {
                    if (it.hasNext()) {
                        if (!Intrinsics.d(f30Var.getUid(), ((dl1.s) it.next()).getUid())) {
                            i14++;
                        }
                    } else {
                        i14 = -1;
                    }
                }
                if (eVar.d2(i14)) {
                    eVar.u1(i14, f30Var);
                    break;
                }
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f118595i;
        boolean z13 = false;
        int i14 = 0;
        z13 = false;
        z13 = false;
        z13 = false;
        e eVar = this.f118596j;
        switch (i13) {
            case 0:
                return e((Pair) obj);
            case 1:
                switch (i13) {
                    case 1:
                        ((h) eVar.P).onRecyclerRefresh();
                        break;
                    default:
                        ((h) eVar.P).onRecyclerRefresh();
                        break;
                }
                return Unit.f80348a;
            case 2:
                return b((f30) obj);
            case 3:
                f((f30) obj);
                return Unit.f80348a;
            case 4:
                return e((Pair) obj);
            case 5:
                switch (i13) {
                    case 1:
                        ((h) eVar.P).onRecyclerRefresh();
                        break;
                    default:
                        ((h) eVar.P).onRecyclerRefresh();
                        break;
                }
                return Unit.f80348a;
            case 6:
                i it = (i) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (it.f64754b == p.STATE_REPORTED) {
                    if (it.f64755c.compareTo(o.UI_ONLY) > 0 && eVar.f0() && eVar.V) {
                        z13 = true;
                    }
                }
                return Boolean.valueOf(z13);
            case 7:
                i iVar = (i) obj;
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
            case 8:
                return b((f30) obj);
            default:
                f((f30) obj);
                return Unit.f80348a;
        }
    }
}
