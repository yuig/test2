package ads_mobile_sdk;

import android.net.Uri;

/* loaded from: classes2.dex */
public final class ax2 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public cx2 f2593a;

    /* renamed from: b, reason: collision with root package name */
    public Uri f2594b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f2595c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cx2 f2596d;

    /* renamed from: e, reason: collision with root package name */
    public int f2597e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ax2(cx2 cx2Var, bl2.c cVar) {
        super(cVar);
        this.f2596d = cx2Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f2595c = obj;
        this.f2597e |= Integer.MIN_VALUE;
        return this.f2596d.f(this);
    }
}
