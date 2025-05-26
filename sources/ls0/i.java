package ls0;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class i {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f84653a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f84654b;

    static {
        int[] iArr = new int[rw0.c.values().length];
        try {
            iArr[rw0.c.MEDIA_NOT_MOUNTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[rw0.c.DIRECTORY_CANNOT_BE_CREATED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f84653a = iArr;
        int[] iArr2 = new int[jo1.a.values().length];
        try {
            iArr2[jo1.a.HOMEFEED.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[jo1.a.RELATED_PINS.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[jo1.a.BOARD.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[jo1.a.SEARCH.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[jo1.a.USER_PINS.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        f84654b = iArr2;
    }
}
