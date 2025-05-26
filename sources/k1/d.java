package k1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class d extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public boolean f77837r;

    /* renamed from: s, reason: collision with root package name */
    public int f77838s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f77839t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ m1.g1 f77840u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ long f77841v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o1.l f77842w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ j f77843x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(m1.g1 g1Var, long j13, o1.l lVar, j jVar, bl2.c cVar) {
        super(2, cVar);
        this.f77840u = g1Var;
        this.f77841v = j13;
        this.f77842w = lVar;
        this.f77843x = jVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        d dVar = new d(this.f77840u, this.f77841v, this.f77842w, this.f77843x, cVar);
        dVar.f77839t = obj;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00ae A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008c  */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 209
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
