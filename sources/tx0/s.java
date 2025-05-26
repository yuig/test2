package tx0;

/* loaded from: classes5.dex */
public final class s extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f119672r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ i90.i f119673s;

    /* renamed from: t, reason: collision with root package name */
    public int f119674t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(i90.i iVar, bl2.c cVar) {
        super(cVar);
        this.f119673s = iVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f119672r = obj;
        this.f119674t |= Integer.MIN_VALUE;
        return this.f119673s.a(0, null, null, null, this);
    }
}
