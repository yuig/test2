package t3;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class v4 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f116237r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f116238s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.j0 f116239t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ i2.o2 f116240u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.z f116241v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ w4 f116242w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ View f116243x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4(kotlin.jvm.internal.j0 j0Var, i2.o2 o2Var, androidx.lifecycle.z zVar, w4 w4Var, View view, bl2.c cVar) {
        super(2, cVar);
        this.f116239t = j0Var;
        this.f116240u = o2Var;
        this.f116241v = zVar;
        this.f116242w = w4Var;
        this.f116243x = view;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        v4 v4Var = new v4(this.f116239t, this.f116240u, this.f116241v, this.f116242w, this.f116243x, cVar);
        v4Var.f116238s = obj;
        return v4Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((v4) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a3  */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r10.f116237r
            r2 = 0
            t3.w4 r3 = r10.f116242w
            androidx.lifecycle.z r4 = r10.f116241v
            r5 = 1
            if (r1 == 0) goto L22
            if (r1 != r5) goto L1a
            java.lang.Object r0 = r10.f116238s
            ao2.o1 r0 = (ao2.o1) r0
            ue.c.H(r11)     // Catch: java.lang.Throwable -> L17
            goto L8c
        L17:
            r11 = move-exception
            goto La1
        L1a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L22:
            ue.c.H(r11)
            java.lang.Object r11 = r10.f116238s
            ao2.j0 r11 = (ao2.j0) r11
            kotlin.jvm.internal.j0 r1 = r10.f116239t     // Catch: java.lang.Throwable -> L59
            java.lang.Object r1 = r1.f80434a     // Catch: java.lang.Throwable -> L59
            t3.y2 r1 = (t3.y2) r1     // Catch: java.lang.Throwable -> L59
            if (r1 == 0) goto L5c
            android.view.View r6 = r10.f116243x     // Catch: java.lang.Throwable -> L59
            android.content.Context r6 = r6.getContext()     // Catch: java.lang.Throwable -> L59
            android.content.Context r6 = r6.getApplicationContext()     // Catch: java.lang.Throwable -> L59
            do2.r2 r6 = t3.z4.a(r6)     // Catch: java.lang.Throwable -> L59
            java.lang.Object r7 = r6.getValue()     // Catch: java.lang.Throwable -> L59
            java.lang.Number r7 = (java.lang.Number) r7     // Catch: java.lang.Throwable -> L59
            float r7 = r7.floatValue()     // Catch: java.lang.Throwable -> L59
            androidx.compose.runtime.ParcelableSnapshotMutableFloatState r8 = r1.f116281a     // Catch: java.lang.Throwable -> L59
            r8.i(r7)     // Catch: java.lang.Throwable -> L59
            t3.u4 r7 = new t3.u4     // Catch: java.lang.Throwable -> L59
            r7.<init>(r6, r1, r2)     // Catch: java.lang.Throwable -> L59
            r1 = 3
            ao2.k2 r11 = kotlin.jvm.internal.j.z(r11, r2, r2, r7, r1)     // Catch: java.lang.Throwable -> L59
            goto L5d
        L59:
            r11 = move-exception
            r0 = r2
            goto La1
        L5c:
            r11 = r2
        L5d:
            i2.o2 r1 = r10.f116240u     // Catch: java.lang.Throwable -> L9f
            r10.f116238s = r11     // Catch: java.lang.Throwable -> L9f
            r10.f116237r = r5     // Catch: java.lang.Throwable -> L9f
            r1.getClass()     // Catch: java.lang.Throwable -> L9f
            i2.n2 r5 = new i2.n2     // Catch: java.lang.Throwable -> L9f
            r5.<init>(r1, r2)     // Catch: java.lang.Throwable -> L9f
            kotlin.coroutines.CoroutineContext r6 = r10.getContext()     // Catch: java.lang.Throwable -> L9f
            i2.i1 r6 = bs1.c.K0(r6)     // Catch: java.lang.Throwable -> L9f
            i2.l2 r7 = new i2.l2     // Catch: java.lang.Throwable -> L9f
            r7.<init>(r1, r5, r6, r2)     // Catch: java.lang.Throwable -> L9f
            i2.j r1 = r1.f71208a     // Catch: java.lang.Throwable -> L9f
            java.lang.Object r1 = kotlin.jvm.internal.j.M(r10, r1, r7)     // Catch: java.lang.Throwable -> L9f
            if (r1 != r0) goto L81
            goto L83
        L81:
            kotlin.Unit r1 = kotlin.Unit.f80348a     // Catch: java.lang.Throwable -> L9f
        L83:
            if (r1 != r0) goto L86
            goto L88
        L86:
            kotlin.Unit r1 = kotlin.Unit.f80348a     // Catch: java.lang.Throwable -> L9f
        L88:
            if (r1 != r0) goto L8b
            return r0
        L8b:
            r0 = r11
        L8c:
            if (r0 == 0) goto L91
            r0.cancel(r2)
        L91:
            androidx.lifecycle.s r11 = r4.getLifecycle()
            r11.b(r3)
            kotlin.Unit r11 = kotlin.Unit.f80348a
            return r11
        L9b:
            r9 = r0
            r0 = r11
            r11 = r9
            goto La1
        L9f:
            r0 = move-exception
            goto L9b
        La1:
            if (r0 == 0) goto La6
            r0.cancel(r2)
        La6:
            androidx.lifecycle.s r0 = r4.getLifecycle()
            r0.b(r3)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.v4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
