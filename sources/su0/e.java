package su0;

import com.pinterest.api.model.uq;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class e {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f115192a;

    static {
        int[] iArr = new int[uq.values().length];
        try {
            iArr[uq.TEXT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[uq.MENTION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[uq.PRODUCT_TAG.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[uq.STICKER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[uq.VTO_PRODUCT_TAG.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[uq.BOARD_STICKER.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[uq.IMAGE_STICKER.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f115192a = iArr;
    }
}
