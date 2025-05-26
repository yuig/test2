package x81;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class x {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f134296a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f134297b;

    static {
        int[] iArr = new int[o.values().length];
        try {
            iArr[o.GALLERY_PHOTOS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[o.TRY_ON.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f134296a = iArr;
        int[] iArr2 = new int[t.values().length];
        try {
            iArr2[t.CAMERA.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[t.GALLERY.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[t.FACE_NOT_DETECTED.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        f134297b = iArr2;
    }
}
