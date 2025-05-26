package kl0;

import i32.b1;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class f {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f80077a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f80078b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f80079c;

    static {
        int[] iArr = new int[zo.c.values().length];
        try {
            iArr[zo.c.DENSE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[zo.c.SINGLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f80077a = iArr;
        int[] iArr2 = new int[b1.values().length];
        try {
            iArr2[b1.ANDROID_OWN_BOARD_OVERFLOW_BUTTON.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[b1.ANDROID_BOARD_SHARE_BUTTON.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[b1.ANDROID_OWN_BOARD_ORGANIZE_TOOL_BUTTON.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[b1.ANDROID_OWN_BOARD_MORE_IDEAS_TOOL_BUTTON.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[b1.ANDROID_OWN_BOARD_ADD_NEW_PLUS_BUTTON.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        f80078b = iArr2;
        int[] iArr3 = new int[i32.r.values().length];
        try {
            iArr3[i32.r.ADD_COLLABORATOR.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[i32.r.ARCHIVE_BOARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        f80079c = iArr3;
    }
}
