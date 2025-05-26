package ns;

import com.pinterest.api.model.f30;

/* loaded from: classes3.dex */
public final class w extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public x f91959r;

    /* renamed from: s, reason: collision with root package name */
    public String f91960s;

    /* renamed from: t, reason: collision with root package name */
    public String f91961t;

    /* renamed from: u, reason: collision with root package name */
    public f30 f91962u;

    /* renamed from: v, reason: collision with root package name */
    public String f91963v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f91964w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ x f91965x;

    /* renamed from: y, reason: collision with root package name */
    public int f91966y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(x xVar, bl2.c cVar) {
        super(cVar);
        this.f91965x = xVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f91964w = obj;
        this.f91966y |= Integer.MIN_VALUE;
        return this.f91965x.i(null, this);
    }
}
