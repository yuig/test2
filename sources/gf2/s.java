package gf2;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class s extends mm.c {

    /* renamed from: f, reason: collision with root package name */
    public static final ef2.a f64881f = new ef2.a(26, 0);

    public final mm.c g(mm.c obj) {
        Intrinsics.checkNotNullParameter(obj, "obj");
        int b13 = b(6);
        if (b13 == 0) {
            return null;
        }
        int i13 = b13 + this.f87566a;
        ByteBuffer byteBuffer = this.f87567b;
        obj.c(byteBuffer.getInt(i13) + i13, byteBuffer);
        return obj;
    }
}
