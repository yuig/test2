package mk2;

/* loaded from: classes4.dex */
public final class a0 implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f87351a;

    /* renamed from: b, reason: collision with root package name */
    public final long f87352b;

    /* renamed from: c, reason: collision with root package name */
    public final int f87353c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f87354d;

    public a0(Runnable runnable, Long l13, int i13) {
        this.f87351a = runnable;
        this.f87352b = l13.longValue();
        this.f87353c = i13;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        a0 a0Var = (a0) obj;
        long j13 = a0Var.f87352b;
        long j14 = this.f87352b;
        int i13 = 0;
        int i14 = j14 < j13 ? -1 : j14 > j13 ? 1 : 0;
        if (i14 != 0) {
            return i14;
        }
        int i15 = this.f87353c;
        int i16 = a0Var.f87353c;
        if (i15 < i16) {
            i13 = -1;
        } else if (i15 > i16) {
            i13 = 1;
        }
        return i13;
    }
}
