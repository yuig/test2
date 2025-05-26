package com.pinterest.shuffles.scene.composer;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import r72.u1;

/* loaded from: classes4.dex */
public final class o extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ u1 f52114r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ q f52115s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ h f52116t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Function0 f52117u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Function0 f52118v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(u1 u1Var, q qVar, h hVar, Function0 function0, Function0 function02, bl2.c cVar) {
        super(2, cVar);
        this.f52114r = u1Var;
        this.f52115s = qVar;
        this.f52116t = hVar;
        this.f52117u = function0;
        this.f52118v = function02;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new o(this.f52114r, this.f52115s, this.f52116t, this.f52117u, this.f52118v, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0080, code lost:
    
        if (r9.f106509d == 1.0f) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0089, code lost:
    
        if (r7.f106499b == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0094, code lost:
    
        if (r7.f106499b == null) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009a  */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.shuffles.scene.composer.o.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
