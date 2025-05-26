package com.pinterest.feature.settings.notifications;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class g extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f48189r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ll.j f48190s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f48191t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f48192u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ll.j jVar, String str, String str2, bl2.c cVar) {
        super(2, cVar);
        this.f48190s = jVar;
        this.f48191t = str;
        this.f48192u = str2;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new g(this.f48190s, this.f48191t, this.f48192u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f48189r;
        if (i13 == 0) {
            ue.c.H(obj);
            r20.a aVar2 = (r20.a) this.f48190s.f83754b;
            this.f48189r = 1;
            obj = aVar2.c(this.f48191t, this.f48192u, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        return obj;
    }
}
