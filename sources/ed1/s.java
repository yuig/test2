package ed1;

/* loaded from: classes5.dex */
public final class s extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f58704r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ v f58705s;

    /* renamed from: t, reason: collision with root package name */
    public int f58706t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(v vVar, bl2.c cVar) {
        super(cVar);
        this.f58705s = vVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f58704r = obj;
        this.f58706t |= Integer.MIN_VALUE;
        return this.f58705s.r3(null, this);
    }
}
