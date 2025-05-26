package ua0;

import ao2.j0;
import dl2.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ta0.g;
import u50.r;

/* loaded from: classes5.dex */
public final class c extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public d f121399r;

    /* renamed from: s, reason: collision with root package name */
    public d f121400s;

    /* renamed from: t, reason: collision with root package name */
    public int f121401t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ g f121402u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ r f121403v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f121404w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g gVar, r rVar, d dVar, bl2.c cVar) {
        super(2, cVar);
        this.f121402u = gVar;
        this.f121403v = rVar;
        this.f121404w = dVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new c(this.f121402u, this.f121403v, this.f121404w, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x012a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ba A[RETURN] */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ua0.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
