package oe2;

import java.lang.reflect.InvocationTargetException;
import java.util.TreeMap;

/* loaded from: classes4.dex */
public final class l extends r {

    /* renamed from: d, reason: collision with root package name */
    public static final f f94354d = new f(1);

    /* renamed from: a, reason: collision with root package name */
    public final kh2.w f94355a;

    /* renamed from: b, reason: collision with root package name */
    public final k[] f94356b;

    /* renamed from: c, reason: collision with root package name */
    public final mc2.k f94357c;

    public l(kh2.w wVar, TreeMap treeMap) {
        this.f94355a = wVar;
        this.f94356b = (k[]) treeMap.values().toArray(new k[treeMap.size()]);
        this.f94357c = mc2.k.b((String[]) treeMap.keySet().toArray(new String[treeMap.size()]));
    }

    @Override // oe2.r
    public final Object a(v vVar) {
        try {
            Object p03 = this.f94355a.p0();
            try {
                vVar.c();
                while (vVar.hasNext()) {
                    int k13 = vVar.k(this.f94357c);
                    if (k13 == -1) {
                        vVar.m();
                        vVar.E();
                    } else {
                        k kVar = this.f94356b[k13];
                        kVar.f94351b.set(p03, kVar.f94352c.a(vVar));
                    }
                }
                vVar.e();
                return p03;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        } catch (IllegalAccessException unused2) {
            throw new AssertionError();
        } catch (InstantiationException e13) {
            throw new RuntimeException(e13);
        } catch (InvocationTargetException e14) {
            pe2.b.i(e14);
            throw null;
        }
    }

    @Override // oe2.r
    public final void d(y yVar, Object obj) {
        try {
            yVar.c();
            for (k kVar : this.f94356b) {
                yVar.f(kVar.f94350a);
                kVar.f94352c.d(yVar, kVar.f94351b.get(obj));
            }
            yVar.d();
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        }
    }

    public final String toString() {
        return "JsonAdapter(" + this.f94355a + ")";
    }
}
