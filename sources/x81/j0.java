package x81;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class j0 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f134247a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f134248b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f134249c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int[] f134250d;

    static {
        int[] iArr = new int[de1.a.values().length];
        try {
            iArr[de1.a.APPLY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[de1.a.CLEAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f134247a = iArr;
        int[] iArr2 = new int[f42.c.values().length];
        try {
            iArr2[f42.c.LIPCOLOR.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[f42.c.EYESHADOW.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f134248b = iArr2;
        int[] iArr3 = new int[i0.values().length];
        try {
            iArr3[i0.CAMERA_DENIED.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[i0.GALLERY_DENIED.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[i0.FACE_NOT_DETECTED.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[i0.TRY_ON.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[i0.GALLERY.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[i0.TRY_ON_CAPTURED_PHOTO.ordinal()] = 6;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[i0.NONE.ordinal()] = 7;
        } catch (NoSuchFieldError unused11) {
        }
        f134249c = iArr3;
        int[] iArr4 = new int[o.values().length];
        try {
            iArr4[o.GALLERY_PHOTOS.ordinal()] = 1;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr4[o.GALLERY_DIRECTORIES.ordinal()] = 2;
        } catch (NoSuchFieldError unused13) {
        }
        f134250d = iArr4;
    }
}
