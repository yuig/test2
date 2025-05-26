package w80;

import s80.b7;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class o1 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f128361a;

    static {
        int[] iArr = new int[b7.values().length];
        try {
            iArr[b7.AddCutoutInstruct.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[b7.ReorderCutoutInstruct.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[b7.ReorderCutoutInstructTryAgain.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[b7.Tips.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[b7.TipsGoBack.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f128361a = iArr;
    }
}
