package com.pinterest.feature.pincarouselads.view;

/* loaded from: classes2.dex */
public final class u extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f47424r;

    /* renamed from: s, reason: collision with root package name */
    public int f47425s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a6.v f47426t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(a6.v vVar, bl2.c cVar) {
        super(cVar);
        this.f47426t = vVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f47424r = obj;
        this.f47425s |= Integer.MIN_VALUE;
        return this.f47426t.emit(null, this);
    }
}
