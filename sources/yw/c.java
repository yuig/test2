package yw;

/* loaded from: classes.dex */
public final class c extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f140250r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f f140251s;

    /* renamed from: t, reason: collision with root package name */
    public int f140252t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, bl2.c cVar) {
        super(cVar);
        this.f140251s = fVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f140250r = obj;
        this.f140252t |= Integer.MIN_VALUE;
        return f.b(this.f140251s, null, this);
    }
}
