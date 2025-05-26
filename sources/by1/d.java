package by1;

import fd.q;

/* loaded from: classes4.dex */
public final class d extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f24136r;

    /* renamed from: s, reason: collision with root package name */
    public int f24137s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ q f24138t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(q qVar, bl2.c cVar) {
        super(cVar);
        this.f24138t = qVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f24136r = obj;
        this.f24137s |= Integer.MIN_VALUE;
        return this.f24138t.emit(null, this);
    }
}
