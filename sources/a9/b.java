package a9;

import a7.n0;
import d7.d0;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b extends dl2.b {
    public static a c3(d0 d0Var) {
        String t13 = d0Var.t();
        t13.getClass();
        String t14 = d0Var.t();
        t14.getClass();
        return new a(t13, t14, d0Var.s(), d0Var.s(), Arrays.copyOfRange(d0Var.f53806a, d0Var.f53807b, d0Var.f53808c));
    }

    @Override // dl2.b
    public final n0 e0(y8.a aVar, ByteBuffer byteBuffer) {
        return new n0(c3(new d0(byteBuffer.array(), byteBuffer.limit())));
    }
}
