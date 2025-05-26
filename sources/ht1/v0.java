package ht1;

import com.pinterest.mediaPipeline.PipelineException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class v0 extends mt1.i {

    /* renamed from: d */
    public final /* synthetic */ int f70362d = 0;

    /* renamed from: e */
    public boolean f70363e;

    /* renamed from: f */
    public final Object f70364f;

    public v0(w0 w0Var) {
        this.f70364f = w0Var;
    }

    @Override // mt1.a
    public final void a(Object obj) {
        Unit unit;
        int i13;
        switch (this.f70362d) {
            case 0:
                ft1.a incomingPacket = (ft1.a) obj;
                Intrinsics.checkNotNullParameter(incomingPacket, "incomingPacket");
                w0 w0Var = (w0) this.f70364f;
                w0Var.f70369c.clear();
                int capacity = w0Var.f70369c.capacity();
                int remaining = incomingPacket.f62935c.remaining();
                ByteBuffer byteBuffer = incomingPacket.f62935c;
                if (capacity < remaining) {
                    w0Var.f70369c = ByteBuffer.allocate(byteBuffer.remaining());
                }
                w0Var.f70369c.order(byteBuffer.order());
                ft1.i g13 = incomingPacket.f62934b.g();
                int i14 = g13 == null ? -1 : u0.f70358a[g13.ordinal()];
                if (i14 == -1) {
                    throw new PipelineException("Volume control is only supported for linear PCM types", kotlin.collections.e0.b(new Pair("Volume Control", this)), null, incomingPacket, ((et1.v0) w0Var.f70367a).f60109a, 4);
                }
                byte b13 = 255;
                if (i14 == 1) {
                    float f13 = w0Var.f70368b;
                    ByteBuffer byteBuffer2 = w0Var.f70369c;
                    Intrinsics.checkNotNullExpressionValue(byteBuffer2, "access$getAdjustedAudio$p(...)");
                    while (byteBuffer.hasRemaining()) {
                        byte b14 = byteBuffer.get();
                        xk2.x xVar = xk2.y.f135237b;
                        byteBuffer2.put((byte) ml2.c.c(ql2.s.f((b14 & 255) * f13, 0, 255)));
                    }
                    unit = Unit.f80348a;
                } else if (i14 == 2) {
                    float f14 = w0Var.f70368b;
                    ByteBuffer byteBuffer3 = w0Var.f70369c;
                    Intrinsics.checkNotNullExpressionValue(byteBuffer3, "access$getAdjustedAudio$p(...)");
                    while (byteBuffer.hasRemaining()) {
                        byteBuffer3.putShort((short) ml2.c.c(ql2.s.f(byteBuffer.getShort() * f14, -32768.0f, 32767.0f)));
                    }
                    unit = Unit.f80348a;
                } else if (i14 == 3) {
                    float f15 = w0Var.f70368b;
                    ByteBuffer putUByte = w0Var.f70369c;
                    Intrinsics.checkNotNullExpressionValue(putUByte, "access$getAdjustedAudio$p(...)");
                    while (byteBuffer.hasRemaining()) {
                        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
                        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
                        byte b15 = byteBuffer.get();
                        xk2.x xVar2 = xk2.y.f135237b;
                        int i15 = b15 & b13;
                        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
                        int i16 = byteBuffer.get() & b13;
                        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
                        int i17 = byteBuffer.get() & b13;
                        ByteOrder order = byteBuffer.order();
                        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                        if (Intrinsics.d(order, byteOrder)) {
                            i13 = i15 | (i16 << 8) | (i17 << 16);
                        } else {
                            if (!Intrinsics.d(order, ByteOrder.BIG_ENDIAN)) {
                                throw new RuntimeException("Unknown byte-order [" + byteBuffer.order() + "]");
                            }
                            i13 = (i15 << 16) | (i16 << 8) | i17;
                        }
                        int c13 = ml2.c.c(ql2.s.f(((i13 << 8) >> 8) * f15, -8388608.0f, 8388607.0f));
                        Intrinsics.checkNotNullParameter(putUByte, "<this>");
                        byte b16 = (byte) c13;
                        byte b17 = (byte) (c13 >> 8);
                        byte b18 = (byte) (c13 >> 16);
                        ByteOrder order2 = putUByte.order();
                        if (Intrinsics.d(order2, byteOrder)) {
                            Intrinsics.checkNotNullParameter(putUByte, "$this$putUByte");
                            putUByte.put(b16);
                            Intrinsics.checkNotNullParameter(putUByte, "$this$putUByte");
                            putUByte.put(b17);
                            Intrinsics.checkNotNullParameter(putUByte, "$this$putUByte");
                            putUByte.put(b18);
                        } else {
                            if (!Intrinsics.d(order2, ByteOrder.BIG_ENDIAN)) {
                                throw new RuntimeException("Unknown byte-order [" + putUByte.order() + "]");
                            }
                            Intrinsics.checkNotNullParameter(putUByte, "$this$putUByte");
                            putUByte.put(b18);
                            Intrinsics.checkNotNullParameter(putUByte, "$this$putUByte");
                            putUByte.put(b17);
                            Intrinsics.checkNotNullParameter(putUByte, "$this$putUByte");
                            putUByte.put(b16);
                        }
                        b13 = 255;
                    }
                    unit = Unit.f80348a;
                } else if (i14 == 4) {
                    float f16 = w0Var.f70368b;
                    ByteBuffer byteBuffer4 = w0Var.f70369c;
                    Intrinsics.checkNotNullExpressionValue(byteBuffer4, "access$getAdjustedAudio$p(...)");
                    while (byteBuffer.hasRemaining()) {
                        byteBuffer4.putInt(ml2.c.c(ql2.s.f(byteBuffer.getInt() * f16, -2.1474836E9f, 2.1474836E9f)));
                    }
                    unit = Unit.f80348a;
                } else {
                    if (i14 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    float f17 = w0Var.f70368b;
                    ByteBuffer byteBuffer5 = w0Var.f70369c;
                    Intrinsics.checkNotNullExpressionValue(byteBuffer5, "access$getAdjustedAudio$p(...)");
                    while (byteBuffer.hasRemaining()) {
                        byteBuffer5.putFloat(byteBuffer.getFloat() * f17);
                    }
                    unit = Unit.f80348a;
                }
                el.a.B(unit);
                w0Var.f70369c.flip();
                ByteBuffer byteBuffer6 = w0Var.f70369c;
                Intrinsics.checkNotNullExpressionValue(byteBuffer6, "access$getAdjustedAudio$p(...)");
                e(new ft1.a(incomingPacket.f62933a, incomingPacket.f62934b, byteBuffer6, incomingPacket.f62936d, incomingPacket.f62937e));
                return;
            default:
                e(obj);
                return;
        }
    }

    @Override // mt1.i, mt1.a
    public final void g() {
        switch (this.f70362d) {
            case 0:
                if (this.f70363e) {
                    throw new PipelineException("Received end-of-input more than once", kotlin.collections.e0.b(new Pair("At", this)), null, null, ((et1.v0) ((w0) this.f70364f).f70367a).f60109a, 12);
                }
                this.f70363e = true;
                super.g();
                return;
            default:
                this.f70363e = true;
                super.g();
                return;
        }
    }

    @Override // mt1.i
    public final String toString() {
        switch (this.f70362d) {
            case 0:
                return "Adjust Volume receivedEndOfInput=[" + this.f70363e + "]";
            default:
                return "Pass-through [" + ((String) this.f70364f) + "] receivedEndOfInput? [" + this.f70363e + "]";
        }
    }

    public v0(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f70364f = name;
    }
}
