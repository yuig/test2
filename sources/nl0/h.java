package nl0;

import com.pinterest.api.model.v7;

/* loaded from: classes5.dex */
public final class h extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public i f91258r;

    /* renamed from: s, reason: collision with root package name */
    public v7 f91259s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f91260t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ i f91261u;

    /* renamed from: v, reason: collision with root package name */
    public int f91262v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, bl2.c cVar) {
        super(cVar);
        this.f91261u = iVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f91260t = obj;
        this.f91262v |= Integer.MIN_VALUE;
        return this.f91261u.emit(null, this);
    }
}
