package ba;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import z9.g0;
import z9.q0;
import z9.r0;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0005\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lba/n;", "Lz9/r0;", "Lba/m;", "<init>", "()V", "g4/u", "navigation-compose_release"}, k = 1, mv = {1, 8, 0})
@q0("dialog")
/* loaded from: classes3.dex */
public final class n extends r0 {
    @Override // z9.r0
    public final z9.z a() {
        return new m(this, e.f22263a);
    }

    @Override // z9.r0
    public final void d(List list, g0 g0Var) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b().g((z9.k) it.next());
        }
    }

    @Override // z9.r0
    public final void i(z9.k kVar, boolean z13) {
        b().f(kVar, z13);
        int V = CollectionsKt.V((Iterable) b().f141228f.f55726a.getValue(), kVar);
        int i13 = 0;
        for (Object obj : (Iterable) b().f141228f.f55726a.getValue()) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                f0.p();
                throw null;
            }
            z9.k kVar2 = (z9.k) obj;
            if (i13 > V) {
                b().b(kVar2);
            }
            i13 = i14;
        }
    }
}
