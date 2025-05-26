package pm;

import java.lang.reflect.AccessibleObject;

/* loaded from: classes3.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final s f100625a;

    /* JADX WARN: Removed duplicated region for block: B:5:0x001f  */
    static {
        /*
            boolean r0 = pm.i.a()
            if (r0 == 0) goto L1c
            java.lang.Class<java.lang.reflect.AccessibleObject> r0 = java.lang.reflect.AccessibleObject.class
            java.lang.String r1 = "canAccess"
            r2 = 1
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L1c
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            r4 = 0
            r2[r4] = r3     // Catch: java.lang.NoSuchMethodException -> L1c
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L1c
            pm.q r1 = new pm.q     // Catch: java.lang.NoSuchMethodException -> L1c
            r1.<init>(r0)     // Catch: java.lang.NoSuchMethodException -> L1c
            goto L1d
        L1c:
            r1 = 0
        L1d:
            if (r1 != 0) goto L24
            pm.r r1 = new pm.r
            r1.<init>()
        L24:
            pm.s.f100625a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pm.s.<clinit>():void");
    }

    public abstract boolean a(Object obj, AccessibleObject accessibleObject);
}
