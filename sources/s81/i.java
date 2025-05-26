package s81;

import m81.s;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class i {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f111902a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f111903b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f111904c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int[] f111905d;

    static {
        int[] iArr = new int[m81.g.values().length];
        try {
            iArr[m81.g.RESULTS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[m81.g.HISTORY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[m81.g.GALLERY_PHOTOS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[m81.g.GALLERY_DIRECTORIES.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[m81.g.NONE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[m81.g.RESULTS_STELA.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[m81.g.RESULTS_ERROR.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f111902a = iArr;
        int[] iArr2 = new int[a32.c.values().length];
        try {
            iArr2[a32.c.CAMERA_SNAP.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[a32.c.CAMERA_GALLERY.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[a32.c.CAMERA_HISTORY.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        f111903b = iArr2;
        int[] iArr3 = new int[h.values().length];
        try {
            iArr3[h.STELA_CROP.ordinal()] = 1;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[h.CAMERA_DENIED.ordinal()] = 2;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr3[h.ACTIVE_CAMERA.ordinal()] = 3;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr3[h.GALLERY_OR_HISTORY.ordinal()] = 4;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr3[h.SEARCH_RESULTS.ordinal()] = 5;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr3[h.ROOM_REPAINT_STYLE_PICKER.ordinal()] = 6;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr3[h.ROOM_REPAINT_LOADING.ordinal()] = 7;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr3[h.ROOM_REPAINT_FAILED.ordinal()] = 8;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr3[h.ROOM_REPAINT_RESULTS.ordinal()] = 9;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr3[h.NONE.ordinal()] = 10;
        } catch (NoSuchFieldError unused20) {
        }
        f111904c = iArr3;
        int[] iArr4 = new int[s.values().length];
        try {
            iArr4[s.SPAN_WIDTH.ordinal()] = 1;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr4[s.SPAN_HEIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused22) {
        }
        f111905d = iArr4;
    }
}
