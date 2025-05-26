package ads_mobile_sdk;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class n42 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o42 f8673a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sx0 f8674b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n42(o42 o42Var, sx0 sx0Var, bl2.c cVar) {
        super(2, cVar);
        this.f8673a = o42Var;
        this.f8674b = sx0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new n42(this.f8673a, this.f8674b, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new n42(this.f8673a, this.f8674b, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        this.f8673a.b().removeAllViews();
        View i13 = this.f8674b.i();
        ViewParent parent = i13.getParent();
        if (parent instanceof ViewGroup) {
            String str = ((sx0) this.f8673a.c().a()).getResponseInfo().f129930a;
            ok.e0 e0Var = gk0.f5596a;
            gk0.d("Banner view provided from " + str + " already has a parent view. Removing its old parent.", null);
            ((ViewGroup) parent).removeView(i13);
        }
        this.f8673a.b().addView(i13);
        return Unit.f80348a;
    }
}
