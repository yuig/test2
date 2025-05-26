package com.pinterest.feature.settings.notifications;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ll.j f48206r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f48207s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f48208t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f48209u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f48210v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ll.j jVar, String str, String str2, String str3, boolean z13, bl2.c cVar) {
        super(2, cVar);
        this.f48206r = jVar;
        this.f48207s = str;
        this.f48208t = str2;
        this.f48209u = str3;
        this.f48210v = z13;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new j(this.f48206r, this.f48207s, this.f48208t, this.f48209u, this.f48210v, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        r20.a aVar2 = (r20.a) this.f48206r.f83754b;
        String k13 = vd0.c.f125622b.k(kotlin.collections.e0.b(kotlin.collections.z0.g(new Pair("type", this.f48207s), new Pair("section", this.f48208t), new Pair("option", this.f48209u), new Pair("value", Boolean.valueOf(this.f48210v)))));
        Intrinsics.checkNotNullExpressionValue(k13, "toJson(...)");
        uj2.b d2 = aVar2.d(k13);
        d2.getClass();
        ek2.e eVar = new ek2.e(1);
        d2.j(eVar);
        if (eVar.getCount() != 0) {
            try {
                eVar.await();
            } catch (InterruptedException e13) {
                eVar.d();
                return e13;
            }
        }
        return eVar.f59420b;
    }
}
