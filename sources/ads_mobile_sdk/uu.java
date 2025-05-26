package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class uu extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public vu f12189a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f12190b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ vu f12191c;

    /* renamed from: d, reason: collision with root package name */
    public int f12192d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uu(vu vuVar, bl2.c cVar) {
        super(cVar);
        this.f12191c = vuVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f12190b = obj;
        this.f12192d |= Integer.MIN_VALUE;
        return vu.a(this.f12191c, this);
    }
}
