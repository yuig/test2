package pr0;

import com.pinterest.api.model.m30;

/* loaded from: classes.dex */
public abstract /* synthetic */ class e {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f101163a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f101164b;

    static {
        int[] iArr = new int[ky.g.values().length];
        try {
            iArr[ky.g.CAROUSEL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ky.g.ITEM_GRID.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f101163a = iArr;
        int[] iArr2 = new int[m30.values().length];
        try {
            iArr2[m30.VIDEO_PIN.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[m30.VIDEO_STORY_PIN.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[m30.OTHER_STORY_PIN.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[m30.CAROUSEL_PIN.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[m30.OTHER_PIN.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        f101164b = iArr2;
    }
}
