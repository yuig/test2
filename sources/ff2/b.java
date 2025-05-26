package ff2;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import mm.c;

/* loaded from: classes4.dex */
public final class b extends c {

    /* renamed from: f, reason: collision with root package name */
    public static final ef2.a f62108f = new ef2.a(5, 0);

    public final ef2.b g() {
        ef2.b obj = new ef2.b();
        Intrinsics.checkNotNullParameter(obj, "obj");
        int b13 = b(10);
        if (b13 == 0) {
            throw new AssertionError("No value for (required) field assets");
        }
        int a13 = a(b13 + this.f87566a);
        ByteBuffer _bb = this.f87567b;
        Intrinsics.checkNotNullExpressionValue(_bb, "bb");
        Intrinsics.checkNotNullParameter(_bb, "_bb");
        Intrinsics.checkNotNullParameter(_bb, "_bb");
        obj.c(a13, _bb);
        return obj;
    }

    public final String h() {
        int b13 = b(4);
        if (b13 != 0) {
            return d(b13 + this.f87566a);
        }
        throw new AssertionError("No value for (required) field name");
    }

    public final ef2.b i() {
        ef2.b obj = new ef2.b();
        Intrinsics.checkNotNullParameter(obj, "obj");
        int b13 = b(8);
        if (b13 == 0) {
            throw new AssertionError("No value for (required) field settings");
        }
        int a13 = a(b13 + this.f87566a);
        ByteBuffer _bb = this.f87567b;
        Intrinsics.checkNotNullExpressionValue(_bb, "bb");
        Intrinsics.checkNotNullParameter(_bb, "_bb");
        Intrinsics.checkNotNullParameter(_bb, "_bb");
        obj.c(a13, _bb);
        return obj;
    }

    public final String j() {
        int b13 = b(6);
        if (b13 != 0) {
            return d(b13 + this.f87566a);
        }
        throw new AssertionError("No value for (required) field shader");
    }
}
