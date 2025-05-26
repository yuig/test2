package qm;

import java.lang.reflect.Array;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b extends nm.i0 {

    /* renamed from: c, reason: collision with root package name */
    public static final a f104124c = new a();

    /* renamed from: a, reason: collision with root package name */
    public final Class f104125a;

    /* renamed from: b, reason: collision with root package name */
    public final f0 f104126b;

    public b(nm.o oVar, nm.i0 i0Var, Class cls) {
        this.f104126b = new f0(oVar, i0Var, cls);
        this.f104125a = cls;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.a();
        while (aVar.hasNext()) {
            arrayList.add(this.f104126b.c(aVar));
        }
        aVar.f();
        int size = arrayList.size();
        Class cls = this.f104125a;
        if (!cls.isPrimitive()) {
            return arrayList.toArray((Object[]) Array.newInstance((Class<?>) cls, size));
        }
        Object newInstance = Array.newInstance((Class<?>) cls, size);
        for (int i13 = 0; i13 < size; i13++) {
            Array.set(newInstance, i13, arrayList.get(i13));
        }
        return newInstance;
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        if (obj == null) {
            cVar.m();
            return;
        }
        cVar.c();
        int length = Array.getLength(obj);
        for (int i13 = 0; i13 < length; i13++) {
            this.f104126b.e(cVar, Array.get(obj, i13));
        }
        cVar.f();
    }
}
