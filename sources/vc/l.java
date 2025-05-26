package vc;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.j0;

/* loaded from: classes3.dex */
public final class l extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public j0 f125539r;

    /* renamed from: s, reason: collision with root package name */
    public j0 f125540s;

    /* renamed from: t, reason: collision with root package name */
    public int f125541t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f125542u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ ad.b f125543v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ pc.f f125544w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ad.b bVar, pc.f fVar, bl2.c cVar) {
        super(2, cVar);
        this.f125543v = bVar;
        this.f125544w = fVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        l lVar = new l(this.f125543v, this.f125544w, cVar);
        lVar.f125542u = obj;
        return lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((do2.j) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00d9  */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: vc.l.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
