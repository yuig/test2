package fd;

import java.util.LinkedHashMap;

/* loaded from: classes3.dex */
public final class g extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public i f61766r;

    /* renamed from: s, reason: collision with root package name */
    public LinkedHashMap f61767s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f61768t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ i f61769u;

    /* renamed from: v, reason: collision with root package name */
    public int f61770v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, bl2.c cVar) {
        super(cVar);
        this.f61769u = iVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f61768t = obj;
        this.f61770v |= Integer.MIN_VALUE;
        return this.f61769u.e(this);
    }
}
