package do2;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class c extends e {

    /* renamed from: e, reason: collision with root package name */
    public final Function2 f55740e;

    public c(Function2 function2, CoroutineContext coroutineContext, int i13, co2.a aVar) {
        super(function2, coroutineContext, i13, aVar);
        this.f55740e = function2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // do2.e, eo2.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(co2.z r5, bl2.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof do2.b
            if (r0 == 0) goto L13
            r0 = r6
            do2.b r0 = (do2.b) r0
            int r1 = r0.f55731u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f55731u = r1
            goto L18
        L13:
            do2.b r0 = new do2.b
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f55729s
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f55731u
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            co2.z r5 = r0.f55728r
            ue.c.H(r6)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            ue.c.H(r6)
            r0.f55728r = r5
            r0.f55731u = r3
            java.lang.Object r6 = super.d(r5, r0)
            if (r6 != r1) goto L3f
            return r1
        L3f:
            co2.y r5 = (co2.y) r5
            co2.q r5 = r5.f28359d
            boolean r5 = r5.s()
            if (r5 == 0) goto L4c
            kotlin.Unit r5 = kotlin.Unit.f80348a
            return r5
        L4c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: do2.c.d(co2.z, bl2.c):java.lang.Object");
    }

    @Override // do2.e, eo2.f
    public final eo2.f e(CoroutineContext coroutineContext, int i13, co2.a aVar) {
        return new c(this.f55740e, coroutineContext, i13, aVar);
    }
}
