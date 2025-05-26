package pb;

import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class k implements do2.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f99421a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Object f99422b;

    public k(Function2 function2) {
        this.f99422b = function2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    @Override // do2.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object collect(do2.j r9, bl2.c r10) {
        /*
            r8 = this;
            int r0 = r8.f99421a
            java.lang.Object r1 = r8.f99422b
            switch(r0) {
                case 0: goto L69;
                default: goto L7;
            }
        L7:
            boolean r0 = r10 instanceof do2.a
            if (r0 == 0) goto L1a
            r0 = r10
            do2.a r0 = (do2.a) r0
            int r2 = r0.f55719u
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L1a
            int r2 = r2 - r3
            r0.f55719u = r2
            goto L1f
        L1a:
            do2.a r0 = new do2.a
            r0.<init>(r8, r10)
        L1f:
            java.lang.Object r10 = r0.f55717s
            cl2.a r2 = cl2.a.COROUTINE_SUSPENDED
            int r3 = r0.f55719u
            r4 = 1
            if (r3 == 0) goto L3a
            if (r3 != r4) goto L32
            eo2.k0 r9 = r0.f55716r
            ue.c.H(r10)     // Catch: java.lang.Throwable -> L30
            goto L59
        L30:
            r10 = move-exception
            goto L65
        L32:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3a:
            ue.c.H(r10)
            eo2.k0 r10 = new eo2.k0
            kotlin.coroutines.CoroutineContext r3 = r0.getContext()
            r10.<init>(r9, r3)
            r0.f55716r = r10     // Catch: java.lang.Throwable -> L63
            r0.f55719u = r4     // Catch: java.lang.Throwable -> L63
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1     // Catch: java.lang.Throwable -> L63
            java.lang.Object r9 = r1.invoke(r10, r0)     // Catch: java.lang.Throwable -> L63
            if (r9 != r2) goto L53
            goto L55
        L53:
            kotlin.Unit r9 = kotlin.Unit.f80348a     // Catch: java.lang.Throwable -> L63
        L55:
            if (r9 != r2) goto L58
            goto L5e
        L58:
            r9 = r10
        L59:
            r9.releaseIntercepted()
            kotlin.Unit r2 = kotlin.Unit.f80348a
        L5e:
            return r2
        L5f:
            r7 = r10
            r10 = r9
            r9 = r7
            goto L65
        L63:
            r9 = move-exception
            goto L5f
        L65:
            r9.releaseIntercepted()
            throw r10
        L69:
            r5 = r1
            do2.i[] r5 = (do2.i[]) r5
            androidx.activity.a0 r2 = new androidx.activity.a0
            r0 = 26
            r2.<init>(r5, r0)
            vc.n r3 = new vc.n
            r0 = 0
            r3.<init>(r0)
            eo2.v r6 = new eo2.v
            r1 = 0
            r0 = r6
            r4 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            eo2.e0 r9 = new eo2.e0
            kotlin.coroutines.CoroutineContext r0 = r10.getContext()
            r9.<init>(r10, r0)
            java.lang.Object r9 = com.bumptech.glide.c.i1(r9, r9, r6)
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            if (r9 != r0) goto L97
            java.lang.String r1 = "frame"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r1)
        L97:
            if (r9 != r0) goto L9a
            goto L9c
        L9a:
            kotlin.Unit r9 = kotlin.Unit.f80348a
        L9c:
            if (r9 != r0) goto L9f
            goto La1
        L9f:
            kotlin.Unit r9 = kotlin.Unit.f80348a
        La1:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: pb.k.collect(do2.j, bl2.c):java.lang.Object");
    }

    public k(do2.i[] iVarArr) {
        this.f99422b = iVarArr;
    }
}
