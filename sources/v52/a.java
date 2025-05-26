package v52;

/* loaded from: classes4.dex */
public final class a extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f124167r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d f124168s;

    /* renamed from: t, reason: collision with root package name */
    public int f124169t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, bl2.c cVar) {
        super(cVar);
        this.f124168s = dVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f124167r = obj;
        this.f124169t |= Integer.MIN_VALUE;
        return d.j(this.f124168s, null, this);
    }
}
