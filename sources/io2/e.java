package io2;

/* loaded from: classes2.dex */
public final class e extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public f f73326r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f73327s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ f f73328t;

    /* renamed from: u, reason: collision with root package name */
    public int f73329u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, bl2.c cVar) {
        super(cVar);
        this.f73328t = fVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f73327s = obj;
        this.f73329u |= Integer.MIN_VALUE;
        return f.g0(this.f73328t, this);
    }
}
