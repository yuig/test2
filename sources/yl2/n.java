package yl2;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class n {

    /* renamed from: c, reason: collision with root package name */
    public static final n f139380c = new n(f0.j(h.f139372c, k.f139375c, i.f139373c, j.f139374c));

    /* renamed from: a, reason: collision with root package name */
    public final List f139381a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f139382b;

    public n(List kinds) {
        Intrinsics.checkNotNullParameter(kinds, "kinds");
        this.f139381a = kinds;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : kinds) {
            ym2.c cVar = ((l) obj).f139376a;
            Object obj2 = linkedHashMap.get(cVar);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(cVar, obj2);
            }
            ((List) obj2).add(obj);
        }
        this.f139382b = linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0066 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x001a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final yl2.m a(java.lang.String r9, ym2.c r10) {
        /*
            r8 = this;
            java.lang.String r0 = "packageFqName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "className"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.util.LinkedHashMap r0 = r8.f139382b
            java.lang.Object r10 = r0.get(r10)
            java.util.List r10 = (java.util.List) r10
            r0 = 0
            if (r10 != 0) goto L16
            return r0
        L16:
            java.util.Iterator r10 = r10.iterator()
        L1a:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L70
            java.lang.Object r1 = r10.next()
            yl2.l r1 = (yl2.l) r1
            java.lang.String r2 = r1.f139377b
            r3 = 0
            boolean r2 = kotlin.text.z.p(r9, r2, r3)
            if (r2 == 0) goto L1a
            java.lang.String r2 = r1.f139377b
            int r2 = r2.length()
            java.lang.String r2 = r9.substring(r2)
            java.lang.String r4 = "substring(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r4)
            int r4 = r2.length()
            if (r4 != 0) goto L47
        L45:
            r2 = r0
            goto L64
        L47:
            int r4 = r2.length()
            r5 = r3
        L4c:
            if (r3 >= r4) goto L60
            char r6 = r2.charAt(r3)
            int r6 = r6 + (-48)
            if (r6 < 0) goto L45
            r7 = 10
            if (r6 >= r7) goto L45
            int r5 = r5 * 10
            int r5 = r5 + r6
            int r3 = r3 + 1
            goto L4c
        L60:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
        L64:
            if (r2 == 0) goto L1a
            int r9 = r2.intValue()
            yl2.m r10 = new yl2.m
            r10.<init>(r1, r9)
            return r10
        L70:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yl2.n.a(java.lang.String, ym2.c):yl2.m");
    }
}
