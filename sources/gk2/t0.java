package gk2;

/* loaded from: classes4.dex */
public abstract class t0 extends ok2.b {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f65627a;

    /* renamed from: b, reason: collision with root package name */
    public int f65628b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f65629c;

    public t0(Object[] objArr) {
        this.f65627a = objArr;
    }

    @Override // xp2.c
    public final void cancel() {
        this.f65629c = true;
    }

    @Override // dk2.i
    public final void clear() {
        this.f65628b = this.f65627a.length;
    }

    @Override // dk2.i
    public final boolean isEmpty() {
        return this.f65628b == this.f65627a.length;
    }

    @Override // dk2.i
    public final Object poll() {
        int i13 = this.f65628b;
        Object[] objArr = this.f65627a;
        if (i13 == objArr.length) {
            return null;
        }
        this.f65628b = i13 + 1;
        Object obj = objArr[i13];
        ck2.i.b(obj, "array element is null");
        return obj;
    }

    @Override // xp2.c
    public final void request(long j13) {
        if (ok2.g.validate(j13) && d7.b.e(this, j13) == 0) {
            if (j13 == Long.MAX_VALUE) {
                s0 s0Var = (s0) this;
                switch (s0Var.f65615d) {
                    case 0:
                        Object[] objArr = s0Var.f65627a;
                        int length = objArr.length;
                        dk2.a aVar = (dk2.a) s0Var.f65616e;
                        for (int i13 = s0Var.f65628b; i13 != length; i13++) {
                            if (s0Var.f65629c) {
                                break;
                            } else {
                                Object obj = objArr[i13];
                                if (obj == null) {
                                    aVar.onError(new NullPointerException(a.a.e("The element at index ", i13, " is null")));
                                    break;
                                } else {
                                    aVar.f(obj);
                                }
                            }
                        }
                        if (!s0Var.f65629c) {
                            aVar.a();
                            break;
                        }
                        break;
                    default:
                        Object[] objArr2 = s0Var.f65627a;
                        int length2 = objArr2.length;
                        xp2.b bVar = s0Var.f65616e;
                        for (int i14 = s0Var.f65628b; i14 != length2; i14++) {
                            if (s0Var.f65629c) {
                                break;
                            } else {
                                Object obj2 = objArr2[i14];
                                if (obj2 == null) {
                                    bVar.onError(new NullPointerException(a.a.e("The element at index ", i14, " is null")));
                                    break;
                                } else {
                                    bVar.c(obj2);
                                }
                            }
                        }
                        if (!s0Var.f65629c) {
                            bVar.a();
                            break;
                        }
                        break;
                }
            }
            s0 s0Var2 = (s0) this;
            switch (s0Var2.f65615d) {
                case 0:
                    Object[] objArr3 = s0Var2.f65627a;
                    int length3 = objArr3.length;
                    int i15 = s0Var2.f65628b;
                    dk2.a aVar2 = (dk2.a) s0Var2.f65616e;
                    long j14 = j13;
                    do {
                        long j15 = 0;
                        while (true) {
                            if (j15 == j14 || i15 == length3) {
                                if (i15 == length3) {
                                    if (!s0Var2.f65629c) {
                                        aVar2.a();
                                        break;
                                    }
                                } else {
                                    j14 = s0Var2.get();
                                    if (j15 == j14) {
                                        s0Var2.f65628b = i15;
                                        j14 = s0Var2.addAndGet(-j15);
                                    }
                                }
                            } else if (s0Var2.f65629c) {
                                break;
                            } else {
                                Object obj3 = objArr3[i15];
                                if (obj3 == null) {
                                    aVar2.onError(new NullPointerException(a.a.e("The element at index ", i15, " is null")));
                                    break;
                                } else {
                                    if (aVar2.f(obj3)) {
                                        j15++;
                                    }
                                    i15++;
                                }
                            }
                        }
                    } while (j14 != 0);
                    break;
                default:
                    Object[] objArr4 = s0Var2.f65627a;
                    int length4 = objArr4.length;
                    int i16 = s0Var2.f65628b;
                    xp2.b bVar2 = s0Var2.f65616e;
                    long j16 = j13;
                    do {
                        long j17 = 0;
                        while (true) {
                            if (j17 == j16 || i16 == length4) {
                                if (i16 == length4) {
                                    if (!s0Var2.f65629c) {
                                        bVar2.a();
                                        break;
                                    }
                                } else {
                                    j16 = s0Var2.get();
                                    if (j17 == j16) {
                                        s0Var2.f65628b = i16;
                                        j16 = s0Var2.addAndGet(-j17);
                                    }
                                }
                            } else if (s0Var2.f65629c) {
                                break;
                            } else {
                                Object obj4 = objArr4[i16];
                                if (obj4 == null) {
                                    bVar2.onError(new NullPointerException(a.a.e("The element at index ", i16, " is null")));
                                    break;
                                } else {
                                    bVar2.c(obj4);
                                    j17++;
                                    i16++;
                                }
                            }
                        }
                    } while (j16 != 0);
                    break;
            }
        }
    }

    @Override // dk2.e
    public final int requestFusion(int i13) {
        return 1;
    }
}
