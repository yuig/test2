package sv0;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferState;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class m {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f115366a;

    static {
        int[] iArr = new int[TransferState.values().length];
        try {
            iArr[TransferState.IN_PROGRESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TransferState.COMPLETED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TransferState.FAILED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[TransferState.CANCELED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f115366a = iArr;
    }
}
