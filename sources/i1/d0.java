package i1;

/* loaded from: classes.dex */
public final class d0 implements do2.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f70735a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f70736b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f70737c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f70738d;

    public /* synthetic */ d0(Object obj, Object obj2, Object obj3, int i13) {
        this.f70735a = i13;
        this.f70736b = obj;
        this.f70737c = obj2;
        this.f70738d = obj3;
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
            int r0 = r8.f70735a
            java.lang.Object r1 = r8.f70738d
            java.lang.Object r2 = r8.f70737c
            java.lang.Object r3 = r8.f70736b
            switch(r0) {
                case 0: goto L6c;
                default: goto Lb;
            }
        Lb:
            boolean r0 = r10 instanceof do2.f
            if (r0 == 0) goto L1e
            r0 = r10
            do2.f r0 = (do2.f) r0
            int r4 = r0.f55777t
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L1e
            int r4 = r4 - r5
            r0.f55777t = r4
            goto L23
        L1e:
            do2.f r0 = new do2.f
            r0.<init>(r8, r10)
        L23:
            java.lang.Object r10 = r0.f55775r
            cl2.a r4 = cl2.a.COROUTINE_SUSPENDED
            int r5 = r0.f55777t
            r6 = 1
            if (r5 == 0) goto L3a
            if (r5 != r6) goto L32
            ue.c.H(r10)
            goto L5c
        L32:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3a:
            ue.c.H(r10)
            do2.g r3 = (do2.g) r3
            kotlin.jvm.functions.Function1 r10 = r3.f55793b
            java.lang.Object r10 = r10.invoke(r9)
            kotlin.jvm.internal.j0 r2 = (kotlin.jvm.internal.j0) r2
            java.lang.Object r5 = r2.f80434a
            fi.b r7 = eo2.j0.f59783a
            if (r5 == r7) goto L5f
            kotlin.jvm.functions.Function2 r3 = r3.f55794c
            java.lang.Object r3 = r3.invoke(r5, r10)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L5c
            goto L5f
        L5c:
            kotlin.Unit r4 = kotlin.Unit.f80348a
            goto L6b
        L5f:
            r2.f80434a = r10
            do2.j r1 = (do2.j) r1
            r0.f55777t = r6
            java.lang.Object r9 = r1.emit(r9, r0)
            if (r9 != r4) goto L5c
        L6b:
            return r4
        L6c:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            i2.b2 r3 = (i2.b2) r3
            if (r9 == 0) goto L95
            i2.v3 r1 = (i2.v3) r1
            java.lang.Object r9 = r1.getValue()
            kotlin.jvm.functions.Function2 r9 = (kotlin.jvm.functions.Function2) r9
            j1.g2 r2 = (j1.g2) r2
            java.lang.Object r10 = r2.c()
            androidx.compose.runtime.ParcelableSnapshotMutableState r0 = r2.f74078d
            java.lang.Object r0 = r0.getValue()
            java.lang.Object r9 = r9.invoke(r10, r0)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            goto L96
        L95:
            r9 = 0
        L96:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            r3.setValue(r9)
            kotlin.Unit r9 = kotlin.Unit.f80348a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.d0.emit(java.lang.Object, bl2.c):java.lang.Object");
    }
}
