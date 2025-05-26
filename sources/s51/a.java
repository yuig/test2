package s51;

import u51.x;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f111149a;

    static {
        int[] iArr = new int[x.values().length];
        try {
            iArr[x.IGNORE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[x.SPAM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[x.POLICIES.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[x.IP.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[x.POLICY_HURTFUL_CONTENT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[x.IGNORE_UNFOLLOW_BOARD.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[x.IGNORE_UNFOLLOW_USER.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[x.IGNORE_BLOCK_USER.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[x.FILE_IP_REPORT.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[x.DID_IT_ON_PINTEREST_IP.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[x.DID_IT_ON_PINTEREST.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[x.DID_IT_ON_PINTEREST_HARASS.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        f111149a = iArr;
    }
}
