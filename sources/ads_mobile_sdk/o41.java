package ads_mobile_sdk;

import a.ta;
import a.w7;

/* loaded from: classes2.dex */
public final class o41 extends sj0 {
    private static final o41 DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f9122c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f9123d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f9124e = 3;
    private int keyMaterialType_;
    private String typeUrl_ = "";
    private il value_ = il.f6431b;

    static {
        o41 o41Var = new o41();
        DEFAULT_INSTANCE = o41Var;
        sj0.a(o41.class, o41Var);
    }

    public static w7 v() {
        return (w7) DEFAULT_INSTANCE.f();
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "keyMaterialType_"});
        }
        if (c13 == 3) {
            return new o41();
        }
        if (c13 == 4) {
            return new w7(DEFAULT_INSTANCE);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (o41.class) {
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

    public final il u() {
        return this.value_;
    }

    public static o41 r() {
        return DEFAULT_INSTANCE;
    }

    public final n41 s() {
        int i13 = this.keyMaterialType_;
        n41 n41Var = i13 != 0 ? i13 != 1 ? i13 != 2 ? i13 != 3 ? i13 != 4 ? null : n41.REMOTE : n41.ASYMMETRIC_PUBLIC : n41.ASYMMETRIC_PRIVATE : n41.SYMMETRIC : n41.UNKNOWN_KEYMATERIAL;
        return n41Var == null ? n41.UNRECOGNIZED : n41Var;
    }

    public final String t() {
        return this.typeUrl_;
    }
}
