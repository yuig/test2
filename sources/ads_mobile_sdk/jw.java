package ads_mobile_sdk;

import a.ta;
import a.z5;

/* loaded from: classes2.dex */
public final class jw extends sj0 {
    private static final jw DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f6977c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f6978d = 2;
    private int bitField0_;
    private byte memoizedIsInitialized = 2;
    private il name_;
    private il value_;

    static {
        jw jwVar = new jw();
        DEFAULT_INSTANCE = jwVar;
        sj0.a(jw.class, jwVar);
    }

    public jw() {
        gl glVar = il.f6431b;
        this.name_ = glVar;
        this.value_ = glVar;
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        switch (a.bb.c(i13)) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                this.memoizedIsInitialized = (byte) (sj0Var == null ? 0 : 1);
                return null;
            case 2:
                return new f62(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"bitField0_", "name_", "value_"});
            case 3:
                return new jw();
            case 4:
                return new z5(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                ta taVar = PARSER;
                if (taVar == null) {
                    synchronized (jw.class) {
                        try {
                            taVar = PARSER;
                            if (taVar == null) {
                                taVar = new rj0(DEFAULT_INSTANCE);
                                PARSER = taVar;
                            }
                        } finally {
                        }
                    }
                }
                return taVar;
            default:
                throw null;
        }
    }

    public static z5 r() {
        return (z5) DEFAULT_INSTANCE.f();
    }
}
