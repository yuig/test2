package v52;

import u52.q0;

/* loaded from: classes4.dex */
public final class b extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public q0 f124170r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f124171s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ d f124172t;

    /* renamed from: u, reason: collision with root package name */
    public int f124173u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, bl2.c cVar) {
        super(cVar);
        this.f124172t = dVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f124171s = obj;
        this.f124173u |= Integer.MIN_VALUE;
        return d.k(this.f124172t, null, this);
    }
}
