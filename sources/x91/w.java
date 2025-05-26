package x91;

/* loaded from: classes5.dex */
public final class w extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f134358r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ i90.i f134359s;

    /* renamed from: t, reason: collision with root package name */
    public int f134360t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(i90.i iVar, bl2.c cVar) {
        super(cVar);
        this.f134359s = iVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f134358r = obj;
        this.f134360t |= Integer.MIN_VALUE;
        return this.f134359s.a(0, null, null, null, this);
    }
}
