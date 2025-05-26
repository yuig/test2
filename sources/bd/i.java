package bd;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.j0;

/* loaded from: classes3.dex */
public final class i extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f22703r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f22704s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j0 f22705t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ qc.i f22706u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j0 j0Var, qc.i iVar, bl2.c cVar) {
        super(2, cVar);
        this.f22705t = j0Var;
        this.f22706u = iVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        i iVar = new i(this.f22705t, this.f22706u, cVar);
        iVar.f22704s = obj;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((do2.j) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0201 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0214  */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 548
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: bd.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
