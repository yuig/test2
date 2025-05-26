package by1;

import do2.j;

/* loaded from: classes4.dex */
public final class f implements j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24143a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24144b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f24145c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f24146d;

    public /* synthetic */ f(Object obj, int i13, Object obj2, int i14) {
        this.f24143a = i14;
        this.f24145c = obj;
        this.f24144b = i13;
        this.f24146d = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    @Override // do2.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(java.lang.Object r9, bl2.c r10) {
        /*
            r8 = this;
            int r0 = r8.f24143a
            java.lang.Object r1 = r8.f24146d
            int r2 = r8.f24144b
            java.lang.Object r3 = r8.f24145c
            r4 = 1
            switch(r0) {
                case 0: goto L56;
                default: goto Lc;
            }
        Lc:
            boolean r0 = r10 instanceof do2.r0
            if (r0 == 0) goto L1f
            r0 = r10
            do2.r0 r0 = (do2.r0) r0
            int r5 = r0.f55920t
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L1f
            int r5 = r5 - r6
            r0.f55920t = r5
            goto L24
        L1f:
            do2.r0 r0 = new do2.r0
            r0.<init>(r8, r10)
        L24:
            java.lang.Object r10 = r0.f55918r
            cl2.a r5 = cl2.a.COROUTINE_SUSPENDED
            int r6 = r0.f55920t
            if (r6 == 0) goto L3a
            if (r6 != r4) goto L32
            ue.c.H(r10)
            goto L4e
        L32:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3a:
            ue.c.H(r10)
            kotlin.jvm.internal.h0 r3 = (kotlin.jvm.internal.h0) r3
            int r10 = r3.f80426a
            if (r10 < r2) goto L51
            do2.j r1 = (do2.j) r1
            r0.f55920t = r4
            java.lang.Object r9 = r1.emit(r9, r0)
            if (r9 != r5) goto L4e
            goto L55
        L4e:
            kotlin.Unit r5 = kotlin.Unit.f80348a
            goto L55
        L51:
            int r10 = r10 + r4
            r3.f80426a = r10
            goto L4e
        L55:
            return r5
        L56:
            java.util.List r9 = (java.util.List) r9
            u50.r r3 = (u50.r) r3
            ay1.o r10 = new ay1.o
            r0 = r9
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r4
            if (r0 == 0) goto L84
            if (r2 <= 0) goto L84
            ay1.f0 r0 = new ay1.f0
            by1.i r1 = (by1.i) r1
            com.pinterest.api.model.f30 r1 = r1.f24160h
            if (r1 == 0) goto L75
            java.lang.String r1 = r1.i6()
            goto L76
        L75:
            r1 = 0
        L76:
            if (r1 != 0) goto L7a
            java.lang.String r1 = ""
        L7a:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.List r9 = kotlin.collections.CollectionsKt.y0(r9, r2)
            r0.<init>(r1, r9)
            goto L86
        L84:
            ay1.d0 r0 = ay1.d0.f20662a
        L86:
            r10.<init>(r0)
            r3.a(r10)
            kotlin.Unit r9 = kotlin.Unit.f80348a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: by1.f.emit(java.lang.Object, bl2.c):java.lang.Object");
    }
}
