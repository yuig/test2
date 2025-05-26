package gk2;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public abstract class c extends AtomicInteger implements uj2.k, g, xp2.c {

    /* renamed from: b, reason: collision with root package name */
    public final ak2.f f65342b;

    /* renamed from: c, reason: collision with root package name */
    public final int f65343c;

    /* renamed from: d, reason: collision with root package name */
    public final int f65344d;

    /* renamed from: e, reason: collision with root package name */
    public xp2.c f65345e;

    /* renamed from: f, reason: collision with root package name */
    public int f65346f;

    /* renamed from: g, reason: collision with root package name */
    public dk2.i f65347g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f65348h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f65349i;

    /* renamed from: k, reason: collision with root package name */
    public volatile boolean f65351k;

    /* renamed from: l, reason: collision with root package name */
    public int f65352l;

    /* renamed from: a, reason: collision with root package name */
    public final f f65341a = new f(this);

    /* renamed from: j, reason: collision with root package name */
    public final pk2.c f65350j = new pk2.c();

    public c(ak2.f fVar, int i13) {
        this.f65342b = fVar;
        this.f65343c = i13;
        this.f65344d = i13 - (i13 >> 2);
    }

    @Override // xp2.b
    public final void a() {
        this.f65348h = true;
        g();
    }

    @Override // xp2.b
    public final void c(Object obj) {
        if (this.f65352l == 2 || this.f65347g.offer(obj)) {
            g();
        } else {
            this.f65345e.cancel();
            onError(new IllegalStateException("Queue full?!"));
        }
    }

    @Override // xp2.b
    public final void d(xp2.c cVar) {
        if (ok2.g.validate(this.f65345e, cVar)) {
            this.f65345e = cVar;
            if (cVar instanceof dk2.f) {
                dk2.f fVar = (dk2.f) cVar;
                int requestFusion = fVar.requestFusion(7);
                if (requestFusion == 1) {
                    this.f65352l = requestFusion;
                    this.f65347g = fVar;
                    this.f65348h = true;
                    h();
                    g();
                    return;
                }
                if (requestFusion == 2) {
                    this.f65352l = requestFusion;
                    this.f65347g = fVar;
                    h();
                    cVar.request(this.f65343c);
                    return;
                }
            }
            this.f65347g = new lk2.b(this.f65343c);
            h();
            cVar.request(this.f65343c);
        }
    }

    public abstract void g();

    public abstract void h();
}
