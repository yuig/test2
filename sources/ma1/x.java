package ma1;

/* loaded from: classes5.dex */
public final class x extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f86816r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.q f86817s;

    /* renamed from: t, reason: collision with root package name */
    public int f86818t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(androidx.appcompat.widget.q qVar, bl2.c cVar) {
        super(cVar);
        this.f86817s = qVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f86816r = obj;
        this.f86818t |= Integer.MIN_VALUE;
        return this.f86817s.i(null, this);
    }
}
