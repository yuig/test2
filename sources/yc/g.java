package yc;

import pc.o0;

/* loaded from: classes.dex */
public final class g extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public pc.f f138624r;

    /* renamed from: s, reason: collision with root package name */
    public o0 f138625s;

    /* renamed from: t, reason: collision with root package name */
    public long f138626t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f138627u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ l f138628v;

    /* renamed from: w, reason: collision with root package name */
    public int f138629w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(l lVar, bl2.c cVar) {
        super(cVar);
        this.f138628v = lVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f138627u = obj;
        this.f138629w |= Integer.MIN_VALUE;
        return l.b(this.f138628v, null, null, this);
    }
}
