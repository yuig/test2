package ads_mobile_sdk;

import a.ta;

/* loaded from: classes2.dex */
public final class c51 extends sj0 {
    private static final c51 DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f3773c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f3774d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f3775e = 3;

    /* renamed from: f, reason: collision with root package name */
    public static final int f3776f = 4;

    /* renamed from: g, reason: collision with root package name */
    public static final int f3777g = 5;
    private int keyManagerVersion_;
    private boolean newKeyAllowed_;
    private String primitiveName_ = "";
    private String typeUrl_ = "";
    private String catalogueName_ = "";

    static {
        c51 c51Var = new c51();
        DEFAULT_INSTANCE = c51Var;
        sj0.a(c51.class, c51Var);
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"primitiveName_", "typeUrl_", "keyManagerVersion_", "newKeyAllowed_", "catalogueName_"});
        }
        if (c13 == 3) {
            return new c51();
        }
        if (c13 == 4) {
            return new a.k(3);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (c51.class) {
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
    }
}
