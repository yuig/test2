package k61;

import z32.m0;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class f {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f78405a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f78406b;

    static {
        int[] iArr = new int[h61.h.values().length];
        try {
            iArr[h61.h.USERS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[h61.h.MY_PINS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[h61.h.BOARDS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[h61.h.ARTICLE_FEED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f78405a = iArr;
        int[] iArr2 = new int[m0.values().length];
        try {
            iArr2[m0.CAROUSEL.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[m0.ITEM_GRID.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[m0.MULTI_PRODUCTS_COLLAGE.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        f78406b = iArr2;
    }
}
