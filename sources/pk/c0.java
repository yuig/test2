package pk;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class c0 extends AbstractSet {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f100370a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f100371b;

    public /* synthetic */ c0(f0 f0Var, int i13) {
        this.f100370a = i13;
        this.f100371b = f0Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        int i13 = this.f100370a;
        f0 f0Var = this.f100371b;
        switch (i13) {
            case 0:
                f0Var.clear();
                break;
            default:
                f0Var.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i13 = this.f100370a;
        f0 f0Var = this.f100371b;
        switch (i13) {
            case 0:
                Map c13 = f0Var.c();
                if (c13 != null) {
                    return c13.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int e13 = f0Var.e(entry.getKey());
                    if (e13 != -1 && kh2.g0.m(f0Var.m()[e13], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return f0Var.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i13 = this.f100370a;
        f0 f0Var = this.f100371b;
        switch (i13) {
            case 0:
                Map c13 = f0Var.c();
                return c13 != null ? c13.entrySet().iterator() : new b0(f0Var, 1);
            default:
                Map c14 = f0Var.c();
                return c14 != null ? c14.keySet().iterator() : new b0(f0Var, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i13 = this.f100370a;
        f0 f0Var = this.f100371b;
        switch (i13) {
            case 0:
                Map c13 = f0Var.c();
                if (c13 == null) {
                    if (obj instanceof Map.Entry) {
                        Map.Entry entry = (Map.Entry) obj;
                        if (!f0Var.h()) {
                            int d2 = f0Var.d();
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            Object obj2 = f0Var.f100387a;
                            Objects.requireNonNull(obj2);
                            int H1 = kh2.m2.H1(key, value, d2, obj2, f0Var.j(), f0Var.k(), f0Var.m());
                            if (H1 != -1) {
                                f0Var.g(H1, d2);
                                f0Var.f100392f--;
                                f0Var.f100391e += 32;
                                break;
                            }
                        }
                    }
                } else {
                    break;
                }
                break;
            default:
                Map c14 = f0Var.c();
                if (c14 == null) {
                    if (f0Var.i(obj) != f0.f100386j) {
                        break;
                    }
                } else {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i13 = this.f100370a;
        f0 f0Var = this.f100371b;
        switch (i13) {
        }
        return f0Var.size();
    }
}
