package pk;

import java.io.Serializable;
import java.util.Iterator;

/* loaded from: classes3.dex */
public abstract class l1 extends y implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final transient h1 f100447d;

    /* renamed from: e, reason: collision with root package name */
    public final transient int f100448e;

    public l1(a3 a3Var, int i13) {
        this.f100447d = a3Var;
        this.f100448e = i13;
    }

    @Override // pk.w
    public final boolean c(Object obj) {
        return obj != null && super.c(obj);
    }

    @Override // pk.l2
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // pk.w
    public final Iterator d() {
        return new i1(this);
    }

    @Override // pk.w
    public final Iterator f() {
        return new j1(this);
    }

    @Override // pk.l2
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public h1 a() {
        return this.f100447d;
    }

    public final o1 h() {
        return this.f100447d.keySet();
    }

    @Override // pk.w, pk.l2
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // pk.l2
    public final int size() {
        return this.f100448e;
    }
}
