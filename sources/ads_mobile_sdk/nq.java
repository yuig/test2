package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class nq extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public zr f8922a;

    /* renamed from: b, reason: collision with root package name */
    public aq f8923b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f8924c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zr f8925d;

    /* renamed from: e, reason: collision with root package name */
    public int f8926e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nq(zr zrVar, bl2.c cVar) {
        super(cVar);
        this.f8925d = zrVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f8924c = obj;
        this.f8926e |= Integer.MIN_VALUE;
        return this.f8925d.l(this);
    }
}
