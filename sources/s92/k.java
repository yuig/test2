package s92;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class k {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f112111a;

    static {
        int[] iArr = new int[l.values().length];
        try {
            iArr[l.FIRST_START.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[l.COLD_START.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[l.WARM_START.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[l.USER_NAVIGATION.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[l.STORY_PIN_NAVIGATION.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[l.AUTOPLAYING_USER_NAVIGATION.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[l.FIRST_PAGE_LOAD.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[l.FIRST_PAGE_LOAD_VISIBLE_ONLY.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        f112111a = iArr;
    }
}
