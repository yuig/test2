package z80;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class u extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f141089r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f141090s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ x f141091t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ u50.r f141092u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(x xVar, u50.r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f141091t = xVar;
        this.f141092u = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        u uVar = new u(this.f141091t, this.f141092u, cVar);
        uVar.f141090s = obj;
        return uVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((u) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00fd, code lost:
    
        if (kotlin.text.z.p(r1, "employee", false) != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0103, code lost:
    
        if (kotlin.text.StringsKt.E(r1, "enabled_pullup", false) != false) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008b  */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z80.u.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
