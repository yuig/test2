package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class us0 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public ws0 f12178a;

    /* renamed from: b, reason: collision with root package name */
    public mo2.a f12179b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f12180c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ws0 f12181d;

    /* renamed from: e, reason: collision with root package name */
    public int f12182e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public us0(ws0 ws0Var, bl2.c cVar) {
        super(cVar);
        this.f12181d = ws0Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f12180c = obj;
        this.f12182e |= Integer.MIN_VALUE;
        return this.f12181d.c(this);
    }
}
