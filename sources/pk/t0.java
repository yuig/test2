package pk;

import java.util.Arrays;
import java.util.Collection;

/* loaded from: classes.dex */
public abstract class t0 extends u0 {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f100481a;

    /* renamed from: b, reason: collision with root package name */
    public int f100482b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f100483c;

    public t0(int i13) {
        a0.C(i13, "initialCapacity");
        this.f100481a = new Object[i13];
        this.f100482b = 0;
    }

    @Override // pk.u0
    public final void b(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            h(collection.size());
            if (collection instanceof v0) {
                this.f100482b = ((v0) collection).c(this.f100482b, this.f100481a);
                return;
            }
        }
        super.b(iterable);
    }

    public final void e(Object obj) {
        obj.getClass();
        h(1);
        Object[] objArr = this.f100481a;
        int i13 = this.f100482b;
        this.f100482b = i13 + 1;
        objArr[i13] = obj;
    }

    public final void f(Object... objArr) {
        int length = objArr.length;
        bs1.c.v(length, objArr);
        h(length);
        System.arraycopy(objArr, 0, this.f100481a, this.f100482b, length);
        this.f100482b += length;
    }

    public void g(Object obj) {
        e(obj);
    }

    public final void h(int i13) {
        Object[] objArr = this.f100481a;
        int d2 = u0.d(objArr.length, this.f100482b + i13);
        if (d2 > objArr.length || this.f100483c) {
            this.f100481a = Arrays.copyOf(this.f100481a, d2);
            this.f100483c = false;
        }
    }
}
