package sk2;

import ck2.i;
import io.reactivex.exceptions.MissingBackpressureException;
import java.util.concurrent.atomic.AtomicReference;
import lb.l0;

/* loaded from: classes4.dex */
public final class c extends a {

    /* renamed from: d, reason: collision with root package name */
    public static final b[] f113100d = new b[0];

    /* renamed from: e, reason: collision with root package name */
    public static final b[] f113101e = new b[0];

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f113102b = new AtomicReference(f113101e);

    /* renamed from: c, reason: collision with root package name */
    public Throwable f113103c;

    @Override // xp2.b
    public final void a() {
        AtomicReference atomicReference = this.f113102b;
        Object obj = atomicReference.get();
        Object obj2 = f113100d;
        if (obj == obj2) {
            return;
        }
        b[] bVarArr = (b[]) atomicReference.getAndSet(obj2);
        for (b bVar : bVarArr) {
            if (bVar.get() != Long.MIN_VALUE) {
                bVar.f113098a.a();
            }
        }
    }

    @Override // xp2.b
    public final void c(Object obj) {
        long j13;
        long j14;
        i.b(obj, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (b bVar : (b[]) this.f113102b.get()) {
            long j15 = bVar.get();
            if (j15 != Long.MIN_VALUE) {
                xp2.b bVar2 = bVar.f113098a;
                if (j15 != 0) {
                    bVar2.c(obj);
                    do {
                        j13 = bVar.get();
                        if (j13 != Long.MIN_VALUE && j13 != Long.MAX_VALUE) {
                            j14 = j13 - 1;
                            if (j14 < 0) {
                                l0.R0(new IllegalStateException(a.a.g("More produced than requested: ", j14)));
                                j14 = 0;
                            }
                        }
                    } while (!bVar.compareAndSet(j13, j14));
                } else {
                    bVar.cancel();
                    bVar2.onError(new MissingBackpressureException("Could not emit value due to lack of requests"));
                }
            }
        }
    }

    @Override // xp2.b
    public final void d(xp2.c cVar) {
        if (this.f113102b.get() == f113100d) {
            cVar.cancel();
        } else {
            cVar.request(Long.MAX_VALUE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // uj2.h
    public final void m(xp2.b bVar) {
        b bVar2 = new b(bVar, this);
        bVar.d(bVar2);
        while (true) {
            AtomicReference atomicReference = this.f113102b;
            b[] bVarArr = (b[]) atomicReference.get();
            if (bVarArr == f113100d) {
                Throwable th3 = this.f113103c;
                if (th3 != null) {
                    bVar.onError(th3);
                    return;
                } else {
                    bVar.a();
                    return;
                }
            }
            int length = bVarArr.length;
            b[] bVarArr2 = new b[length + 1];
            System.arraycopy(bVarArr, 0, bVarArr2, 0, length);
            bVarArr2[length] = bVar2;
            while (!atomicReference.compareAndSet(bVarArr, bVarArr2)) {
                if (atomicReference.get() != bVarArr) {
                    break;
                }
            }
            if (bVar2.get() == Long.MIN_VALUE) {
                o(bVar2);
                return;
            }
            return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o(b bVar) {
        b[] bVarArr;
        while (true) {
            AtomicReference atomicReference = this.f113102b;
            b[] bVarArr2 = (b[]) atomicReference.get();
            if (bVarArr2 == f113100d || bVarArr2 == (bVarArr = f113101e)) {
                return;
            }
            int length = bVarArr2.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    i13 = -1;
                    break;
                } else if (bVarArr2[i13] == bVar) {
                    break;
                } else {
                    i13++;
                }
            }
            if (i13 < 0) {
                return;
            }
            if (length != 1) {
                bVarArr = new b[length - 1];
                System.arraycopy(bVarArr2, 0, bVarArr, 0, i13);
                System.arraycopy(bVarArr2, i13 + 1, bVarArr, i13, (length - i13) - 1);
            }
            while (!atomicReference.compareAndSet(bVarArr2, bVarArr)) {
                if (atomicReference.get() != bVarArr2) {
                    break;
                }
            }
            return;
        }
    }

    @Override // xp2.b
    public final void onError(Throwable th3) {
        i.b(th3, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        AtomicReference atomicReference = this.f113102b;
        Object obj = atomicReference.get();
        Object obj2 = f113100d;
        if (obj == obj2) {
            l0.R0(th3);
            return;
        }
        this.f113103c = th3;
        b[] bVarArr = (b[]) atomicReference.getAndSet(obj2);
        for (b bVar : bVarArr) {
            if (bVar.get() != Long.MIN_VALUE) {
                bVar.f113098a.onError(th3);
            } else {
                l0.R0(th3);
            }
        }
    }
}
