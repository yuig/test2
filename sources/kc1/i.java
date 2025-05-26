package kc1;

/* loaded from: classes5.dex */
public final class i extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f79156r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.q f79157s;

    /* renamed from: t, reason: collision with root package name */
    public int f79158t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(androidx.appcompat.widget.q qVar, bl2.c cVar) {
        super(cVar);
        this.f79157s = qVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f79156r = obj;
        this.f79158t |= Integer.MIN_VALUE;
        return this.f79157s.i(null, this);
    }
}
