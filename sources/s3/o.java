package s3;

import java.util.Comparator;

/* loaded from: classes.dex */
public final class o implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f110849a;

    public /* synthetic */ o(int i13) {
        this.f110849a = i13;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
    
        if (r0 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
    
        r1 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0060, code lost:
    
        if (r0 != false) goto L23;
     */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int compare(java.lang.Object r7, java.lang.Object r8) {
        /*
            r6 = this;
            int r0 = r6.f110849a
            r1 = -1
            r2 = 1
            r3 = 0
            switch(r0) {
                case 0: goto L90;
                case 1: goto L75;
                case 2: goto L41;
                case 3: goto L37;
                case 4: goto L26;
                case 5: goto L1d;
                default: goto L8;
            }
        L8:
            gc2.a r7 = (gc2.a) r7
            long r0 = r7.f64773a
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
            gc2.a r8 = (gc2.a) r8
            long r0 = r8.f64773a
            java.lang.Long r8 = java.lang.Long.valueOf(r0)
            int r7 = al2.a.b(r7, r8)
            return r7
        L1d:
            java.lang.Comparable r7 = (java.lang.Comparable) r7
            java.lang.Comparable r8 = (java.lang.Comparable) r8
            int r7 = r7.compareTo(r8)
            return r7
        L26:
            kotlin.Pair r7 = (kotlin.Pair) r7
            java.lang.Object r7 = r7.f80346a
            java.lang.String r7 = (java.lang.String) r7
            kotlin.Pair r8 = (kotlin.Pair) r8
            java.lang.Object r8 = r8.f80346a
            java.lang.String r8 = (java.lang.String) r8
            int r7 = al2.a.b(r7, r8)
            return r7
        L37:
            xa.f r7 = (xa.f) r7
            xa.f r8 = (xa.f) r8
            int r7 = r7.f134381b
            int r8 = r8.f134381b
            int r7 = r7 - r8
            return r7
        L41:
            androidx.recyclerview.widget.g0 r7 = (androidx.recyclerview.widget.g0) r7
            androidx.recyclerview.widget.g0 r8 = (androidx.recyclerview.widget.g0) r8
            androidx.recyclerview.widget.RecyclerView r0 = r7.f19417d
            if (r0 != 0) goto L4b
            r4 = r2
            goto L4c
        L4b:
            r4 = r3
        L4c:
            androidx.recyclerview.widget.RecyclerView r5 = r8.f19417d
            if (r5 != 0) goto L52
            r5 = r2
            goto L53
        L52:
            r5 = r3
        L53:
            if (r4 == r5) goto L5a
            if (r0 != 0) goto L58
        L57:
            r1 = r2
        L58:
            r3 = r1
            goto L74
        L5a:
            boolean r0 = r7.f19414a
            boolean r4 = r8.f19414a
            if (r0 == r4) goto L63
            if (r0 == 0) goto L57
            goto L58
        L63:
            int r0 = r8.f19415b
            int r1 = r7.f19415b
            int r0 = r0 - r1
            if (r0 == 0) goto L6c
            r3 = r0
            goto L74
        L6c:
            int r7 = r7.f19416c
            int r8 = r8.f19416c
            int r7 = r7 - r8
            if (r7 == 0) goto L74
            r3 = r7
        L74:
            return r3
        L75:
            android.view.View r7 = (android.view.View) r7
            android.view.View r8 = (android.view.View) r8
            java.util.WeakHashMap r0 = q5.v0.f102521a
            float r7 = q5.m0.h(r7)
            float r8 = q5.m0.h(r8)
            int r0 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r0 <= 0) goto L88
            goto L8f
        L88:
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 >= 0) goto L8e
            r1 = r2
            goto L8f
        L8e:
            r1 = r3
        L8f:
            return r1
        L90:
            s3.k0 r7 = (s3.k0) r7
            s3.k0 r8 = (s3.k0) r8
            int r0 = r7.f110823k
            int r1 = r8.f110823k
            int r0 = kotlin.jvm.internal.Intrinsics.i(r0, r1)
            if (r0 == 0) goto L9f
            goto Lab
        L9f:
            int r7 = r7.hashCode()
            int r8 = r8.hashCode()
            int r0 = kotlin.jvm.internal.Intrinsics.i(r7, r8)
        Lab:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.o.compare(java.lang.Object, java.lang.Object):int");
    }
}
