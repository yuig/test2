package q3;

/* loaded from: classes.dex */
public abstract class j1 {

    /* renamed from: a, reason: collision with root package name */
    public static final long f102223a = androidx.compose.ui.layout.b.a(Float.NaN, Float.NaN);

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f102224b = 0;

    public static final float a(long j13) {
        if (j13 != f102223a) {
            return Float.intBitsToFloat((int) (j13 >> 32));
        }
        jk.r.y("ScaleFactor is unspecified");
        throw null;
    }

    public static final float b(long j13) {
        if (j13 != f102223a) {
            return Float.intBitsToFloat((int) (j13 & 4294967295L));
        }
        jk.r.y("ScaleFactor is unspecified");
        throw null;
    }
}
