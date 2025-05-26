package sv0;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferState;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class k {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f115347a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f115348b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f115349c;

    static {
        int[] iArr = new int[ex0.e.values().length];
        try {
            iArr[ex0.e.BUCKET_80_OR_ABOVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ex0.e.BUCKET_20_40.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ex0.e.BUCKET_40_80.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ex0.e.BUCKET_5_10.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ex0.e.BUCKET_10_20.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f115347a = iArr;
        int[] iArr2 = new int[f.values().length];
        try {
            iArr2[f.EXTRA_LARGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[f.LARGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[f.MEDIUM.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        f115348b = iArr2;
        int[] iArr3 = new int[TransferState.values().length];
        try {
            iArr3[TransferState.COMPLETED.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        f115349c = iArr3;
    }
}
