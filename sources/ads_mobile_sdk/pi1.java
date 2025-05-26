package ads_mobile_sdk;

import a.ta;

/* loaded from: classes2.dex */
public final class pi1 extends sj0 {
    private static final pi1 DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f9697c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f9698d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f9699e = 3;

    /* renamed from: f, reason: collision with root package name */
    public static final int f9700f = 4;

    /* renamed from: g, reason: collision with root package name */
    public static final int f9701g = 5;

    /* renamed from: h, reason: collision with root package name */
    public static final int f9702h = 6;

    /* renamed from: i, reason: collision with root package name */
    public static final int f9703i = 7;

    /* renamed from: j, reason: collision with root package name */
    public static final int f9704j = 8;

    /* renamed from: k, reason: collision with root package name */
    public static final int f9705k = 9;
    private int bitField0_;
    private boolean disableImageLoading_;
    private boolean isBannerAllowed_;
    private boolean isNativeAllowed_;
    private boolean multipleImages_;
    private String nativeMediaOrientation_ = "";
    private int preferredAdChoicesPosition_;
    private ri1 sdkCustomClickGesture_;
    private boolean useCustomMute_;
    private ti1 videoOptions_;

    static {
        pi1 pi1Var = new pi1();
        DEFAULT_INSTANCE = pi1Var;
        sj0.a(pi1.class, pi1Var);
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003\u0005ဇ\u0004\u0006ဈ\u0005\u0007ဇ\u0006\bဇ\u0007\tဉ\b", new Object[]{"bitField0_", "videoOptions_", "multipleImages_", "useCustomMute_", "preferredAdChoicesPosition_", "disableImageLoading_", "nativeMediaOrientation_", "isBannerAllowed_", "isNativeAllowed_", "sdkCustomClickGesture_"});
        }
        if (c13 == 3) {
            return new pi1();
        }
        if (c13 == 4) {
            return new a.k9(DEFAULT_INSTANCE);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (pi1.class) {
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

    public static a.k9 r() {
        return (a.k9) DEFAULT_INSTANCE.f();
    }
}
