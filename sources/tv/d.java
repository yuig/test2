package tv;

/* loaded from: classes3.dex */
public final class d extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f119496r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e f119497s;

    /* renamed from: t, reason: collision with root package name */
    public int f119498t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, bl2.c cVar) {
        super(cVar);
        this.f119497s = eVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f119496r = obj;
        this.f119498t |= Integer.MIN_VALUE;
        return e.j(this.f119497s, null, this);
    }
}
