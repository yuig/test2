package iv0;

import com.pinterest.api.model.er;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f73730a;

    static {
        int[] iArr = new int[er.values().length];
        try {
            iArr[er.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[er.INVERTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[er.INVERTED_TRANSPARENT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[er.HIGHLIGHT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[er.TRANSPARENT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f73730a = iArr;
    }
}
