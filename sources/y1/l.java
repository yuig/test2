package y1;

import ao2.o1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class l extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f136586r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ o1 f136587s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ n f136588t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(o1 o1Var, n nVar, bl2.c cVar) {
        super(2, cVar);
        this.f136587s = o1Var;
        this.f136588t = nVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new l(this.f136587s, this.f136588t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0057 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0055 -> B:8:0x003a). Please report as a decompilation issue!!! */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r9.f136586r
            r2 = 0
            r3 = 500(0x1f4, double:2.47E-321)
            r5 = 3
            r6 = 2
            r7 = 1
            y1.n r8 = r9.f136588t
            if (r1 == 0) goto L2a
            if (r1 == r7) goto L26
            if (r1 == r6) goto L22
            if (r1 != r5) goto L1a
            ue.c.H(r10)     // Catch: java.lang.Throwable -> L18
            goto L3a
        L18:
            r10 = move-exception
            goto L58
        L1a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L22:
            ue.c.H(r10)     // Catch: java.lang.Throwable -> L18
            goto L4a
        L26:
            ue.c.H(r10)
            goto L3a
        L2a:
            ue.c.H(r10)
            ao2.o1 r10 = r9.f136587s
            if (r10 == 0) goto L3a
            r9.f136586r = r7
            java.lang.Object r10 = ao2.m0.k(r10, r9)
            if (r10 != r0) goto L3a
            return r0
        L3a:
            androidx.compose.runtime.ParcelableSnapshotMutableFloatState r10 = r8.f136592b     // Catch: java.lang.Throwable -> L18
            r1 = 1065353216(0x3f800000, float:1.0)
            r10.i(r1)     // Catch: java.lang.Throwable -> L18
            r9.f136586r = r6     // Catch: java.lang.Throwable -> L18
            java.lang.Object r10 = lb.l0.S(r3, r9)     // Catch: java.lang.Throwable -> L18
            if (r10 != r0) goto L4a
            return r0
        L4a:
            androidx.compose.runtime.ParcelableSnapshotMutableFloatState r10 = r8.f136592b     // Catch: java.lang.Throwable -> L18
            r10.i(r2)     // Catch: java.lang.Throwable -> L18
            r9.f136586r = r5     // Catch: java.lang.Throwable -> L18
            java.lang.Object r10 = lb.l0.S(r3, r9)     // Catch: java.lang.Throwable -> L18
            if (r10 != r0) goto L3a
            return r0
        L58:
            androidx.compose.runtime.ParcelableSnapshotMutableFloatState r0 = r8.f136592b
            r0.i(r2)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: y1.l.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
