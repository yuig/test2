package ip2;

import ja.c0;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final Serializable f73384a;

    public t(boolean z13) {
        this.f73384a = Boolean.valueOf(z13);
    }

    public static t a(m mVar, String str, int[] iArr) {
        loop0: for (l lVar : mVar.f()) {
            if (!lVar.n() || lVar.f().equals(str)) {
                if (lVar.o()) {
                    int[] c13 = c0.c(lVar.k());
                    int i13 = 0;
                    while (i13 < Math.max(iArr.length, c13.length)) {
                        int i14 = i13 < iArr.length ? iArr[i13] : 0;
                        int i15 = i13 < c13.length ? c13[i13] : 0;
                        if (i14 > i15) {
                            break loop0;
                        }
                        if (i14 < i15) {
                            break;
                        }
                        i13++;
                    }
                }
                k m13 = lVar.m();
                switch (r.f73383a[m13.ordinal()]) {
                    case 1:
                        return new t(lVar.g());
                    case 2:
                        return new t(lVar.j());
                    case 3:
                        return new t(lVar.i());
                    case 4:
                        return new t(lVar.l());
                    case 5:
                        return new t(lVar.h());
                    case 6:
                        return null;
                    default:
                        throw new IllegalArgumentException("Flag value uses unknown value type " + m13);
                }
            }
        }
        return null;
    }

    public final void b(s sVar) {
        s d2 = d();
        if (sVar == d2) {
            return;
        }
        throw new IllegalStateException("Attempted to access flag value as " + sVar + ", but actual type is " + d2);
    }

    public final String c() {
        b(s.STRING);
        return (String) this.f73384a;
    }

    public final s d() {
        Serializable serializable = this.f73384a;
        if (serializable instanceof Boolean) {
            return s.BOOL;
        }
        if (serializable instanceof Long) {
            return s.INT;
        }
        if (serializable instanceof Float) {
            return s.FLOAT;
        }
        if (serializable instanceof String) {
            return s.STRING;
        }
        if (serializable instanceof com.google.protobuf.l) {
            return s.BYTES;
        }
        throw new IllegalStateException("Unexpected flag value type: ".concat(serializable.getClass().getName()));
    }

    public t(long j13) {
        this.f73384a = Long.valueOf(j13);
    }

    public t(float f13) {
        this.f73384a = Float.valueOf(f13);
    }

    public t(String str) {
        this.f73384a = str;
    }

    public t(com.google.protobuf.l lVar) {
        this.f73384a = lVar;
    }
}
