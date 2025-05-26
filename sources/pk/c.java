package pk;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public abstract class c extends n3 {

    /* renamed from: a, reason: collision with root package name */
    public b f100368a = b.NOT_READY;

    /* renamed from: b, reason: collision with root package name */
    public Object f100369b;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        Object next;
        b bVar = this.f100368a;
        b bVar2 = b.FAILED;
        bf.b.v(bVar != bVar2);
        int ordinal = this.f100368a.ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal == 2) {
            return false;
        }
        this.f100368a = bVar2;
        u1 u1Var = (u1) this;
        int i13 = u1Var.f100489c;
        Object obj = null;
        Object obj2 = u1Var.f100491e;
        Iterator it = u1Var.f100490d;
        switch (i13) {
            case 0:
                while (it.hasNext()) {
                    next = it.next();
                    if (((ok.w) obj2).apply(next)) {
                        obj = next;
                        break;
                    }
                }
                u1Var.f100368a = b.DONE;
                break;
            default:
                while (it.hasNext()) {
                    next = it.next();
                    if (((f3) obj2).f100400c.contains(next)) {
                        obj = next;
                        break;
                    }
                }
                u1Var.f100368a = b.DONE;
                break;
        }
        this.f100369b = obj;
        if (this.f100368a == b.DONE) {
            return false;
        }
        this.f100368a = b.READY;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f100368a = b.NOT_READY;
        Object obj = this.f100369b;
        this.f100369b = null;
        return obj;
    }
}
