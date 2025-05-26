package io2;

/* loaded from: classes4.dex */
public final class k extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f73347r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ l f73348s;

    /* renamed from: t, reason: collision with root package name */
    public int f73349t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, bl2.c cVar) {
        super(cVar);
        this.f73348s = lVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f73347r = obj;
        this.f73349t |= Integer.MIN_VALUE;
        return this.f73348s.b(this);
    }
}
