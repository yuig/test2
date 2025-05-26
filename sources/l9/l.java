package l9;

import a8.v;
import pk.c1;
import pk.x0;

/* loaded from: classes3.dex */
public interface l {
    int E();

    default void d() {
    }

    void w(byte[] bArr, int i13, int i14, k kVar, d7.i iVar);

    default d x(byte[] bArr, int i13, int i14) {
        x0 n13 = c1.n();
        w(bArr, i13, i14, k.f82318c, new v(n13, 5));
        return new b(n13.i());
    }
}
