package l32;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class b {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f81525a;

    static {
        int[] iArr = new int[c.values().length];
        try {
            iArr[c.BLOCK_SINGLE_PFY_PIN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[c.BLOCK_PFY_THROUGH_BOARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[c.BLOCK_ALL_PFY_PINS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[c.BLOCK_PFY_THROUGH_PIN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[c.BLOCK_PFY_THROUGH_INTEREST.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[c.BLOCK_THROUGH_OBJECT.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[c.BLOCK_RECOMMENDED_OBJECT.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[c.BLOCK_ARCHIVED_BOARD.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[c.UNBLOCK_ARCHIVED_BOARD.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[c.BLOCK_ONLY_THIS_PIN.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[c.BLOCK_PRIVATE_BOARD.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[c.UNBLOCK_PRIVATE_BOARD.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[c.BLOCK_ORIGINAL_CREATOR.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[c.CONTEXTUAL.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        f81525a = iArr;
    }
}
