package androidx.datastore.preferences.protobuf;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class y {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f18171a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f18172b;

    static {
        int[] iArr = new int[k0.values().length];
        f18172b = iArr;
        try {
            iArr[k0.BYTE_STRING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f18172b[k0.MESSAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f18172b[k0.STRING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[z.values().length];
        f18171a = iArr2;
        try {
            iArr2[z.MAP.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f18171a[z.VECTOR.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f18171a[z.SCALAR.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
