package ur0;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f123065a;

    static {
        int[] iArr = new int[yb0.d.values().length];
        try {
            iArr[yb0.d.OUTSIDE_TOUCH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[yb0.d.BACK_BUTTON_CLICK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[yb0.d.SHOWING_ANOTHER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[yb0.d.CONFIRM_BUTTON_CLICK.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[yb0.d.CANCEL_BUTTON_CLICK.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[yb0.d.EXPLICIT_DIRECTIVE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f123065a = iArr;
    }
}
