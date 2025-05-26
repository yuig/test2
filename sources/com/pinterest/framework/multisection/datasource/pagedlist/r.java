package com.pinterest.framework.multisection.datasource.pagedlist;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class r extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f49158r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f49159s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ s f49160t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ p f49161u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar, p pVar, bl2.c cVar) {
        super(2, cVar);
        this.f49160t = sVar;
        this.f49161u = pVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        r rVar = new r(this.f49160t, this.f49161u, cVar);
        rVar.f49159s = obj;
        return rVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cd  */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.framework.multisection.datasource.pagedlist.r.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
