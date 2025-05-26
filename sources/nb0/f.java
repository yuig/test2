package nb0;

/* loaded from: classes5.dex */
public final class f extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f90200r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ t f90201s;

    /* renamed from: t, reason: collision with root package name */
    public int f90202t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(t tVar, bl2.c cVar) {
        super(cVar);
        this.f90201s = tVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f90200r = obj;
        this.f90202t |= Integer.MIN_VALUE;
        return t.o(this.f90201s, null, this);
    }
}
