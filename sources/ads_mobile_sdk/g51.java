package ads_mobile_sdk;

import a.s2;
import a.ta;

/* loaded from: classes2.dex */
public final class g51 extends sj0 {
    private static final g51 DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f5433c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f5434d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f5435e = 3;

    /* renamed from: f, reason: collision with root package name */
    public static final int f5436f = 4;
    private int bitField0_;
    private il hmacKey_;
    private int hmacSignatureLength_;
    private byte memoizedIsInitialized = 2;
    private il symmetricKey_;
    private int type_;

    static {
        g51 g51Var = new g51();
        DEFAULT_INSTANCE = g51Var;
        sj0.a(g51.class, g51Var);
    }

    public g51() {
        gl glVar = il.f6431b;
        this.symmetricKey_ = glVar;
        this.hmacKey_ = glVar;
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
                return new f62(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0003\u0001ᴌ\u0000\u0002ᔊ\u0001\u0003ᔊ\u0002\u0004င\u0003", new Object[]{"bitField0_", "type_", d51.f4175a, "symmetricKey_", "hmacKey_", "hmacSignatureLength_"});
            case 3:
                return new g51();
            case 4:
                return new s2(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                ta taVar = PARSER;
                if (taVar == null) {
                    synchronized (g51.class) {
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

    public static s2 r() {
        return (s2) DEFAULT_INSTANCE.f();
    }
}
