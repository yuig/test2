package ads_mobile_sdk;

import android.view.WindowManager;

/* loaded from: classes2.dex */
public final class df0 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public kf0 f4256a;

    /* renamed from: b, reason: collision with root package name */
    public WindowManager f4257b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f4258c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kf0 f4259d;

    /* renamed from: e, reason: collision with root package name */
    public int f4260e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public df0(kf0 kf0Var, bl2.c cVar) {
        super(cVar);
        this.f4259d = kf0Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f4258c = obj;
        this.f4260e |= Integer.MIN_VALUE;
        return kf0.a(this.f4259d, (a.pf) null, this);
    }
}
