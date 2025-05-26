package dg;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class g extends ve.h {

    /* renamed from: b, reason: collision with root package name */
    public static final gg.d[] f54915b = new gg.d[0];

    /* renamed from: c, reason: collision with root package name */
    public static final a[] f54916c = new a[0];

    /* renamed from: d, reason: collision with root package name */
    public static final Method f54917d;

    static {
        try {
            f54917d = Map.class.getMethod("get", Object.class);
        } catch (NoSuchMethodException e13) {
            throw new AssertionError(e13);
        }
    }

    public static Object n0(ve.h hVar, int i13, gg.d[] dVarArr, List list) {
        Object obj = list.get(i13);
        hVar.getClass();
        Object c13 = ve.h.c(obj);
        if (dVarArr != null) {
            for (gg.d dVar : dVarArr) {
                gg.b bVar = new gg.b();
                bVar.add(c13);
                c13 = ve.h.c(dVar.a(bVar));
            }
        }
        return c13;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c5, code lost:
    
        if (r14 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c7, code lost:
    
        r8.add(new eg.f(r17, r0, r14, java.util.Collections.singletonList(new eg.a(0, r5))));
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d8, code lost:
    
        if (r14 != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00da, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e5, code lost:
    
        r1 = m0(r0, r3, r8, r5, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ee, code lost:
    
        if (r1 != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00f0, code lost:
    
        if (r14 == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00f2, code lost:
    
        r1 = new dg.f(r9, (dg.a[]) r8.toArray(r11));
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00dc, code lost:
    
        r3 = (gg.d[]) r14.toArray(dg.g.f54915b);
     */
    @Override // ve.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final dg.e l(java.lang.String r18, java.util.List r19) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: dg.g.l(java.lang.String, java.util.List):dg.e");
    }

    public final h m0(int i13, gg.d[] dVarArr, ArrayList arrayList, Object obj, String str) {
        Object c13 = ve.h.c(obj);
        if (c13 == null) {
            return null;
        }
        boolean z13 = c13 instanceof Map;
        a[] aVarArr = f54916c;
        if (!z13) {
            AccessibleObject m13 = ve.h.m(c13.getClass(), str);
            if (m13 == null) {
                return null;
            }
            return new h(i13, dVarArr, (a[]) arrayList.toArray(aVarArr), m13, new Object[0], this);
        }
        if (!((Map) c13).containsKey(str)) {
            arrayList.add(new eg.d(this, i13, str, false, dVarArr));
            return null;
        }
        arrayList.add(new eg.d(this, i13, str, true, dVarArr));
        return new h(i13, dVarArr, (a[]) arrayList.toArray(aVarArr), f54917d, new Object[]{str}, this);
    }
}
