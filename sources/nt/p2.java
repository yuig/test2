package nt;

/* loaded from: classes3.dex */
public final class p2 extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f92135r;

    /* renamed from: s, reason: collision with root package name */
    public int f92136s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ o1.f f92137t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(o1.f fVar, bl2.c cVar) {
        super(cVar);
        this.f92137t = fVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f92135r = obj;
        this.f92136s |= Integer.MIN_VALUE;
        return this.f92137t.emit(null, this);
    }
}
