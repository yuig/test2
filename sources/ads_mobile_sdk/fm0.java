package ads_mobile_sdk;

import java.util.UUID;

/* loaded from: classes2.dex */
public final class fm0 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public ym0 f5197a;

    /* renamed from: b, reason: collision with root package name */
    public Object f5198b;

    /* renamed from: c, reason: collision with root package name */
    public String f5199c;

    /* renamed from: d, reason: collision with root package name */
    public UUID f5200d;

    /* renamed from: e, reason: collision with root package name */
    public ao2.v f5201e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f5202f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ym0 f5203g;

    /* renamed from: h, reason: collision with root package name */
    public int f5204h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fm0(ym0 ym0Var, bl2.c cVar) {
        super(cVar);
        this.f5203g = ym0Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f5202f = obj;
        this.f5204h |= Integer.MIN_VALUE;
        return this.f5203g.a(null, null, null, this);
    }
}
