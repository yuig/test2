package p01;

import androidx.recyclerview.widget.w;
import ao2.m2;
import ao2.o1;
import com.pinterest.framework.multisection.datasource.pagedlist.g0;
import com.pinterest.framework.multisection.datasource.pagedlist.h0;
import dl1.s0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import sq0.r;
import sq0.t;
import sq0.u;
import uj2.q;
import wt1.c0;
import wt1.v;
import wt1.z;

/* loaded from: classes5.dex */
public final class c extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f98353i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h0 f98354j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(h0 h0Var, int i13) {
        super(1);
        this.f98353i = i13;
        this.f98354j = h0Var;
    }

    public final Boolean b(c0 it) {
        int i13 = this.f98353i;
        boolean z13 = false;
        h0 h0Var = this.f98354j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                tl1.i iVar = it.f131096b;
                boolean z14 = !h0Var.d().isEmpty();
                if ((it instanceof wt1.m) && (iVar instanceof wt1.l) && (z14 || (!((wt1.l) iVar).f131122b.isEmpty()))) {
                    List list = ((wt1.l) iVar).f131122b;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            if (((dl1.s) it2.next()) instanceof o01.d) {
                            }
                        }
                    }
                    List d2 = h0Var.d();
                    if (!(d2 instanceof Collection) || !d2.isEmpty()) {
                        Iterator it3 = d2.iterator();
                        while (it3.hasNext()) {
                            if (((dl1.s) it3.next()) instanceof o01.d) {
                            }
                        }
                    }
                    z13 = true;
                }
                return Boolean.valueOf(z13);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                tl1.i iVar2 = it.f131096b;
                if ((it instanceof wt1.m) && (iVar2 instanceof wt1.l)) {
                    List list2 = ((wt1.l) iVar2).f131122b;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator it4 = list2.iterator();
                        while (it4.hasNext()) {
                            if (((dl1.s) it4.next()) instanceof o01.h) {
                            }
                        }
                    }
                    List d13 = h0Var.d();
                    if (!(d13 instanceof Collection) || !d13.isEmpty()) {
                        Iterator it5 = d13.iterator();
                        while (it5.hasNext()) {
                            if (((dl1.s) it5.next()) instanceof o01.h) {
                            }
                        }
                    }
                    z13 = true;
                }
                return Boolean.valueOf(z13);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit unit;
        int i13 = this.f98353i;
        int i14 = 0;
        h0 h0Var = this.f98354j;
        switch (i13) {
            case 0:
                return b((c0) obj);
            case 1:
                return b((c0) obj);
            case 2:
                h0Var.f49122l.removeFirst();
                h0Var.f49129s.onError((Throwable) obj);
                h0Var.U();
                return Unit.f80348a;
            case 3:
                xj2.c it = (xj2.c) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                h0Var.f49123m = it;
                return Unit.f80348a;
            case 4:
                o1 it2 = (o1) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                h0Var.f49124n = new m2(it2);
                return Unit.f80348a;
            case 5:
                c0 it3 = (c0) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                if (it3 instanceof v) {
                    return q.y(new u());
                }
                w wVar = it3.f131095a;
                return wVar != null ? q.y(new sq0.q(wVar)) : it3 instanceof wt1.j ? q.y(new t(0, h0Var.a())) : it3 instanceof z ? q.y(new r(0, h0Var.a())) : jk2.h0.f76488a;
            case 6:
                Intrinsics.checkNotNullParameter((sq0.v) obj, "it");
                return Boolean.valueOf(!h0Var.C);
            default:
                s0 s0Var = (s0) obj;
                int i15 = g0.f49108a[s0Var.f55285a.ordinal()];
                dl1.s model = s0Var.f55286b;
                if (i15 == 1) {
                    h0Var.getClass();
                    Intrinsics.checkNotNullParameter(model, "model");
                    unit = Unit.f80348a;
                } else if (i15 == 2) {
                    h0Var.getClass();
                    Intrinsics.checkNotNullParameter(model, "model");
                    for (Object obj2 : h0Var.f49127q) {
                        int i16 = i14 + 1;
                        if (i14 < 0) {
                            f0.p();
                            throw null;
                        }
                        if (Intrinsics.d(model.getUid(), ((dl1.s) obj2).getUid())) {
                            h0Var.removeItem(i14);
                        }
                        i14 = i16;
                    }
                    unit = Unit.f80348a;
                } else {
                    if (i15 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    h0Var.T(model);
                    unit = Unit.f80348a;
                }
                el.a.B(unit);
                return Unit.f80348a;
        }
    }
}
