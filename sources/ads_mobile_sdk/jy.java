package ads_mobile_sdk;

import a.h4;
import a.ta;

/* loaded from: classes2.dex */
public final class jy extends sj0 {
    private static final jy DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f7011c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f7012d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f7013e = 3;

    /* renamed from: f, reason: collision with root package name */
    public static final int f7014f = 5;

    /* renamed from: g, reason: collision with root package name */
    public static final int f7015g = 6;

    /* renamed from: h, reason: collision with root package name */
    public static final int f7016h = 7;
    private int bitField0_;
    private int id_;
    private int resourceId_;
    private String tag_ = "";
    private a.g1 childIds_ = sj0.g();
    private h4 attribute_ = sj0.i();
    private il innerHtml_ = il.f6431b;

    static {
        jy jyVar = new jy();
        DEFAULT_INSTANCE = jyVar;
        sj0.a(jy.class, jyVar);
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u0016\u0005င\u0002\u0006\u001b\u0007ည\u0003", new Object[]{"bitField0_", "id_", "tag_", "childIds_", "resourceId_", "attribute_", hy.class, "innerHtml_"});
        }
        if (c13 == 3) {
            return new jy();
        }
        if (c13 == 4) {
            return new a.k(19);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (jy.class) {
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
