package dn2;

import am2.d0;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import pn2.b0;
import pn2.h0;

/* loaded from: classes4.dex */
public final class z extends p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f55638b = 0;

    public z(byte b13) {
        super(Byte.valueOf(b13));
    }

    @Override // dn2.g
    public final b0 a(d0 module) {
        h0 j13;
        switch (this.f55638b) {
            case 0:
                Intrinsics.checkNotNullParameter(module, "module");
                am2.g c03 = l0.c0(module, xl2.q.R);
                j13 = c03 != null ? c03.j() : null;
                return j13 == null ? rn2.m.d(rn2.l.NOT_FOUND_UNSIGNED_TYPE, "UByte") : j13;
            case 1:
                Intrinsics.checkNotNullParameter(module, "module");
                am2.g c04 = l0.c0(module, xl2.q.T);
                j13 = c04 != null ? c04.j() : null;
                return j13 == null ? rn2.m.d(rn2.l.NOT_FOUND_UNSIGNED_TYPE, "UInt") : j13;
            case 2:
                Intrinsics.checkNotNullParameter(module, "module");
                am2.g c05 = l0.c0(module, xl2.q.U);
                j13 = c05 != null ? c05.j() : null;
                return j13 == null ? rn2.m.d(rn2.l.NOT_FOUND_UNSIGNED_TYPE, "ULong") : j13;
            default:
                Intrinsics.checkNotNullParameter(module, "module");
                am2.g c06 = l0.c0(module, xl2.q.S);
                j13 = c06 != null ? c06.j() : null;
                return j13 == null ? rn2.m.d(rn2.l.NOT_FOUND_UNSIGNED_TYPE, "UShort") : j13;
        }
    }

    @Override // dn2.g
    public final String toString() {
        int i13 = this.f55638b;
        Object obj = this.f55623a;
        switch (i13) {
            case 0:
                return ((Number) obj).intValue() + ".toUByte()";
            case 1:
                return ((Number) obj).intValue() + ".toUInt()";
            case 2:
                return ((Number) obj).longValue() + ".toULong()";
            default:
                return ((Number) obj).intValue() + ".toUShort()";
        }
    }

    public z(int i13) {
        super(Integer.valueOf(i13));
    }

    public z(long j13) {
        super(Long.valueOf(j13));
    }

    public z(short s13) {
        super(Short.valueOf(s13));
    }
}
