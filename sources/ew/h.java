package ew;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class h extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f60312r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j f60313s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, bl2.c cVar) {
        super(2, cVar);
        this.f60313s = jVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new h(this.f60313s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0080  */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ew.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
