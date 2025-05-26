package z80;

import s80.r6;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f141043a;

    static {
        int[] iArr = new int[r6.values().length];
        try {
            iArr[r6.HowItWorks.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[r6.DownloadImage.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[r6.DuplicateCollage.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[r6.StartNewCollage.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[r6.SaveAndExit.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f141043a = iArr;
    }
}
