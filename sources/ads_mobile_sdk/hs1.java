package ads_mobile_sdk;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class hs1 extends dl2.j implements kl2.l {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ a.e9 f6065a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ws1 f6066b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f6067c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xh0 f6068d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f6069e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hs1(ws1 ws1Var, View view, xh0 xh0Var, String str, bl2.c cVar) {
        super(3, cVar);
        this.f6066b = ws1Var;
        this.f6067c = view;
        this.f6068d = xh0Var;
        this.f6069e = str;
    }

    @Override // kl2.l
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        hs1 hs1Var = new hs1(this.f6066b, this.f6067c, this.f6068d, this.f6069e, (bl2.c) obj3);
        hs1Var.f6065a = (a.e9) obj2;
        return hs1Var.invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        a.e9 adSession = this.f6065a;
        zq1 zq1Var = this.f6066b.f13229e;
        View friendlyObstructionView = this.f6067c;
        xh0 purpose = this.f6068d;
        String str = this.f6069e;
        zq1Var.getClass();
        Intrinsics.checkNotNullParameter(adSession, "adSession");
        Intrinsics.checkNotNullParameter(friendlyObstructionView, "friendlyObstructionView");
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        return Unit.f80348a;
    }
}
