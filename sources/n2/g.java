package n2;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;

/* loaded from: classes2.dex */
public class g extends e {

    /* renamed from: d, reason: collision with root package name */
    public final f f88941d;

    /* renamed from: e, reason: collision with root package name */
    public Object f88942e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f88943f;

    /* renamed from: g, reason: collision with root package name */
    public int f88944g;

    public g(f fVar, s[] sVarArr) {
        super(fVar.f88937b, sVarArr);
        this.f88941d = fVar;
        this.f88944g = fVar.f88939d;
    }

    public final void d(int i13, r rVar, Object obj, int i14) {
        int i15 = i14 * 5;
        s[] sVarArr = this.f88933a;
        if (i15 <= 30) {
            int D0 = 1 << l0.D0(i13, i15);
            if (rVar.k(D0)) {
                sVarArr[i14].b(Integer.bitCount(rVar.f88955a) * 2, rVar.i(D0), rVar.f88958d);
                this.f88934b = i14;
                return;
            }
            int B = rVar.B(D0);
            r A = rVar.A(B);
            sVarArr[i14].b(Integer.bitCount(rVar.f88955a) * 2, B, rVar.f88958d);
            d(i13, A, obj, i14 + 1);
            return;
        }
        s sVar = sVarArr[i14];
        Object[] objArr = rVar.f88958d;
        sVar.b(objArr.length, 0, objArr);
        while (true) {
            s sVar2 = sVarArr[i14];
            if (Intrinsics.d(sVar2.f88959a[sVar2.f88961c], obj)) {
                this.f88934b = i14;
                return;
            } else {
                sVarArr[i14].f88961c += 2;
            }
        }
    }

    @Override // n2.e, java.util.Iterator
    public final Object next() {
        if (this.f88941d.f88939d != this.f88944g) {
            throw new ConcurrentModificationException();
        }
        if (!this.f88935c) {
            throw new NoSuchElementException();
        }
        s sVar = this.f88933a[this.f88934b];
        this.f88942e = sVar.f88959a[sVar.f88961c];
        this.f88943f = true;
        return super.next();
    }

    @Override // n2.e, java.util.Iterator
    public final void remove() {
        if (!this.f88943f) {
            throw new IllegalStateException();
        }
        boolean z13 = this.f88935c;
        f fVar = this.f88941d;
        if (!z13) {
            dl2.b.u(fVar).remove(this.f88942e);
        } else {
            if (!z13) {
                throw new NoSuchElementException();
            }
            s sVar = this.f88933a[this.f88934b];
            Object obj = sVar.f88959a[sVar.f88961c];
            dl2.b.u(fVar).remove(this.f88942e);
            d(obj != null ? obj.hashCode() : 0, fVar.f88937b, obj, 0);
        }
        this.f88942e = null;
        this.f88943f = false;
        this.f88944g = fVar.f88939d;
    }
}
