package ads_mobile_sdk;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes2.dex */
public final class i32 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public a.j8 f6207a;

    /* renamed from: b, reason: collision with root package name */
    public CoroutineContext f6208b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f6209c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r32 f6210d;

    /* renamed from: e, reason: collision with root package name */
    public int f6211e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i32(r32 r32Var, bl2.c cVar) {
        super(cVar);
        this.f6210d = r32Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f6209c = obj;
        this.f6211e |= Integer.MIN_VALUE;
        return r32.a(this.f6210d, null, this);
    }
}
