package ef2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58841a;

    public /* synthetic */ a(int i13) {
        this.f58841a = i13;
    }

    public static int e(mm.b builder, int i13, int i14) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.o(2);
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.d(1, i14);
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.d(0, i13);
        Intrinsics.checkNotNullParameter(builder, "builder");
        int g13 = builder.g();
        builder.l(g13, 4);
        builder.l(g13, 6);
        return g13;
    }

    public static int f(mm.b builder, float f13, float f14) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.o(2);
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.b(1, f14);
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.b(0, f13);
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.g();
    }

    public static ff2.b g(ByteBuffer _bb) {
        Intrinsics.checkNotNullParameter(_bb, "_bb");
        ff2.b obj = new ff2.b();
        Intrinsics.checkNotNullParameter(_bb, "_bb");
        Intrinsics.checkNotNullParameter(obj, "obj");
        _bb.order(ByteOrder.LITTLE_ENDIAN);
        int position = _bb.position() + _bb.getInt(_bb.position());
        Intrinsics.checkNotNullParameter(_bb, "_bb");
        Intrinsics.checkNotNullParameter(_bb, "_bb");
        obj.c(position, _bb);
        return obj;
    }

    public final void a(int i13, mm.b builder) {
        switch (this.f58841a) {
            case 6:
                Intrinsics.checkNotNullParameter(builder, "builder");
                builder.d(0, i13);
                break;
            case 9:
                Intrinsics.checkNotNullParameter(builder, "builder");
                builder.d(0, i13);
                break;
            case 13:
                Intrinsics.checkNotNullParameter(builder, "builder");
                builder.d(0, i13);
                break;
            case 19:
                Intrinsics.checkNotNullParameter(builder, "builder");
                builder.d(0, i13);
                break;
            case 24:
                Intrinsics.checkNotNullParameter(builder, "builder");
                builder.d(0, i13);
                break;
            default:
                Intrinsics.checkNotNullParameter(builder, "builder");
                builder.d(0, i13);
                break;
        }
    }

    public final void b(int i13, mm.b builder) {
        switch (this.f58841a) {
            case 13:
                Intrinsics.checkNotNullParameter(builder, "builder");
                builder.d(1, i13);
                break;
            case 19:
                Intrinsics.checkNotNullParameter(builder, "builder");
                builder.d(1, i13);
                break;
            case 24:
                Intrinsics.checkNotNullParameter(builder, "builder");
                builder.d(1, i13);
                break;
            default:
                Intrinsics.checkNotNullParameter(builder, "builder");
                builder.d(1, i13);
                break;
        }
    }

    public final void c(int i13, mm.b builder) {
        switch (this.f58841a) {
            case 11:
                Intrinsics.checkNotNullParameter(builder, "builder");
                builder.d(1, i13);
                break;
            case 17:
                Intrinsics.checkNotNullParameter(builder, "builder");
                builder.d(1, i13);
                break;
            case 21:
                Intrinsics.checkNotNullParameter(builder, "builder");
                if (i13 == 0) {
                    builder.getClass();
                    break;
                } else {
                    builder.k(4, 0);
                    ByteBuffer byteBuffer = builder.f87553a;
                    int i14 = builder.f87554b - 4;
                    builder.f87554b = i14;
                    byteBuffer.putInt(i14, i13);
                    builder.n(0);
                    break;
                }
            case 25:
                Intrinsics.checkNotNullParameter(builder, "builder");
                builder.d(1, i13);
                break;
            default:
                Intrinsics.checkNotNullParameter(builder, "builder");
                builder.d(1, i13);
                break;
        }
    }

    public final void d(mm.b builder, byte b13) {
        switch (this.f58841a) {
            case 11:
                Intrinsics.checkNotNullParameter(builder, "builder");
                builder.a(0, b13);
                break;
            case 17:
                Intrinsics.checkNotNullParameter(builder, "builder");
                builder.a(0, b13);
                break;
            case 25:
                Intrinsics.checkNotNullParameter(builder, "builder");
                builder.a(0, b13);
                break;
            default:
                Intrinsics.checkNotNullParameter(builder, "builder");
                builder.a(0, b13);
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i13, int i14) {
        this(0);
        this.f58841a = i13;
        switch (i13) {
            case 1:
                this(1);
                break;
            case 2:
                this(2);
                break;
            case 3:
                this(3);
                break;
            case 4:
                this(4);
                break;
            case 5:
                this(5);
                break;
            case 6:
                this(6);
                break;
            case 7:
                this(7);
                break;
            case 8:
                this(8);
                break;
            case 9:
                this(9);
                break;
            case 10:
                this(10);
                break;
            case 11:
                this(11);
                break;
            case 12:
                this(12);
                break;
            case 13:
                this(13);
                break;
            case 14:
                this(14);
                break;
            case 15:
                this(15);
                break;
            case 16:
                this(16);
                break;
            case 17:
                this(17);
                break;
            case 18:
                this(18);
                break;
            case 19:
                this(19);
                break;
            case 20:
                this(20);
                break;
            case 21:
                this(21);
                break;
            case 22:
                this(22);
                break;
            case 23:
                this(23);
                break;
            case 24:
                this(24);
                break;
            case 25:
                this(25);
                break;
            case 26:
                this(26);
                break;
            case 27:
                this(27);
                break;
            case 28:
                this(28);
                break;
            case 29:
                this(29);
                break;
            default:
                break;
        }
    }
}
