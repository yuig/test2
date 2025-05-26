package ik1;

import ao2.j0;
import dl2.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class f extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f72409r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g f72410s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, bl2.c cVar) {
        super(2, cVar);
        this.f72410s = gVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new f(this.f72410s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        r11 = kotlin.text.StringsKt__StringsKt.split$default(r11, new java.lang.String[]{","}, false, 0, 6, null);
     */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r10.f72409r
            r2 = 0
            ik1.g r3 = r10.f72410s
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L1f
            if (r1 == r5) goto L1b
            if (r1 != r4) goto L13
            ue.c.H(r11)
            goto L7c
        L13:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1b:
            ue.c.H(r11)
            goto L37
        L1f:
            ue.c.H(r11)
            se2.a r11 = r3.f72411a
            bf2.b r11 = (bf2.b) r11
            java.lang.Object r11 = r11.get()
            nb0.e r11 = (nb0.e) r11
            r10.f72409r = r5
            java.lang.String r1 = "PREF_USER_ACTION_SEQUENCE"
            java.lang.Object r11 = r11.h(r1, r2, r10)
            if (r11 != r0) goto L37
            return r0
        L37:
            java.lang.String r11 = (java.lang.String) r11
            if (r11 == 0) goto L7c
            java.lang.String r1 = ","
            java.lang.String[] r1 = new java.lang.String[]{r1}
            r6 = 6
            r7 = 0
            java.util.List r11 = kotlin.text.StringsKt.W(r11, r1, r7, r6)
            if (r11 == 0) goto L7c
            m60.f0 r1 = r3.f72413c
            boolean r6 = r11.isEmpty()
            r8 = 30
            if (r6 != 0) goto L5b
            int r6 = r11.size()
            if (r6 != r8) goto L5a
            goto L5b
        L5a:
            r5 = r7
        L5b:
            tb0.p r6 = tb0.p.USER_SEQUENCE
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.String r9 = "actions should always have a size of 0 or ACTIONS_MAX_SIZE"
            r1.R(r5, r9, r6, r7)
            int r1 = r11.size()
            if (r1 != r8) goto L7c
            ko2.f r1 = ao2.v0.f20219a
            ao2.e2 r1 = ho2.q.f69782a
            ik1.e r5 = new ik1.e
            r5.<init>(r3, r11, r2)
            r10.f72409r = r4
            java.lang.Object r11 = kotlin.jvm.internal.j.M(r10, r1, r5)
            if (r11 != r0) goto L7c
            return r0
        L7c:
            kotlin.Unit r11 = kotlin.Unit.f80348a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ik1.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
