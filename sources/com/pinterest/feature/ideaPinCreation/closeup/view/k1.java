package com.pinterest.feature.ideaPinCreation.closeup.view;

import com.pinterest.api.model.uq;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class k1 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f46213a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f46214b;

    static {
        int[] iArr = new int[uq.values().length];
        try {
            iArr[uq.PRODUCT_TAG.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[uq.VTO_PRODUCT_TAG.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[uq.BOARD_STICKER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[uq.MENTION.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f46213a = iArr;
        int[] iArr2 = new int[u.values().length];
        try {
            iArr2[u.PRODUCT_THUMBNAIL.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[u.PRODUCT_TITLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[u.BOARD_DEFAULT.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[u.BOARD_ONE_LINE.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        f46214b = iArr2;
    }
}
