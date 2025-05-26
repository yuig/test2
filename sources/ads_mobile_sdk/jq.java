package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class jq extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public zr f6912a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f6913b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zr f6914c;

    /* renamed from: d, reason: collision with root package name */
    public int f6915d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jq(zr zrVar, bl2.c cVar) {
        super(cVar);
        this.f6914c = zrVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f6913b = obj;
        this.f6915d |= Integer.MIN_VALUE;
        return this.f6914c.i(this);
    }
}
