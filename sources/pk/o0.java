package pk;

import java.util.ArrayDeque;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class o0 implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Iterable[] f100460a;

    public o0(Iterable[] iterableArr) {
        this.f100460a = iterableArr;
    }

    public static o0 b(ArrayDeque arrayDeque, ArrayDeque arrayDeque2) {
        Iterable[] iterableArr = {arrayDeque, arrayDeque2};
        for (int i13 = 0; i13 < 2; i13++) {
            iterableArr[i13].getClass();
        }
        return new o0(iterableArr);
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        Iterator it = iterator();
        StringBuilder sb3 = new StringBuilder("[");
        boolean z13 = true;
        while (it.hasNext()) {
            if (!z13) {
                sb3.append(", ");
            }
            sb3.append(it.next());
            z13 = false;
        }
        sb3.append(']');
        return sb3.toString();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        n0 n0Var = new n0(this, this.f100460a.length);
        w1 w1Var = new w1();
        w1Var.f100511b = v1.f100500d;
        w1Var.f100512c = n0Var;
        return w1Var;
    }
}
