package rq;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f109072a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f109073b;

    static {
        int[] iArr = new int[cr0.m.values().length];
        try {
            iArr[cr0.m.Realtime.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[cr0.m.Hourly.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[cr0.m.Daily.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[cr0.m.Unknown.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f109072a = iArr;
        int[] iArr2 = new int[cr0.l.values().length];
        try {
            iArr2[cr0.l.Lifetime.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[cr0.l.Last30Days.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[cr0.l.LifetimeOfVideo.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[cr0.l.Unknown.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        f109073b = iArr2;
    }
}
