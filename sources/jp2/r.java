package jp2;

/* loaded from: classes4.dex */
public final class r implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f77375a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f77376b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f77377c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f77378d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f77379e;

    public /* synthetic */ r(Object obj, int i13, long j13, int i14, int i15) {
        this.f77375a = i15;
        this.f77379e = obj;
        this.f77376b = i13;
        this.f77377c = j13;
        this.f77378d = i14;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f77375a;
        int i14 = this.f77376b;
        int i15 = this.f77378d;
        long j13 = this.f77377c;
        Object obj = this.f77379e;
        switch (i13) {
            case 0:
                ((f0) obj).onRttObservation(i14, j13, i15);
                break;
            default:
                ((g0) obj).onThroughputObservation(i14, j13, i15);
                break;
        }
    }
}
