package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class x60 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public y60 f13506a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f13507b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y60 f13508c;

    /* renamed from: d, reason: collision with root package name */
    public int f13509d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x60(y60 y60Var, bl2.c cVar) {
        super(cVar);
        this.f13508c = y60Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f13507b = obj;
        this.f13509d |= Integer.MIN_VALUE;
        return y60.a(this.f13508c, this);
    }
}
