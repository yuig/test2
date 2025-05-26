package qr0;

import wa2.p;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f104960a;

    static {
        int[] iArr = new int[p.values().length];
        f104960a = iArr;
        try {
            iArr[p.STATE_FILTER_BOARD_PINS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f104960a[p.STATE_UNDO_FILTER_BOARD_PINS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f104960a[p.STATE_UNFOLLOWED_BOARD.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f104960a[p.STATE_UNLIKED_BOARD.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f104960a[p.STATE_UNDO_UNFOLLOWED_BOARD.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f104960a[p.STATE_UNFOLLOWED_USER.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f104960a[p.STATE_UNLIKED_USER.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f104960a[p.STATE_UNDO_UNFOLLOWED_USER.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f104960a[p.STATE_UNFOLLOWED_INTEREST.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f104960a[p.STATE_UNLIKED_INTEREST.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            f104960a[p.STATE_UNDO_UNFOLLOWED_INTEREST.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
    }
}
