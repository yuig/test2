package k1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class l extends dl2.i implements Function2 {

    /* renamed from: s, reason: collision with root package name */
    public int f77916s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f77917t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ n f77918u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(n nVar, bl2.c cVar) {
        super(2, cVar);
        this.f77918u = nVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        l lVar = new l(this.f77918u, cVar);
        lVar.f77917t = obj;
        return lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((n3.l0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x006f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0057 -> B:6:0x005a). Please report as a decompilation issue!!! */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r13.f77916s
            r2 = 2
            r3 = 1
            k1.n r4 = r13.f77918u
            if (r1 == 0) goto L26
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            java.lang.Object r1 = r13.f77917t
            n3.l0 r1 = (n3.l0) r1
            ue.c.H(r14)
            goto L5a
        L16:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L1e:
            java.lang.Object r1 = r13.f77917t
            n3.l0 r1 = (n3.l0) r1
            ue.c.H(r14)
            goto L39
        L26:
            ue.c.H(r14)
            java.lang.Object r14 = r13.f77917t
            r1 = r14
            n3.l0 r1 = (n3.l0) r1
            r13.f77917t = r1
            r13.f77916s = r3
            java.lang.Object r14 = m1.n3.c(r1, r13, r2)
            if (r14 != r0) goto L39
            return r0
        L39:
            n3.q r14 = (n3.q) r14
            long r5 = r14.f89107a
            n3.p r7 = new n3.p
            r7.<init>(r5)
            r4.f77938g = r7
            a3.c r5 = new a3.c
            long r6 = r14.f89109c
            r5.<init>(r6)
            r4.f77932a = r5
        L4d:
            r13.f77917t = r1
            r13.f77916s = r2
            n3.k r14 = n3.k.Main
            java.lang.Object r14 = r1.a(r14, r13)
            if (r14 != r0) goto L5a
            return r0
        L5a:
            n3.j r14 = (n3.j) r14
            java.util.List r14 = r14.f89070a
            java.util.ArrayList r5 = new java.util.ArrayList
            int r6 = r14.size()
            r5.<init>(r6)
            int r6 = r14.size()
            r7 = 0
            r8 = r7
        L6d:
            if (r8 >= r6) goto L80
            java.lang.Object r9 = r14.get(r8)
            r10 = r9
            n3.q r10 = (n3.q) r10
            boolean r10 = r10.f89110d
            if (r10 == 0) goto L7d
            r5.add(r9)
        L7d:
            int r8 = r8 + 1
            goto L6d
        L80:
            int r14 = r5.size()
        L84:
            r6 = 0
            if (r7 >= r14) goto La0
            java.lang.Object r8 = r5.get(r7)
            r9 = r8
            n3.q r9 = (n3.q) r9
            long r9 = r9.f89107a
            n3.p r11 = r4.f77938g
            boolean r12 = r11 instanceof n3.p
            if (r12 != 0) goto L97
            goto L9d
        L97:
            long r11 = r11.f89106a
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto La1
        L9d:
            int r7 = r7 + 1
            goto L84
        La0:
            r8 = r6
        La1:
            n3.q r8 = (n3.q) r8
            if (r8 != 0) goto Lac
            java.lang.Object r14 = kotlin.collections.CollectionsKt.firstOrNull(r5)
            r8 = r14
            n3.q r8 = (n3.q) r8
        Lac:
            if (r8 == 0) goto Lc0
            n3.p r14 = new n3.p
            long r9 = r8.f89107a
            r14.<init>(r9)
            r4.f77938g = r14
            a3.c r14 = new a3.c
            long r7 = r8.f89109c
            r14.<init>(r7)
            r4.f77932a = r14
        Lc0:
            boolean r14 = r5.isEmpty()
            r14 = r14 ^ r3
            if (r14 != 0) goto L4d
            r4.f77938g = r6
            kotlin.Unit r14 = kotlin.Unit.f80348a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.l.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
