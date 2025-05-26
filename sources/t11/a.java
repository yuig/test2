package t11;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f115790a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f115791b;

    static {
        int[] iArr = new int[aq.d.values().length];
        try {
            iArr[aq.d.BOARD_ID.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[aq.d.SECTION_ID.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[aq.d.ADVANCE_SETTINGS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[aq.d.INTEREST_TAGGING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[aq.d.PUBLISH_TIME.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[aq.d.PAID_PARTNERSHIP.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[aq.d.PRODUCT_TAGS.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f115790a = iArr;
        int[] iArr2 = new int[q11.e.values().length];
        try {
            iArr2[q11.e.DELETE_CONFIRMED.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[q11.e.DELETE_CANCELLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[q11.e.PUBLISH_CONFIRMED.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[q11.e.PUBLISH_CANCELLED.ordinal()] = 4;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[q11.e.REMOVE_PAID_PARTNERSHIP_CONFIRM.ordinal()] = 5;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[q11.e.REMOVE_PAID_PARTNERSHIP_CANCELLED.ordinal()] = 6;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[q11.e.SAVE_LINK_CONFIRMED.ordinal()] = 7;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[q11.e.SAVE_LINK_CANCELLED.ordinal()] = 8;
        } catch (NoSuchFieldError unused15) {
        }
        f115791b = iArr2;
    }
}
