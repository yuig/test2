package j22;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class h {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f74537a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f74538b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f74539c;

    static {
        int[] iArr = new int[a.values().length];
        try {
            iArr[a.TYPEAHEAD_MY_BOARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[a.TYPEAHEAD_MENTIONS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[a.TYPEAHEAD_HASHTAGS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[a.PEOPLE_PICKER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[a.TYPEAHEAD.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[a.INVITE_FRIENDS.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[a.RECENT_QUERIES.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[a.RECENT_MY_QUERIES.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        f74537a = iArr;
        int[] iArr2 = new int[c.values().length];
        try {
            iArr2[c.TRENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[c.RECENT_QUERIES.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[c.RECOMMENDED_QUERIES.ordinal()] = 3;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[c.PERSONAL_SEARCH.ordinal()] = 4;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[c.TYPEAHEAD.ordinal()] = 5;
        } catch (NoSuchFieldError unused13) {
        }
        f74538b = iArr2;
        int[] iArr3 = new int[l.values().length];
        try {
            iArr3[l.TOP.ordinal()] = 1;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr3[l.PRODUCT_TAGGING.ordinal()] = 2;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr3[l.PRODUCTS.ordinal()] = 3;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr3[l.YOURS.ordinal()] = 4;
        } catch (NoSuchFieldError unused17) {
        }
        f74539c = iArr3;
    }
}
