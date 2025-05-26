package com.pinterest.shuffles.scene.composer;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import r72.l2;
import r72.y1;

/* loaded from: classes4.dex */
public final class p extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ c1 f52119r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Function0 f52120s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ y1 f52121t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ q f52122u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Function0 f52123v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(c1 c1Var, Function0 function0, y1 y1Var, q qVar, Function0 function02, bl2.c cVar) {
        super(2, cVar);
        this.f52119r = c1Var;
        this.f52120s = function0;
        this.f52121t = y1Var;
        this.f52122u = qVar;
        this.f52123v = function02;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new p(this.f52119r, this.f52120s, this.f52121t, this.f52122u, this.f52123v, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        c1 c1Var = this.f52119r;
        if (c1Var == null) {
            c1Var = new c1();
        }
        int intValue = ((Number) this.f52120s.invoke()).intValue();
        y1 y1Var = this.f52121t;
        l2 l2Var = y1Var.f106726f;
        c1Var.j(intValue, l2Var, (float) y1Var.f106723c, this.f52122u.f52126c.a(l2Var.f106544e), this.f52123v);
        return c1Var;
    }
}
