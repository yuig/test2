package com.pinterest.feature.settings.notifications;

/* loaded from: classes5.dex */
public final class p extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f48247r;

    /* renamed from: s, reason: collision with root package name */
    public int f48248s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c31.m f48249t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(c31.m mVar, bl2.c cVar) {
        super(cVar);
        this.f48249t = mVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f48247r = obj;
        this.f48248s |= Integer.MIN_VALUE;
        return this.f48249t.emit(null, this);
    }
}
