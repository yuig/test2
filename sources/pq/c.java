package pq;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f100966a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f100967b;

    static {
        int[] iArr = new int[qq.e.values().length];
        try {
            iArr[qq.e.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[qq.e.IMAGE_SEARCH.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[qq.e.IMAGE_SEARCH_WITH_CUTOUT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[qq.e.VIRTUAL_TRY_ON.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f100966a = iArr;
        int[] iArr2 = new int[qq.a.values().length];
        try {
            iArr2[qq.a.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[qq.a.CUTOUT_SCISSORS.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[qq.a.REMIX.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        f100967b = iArr2;
    }
}
