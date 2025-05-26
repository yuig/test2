package is0;

import wa2.p;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class d {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f73531a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f73532b;

    static {
        int[] iArr = new int[jo1.a.values().length];
        try {
            iArr[jo1.a.BOARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[jo1.a.BOARD_SECTION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[jo1.a.REPORT_PIN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[jo1.a.BOARD_SHOP_TOOLS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f73531a = iArr;
        int[] iArr2 = new int[p.values().length];
        try {
            iArr2[p.STATE_REPORTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[p.STATE_LOW_QUALITY.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[p.STATE_UNLIKED_BOARD.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[p.STATE_UNLIKED_USER.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[p.STATE_UNLIKED_INTEREST.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[p.STATE_UNFOLLOWED_BOARD.ordinal()] = 6;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[p.STATE_UNFOLLOWED_USER.ordinal()] = 7;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[p.STATE_UNFOLLOWED_INTEREST.ordinal()] = 8;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[p.STATE_NOT_INTO.ordinal()] = 9;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[p.STATE_TOPIC_NOT_FOR_ME.ordinal()] = 10;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[p.STATE_LOW_QUALITY_AD.ordinal()] = 11;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr2[p.STATE_TOPIC_NOT_FOR_ME_AD.ordinal()] = 12;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr2[p.STATE_REPETITIVE_AD.ordinal()] = 13;
        } catch (NoSuchFieldError unused17) {
        }
        f73532b = iArr2;
    }
}
