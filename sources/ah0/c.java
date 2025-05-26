package ah0;

import i32.d0;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f15175a;

    static {
        int[] iArr = new int[d0.values().length];
        try {
            iArr[d0.PRIMARY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[d0.SECONDARY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[d0.TERTIARY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[d0.SHOPPING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[d0.ALWAYS_LIGHT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[d0.ALWAYS_DARK.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f15175a = iArr;
    }
}
