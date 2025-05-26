package ads_mobile_sdk;

import java.util.Map;

/* loaded from: classes2.dex */
public final class j70 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public Object f6708a;

    /* renamed from: b, reason: collision with root package name */
    public ym0 f6709b;

    /* renamed from: c, reason: collision with root package name */
    public Map f6710c;

    /* renamed from: d, reason: collision with root package name */
    public mo2.a f6711d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f6712e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k70 f6713f;

    /* renamed from: g, reason: collision with root package name */
    public int f6714g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j70(k70 k70Var, bl2.c cVar) {
        super(cVar);
        this.f6713f = k70Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f6712e = obj;
        this.f6714g |= Integer.MIN_VALUE;
        return this.f6713f.a(null, null, this);
    }
}
