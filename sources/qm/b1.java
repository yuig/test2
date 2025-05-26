package qm;

import com.google.gson.JsonSyntaxException;
import java.util.BitSet;

/* loaded from: classes.dex */
public final class b1 extends nm.i0 {
    @Override // nm.i0
    public final Object c(um.a aVar) {
        BitSet bitSet = new BitSet();
        aVar.a();
        um.b K = aVar.K();
        int i13 = 0;
        while (K != um.b.END_ARRAY) {
            int i14 = f1.f104161a[K.ordinal()];
            if (i14 == 1 || i14 == 2) {
                int o03 = aVar.o0();
                if (o03 != 0) {
                    if (o03 != 1) {
                        StringBuilder s13 = a.a.s("Invalid bitset value ", o03, ", expected 0 or 1; at path ");
                        s13.append(aVar.o());
                        throw new JsonSyntaxException(s13.toString());
                    }
                    bitSet.set(i13);
                    i13++;
                    K = aVar.K();
                } else {
                    continue;
                    i13++;
                    K = aVar.K();
                }
            } else {
                if (i14 != 3) {
                    throw new JsonSyntaxException("Invalid bitset value type: " + K + "; at path " + aVar.k());
                }
                if (!aVar.R0()) {
                    i13++;
                    K = aVar.K();
                }
                bitSet.set(i13);
                i13++;
                K = aVar.K();
            }
        }
        aVar.f();
        return bitSet;
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        BitSet bitSet = (BitSet) obj;
        cVar.c();
        int length = bitSet.length();
        for (int i13 = 0; i13 < length; i13++) {
            cVar.J(bitSet.get(i13) ? 1L : 0L);
        }
        cVar.f();
    }
}
