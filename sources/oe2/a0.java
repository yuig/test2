package oe2;

import java.util.AbstractSet;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class a0 extends AbstractSet {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f94280a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f94281b;

    public /* synthetic */ a0(d0 d0Var, int i13) {
        this.f94280a = i13;
        this.f94281b = d0Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        int i13 = this.f94280a;
        d0 d0Var = this.f94281b;
        switch (i13) {
            case 0:
                d0Var.clear();
                break;
            default:
                d0Var.clear();
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0038 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean contains(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.f94280a
            oe2.d0 r1 = r4.f94281b
            switch(r0) {
                case 0: goto Lc;
                default: goto L7;
            }
        L7:
            boolean r5 = r1.containsKey(r5)
            return r5
        Lc:
            boolean r0 = r5 instanceof java.util.Map.Entry
            r2 = 0
            if (r0 == 0) goto L39
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            r1.getClass()
            java.lang.Object r0 = r5.getKey()
            r3 = 0
            if (r0 == 0) goto L22
            oe2.c0 r0 = r1.a(r0, r2)     // Catch: java.lang.ClassCastException -> L22
            goto L23
        L22:
            r0 = r3
        L23:
            if (r0 == 0) goto L36
            java.lang.Object r1 = r0.f94300h
            java.lang.Object r5 = r5.getValue()
            if (r1 == r5) goto L35
            if (r1 == 0) goto L36
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L36
        L35:
            r3 = r0
        L36:
            if (r3 == 0) goto L39
            r2 = 1
        L39:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: oe2.a0.contains(java.lang.Object):boolean");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f94280a) {
            case 0:
                return new z(this);
            default:
                return new z(this, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0048  */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean remove(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 0
            int r1 = r6.f94280a
            r2 = 0
            r3 = 1
            oe2.d0 r4 = r6.f94281b
            switch(r1) {
                case 0: goto L1c;
                default: goto La;
            }
        La:
            r4.getClass()
            if (r7 == 0) goto L13
            oe2.c0 r0 = r4.a(r7, r2)     // Catch: java.lang.ClassCastException -> L13
        L13:
            if (r0 == 0) goto L18
            r4.c(r0, r3)
        L18:
            if (r0 == 0) goto L1b
            r2 = r3
        L1b:
            return r2
        L1c:
            boolean r1 = r7 instanceof java.util.Map.Entry
            if (r1 != 0) goto L21
            goto L4c
        L21:
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            r4.getClass()
            java.lang.Object r1 = r7.getKey()
            if (r1 == 0) goto L31
            oe2.c0 r1 = r4.a(r1, r2)     // Catch: java.lang.ClassCastException -> L31
            goto L32
        L31:
            r1 = r0
        L32:
            if (r1 == 0) goto L45
            java.lang.Object r5 = r1.f94300h
            java.lang.Object r7 = r7.getValue()
            if (r5 == r7) goto L44
            if (r5 == 0) goto L45
            boolean r7 = r5.equals(r7)
            if (r7 == 0) goto L45
        L44:
            r0 = r1
        L45:
            if (r0 != 0) goto L48
            goto L4c
        L48:
            r4.c(r0, r3)
            r2 = r3
        L4c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: oe2.a0.remove(java.lang.Object):boolean");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i13 = this.f94280a;
        d0 d0Var = this.f94281b;
        switch (i13) {
        }
        return d0Var.f94313d;
    }
}
