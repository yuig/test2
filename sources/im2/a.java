package im2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.collections.i1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: c, reason: collision with root package name */
    public static final LinkedHashMap f72683c;

    /* renamed from: a, reason: collision with root package name */
    public final z f72684a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f72685b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (b bVar : b.values()) {
            String javaTarget = bVar.getJavaTarget();
            if (linkedHashMap.get(javaTarget) == null) {
                linkedHashMap.put(javaTarget, bVar);
            }
        }
        f72683c = linkedHashMap;
    }

    public a(z javaTypeEnhancementState) {
        Intrinsics.checkNotNullParameter(javaTypeEnhancementState, "javaTypeEnhancementState");
        this.f72684a = javaTypeEnhancementState;
        this.f72685b = new ConcurrentHashMap();
    }

    public static Set a(LinkedHashSet linkedHashSet) {
        return linkedHashSet.contains(b.TYPE_USE) ? i1.i(i1.g(kotlin.collections.c0.f0(b.values()), b.TYPE_PARAMETER_BOUNDS), linkedHashSet) : linkedHashSet;
    }

    public abstract ArrayList b(Object obj, boolean z13);

    /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0116 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0015 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final im2.a0 c(im2.a0 r12, java.lang.Iterable r13) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: im2.a.c(im2.a0, java.lang.Iterable):im2.a0");
    }

    public final Object d(Object obj, ym2.c cVar) {
        for (Object obj2 : g(obj)) {
            if (Intrinsics.d(e(obj2), cVar)) {
                return obj2;
            }
        }
        return null;
    }

    public abstract ym2.c e(Object obj);

    public abstract am2.g f(Object obj);

    public abstract Iterable g(Object obj);

    public final boolean h(Object obj, ym2.c cVar) {
        Iterable g13 = g(obj);
        if ((g13 instanceof Collection) && ((Collection) g13).isEmpty()) {
            return false;
        }
        Iterator it = g13.iterator();
        while (it.hasNext()) {
            if (Intrinsics.d(e(it.next()), cVar)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008d, code lost:
    
        if (r6.equals("ALWAYS") != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a2, code lost:
    
        if (r6.equals("NEVER") == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ae, code lost:
    
        r6 = qm2.f.NULLABLE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ab, code lost:
    
        if (r6.equals("MAYBE") == false) goto L45;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final qm2.g i(java.lang.Object r6, boolean r7) {
        /*
            r5 = this;
            ym2.c r0 = r5.e(r6)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            im2.z r2 = r5.f72684a
            r2.getClass()
            im2.y r2 = im2.y.f72792a
            java.lang.Object r2 = r2.invoke(r0)
            im2.j0 r2 = (im2.j0) r2
            boolean r3 = r2.isIgnore()
            if (r3 == 0) goto L1c
            return r1
        L1c:
            java.util.List r3 = im2.e0.j()
            boolean r3 = r3.contains(r0)
            r4 = 0
            if (r3 == 0) goto L2b
            qm2.f r6 = qm2.f.NULLABLE
            goto Le7
        L2b:
            java.util.List r3 = im2.e0.i()
            boolean r3 = r3.contains(r0)
            if (r3 == 0) goto L39
            qm2.f r6 = qm2.f.NOT_NULL
            goto Le7
        L39:
            ym2.c r3 = im2.e0.g()
            boolean r3 = kotlin.jvm.internal.Intrinsics.d(r0, r3)
            if (r3 == 0) goto L44
            goto L4e
        L44:
            ym2.c r3 = im2.e0.e()
            boolean r3 = kotlin.jvm.internal.Intrinsics.d(r0, r3)
            if (r3 == 0) goto L52
        L4e:
            qm2.f r6 = qm2.f.NULLABLE
            goto Le7
        L52:
            ym2.c r3 = im2.e0.h()
            boolean r3 = kotlin.jvm.internal.Intrinsics.d(r0, r3)
            if (r3 == 0) goto L5d
            goto L67
        L5d:
            ym2.c r3 = im2.e0.f()
            boolean r3 = kotlin.jvm.internal.Intrinsics.d(r0, r3)
            if (r3 == 0) goto L6b
        L67:
            qm2.f r6 = qm2.f.FORCE_FLEXIBILITY
            goto Le7
        L6b:
            ym2.c r3 = im2.e0.f72726h
            boolean r3 = kotlin.jvm.internal.Intrinsics.d(r0, r3)
            if (r3 == 0) goto Lb4
            java.util.ArrayList r6 = r5.b(r6, r4)
            java.lang.Object r6 = kotlin.collections.CollectionsKt.T(r6)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto Lb1
            int r0 = r6.hashCode()
            switch(r0) {
                case 73135176: goto La5;
                case 74175084: goto L9c;
                case 433141802: goto L90;
                case 1933739535: goto L87;
                default: goto L86;
            }
        L86:
            goto Lad
        L87:
            java.lang.String r0 = "ALWAYS"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto Lad
            goto Lb1
        L90:
            java.lang.String r0 = "UNKNOWN"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L99
            goto Lad
        L99:
            qm2.f r6 = qm2.f.FORCE_FLEXIBILITY
            goto Le7
        L9c:
            java.lang.String r0 = "NEVER"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto Lae
            goto Lad
        La5:
            java.lang.String r0 = "MAYBE"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto Lae
        Lad:
            return r1
        Lae:
            qm2.f r6 = qm2.f.NULLABLE
            goto Le7
        Lb1:
            qm2.f r6 = qm2.f.NOT_NULL
            goto Le7
        Lb4:
            ym2.c r6 = im2.e0.d()
            boolean r6 = kotlin.jvm.internal.Intrinsics.d(r0, r6)
            if (r6 == 0) goto Lc1
            qm2.f r6 = qm2.f.NULLABLE
            goto Le7
        Lc1:
            ym2.c r6 = im2.e0.c()
            boolean r6 = kotlin.jvm.internal.Intrinsics.d(r0, r6)
            if (r6 == 0) goto Lce
            qm2.f r6 = qm2.f.NOT_NULL
            goto Le7
        Lce:
            ym2.c r6 = im2.e0.a()
            boolean r6 = kotlin.jvm.internal.Intrinsics.d(r0, r6)
            if (r6 == 0) goto Ldb
            qm2.f r6 = qm2.f.NOT_NULL
            goto Le7
        Ldb:
            ym2.c r6 = im2.e0.b()
            boolean r6 = kotlin.jvm.internal.Intrinsics.d(r0, r6)
            if (r6 == 0) goto Lf6
            qm2.f r6 = qm2.f.NULLABLE
        Le7:
            qm2.g r0 = new qm2.g
            boolean r1 = r2.isWarning()
            if (r1 != 0) goto Lf1
            if (r7 == 0) goto Lf2
        Lf1:
            r4 = 1
        Lf2:
            r0.<init>(r6, r4)
            return r0
        Lf6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: im2.a.i(java.lang.Object, boolean):qm2.g");
    }

    public final j0 j(Object obj) {
        ym2.c e13 = e(obj);
        if (e13 == null || !c.f72696f.containsKey(e13)) {
            return k(obj);
        }
        this.f72684a.getClass();
        return (j0) y.f72792a.invoke(e13);
    }

    public final j0 k(Object obj) {
        j0 l13 = l(obj);
        return l13 != null ? l13 : this.f72684a.f72794a.f72687a;
    }

    public final j0 l(Object obj) {
        String str;
        z zVar = this.f72684a;
        j0 j0Var = (j0) zVar.f72794a.f72689c.get(e(obj));
        if (j0Var != null) {
            return j0Var;
        }
        Object d2 = d(obj, c.f72694d);
        if (d2 == null || (str = (String) CollectionsKt.T(b(d2, false))) == null) {
            return null;
        }
        j0 j0Var2 = zVar.f72794a.f72688b;
        if (j0Var2 != null) {
            return j0Var2;
        }
        int hashCode = str.hashCode();
        if (hashCode == -2137067054) {
            if (str.equals("IGNORE")) {
                return j0.IGNORE;
            }
            return null;
        }
        if (hashCode == -1838656823) {
            if (str.equals("STRICT")) {
                return j0.STRICT;
            }
            return null;
        }
        if (hashCode == 2656902 && str.equals("WARN")) {
            return j0.WARN;
        }
        return null;
    }

    public final Object m(Object annotation) {
        Object obj;
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        if (this.f72684a.f72794a.f72690d) {
            return null;
        }
        if (CollectionsKt.L(c.f72698h, e(annotation)) || h(annotation, c.f72692b)) {
            return annotation;
        }
        if (!h(annotation, c.f72691a)) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = this.f72685b;
        am2.g f13 = f(annotation);
        Object obj2 = concurrentHashMap.get(f13);
        if (obj2 != null) {
            return obj2;
        }
        Iterator it = g(annotation).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = m(it.next());
            if (obj != null) {
                break;
            }
        }
        if (obj == null) {
            return null;
        }
        Object putIfAbsent = concurrentHashMap.putIfAbsent(f13, obj);
        return putIfAbsent == null ? obj : putIfAbsent;
    }
}
