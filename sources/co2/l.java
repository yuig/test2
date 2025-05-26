package co2;

/* loaded from: classes2.dex */
public final class l extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f28309r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ m f28310s;

    /* renamed from: t, reason: collision with root package name */
    public int f28311t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, bl2.c cVar) {
        super(cVar);
        this.f28310s = mVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f28309r = obj;
        this.f28311t |= Integer.MIN_VALUE;
        Object O = this.f28310s.O(null, 0, 0L, this);
        return O == cl2.a.COROUTINE_SUSPENDED ? O : new t(O);
    }
}
