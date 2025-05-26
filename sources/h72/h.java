package h72;

import ao2.j0;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import r72.r1;

/* loaded from: classes4.dex */
public final class h extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public File f67971r;

    /* renamed from: s, reason: collision with root package name */
    public File f67972s;

    /* renamed from: t, reason: collision with root package name */
    public int f67973t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f67974u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ l f67975v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r1 f67976w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(l lVar, r1 r1Var, bl2.c cVar) {
        super(2, cVar);
        this.f67975v = lVar;
        this.f67976w = r1Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        h hVar = new h(this.f67975v, this.f67976w, cVar);
        hVar.f67974u = obj;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x037a, code lost:
    
        if (((java.lang.Boolean) r12.invoke(r72.k2.HeptaSlabBold, 800)).booleanValue() == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x013e, code lost:
    
        if (((java.lang.Boolean) r12.invoke(r72.k2.QuicksandBold, 700)).booleanValue() == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x016f, code lost:
    
        if (((java.lang.Boolean) r12.invoke(r72.k2.GrandstanderBold, 700)).booleanValue() == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x02cf, code lost:
    
        if (((java.lang.Boolean) r12.invoke(r72.k2.UnboundedBold, 800)).booleanValue() == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x030f, code lost:
    
        if (((java.lang.Boolean) r12.invoke(r72.k2.MartianMonoBold, 800)).booleanValue() == false) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x007e A[Catch: Exception -> 0x001e, TryCatch #0 {Exception -> 0x001e, blocks: (B:7:0x001a, B:8:0x0074, B:10:0x007e, B:12:0x0084, B:114:0x008f, B:115:0x0096, B:117:0x0097, B:119:0x009d, B:121:0x00a5, B:122:0x00a8, B:129:0x005d), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0097 A[Catch: Exception -> 0x001e, TryCatch #0 {Exception -> 0x001e, blocks: (B:7:0x001a, B:8:0x0074, B:10:0x007e, B:12:0x0084, B:114:0x008f, B:115:0x0096, B:117:0x0097, B:119:0x009d, B:121:0x00a5, B:122:0x00a8, B:129:0x005d), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d6  */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 1046
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h72.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
