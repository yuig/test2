package v41;

/* loaded from: classes5.dex */
public final class j extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f124129r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ l f124130s;

    /* renamed from: t, reason: collision with root package name */
    public int f124131t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, bl2.c cVar) {
        super(cVar);
        this.f124130s = lVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f124129r = obj;
        this.f124131t |= Integer.MIN_VALUE;
        return this.f124130s.a(0, null, null, null, this);
    }
}
