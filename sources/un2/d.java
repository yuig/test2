package un2;

import kotlin.jvm.internal.Intrinsics;
import pn2.b1;
import pn2.d1;
import pn2.g1;
import pn2.i1;
import pn2.w1;

/* loaded from: classes4.dex */
public final class d extends d1 {
    @Override // pn2.d1
    public final g1 h(b1 key) {
        Intrinsics.checkNotNullParameter(key, "key");
        cn2.b bVar = key instanceof cn2.b ? (cn2.b) key : null;
        if (bVar == null) {
            return null;
        }
        if (bVar.a().b()) {
            return new i1(bVar.a().getType(), w1.OUT_VARIANCE);
        }
        return bVar.a();
    }
}
