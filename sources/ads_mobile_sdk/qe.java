package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class qe extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public se f10051a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f10052b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ se f10053c;

    /* renamed from: d, reason: collision with root package name */
    public int f10054d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qe(se seVar, bl2.c cVar) {
        super(cVar);
        this.f10053c = seVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f10052b = obj;
        this.f10054d |= Integer.MIN_VALUE;
        return se.a(this.f10053c, this);
    }
}
