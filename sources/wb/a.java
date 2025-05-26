package wb;

import dl2.d;

/* loaded from: classes3.dex */
public final class a extends d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f128964r;

    /* renamed from: s, reason: collision with root package name */
    public int f128965s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b f128966t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, bl2.c cVar) {
        super(cVar);
        this.f128966t = bVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f128964r = obj;
        this.f128965s |= Integer.MIN_VALUE;
        return this.f128966t.emit(null, this);
    }
}
