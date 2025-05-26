package jk2;

/* loaded from: classes2.dex */
public final class w extends ek2.a {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f76729f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f76730g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(uj2.v vVar, Object obj, int i13) {
        super(vVar);
        this.f76729f = i13;
        this.f76730g = obj;
    }

    @Override // uj2.v
    public final void c(Object obj) {
        int i13 = this.f76729f;
        Object obj2 = this.f76730g;
        uj2.v vVar = this.f59410a;
        switch (i13) {
            case 0:
                vVar.c(obj);
                if (this.f59414e == 0) {
                    try {
                        ((ak2.e) obj2).accept(obj);
                        break;
                    } catch (Throwable th3) {
                        d(th3);
                        return;
                    }
                }
                break;
            case 1:
                if (this.f59414e != 0) {
                    vVar.c(null);
                    break;
                } else {
                    try {
                        if (((ak2.g) obj2).test(obj)) {
                            vVar.c(obj);
                            break;
                        }
                    } catch (Throwable th4) {
                        d(th4);
                        return;
                    }
                }
                break;
            default:
                if (!this.f59413d) {
                    if (this.f59414e != 0) {
                        vVar.c(null);
                        break;
                    } else {
                        try {
                            Object apply = ((ak2.f) obj2).apply(obj);
                            ck2.i.b(apply, "The mapper function returned a null value.");
                            vVar.c(apply);
                            break;
                        } catch (Throwable th5) {
                            d(th5);
                        }
                    }
                }
                break;
        }
    }

    @Override // dk2.i
    public final Object poll() {
        Object poll;
        int i13 = this.f76729f;
        Object obj = this.f76730g;
        switch (i13) {
            case 0:
                Object poll2 = this.f59412c.poll();
                if (poll2 != null) {
                    ((ak2.e) obj).accept(poll2);
                }
                return poll2;
            case 1:
                break;
            default:
                Object poll3 = this.f59412c.poll();
                if (poll3 == null) {
                    return null;
                }
                Object apply = ((ak2.f) obj).apply(poll3);
                ck2.i.b(apply, "The mapper function returned a null value.");
                return apply;
        }
        do {
            poll = this.f59412c.poll();
            if (poll != null) {
            }
            return poll;
        } while (!((ak2.g) obj).test(poll));
        return poll;
    }

    @Override // ek2.a, dk2.e
    public final int requestFusion(int i13) {
        switch (this.f76729f) {
        }
        return e(i13);
    }
}
