package pk;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public class m1 extends t0 {

    /* renamed from: d, reason: collision with root package name */
    public Object[] f100452d;

    /* renamed from: e, reason: collision with root package name */
    public int f100453e;

    @Override // pk.u0
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public m1 a(Object obj) {
        obj.getClass();
        if (this.f100452d != null && o1.n(this.f100482b) <= this.f100452d.length) {
            l(obj);
            return this;
        }
        this.f100452d = null;
        e(obj);
        return this;
    }

    public m1 j(Object... objArr) {
        if (this.f100452d != null) {
            for (Object obj : objArr) {
                a(obj);
            }
        } else {
            f(objArr);
        }
        return this;
    }

    public m1 k(Iterable iterable) {
        iterable.getClass();
        if (this.f100452d != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
        } else {
            b(iterable);
        }
        return this;
    }

    public final void l(Object obj) {
        Objects.requireNonNull(this.f100452d);
        int length = this.f100452d.length - 1;
        int hashCode = obj.hashCode();
        int X1 = bs1.c.X1(hashCode);
        while (true) {
            int i13 = X1 & length;
            Object[] objArr = this.f100452d;
            Object obj2 = objArr[i13];
            if (obj2 == null) {
                objArr[i13] = obj;
                this.f100453e += hashCode;
                e(obj);
                return;
            } else if (obj2.equals(obj)) {
                return;
            } else {
                X1 = i13 + 1;
            }
        }
    }

    public o1 m() {
        o1 p13;
        int i13 = this.f100482b;
        if (i13 == 0) {
            int i14 = o1.f100461c;
            return b3.f100362j;
        }
        if (i13 == 1) {
            Object obj = this.f100481a[0];
            Objects.requireNonNull(obj);
            int i15 = o1.f100461c;
            return new j3(obj);
        }
        if (this.f100452d == null || o1.n(i13) != this.f100452d.length) {
            p13 = o1.p(this.f100482b, this.f100481a);
            this.f100482b = p13.size();
        } else {
            Object[] copyOf = o1.l(this.f100482b, this.f100481a.length) ? Arrays.copyOf(this.f100481a, this.f100482b) : this.f100481a;
            p13 = new b3(this.f100453e, r7.length - 1, this.f100482b, copyOf, this.f100452d);
        }
        this.f100483c = true;
        this.f100452d = null;
        return p13;
    }
}
