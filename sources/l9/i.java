package l9;

import java.util.List;

/* loaded from: classes3.dex */
public abstract class i extends k7.f implements d {

    /* renamed from: e, reason: collision with root package name */
    public d f82316e;

    /* renamed from: f, reason: collision with root package name */
    public long f82317f;

    @Override // l9.d
    public final int a(long j13) {
        d dVar = this.f82316e;
        dVar.getClass();
        return dVar.a(j13 - this.f82317f);
    }

    @Override // l9.d
    public final List b(long j13) {
        d dVar = this.f82316e;
        dVar.getClass();
        return dVar.b(j13 - this.f82317f);
    }

    @Override // l9.d
    public final long c(int i13) {
        d dVar = this.f82316e;
        dVar.getClass();
        return dVar.c(i13) + this.f82317f;
    }

    @Override // l9.d
    public final int d() {
        d dVar = this.f82316e;
        dVar.getClass();
        return dVar.d();
    }

    @Override // k7.f
    public final void n() {
        this.f57530b = 0;
        this.f78460c = 0L;
        this.f78461d = false;
        this.f82316e = null;
    }
}
