package pk;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public abstract class d0 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public int f100377a;

    /* renamed from: b, reason: collision with root package name */
    public int f100378b;

    /* renamed from: c, reason: collision with root package name */
    public int f100379c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f0 f100380d;

    public d0(f0 f0Var) {
        this.f100380d = f0Var;
        this.f100377a = f0Var.f100391e;
        this.f100378b = f0Var.isEmpty() ? -1 : 0;
        this.f100379c = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f100378b >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj;
        f0 f0Var = this.f100380d;
        if (f0Var.f100391e != this.f100377a) {
            throw new ConcurrentModificationException();
        }
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i13 = this.f100378b;
        this.f100379c = i13;
        b0 b0Var = (b0) this;
        int i14 = b0Var.f100354e;
        f0 f0Var2 = b0Var.f100355f;
        switch (i14) {
            case 0:
                obj = f0Var2.k()[i13];
                break;
            case 1:
                obj = new e0(f0Var2, i13);
                break;
            default:
                obj = f0Var2.m()[i13];
                break;
        }
        int i15 = this.f100378b + 1;
        if (i15 >= f0Var.f100392f) {
            i15 = -1;
        }
        this.f100378b = i15;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        f0 f0Var = this.f100380d;
        if (f0Var.f100391e != this.f100377a) {
            throw new ConcurrentModificationException();
        }
        bf.b.u("no calls to next() since the last call to remove()", this.f100379c >= 0);
        this.f100377a += 32;
        f0Var.remove(f0Var.k()[this.f100379c]);
        this.f100378b--;
        this.f100379c = -1;
    }
}
