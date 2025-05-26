package io2;

/* loaded from: classes4.dex */
public final class g extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public i f73334r;

    /* renamed from: s, reason: collision with root package name */
    public do2.j f73335s;

    /* renamed from: t, reason: collision with root package name */
    public l f73336t;

    /* renamed from: u, reason: collision with root package name */
    public long f73337u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f73338v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f73339w;

    /* renamed from: x, reason: collision with root package name */
    public int f73340x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, bl2.c cVar) {
        super(cVar);
        this.f73339w = iVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f73338v = obj;
        this.f73340x |= Integer.MIN_VALUE;
        return this.f73339w.h(this, null);
    }
}
