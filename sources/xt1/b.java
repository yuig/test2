package xt1;

import com.pinterest.api.model.qw;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class b {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f135919a;

    static {
        int[] iArr = new int[qw.values().length];
        try {
            iArr[qw.PIN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[qw.BOARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[qw.USER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[qw.INTEREST.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[qw.BOARD_SECTION.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f135919a = iArr;
    }
}
