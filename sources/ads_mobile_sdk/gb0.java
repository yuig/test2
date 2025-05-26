package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class gb0 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public Object f5493a;

    /* renamed from: b, reason: collision with root package name */
    public sy0 f5494b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f5495c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kb0 f5496d;

    /* renamed from: e, reason: collision with root package name */
    public int f5497e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gb0(kb0 kb0Var, bl2.c cVar) {
        super(cVar);
        this.f5496d = kb0Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f5495c = obj;
        this.f5497e |= Integer.MIN_VALUE;
        return this.f5496d.a((cb0) null, this);
    }
}
