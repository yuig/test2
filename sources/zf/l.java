package zf;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class l {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f141846a;

    static {
        int[] iArr = new int[tf.h.values().length];
        f141846a = iArr;
        try {
            iArr[tf.h.LINEAR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f141846a[tf.h.STEPPED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f141846a[tf.h.CUBIC_BEZIER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f141846a[tf.h.HORIZONTAL_BEZIER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
