package gk2;

import java.util.Iterator;

/* loaded from: classes4.dex */
public abstract class u0 extends ok2.b {

    /* renamed from: a, reason: collision with root package name */
    public Iterator f65650a;

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f65651b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f65652c;

    @Override // xp2.c
    public final void cancel() {
        this.f65651b = true;
    }

    @Override // dk2.i
    public final void clear() {
        this.f65650a = null;
    }

    @Override // dk2.i
    public final boolean isEmpty() {
        Iterator it = this.f65650a;
        return it == null || !it.hasNext();
    }

    @Override // dk2.i
    public final Object poll() {
        Iterator it = this.f65650a;
        if (it == null) {
            return null;
        }
        if (!this.f65652c) {
            this.f65652c = true;
        } else if (!it.hasNext()) {
            return null;
        }
        Object next = this.f65650a.next();
        ck2.i.b(next, "Iterator.next() returned a null value");
        return next;
    }

    @Override // xp2.c
    public final void request(long j13) {
        if (ok2.g.validate(j13) && d7.b.e(this, j13) == 0) {
            if (j13 == Long.MAX_VALUE) {
                v0 v0Var = (v0) this;
                switch (v0Var.f65659d) {
                    case 0:
                        Iterator it = v0Var.f65650a;
                        dk2.a aVar = (dk2.a) v0Var.f65660e;
                        while (!v0Var.f65651b) {
                            try {
                                Object next = it.next();
                                if (v0Var.f65651b) {
                                    break;
                                } else if (next == null) {
                                    aVar.onError(new NullPointerException("Iterator.next() returned a null value"));
                                    break;
                                } else {
                                    aVar.f(next);
                                    if (v0Var.f65651b) {
                                        break;
                                    } else {
                                        try {
                                            if (!it.hasNext()) {
                                                if (!v0Var.f65651b) {
                                                    aVar.a();
                                                    break;
                                                }
                                            }
                                        } catch (Throwable th3) {
                                            bp1.h.H(th3);
                                            aVar.onError(th3);
                                            return;
                                        }
                                    }
                                }
                            } catch (Throwable th4) {
                                bp1.h.H(th4);
                                aVar.onError(th4);
                                return;
                            }
                        }
                        break;
                    default:
                        Iterator it2 = v0Var.f65650a;
                        xp2.b bVar = v0Var.f65660e;
                        while (!v0Var.f65651b) {
                            try {
                                Object next2 = it2.next();
                                if (v0Var.f65651b) {
                                    break;
                                } else if (next2 == null) {
                                    bVar.onError(new NullPointerException("Iterator.next() returned a null value"));
                                    break;
                                } else {
                                    bVar.c(next2);
                                    if (v0Var.f65651b) {
                                        break;
                                    } else {
                                        try {
                                            if (!it2.hasNext()) {
                                                if (!v0Var.f65651b) {
                                                    bVar.a();
                                                    break;
                                                }
                                            }
                                        } catch (Throwable th5) {
                                            bp1.h.H(th5);
                                            bVar.onError(th5);
                                            return;
                                        }
                                    }
                                }
                            } catch (Throwable th6) {
                                bp1.h.H(th6);
                                bVar.onError(th6);
                                return;
                            }
                        }
                        break;
                }
            }
            v0 v0Var2 = (v0) this;
            switch (v0Var2.f65659d) {
                case 0:
                    Iterator it3 = v0Var2.f65650a;
                    dk2.a aVar2 = (dk2.a) v0Var2.f65660e;
                    do {
                        long j14 = 0;
                        while (true) {
                            if (j14 == j13) {
                                j13 = v0Var2.get();
                                if (j14 == j13) {
                                    j13 = v0Var2.addAndGet(-j14);
                                }
                            } else if (v0Var2.f65651b) {
                                break;
                            } else {
                                try {
                                    Object next3 = it3.next();
                                    if (v0Var2.f65651b) {
                                        break;
                                    } else if (next3 == null) {
                                        aVar2.onError(new NullPointerException("Iterator.next() returned a null value"));
                                        break;
                                    } else {
                                        boolean f13 = aVar2.f(next3);
                                        if (v0Var2.f65651b) {
                                            break;
                                        } else {
                                            try {
                                                if (!it3.hasNext()) {
                                                    if (!v0Var2.f65651b) {
                                                        aVar2.a();
                                                        break;
                                                    }
                                                } else if (f13) {
                                                    j14++;
                                                }
                                            } catch (Throwable th7) {
                                                bp1.h.H(th7);
                                                aVar2.onError(th7);
                                                return;
                                            }
                                        }
                                    }
                                } catch (Throwable th8) {
                                    bp1.h.H(th8);
                                    aVar2.onError(th8);
                                    return;
                                }
                            }
                        }
                    } while (j13 != 0);
                    break;
                default:
                    Iterator it4 = v0Var2.f65650a;
                    xp2.b bVar2 = v0Var2.f65660e;
                    do {
                        long j15 = 0;
                        while (true) {
                            if (j15 == j13) {
                                j13 = v0Var2.get();
                                if (j15 == j13) {
                                    j13 = v0Var2.addAndGet(-j15);
                                }
                            } else if (v0Var2.f65651b) {
                                break;
                            } else {
                                try {
                                    Object next4 = it4.next();
                                    if (v0Var2.f65651b) {
                                        break;
                                    } else if (next4 == null) {
                                        bVar2.onError(new NullPointerException("Iterator.next() returned a null value"));
                                        break;
                                    } else {
                                        bVar2.c(next4);
                                        if (v0Var2.f65651b) {
                                            break;
                                        } else {
                                            try {
                                                if (!it4.hasNext()) {
                                                    if (!v0Var2.f65651b) {
                                                        bVar2.a();
                                                        break;
                                                    }
                                                } else {
                                                    j15++;
                                                }
                                            } catch (Throwable th9) {
                                                bp1.h.H(th9);
                                                bVar2.onError(th9);
                                                return;
                                            }
                                        }
                                    }
                                } catch (Throwable th10) {
                                    bp1.h.H(th10);
                                    bVar2.onError(th10);
                                    return;
                                }
                            }
                        }
                    } while (j13 != 0);
                    break;
            }
        }
    }

    @Override // dk2.e
    public final int requestFusion(int i13) {
        return 1;
    }
}
