package lq0;

import com.pinterest.api.model.mv;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class q {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f84406a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f84407b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f84408c;

    static {
        int[] iArr = new int[mv.c.values().length];
        try {
            iArr[mv.c.BOARD_INVITE_SENT_SYSTEM_MESSAGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[mv.c.BOARD_INVITE_ACCEPTED_SYSTEM_MESSAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[mv.c.BOARD_NEW_PINS_SYSTEM_MESSAGE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[mv.c.EXTERNAL_SHARE_SYSTEM_MESSAGE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f84406a = iArr;
        int[] iArr2 = new int[p.values().length];
        try {
            iArr2[p.PIN.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[p.GIF.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[p.PINNER.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[p.BOARD.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[p.TEXT.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[p.NONE.ordinal()] = 6;
        } catch (NoSuchFieldError unused10) {
        }
        f84407b = iArr2;
        int[] iArr3 = new int[mq0.d.values().length];
        try {
            iArr3[mq0.d.TOP.ordinal()] = 1;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[mq0.d.BOTTOM.ordinal()] = 2;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr3[mq0.d.BOTTOM_BELOW_ANCHOR.ordinal()] = 3;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr3[mq0.d.MIDDLE.ordinal()] = 4;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr3[mq0.d.MIDDLE_BELOW_ANCHOR.ordinal()] = 5;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr3[mq0.d.SINGLE.ordinal()] = 6;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr3[mq0.d.NONE.ordinal()] = 7;
        } catch (NoSuchFieldError unused17) {
        }
        f84408c = iArr3;
    }
}
