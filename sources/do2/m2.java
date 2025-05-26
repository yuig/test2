package do2;

/* loaded from: classes4.dex */
public final class m2 extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f55858r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ o1.f f55859s;

    /* renamed from: t, reason: collision with root package name */
    public int f55860t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(o1.f fVar, bl2.c cVar) {
        super(cVar);
        this.f55859s = fVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f55858r = obj;
        this.f55860t |= Integer.MIN_VALUE;
        return this.f55859s.a(0, this);
    }
}
