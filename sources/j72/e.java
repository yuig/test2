package j72;

/* loaded from: classes4.dex */
public final class e extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f74864r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ s f74865s;

    /* renamed from: t, reason: collision with root package name */
    public int f74866t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(s sVar, bl2.c cVar) {
        super(cVar);
        this.f74865s = sVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f74864r = obj;
        this.f74866t |= Integer.MIN_VALUE;
        return this.f74865s.a(null, this);
    }
}
