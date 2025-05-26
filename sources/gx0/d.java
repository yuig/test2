package gx0;

import com.pinterest.api.model.dh;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class d {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f66283a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f66284b;

    static {
        int[] iArr = new int[fx0.a.values().length];
        try {
            iArr[fx0.a.ITEM_TYPE_SECTION_HEADER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[fx0.a.ITEM_TYPE_SECTION_CONTENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f66283a = iArr;
        int[] iArr2 = new int[dh.values().length];
        try {
            iArr2[dh.DISPLAY_MODE_GRID_WITH_COMPACT_BOARDS.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        f66284b = iArr2;
    }
}
