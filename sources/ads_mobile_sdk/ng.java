package ads_mobile_sdk;

/* loaded from: classes2.dex */
public enum ng implements a.w {
    UNSUPPORTED(0),
    ARM7(2),
    X86(4),
    ARM64(5),
    X86_64(6),
    RISCV64(7),
    UNKNOWN(999);


    /* renamed from: a, reason: collision with root package name */
    public final int f8781a;

    ng(int i13) {
        this.f8781a = i13;
    }

    public static ng a(int i13) {
        if (i13 == 0) {
            return UNSUPPORTED;
        }
        if (i13 == 2) {
            return ARM7;
        }
        if (i13 == 999) {
            return UNKNOWN;
        }
        if (i13 == 4) {
            return X86;
        }
        if (i13 == 5) {
            return ARM64;
        }
        if (i13 == 6) {
            return X86_64;
        }
        if (i13 != 7) {
            return null;
        }
        return RISCV64;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + ng.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f8781a + " name=" + name() + '>';
    }

    @Override // a.w
    public final int a() {
        return this.f8781a;
    }
}
