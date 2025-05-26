package q52;

import i90.i;

/* loaded from: classes4.dex */
public final class b extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f102576r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ i f102577s;

    /* renamed from: t, reason: collision with root package name */
    public int f102578t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(i iVar, bl2.c cVar) {
        super(cVar);
        this.f102577s = iVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f102576r = obj;
        this.f102578t |= Integer.MIN_VALUE;
        return this.f102577s.a(0, null, null, null, this);
    }
}
