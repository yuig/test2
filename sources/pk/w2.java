package pk;

import java.util.AbstractMap;
import java.util.Objects;

/* loaded from: classes.dex */
public final class w2 extends c1 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x2 f100514c;

    public w2(x2 x2Var) {
        this.f100514c = x2Var;
    }

    @Override // java.util.List
    public final Object get(int i13) {
        x2 x2Var = this.f100514c;
        bf.b.l(i13, x2Var.f100519g);
        int i14 = i13 * 2;
        int i15 = x2Var.f100518f;
        Object[] objArr = x2Var.f100517e;
        Object obj = objArr[i14 + i15];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i14 + (i15 ^ 1)];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // pk.v0
    public final boolean i() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f100514c.f100519g;
    }

    @Override // pk.c1, pk.v0
    public Object writeReplace() {
        return super.writeReplace();
    }
}
