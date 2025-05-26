package oe2;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public abstract class b0 implements Iterator {

    /* renamed from: a */
    public c0 f94283a;

    /* renamed from: b */
    public c0 f94284b = null;

    /* renamed from: c */
    public int f94285c;

    /* renamed from: d */
    public final /* synthetic */ d0 f94286d;

    public b0(d0 d0Var) {
        this.f94286d = d0Var;
        this.f94283a = d0Var.f94312c.f94296d;
        this.f94285c = d0Var.f94314e;
    }

    public final c0 b() {
        c0 c0Var = this.f94283a;
        d0 d0Var = this.f94286d;
        if (c0Var == d0Var.f94312c) {
            throw new NoSuchElementException();
        }
        if (d0Var.f94314e != this.f94285c) {
            throw new ConcurrentModificationException();
        }
        this.f94283a = c0Var.f94296d;
        this.f94284b = c0Var;
        return c0Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f94283a != this.f94286d.f94312c;
    }

    @Override // java.util.Iterator
    public final void remove() {
        c0 c0Var = this.f94284b;
        if (c0Var == null) {
            throw new IllegalStateException();
        }
        d0 d0Var = this.f94286d;
        d0Var.c(c0Var, true);
        this.f94284b = null;
        this.f94285c = d0Var.f94314e;
    }
}
