package oe2;

import a.cb;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* loaded from: classes4.dex */
public final class e implements q {

    /* renamed from: a, reason: collision with root package name */
    public final List f94318a;

    /* renamed from: b, reason: collision with root package name */
    public final List f94319b;

    public e(ArrayList arrayList, ArrayList arrayList2) {
        this.f94318a = arrayList;
        this.f94319b = arrayList2;
    }

    public static d b(List list, Type type, Set set) {
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            d dVar = (d) list.get(i13);
            if (kg.a.r(dVar.f94302a, type) && dVar.f94303b.equals(set)) {
                return dVar;
            }
        }
        return null;
    }

    @Override // oe2.q
    public final r a(Type type, Set set, h0 h0Var) {
        d b13 = b(this.f94318a, type, set);
        d b14 = b(this.f94319b, type, set);
        r rVar = null;
        if (b13 == null && b14 == null) {
            return null;
        }
        if (b13 == null || b14 == null) {
            try {
                rVar = h0Var.d(this, type, set);
            } catch (IllegalArgumentException e13) {
                StringBuilder o13 = cb.o("No ", b13 == null ? "@ToJson" : "@FromJson", " adapter for ");
                o13.append(pe2.b.j(type, set));
                throw new IllegalArgumentException(o13.toString(), e13);
            }
        }
        r rVar2 = rVar;
        if (b13 != null) {
            b13.a(h0Var, this);
        }
        if (b14 != null) {
            b14.a(h0Var, this);
        }
        return new a(b13, rVar2, h0Var, b14, set, type);
    }
}
