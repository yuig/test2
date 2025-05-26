package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class qr extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public zr f10225a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f10226b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zr f10227c;

    /* renamed from: d, reason: collision with root package name */
    public int f10228d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qr(zr zrVar, bl2.c cVar) {
        super(cVar);
        this.f10227c = zrVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f10226b = obj;
        this.f10228d |= Integer.MIN_VALUE;
        return zr.h(this.f10227c, this);
    }
}
