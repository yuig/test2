package pm;

import java.util.AbstractSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class l extends AbstractSet {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f100600a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f100601b;

    public /* synthetic */ l(o oVar, int i13) {
        this.f100600a = i13;
        this.f100601b = oVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        int i13 = this.f100600a;
        o oVar = this.f100601b;
        switch (i13) {
            case 0:
                oVar.clear();
                break;
            default:
                oVar.clear();
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean contains(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.f100600a
            pm.o r1 = r4.f100601b
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
            if (r0 == 0) goto L35
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            r1.getClass()
            java.lang.Object r0 = r5.getKey()
            r3 = 0
            if (r0 == 0) goto L22
            pm.n r0 = r1.a(r0, r2)     // Catch: java.lang.ClassCastException -> L22
            goto L23
        L22:
            r0 = r3
        L23:
            if (r0 == 0) goto L32
            java.lang.Object r1 = r0.f100613h
            java.lang.Object r5 = r5.getValue()
            boolean r5 = java.util.Objects.equals(r1, r5)
            if (r5 == 0) goto L32
            r3 = r0
        L32:
            if (r3 == 0) goto L35
            r2 = 1
        L35:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: pm.l.contains(java.lang.Object):boolean");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f100600a) {
            case 0:
                return new k(this);
            default:
                return new k(this, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0044  */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean remove(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 0
            int r1 = r6.f100600a
            r2 = 0
            r3 = 1
            pm.o r4 = r6.f100601b
            switch(r1) {
                case 0: goto L1c;
                default: goto La;
            }
        La:
            r4.getClass()
            if (r7 == 0) goto L13
            pm.n r0 = r4.a(r7, r2)     // Catch: java.lang.ClassCastException -> L13
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
            goto L48
        L21:
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            r4.getClass()
            java.lang.Object r1 = r7.getKey()
            if (r1 == 0) goto L31
            pm.n r1 = r4.a(r1, r2)     // Catch: java.lang.ClassCastException -> L31
            goto L32
        L31:
            r1 = r0
        L32:
            if (r1 == 0) goto L41
            java.lang.Object r5 = r1.f100613h
            java.lang.Object r7 = r7.getValue()
            boolean r7 = java.util.Objects.equals(r5, r7)
            if (r7 == 0) goto L41
            r0 = r1
        L41:
            if (r0 != 0) goto L44
            goto L48
        L44:
            r4.c(r0, r3)
            r2 = r3
        L48:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: pm.l.remove(java.lang.Object):boolean");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i13 = this.f100600a;
        o oVar = this.f100601b;
        switch (i13) {
        }
        return oVar.f100619d;
    }
}
