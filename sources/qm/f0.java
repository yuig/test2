package qm;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.security.AccessController;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class f0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f104157a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f104158b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f104159c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f104160d;

    public f0(Class cls) {
        this.f104157a = 1;
        this.f104158b = new HashMap();
        this.f104159c = new HashMap();
        this.f104160d = new HashMap();
        try {
            for (Field field : (Field[]) AccessController.doPrivileged(new m1(cls))) {
                Enum r43 = (Enum) field.get(null);
                String name = r43.name();
                String str = r43.toString();
                om.b bVar = (om.b) field.getAnnotation(om.b.class);
                Object obj = this.f104158b;
                if (bVar != null) {
                    name = bVar.value();
                    for (String str2 : bVar.alternate()) {
                        ((Map) obj).put(str2, r43);
                    }
                }
                ((Map) obj).put(name, r43);
                ((Map) this.f104159c).put(str, r43);
                ((Map) this.f104160d).put(r43, name);
            }
        } catch (IllegalAccessException e13) {
            throw new AssertionError(e13);
        }
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        int i13 = this.f104157a;
        Object obj = this.f104159c;
        switch (i13) {
            case 0:
                return ((nm.i0) obj).c(aVar);
            default:
                if (aVar.K() == um.b.NULL) {
                    aVar.B1();
                    return null;
                }
                String Y0 = aVar.Y0();
                Enum r03 = (Enum) ((Map) this.f104158b).get(Y0);
                return r03 == null ? (Enum) ((Map) obj).get(Y0) : r03;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0056, code lost:
    
        if ((r2 instanceof qm.x) == false) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.reflect.Type] */
    @Override // nm.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(um.c r5, java.lang.Object r6) {
        /*
            r4 = this;
            int r0 = r4.f104157a
            java.lang.Object r1 = r4.f104160d
            switch(r0) {
                case 0: goto L19;
                default: goto L7;
            }
        L7:
            java.lang.Enum r6 = (java.lang.Enum) r6
            if (r6 != 0) goto Ld
            r6 = 0
            goto L15
        Ld:
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r6 = r1.get(r6)
            java.lang.String r6 = (java.lang.String) r6
        L15:
            r5.M(r6)
            return
        L19:
            java.lang.Object r0 = r4.f104159c
            nm.i0 r0 = (nm.i0) r0
            java.lang.reflect.Type r1 = (java.lang.reflect.Type) r1
            if (r6 == 0) goto L2e
            boolean r2 = r1 instanceof java.lang.Class
            if (r2 != 0) goto L29
            boolean r2 = r1 instanceof java.lang.reflect.TypeVariable
            if (r2 == 0) goto L2e
        L29:
            java.lang.Class r2 = r6.getClass()
            goto L2f
        L2e:
            r2 = r1
        L2f:
            if (r2 == r1) goto L5a
            java.lang.Object r1 = r4.f104158b
            nm.o r1 = (nm.o) r1
            com.google.gson.reflect.TypeToken r3 = new com.google.gson.reflect.TypeToken
            r3.<init>(r2)
            nm.i0 r1 = r1.g(r3)
            boolean r2 = r1 instanceof qm.x
            if (r2 != 0) goto L43
            goto L59
        L43:
            r2 = r0
        L44:
            boolean r3 = r2 instanceof qm.c0
            if (r3 == 0) goto L54
            r3 = r2
            qm.c0 r3 = (qm.c0) r3
            nm.i0 r3 = r3.f()
            if (r3 != r2) goto L52
            goto L54
        L52:
            r2 = r3
            goto L44
        L54:
            boolean r2 = r2 instanceof qm.x
            if (r2 != 0) goto L59
            goto L5a
        L59:
            r0 = r1
        L5a:
            r0.e(r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qm.f0.e(um.c, java.lang.Object):void");
    }

    public f0(nm.o oVar, nm.i0 i0Var, Type type) {
        this.f104157a = 0;
        this.f104158b = oVar;
        this.f104159c = i0Var;
        this.f104160d = type;
    }
}
