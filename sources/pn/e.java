package pn;

/* loaded from: classes.dex */
public final class e implements xp2.b, xp2.c {

    /* renamed from: a, reason: collision with root package name */
    public final xp2.b f100720a;

    /* renamed from: b, reason: collision with root package name */
    public final a f100721b;

    /* renamed from: c, reason: collision with root package name */
    public xp2.c f100722c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f100723d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f100724e = true;

    public e(xp2.b bVar, a aVar) {
        this.f100720a = bVar;
        this.f100721b = aVar;
    }

    @Override // xp2.b
    public final void a() {
        this.f100720a.a();
    }

    @Override // xp2.b
    public final void c(Object obj) {
        this.f100720a.c(obj);
    }

    @Override // xp2.c
    public final void cancel() {
        this.f100723d = true;
        this.f100722c.cancel();
    }

    @Override // xp2.b
    public final void d(xp2.c cVar) {
        this.f100722c = cVar;
        this.f100720a.d(this);
    }

    @Override // xp2.b
    public final void onError(Throwable th3) {
        this.f100720a.onError(th3);
    }

    @Override // xp2.c
    public final void request(long j13) {
        if (j13 == 0) {
            return;
        }
        if (this.f100724e) {
            this.f100724e = false;
            Object obj = this.f100721b.f100711a;
            if (obj != null && !this.f100723d) {
                this.f100720a.c(obj);
                if (j13 != Long.MAX_VALUE) {
                    j13--;
                    if (j13 == 0) {
                        return;
                    }
                }
            }
        }
        this.f100722c.request(j13);
    }
}
