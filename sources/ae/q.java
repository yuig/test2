package ae;

/* loaded from: classes.dex */
public final class q implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f15025a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rb.h f15026b;

    public q(rb.h hVar, boolean z13) {
        this.f15026b = hVar;
        this.f15025a = z13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rb.h hVar = this.f15026b;
        hVar.getClass();
        he.n.a();
        m7.c cVar = (m7.c) hVar.f107067b;
        boolean z13 = cVar.f86115b;
        boolean z14 = this.f15025a;
        cVar.f86115b = z14;
        if (z13 != z14) {
            ((a) cVar.f86116c).a(z14);
        }
    }
}
