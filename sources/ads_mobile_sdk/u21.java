package ads_mobile_sdk;

import kotlin.jvm.internal.j0;

/* loaded from: classes2.dex */
public final class u21 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public g31 f11808a;

    /* renamed from: b, reason: collision with root package name */
    public j0 f11809b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f11810c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g31 f11811d;

    /* renamed from: e, reason: collision with root package name */
    public int f11812e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u21(g31 g31Var, bl2.c cVar) {
        super(cVar);
        this.f11811d = g31Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f11810c = obj;
        this.f11812e |= Integer.MIN_VALUE;
        return this.f11811d.b((String) null, this);
    }
}
