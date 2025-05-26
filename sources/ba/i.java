package ba;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import i2.y3;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import z9.g0;
import z9.q0;
import z9.r0;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0005\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lba/i;", "Lz9/r0;", "Lba/h;", "<init>", "()V", "g4/u", "navigation-compose_release"}, k = 1, mv = {1, 8, 0})
@q0("composable")
/* loaded from: classes3.dex */
public final class i extends r0 {

    /* renamed from: c, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f22269c = bs1.c.u1(Boolean.FALSE, y3.f71400a);

    @Override // z9.r0
    public final z9.z a() {
        return new h(this, c.f22257a);
    }

    @Override // z9.r0
    public final void d(List list, g0 g0Var) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b().h((z9.k) it.next());
        }
        this.f22269c.setValue(Boolean.FALSE);
    }

    @Override // z9.r0
    public final void i(z9.k kVar, boolean z13) {
        b().f(kVar, z13);
        this.f22269c.setValue(Boolean.TRUE);
    }
}
