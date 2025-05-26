package c2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class g1 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f24753r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j1.d f24754s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ float f24755t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f24756u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ h1 f24757v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o1.j f24758w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(j1.d dVar, float f13, boolean z13, h1 h1Var, o1.j jVar, bl2.c cVar) {
        super(2, cVar);
        this.f24754s = dVar;
        this.f24755t = f13;
        this.f24756u = z13;
        this.f24757v = h1Var;
        this.f24758w = jVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new g1(this.f24754s, this.f24755t, this.f24756u, this.f24757v, this.f24758w, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g1) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0099, code lost:
    
        if ((r2 instanceof o1.d) != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b3, code lost:
    
        if ((r1 instanceof o1.d) != false) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c7  */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.g1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
