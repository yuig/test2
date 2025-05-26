package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class c42 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public o42 f3737a;

    /* renamed from: b, reason: collision with root package name */
    public o42 f3738b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f3739c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o42 f3740d;

    /* renamed from: e, reason: collision with root package name */
    public int f3741e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c42(o42 o42Var, bl2.c cVar) {
        super(cVar);
        this.f3740d = o42Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f3739c = obj;
        this.f3741e |= Integer.MIN_VALUE;
        return this.f3740d.b(this);
    }
}
