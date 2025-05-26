package gk2;

/* loaded from: classes2.dex */
public final class i0 extends nk2.a {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f65459f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f65460g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(dk2.a aVar, Object obj, int i13) {
        super(aVar);
        this.f65459f = i13;
        this.f65460g = obj;
    }

    @Override // xp2.b
    public final void c(Object obj) {
        switch (this.f65459f) {
            case 0:
                if (!f(obj)) {
                    this.f91182b.request(1L);
                    break;
                }
                break;
            default:
                if (!this.f91184d) {
                    int i13 = this.f91185e;
                    dk2.a aVar = this.f91181a;
                    if (i13 != 0) {
                        aVar.c(null);
                        break;
                    } else {
                        try {
                            Object apply = ((ak2.f) this.f65460g).apply(obj);
                            ck2.i.b(apply, "The mapper function returned a null value.");
                            aVar.c(apply);
                            break;
                        } catch (Throwable th3) {
                            b(th3);
                        }
                    }
                }
                break;
        }
    }

    @Override // dk2.a
    public final boolean f(Object obj) {
        int i13 = this.f65459f;
        dk2.a aVar = this.f91181a;
        Object obj2 = this.f65460g;
        switch (i13) {
            case 0:
                if (!this.f91184d) {
                    if (this.f91185e != 0) {
                        break;
                    } else {
                        try {
                            if (((ak2.g) obj2).test(obj) && aVar.f(obj)) {
                            }
                        } catch (Throwable th3) {
                            b(th3);
                            return true;
                        }
                    }
                }
                break;
            default:
                if (this.f91184d) {
                    break;
                } else {
                    try {
                        Object apply = ((ak2.f) obj2).apply(obj);
                        ck2.i.b(apply, "The mapper function returned a null value.");
                        break;
                    } catch (Throwable th4) {
                        b(th4);
                        return true;
                    }
                }
        }
        return true;
    }

    @Override // dk2.i
    public final Object poll() {
        int i13 = this.f65459f;
        Object obj = this.f65460g;
        switch (i13) {
            case 0:
                dk2.f fVar = this.f91183c;
                ak2.g gVar = (ak2.g) obj;
                while (true) {
                    Object poll = fVar.poll();
                    if (poll == null) {
                        return null;
                    }
                    if (gVar.test(poll)) {
                        return poll;
                    }
                    if (this.f91185e == 2) {
                        fVar.request(1L);
                    }
                }
            default:
                Object poll2 = this.f91183c.poll();
                if (poll2 == null) {
                    return null;
                }
                Object apply = ((ak2.f) obj).apply(poll2);
                ck2.i.b(apply, "The mapper function returned a null value.");
                return apply;
        }
    }

    @Override // nk2.a, dk2.e
    public final int requestFusion(int i13) {
        switch (this.f65459f) {
        }
        return e(i13);
    }
}
