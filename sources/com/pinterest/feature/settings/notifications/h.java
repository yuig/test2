package com.pinterest.feature.settings.notifications;

/* loaded from: classes5.dex */
public final class h extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public i f48194r;

    /* renamed from: s, reason: collision with root package name */
    public Object f48195s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f48196t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ i f48197u;

    /* renamed from: v, reason: collision with root package name */
    public int f48198v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, bl2.c cVar) {
        super(cVar);
        this.f48197u = iVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f48196t = obj;
        this.f48198v |= Integer.MIN_VALUE;
        return this.f48197u.i(null, this);
    }
}
