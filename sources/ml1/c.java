package ml1;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f87522a;

    static {
        int[] iArr = new int[b.values().length];
        try {
            iArr[b.MODAL_TRANSITION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[b.NO_TRANSITION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[b.DEFAULT_TRANSITION_WITHOUT_ALPHA_ANIMATION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[b.VERTICAL_TRANSITION.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[b.CROSS_FADE_TRANSITION.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[b.UNSPECIFIED_TRANSITION.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[b.DEFAULT_TRANSITION.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f87522a = iArr;
    }
}
