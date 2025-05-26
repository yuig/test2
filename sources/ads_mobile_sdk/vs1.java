package ads_mobile_sdk;

import android.view.View;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class vs1 extends dl2.j implements kl2.l {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ a.e9 f12627a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ws1 f12628b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f12629c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vs1(ws1 ws1Var, View view, bl2.c cVar) {
        super(3, cVar);
        this.f12628b = ws1Var;
        this.f12629c = view;
    }

    @Override // kl2.l
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        vs1 vs1Var = new vs1(this.f12628b, this.f12629c, (bl2.c) obj3);
        vs1Var.f12627a = (a.e9) obj2;
        return vs1Var.invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        this.f12628b.f13229e.a(this.f12627a, this.f12629c);
        this.f12628b.f13237m.add(this.f12629c);
        return Unit.f80348a;
    }
}
