package pa2;

import bi0.c;
import wa2.p;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f99400a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f99401b;

    static {
        int[] iArr = new int[c.values().length];
        f99401b = iArr;
        try {
            iArr[c.USER_ACTIVITY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f99401b[c.REALTIME_P2B.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f99401b[c.CLICKTHROUGH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f99401b[c.P2P.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f99401b[c.RECOMMENDED_COMMERCE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        int[] iArr2 = new int[p.values().length];
        f99400a = iArr2;
        try {
            iArr2[p.STATE_NOT_INTO.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f99400a[p.STATE_HIDDEN.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f99400a[p.STATE_NOT_RELEVANT.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f99400a[p.STATE_DOESNT_BELONG.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f99400a[p.STATE_REPORTED.ordinal()] = 5;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            f99400a[p.STATE_UNLIKED_BOARD.ordinal()] = 6;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            f99400a[p.STATE_UNFOLLOWED_BOARD.ordinal()] = 7;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            f99400a[p.STATE_UNLIKED_USER.ordinal()] = 8;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            f99400a[p.STATE_UNFOLLOWED_USER.ordinal()] = 9;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            f99400a[p.STATE_UNLIKED_INTEREST.ordinal()] = 10;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            f99400a[p.STATE_UNFOLLOWED_INTEREST.ordinal()] = 11;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            f99400a[p.STATE_NO_FEEDBACK.ordinal()] = 12;
        } catch (NoSuchFieldError unused17) {
        }
    }
}
