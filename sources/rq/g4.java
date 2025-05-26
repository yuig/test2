package rq;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class g4 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f109215a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f109216b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f109217c;

    static {
        int[] iArr = new int[rh1.x.values().length];
        try {
            iArr[rh1.x.Like.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[rh1.x.Unlike.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[rh1.x.Helpful.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[rh1.x.NotHelpful.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f109215a = iArr;
        int[] iArr2 = new int[c.values().length];
        try {
            iArr2[c.Comment.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[c.Reply.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        f109216b = iArr2;
        int[] iArr3 = new int[uq.p.values().length];
        try {
            iArr3[uq.p.Body.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[uq.p.Image.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[uq.p.Avatar.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[uq.p.Username.ordinal()] = 4;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[uq.p.Like.ordinal()] = 5;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[uq.p.Unlike.ordinal()] = 6;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr3[uq.p.Reply.ordinal()] = 7;
        } catch (NoSuchFieldError unused13) {
        }
        f109217c = iArr3;
    }
}
