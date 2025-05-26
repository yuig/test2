package oe2;

import java.lang.reflect.Array;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class g extends r {

    /* renamed from: c, reason: collision with root package name */
    public static final f f94328c = new f(0);

    /* renamed from: a, reason: collision with root package name */
    public final Class f94329a;

    /* renamed from: b, reason: collision with root package name */
    public final r f94330b;

    public g(Class cls, r rVar) {
        this.f94329a = cls;
        this.f94330b = rVar;
    }

    @Override // oe2.r
    public final Object a(v vVar) {
        ArrayList arrayList = new ArrayList();
        vVar.a();
        while (vVar.hasNext()) {
            arrayList.add(this.f94330b.a(vVar));
        }
        vVar.d();
        Object newInstance = Array.newInstance((Class<?>) this.f94329a, arrayList.size());
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            Array.set(newInstance, i13, arrayList.get(i13));
        }
        return newInstance;
    }

    @Override // oe2.r
    public final void d(y yVar, Object obj) {
        yVar.a();
        int length = Array.getLength(obj);
        for (int i13 = 0; i13 < length; i13++) {
            this.f94330b.d(yVar, Array.get(obj, i13));
        }
        ((x) yVar).q(1, 2, ']');
    }

    public final String toString() {
        return this.f94330b + ".array()";
    }
}
