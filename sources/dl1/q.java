package dl1;

/* loaded from: classes2.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public s f55265a;

    /* renamed from: b, reason: collision with root package name */
    public long f55266b;

    /* renamed from: c, reason: collision with root package name */
    public Long f55267c;

    public static boolean a(q qVar) {
        Long l13 = qVar.f55267c;
        if (l13 == null) {
            return false;
        }
        long longValue = l13.longValue();
        long j13 = qVar.f55266b;
        long j14 = longValue + j13;
        return j14 >= j13 && j14 < System.currentTimeMillis();
    }
}
