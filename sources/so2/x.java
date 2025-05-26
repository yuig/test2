package so2;

import java.util.LinkedHashMap;

/* loaded from: classes4.dex */
public final class x extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public xk2.b f114828r;

    /* renamed from: s, reason: collision with root package name */
    public y f114829s;

    /* renamed from: t, reason: collision with root package name */
    public LinkedHashMap f114830t;

    /* renamed from: u, reason: collision with root package name */
    public String f114831u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f114832v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ y f114833w;

    /* renamed from: x, reason: collision with root package name */
    public int f114834x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(y yVar, bl2.c cVar) {
        super(cVar);
        this.f114833w = yVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f114832v = obj;
        this.f114834x |= Integer.MIN_VALUE;
        return y.a(this.f114833w, null, this);
    }
}
