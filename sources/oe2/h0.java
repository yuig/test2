package oe2;

import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* loaded from: classes4.dex */
public final class h0 {

    /* renamed from: d, reason: collision with root package name */
    public static final ArrayList f94338d;

    /* renamed from: a, reason: collision with root package name */
    public final List f94339a;

    /* renamed from: b, reason: collision with root package name */
    public final ThreadLocal f94340b = new ThreadLocal();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f94341c = new LinkedHashMap();

    static {
        ArrayList arrayList = new ArrayList(5);
        f94338d = arrayList;
        arrayList.add(n0.f94371a);
        arrayList.add(n.f94369b);
        arrayList.add(e0.f94320c);
        arrayList.add(g.f94328c);
        arrayList.add(i0.f94345a);
        arrayList.add(l.f94354d);
    }

    public h0(ho.i iVar) {
        List list = iVar.f69676b;
        int size = list.size();
        ArrayList arrayList = f94338d;
        ArrayList arrayList2 = new ArrayList(arrayList.size() + size);
        arrayList2.addAll(list);
        arrayList2.addAll(arrayList);
        this.f94339a = Collections.unmodifiableList(arrayList2);
    }

    public final r a(Class cls) {
        return c(cls, pe2.b.f99998a, null);
    }

    public final r b(Type type) {
        return c(type, pe2.b.f99998a, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v4, types: [oe2.r] */
    public final r c(Type type, Set set, String str) {
        f0 f0Var;
        if (type == null) {
            throw new NullPointerException("type == null");
        }
        if (set == null) {
            throw new NullPointerException("annotations == null");
        }
        Type g13 = pe2.b.g(pe2.b.a(type));
        Object asList = set.isEmpty() ? g13 : Arrays.asList(g13, set);
        synchronized (this.f94341c) {
            try {
                r rVar = (r) this.f94341c.get(asList);
                if (rVar != null) {
                    return rVar;
                }
                g0 g0Var = (g0) this.f94340b.get();
                if (g0Var == null) {
                    g0Var = new g0(this);
                    this.f94340b.set(g0Var);
                }
                ArrayList arrayList = g0Var.f94331a;
                int size = arrayList.size();
                int i13 = 0;
                while (true) {
                    ArrayDeque arrayDeque = g0Var.f94332b;
                    if (i13 >= size) {
                        f0 f0Var2 = new f0(asList, str, g13);
                        arrayList.add(f0Var2);
                        arrayDeque.add(f0Var2);
                        f0Var = null;
                        break;
                    }
                    f0Var = (f0) arrayList.get(i13);
                    if (f0Var.f94326c.equals(asList)) {
                        arrayDeque.add(f0Var);
                        ?? r122 = f0Var.f94327d;
                        if (r122 != 0) {
                            f0Var = r122;
                        }
                    } else {
                        i13++;
                    }
                }
                try {
                    if (f0Var != null) {
                        return f0Var;
                    }
                    try {
                        int size2 = this.f94339a.size();
                        for (int i14 = 0; i14 < size2; i14++) {
                            r a13 = ((q) this.f94339a.get(i14)).a(g13, set, this);
                            if (a13 != null) {
                                ((f0) g0Var.f94332b.getLast()).f94327d = a13;
                                g0Var.b(true);
                                return a13;
                            }
                        }
                        throw new IllegalArgumentException("No JsonAdapter for " + pe2.b.j(g13, set));
                    } catch (IllegalArgumentException e13) {
                        throw g0Var.a(e13);
                    }
                } finally {
                    g0Var.b(false);
                }
            } finally {
            }
        }
    }

    public final r d(q qVar, Type type, Set set) {
        if (set == null) {
            throw new NullPointerException("annotations == null");
        }
        Type g13 = pe2.b.g(pe2.b.a(type));
        List list = this.f94339a;
        int indexOf = list.indexOf(qVar);
        if (indexOf == -1) {
            throw new IllegalArgumentException("Unable to skip past unknown factory " + qVar);
        }
        int size = list.size();
        for (int i13 = indexOf + 1; i13 < size; i13++) {
            r a13 = ((q) list.get(i13)).a(g13, set, this);
            if (a13 != null) {
                return a13;
            }
        }
        throw new IllegalArgumentException("No next JsonAdapter for " + pe2.b.j(g13, set));
    }
}
