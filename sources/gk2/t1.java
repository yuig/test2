package gk2;

import io.reactivex.exceptions.CompositeException;

/* loaded from: classes4.dex */
public final class t1 extends ok2.f implements uj2.k {

    /* renamed from: i, reason: collision with root package name */
    public final xp2.b f65630i;

    /* renamed from: j, reason: collision with root package name */
    public final ak2.f f65631j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f65632k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f65633l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f65634m;

    /* renamed from: n, reason: collision with root package name */
    public long f65635n;

    public t1(xp2.b bVar, ak2.f fVar, boolean z13) {
        this.f65630i = bVar;
        this.f65631j = fVar;
        this.f65632k = z13;
    }

    @Override // xp2.b
    public final void a() {
        if (this.f65634m) {
            return;
        }
        this.f65634m = true;
        this.f65633l = true;
        this.f65630i.a();
    }

    @Override // xp2.b
    public final void c(Object obj) {
        if (this.f65634m) {
            return;
        }
        if (!this.f65633l) {
            this.f65635n++;
        }
        this.f65630i.c(obj);
    }

    @Override // xp2.b
    public final void onError(Throwable th3) {
        boolean z13 = this.f65633l;
        xp2.b bVar = this.f65630i;
        if (z13) {
            if (this.f65634m) {
                lb.l0.R0(th3);
                return;
            } else {
                bVar.onError(th3);
                return;
            }
        }
        this.f65633l = true;
        if (this.f65632k && !(th3 instanceof Exception)) {
            bVar.onError(th3);
            return;
        }
        try {
            Object apply = this.f65631j.apply(th3);
            ck2.i.b(apply, "The nextSupplier returned a null Publisher");
            xp2.a aVar = (xp2.a) apply;
            long j13 = this.f65635n;
            if (j13 != 0) {
                g(j13);
            }
            aVar.b(this);
        } catch (Throwable th4) {
            bp1.h.H(th4);
            bVar.onError(new CompositeException(th3, th4));
        }
    }
}
