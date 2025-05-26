package k1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class s1 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f78004r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ t1 f78005s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(t1 t1Var, bl2.c cVar) {
        super(2, cVar);
        this.f78005s = t1Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new s1(this.f78005s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((s1) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0030 -> B:8:0x0021). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0048 -> B:6:0x004b). Please report as a decompilation issue!!! */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r7.f78004r
            r2 = 2
            r3 = 1
            k1.t1 r4 = r7.f78005s
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            ue.c.H(r8)
            goto L4b
        L12:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1a:
            ue.c.H(r8)
            goto L2e
        L1e:
            ue.c.H(r8)
        L21:
            co2.m r8 = r4.E
            if (r8 == 0) goto L2e
            r7.f78004r = r3
            java.lang.Object r8 = r8.p(r7)
            if (r8 != r0) goto L2e
            return r0
        L2e:
            k1.f2 r8 = r4.f78025z
            if (r8 == 0) goto L21
            k1.t r8 = k1.t.f78009k
            r7.f78004r = r2
            kotlin.coroutines.CoroutineContext r1 = r7.getContext()
            i2.i1 r1 = bs1.c.K0(r1)
            i1.f1 r5 = new i1.f1
            r6 = 5
            r5.<init>(r6, r8)
            java.lang.Object r8 = r1.d(r5, r7)
            if (r8 != r0) goto L4b
            return r0
        L4b:
            k1.f2 r8 = r4.f78025z
            if (r8 == 0) goto L21
            k1.h2 r8 = (k1.h2) r8
            r8.d()
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.s1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
