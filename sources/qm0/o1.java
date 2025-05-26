package qm0;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class o1 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f104319a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f104320b;

    static {
        int[] iArr = new int[tm0.b.values().length];
        try {
            iArr[tm0.b.ArchiveConfirmation.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[tm0.b.UnarchiveConfirmation.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f104319a = iArr;
        int[] iArr2 = new int[cl0.a.values().length];
        try {
            iArr2[cl0.a.Edit.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[cl0.a.Merge.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[cl0.a.Archive.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[cl0.a.Unarchive.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[cl0.a.Send.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[cl0.a.Share.ordinal()] = 6;
        } catch (NoSuchFieldError unused8) {
        }
        f104320b = iArr2;
    }
}
