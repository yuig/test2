package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;

/* loaded from: classes3.dex */
public abstract class v1 {
    public abstract w1 a(Object obj);

    public abstract void b(Object obj);

    public final boolean c(Object obj, p1 p1Var) {
        o oVar = (o) p1Var;
        int i13 = oVar.f33668b;
        int i14 = i13 >>> 3;
        int i15 = i13 & 7;
        if (i15 == 0) {
            oVar.w(0);
            ((w1) obj).d(i14 << 3, Long.valueOf(oVar.f33667a.q()));
            return true;
        }
        if (i15 == 1) {
            oVar.w(1);
            ((w1) obj).d((i14 << 3) | 1, Long.valueOf(oVar.f33667a.n()));
            return true;
        }
        if (i15 == 2) {
            ((w1) obj).d((i14 << 3) | 2, oVar.f());
            return true;
        }
        if (i15 != 3) {
            if (i15 == 4) {
                return false;
            }
            if (i15 != 5) {
                int i16 = InvalidProtocolBufferException.f33590b;
                throw new InvalidProtocolBufferException.InvalidWireTypeException();
            }
            oVar.w(5);
            ((w1) obj).d((i14 << 3) | 5, Integer.valueOf(oVar.f33667a.m()));
            return true;
        }
        w1 c13 = w1.c();
        int i17 = i14 << 3;
        int i18 = i17 | 4;
        while (oVar.b() != Integer.MAX_VALUE && c(c13, oVar)) {
        }
        if (i18 != oVar.f33668b) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
        if (c13.f33709e) {
            c13.f33709e = false;
        }
        ((w1) obj).d(i17 | 3, c13);
        return true;
    }
}
