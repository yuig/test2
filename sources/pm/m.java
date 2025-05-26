package pm;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class m implements Iterator {

    /* renamed from: a */
    public n f100602a;

    /* renamed from: b */
    public n f100603b = null;

    /* renamed from: c */
    public int f100604c;

    /* renamed from: d */
    public final /* synthetic */ o f100605d;

    public m(o oVar) {
        this.f100605d = oVar;
        this.f100602a = oVar.f100621f.f100609d;
        this.f100604c = oVar.f100620e;
    }

    public final n b() {
        n nVar = this.f100602a;
        o oVar = this.f100605d;
        if (nVar == oVar.f100621f) {
            throw new NoSuchElementException();
        }
        if (oVar.f100620e != this.f100604c) {
            throw new ConcurrentModificationException();
        }
        this.f100602a = nVar.f100609d;
        this.f100603b = nVar;
        return nVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f100602a != this.f100605d.f100621f;
    }

    @Override // java.util.Iterator
    public final void remove() {
        n nVar = this.f100603b;
        if (nVar == null) {
            throw new IllegalStateException();
        }
        o oVar = this.f100605d;
        oVar.c(nVar, true);
        this.f100603b = null;
        this.f100604c = oVar.f100620e;
    }
}
