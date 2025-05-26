package in0;

/* loaded from: classes5.dex */
public final class a extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public f f72796r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f72797s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ f f72798t;

    /* renamed from: u, reason: collision with root package name */
    public int f72799u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(f fVar, bl2.c cVar) {
        super(cVar);
        this.f72798t = fVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f72797s = obj;
        this.f72799u |= Integer.MIN_VALUE;
        return this.f72798t.a(null, this);
    }
}
