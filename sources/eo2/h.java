package eo2;

/* loaded from: classes4.dex */
public final class h extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public i f59769r;

    /* renamed from: s, reason: collision with root package name */
    public do2.i f59770s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f59771t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ i f59772u;

    /* renamed from: v, reason: collision with root package name */
    public int f59773v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, bl2.c cVar) {
        super(cVar);
        this.f59772u = iVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f59771t = obj;
        this.f59773v |= Integer.MIN_VALUE;
        return this.f59772u.emit(null, this);
    }
}
