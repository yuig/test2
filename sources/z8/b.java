package z8;

import a7.n0;
import d7.c0;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class b extends dl2.b {
    @Override // dl2.b
    public final n0 e0(y8.a aVar, ByteBuffer byteBuffer) {
        if (byteBuffer.get() != 116) {
            return null;
        }
        c0 c0Var = new c0(byteBuffer.array(), byteBuffer.limit());
        c0Var.o(12);
        int d2 = (c0Var.d() + c0Var.g(12)) - 4;
        c0Var.o(44);
        c0Var.p(c0Var.g(12));
        c0Var.o(16);
        ArrayList arrayList = new ArrayList();
        while (c0Var.d() < d2) {
            c0Var.o(48);
            int g13 = c0Var.g(8);
            c0Var.o(4);
            int d13 = c0Var.d() + c0Var.g(12);
            String str = null;
            String str2 = null;
            while (c0Var.d() < d13) {
                int g14 = c0Var.g(8);
                int g15 = c0Var.g(8);
                int d14 = c0Var.d() + g15;
                if (g14 == 2) {
                    int g16 = c0Var.g(16);
                    c0Var.o(8);
                    if (g16 == 3) {
                        while (c0Var.d() < d14) {
                            int g17 = c0Var.g(8);
                            Charset charset = StandardCharsets.US_ASCII;
                            byte[] bArr = new byte[g17];
                            c0Var.j(bArr, g17);
                            str = new String(bArr, charset);
                            int g18 = c0Var.g(8);
                            for (int i13 = 0; i13 < g18; i13++) {
                                c0Var.p(c0Var.g(8));
                            }
                        }
                    }
                } else if (g14 == 21) {
                    Charset charset2 = StandardCharsets.US_ASCII;
                    byte[] bArr2 = new byte[g15];
                    c0Var.j(bArr2, g15);
                    str2 = new String(bArr2, charset2);
                }
                c0Var.m(d14 * 8);
            }
            c0Var.m(d13 * 8);
            if (str != null && str2 != null) {
                arrayList.add(new a(g13, str.concat(str2)));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new n0(arrayList);
    }
}
