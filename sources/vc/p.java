package vc;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.j0;

/* loaded from: classes.dex */
public final class p extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public j0 f125553r;

    /* renamed from: s, reason: collision with root package name */
    public j0 f125554s;

    /* renamed from: t, reason: collision with root package name */
    public int f125555t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f125556u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ ad.b f125557v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ pc.f f125558w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(ad.b bVar, pc.f fVar, bl2.c cVar) {
        super(2, cVar);
        this.f125557v = bVar;
        this.f125558w = fVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        p pVar = new p(this.f125557v, this.f125558w, cVar);
        pVar.f125556u = obj;
        return pVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((do2.j) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f9  */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: vc.p.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
