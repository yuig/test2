package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class nt extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f8966a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ot f8967b;

    /* renamed from: c, reason: collision with root package name */
    public int f8968c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nt(ot otVar, bl2.c cVar) {
        super(cVar);
        this.f8967b = otVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f8966a = obj;
        this.f8968c |= Integer.MIN_VALUE;
        return this.f8967b.a((a.b) null, this);
    }
}
