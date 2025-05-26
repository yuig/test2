package com.pinterest.feature.unauth.sba;

/* loaded from: classes5.dex */
public final class p extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f48846r;

    /* renamed from: s, reason: collision with root package name */
    public int f48847s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c31.m f48848t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(c31.m mVar, bl2.c cVar) {
        super(cVar);
        this.f48848t = mVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f48846r = obj;
        this.f48847s |= Integer.MIN_VALUE;
        return this.f48848t.emit(null, this);
    }
}
