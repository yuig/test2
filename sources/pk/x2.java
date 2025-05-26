package pk;

import java.util.Map;

/* loaded from: classes.dex */
public final class x2 extends o1 {

    /* renamed from: d, reason: collision with root package name */
    public final transient h1 f100516d;

    /* renamed from: e, reason: collision with root package name */
    public final transient Object[] f100517e;

    /* renamed from: f, reason: collision with root package name */
    public final transient int f100518f;

    /* renamed from: g, reason: collision with root package name */
    public final transient int f100519g;

    public x2(h1 h1Var, Object[] objArr, int i13, int i14) {
        this.f100516d = h1Var;
        this.f100517e = objArr;
        this.f100518f = i13;
        this.f100519g = i14;
    }

    @Override // pk.v0
    public final int c(int i13, Object[] objArr) {
        return b().c(i13, objArr);
    }

    @Override // pk.v0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        return value != null && value.equals(this.f100516d.get(key));
    }

    @Override // pk.v0
    public final boolean i() {
        return true;
    }

    @Override // pk.v0
    /* renamed from: j */
    public final n3 iterator() {
        return b().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f100519g;
    }

    @Override // pk.o1
    public final c1 t() {
        return new w2(this);
    }

    @Override // pk.o1, pk.v0
    public Object writeReplace() {
        return super.writeReplace();
    }
}
