package s80;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class c6 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f111487a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f111488b;

    static {
        int[] iArr = new int[sa0.d0.values().length];
        try {
            iArr[sa0.d0.Camera.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[sa0.d0.Gallery.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f111487a = iArr;
        int[] iArr2 = new int[b7.values().length];
        try {
            iArr2[b7.None.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[b7.InitialWelcome.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[b7.RevisitWelcome.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[b7.AddCutoutInstruct.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[b7.ReorderCutoutWelcome.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[b7.ReorderCutoutInstruct.ordinal()] = 6;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[b7.ReorderCutoutInstructWhilePressing.ordinal()] = 7;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[b7.ReorderCutoutInstructTryAgain.ordinal()] = 8;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[b7.ChangeBackgroundColorWelcome.ordinal()] = 9;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[b7.ChangeBackgroundColorInstruct.ordinal()] = 10;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[b7.ChangeBackgroundColorActive.ordinal()] = 11;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[b7.ChangeBackgroundColorComplete.ordinal()] = 12;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[b7.AllDone.ordinal()] = 13;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr2[b7.Tips.ordinal()] = 14;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr2[b7.TipsGoBack.ordinal()] = 15;
        } catch (NoSuchFieldError unused17) {
        }
        f111488b = iArr2;
    }
}
