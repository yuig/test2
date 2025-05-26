package ads_mobile_sdk;

import a.l2;
import a.m2;
import android.view.MotionEvent;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class et extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f4940a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ed2 f4941b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public et(ed2 ed2Var, bl2.c cVar) {
        super(2, cVar);
        this.f4941b = ed2Var;
    }

    public static final void a(ed2 ed2Var, View view) {
        ed2Var.f4824f.set(true);
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        et etVar = new et(this.f4941b, cVar);
        etVar.f4940a = obj;
        return etVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        et etVar = new et(this.f4941b, (bl2.c) obj2);
        etVar.f4940a = (ym0) obj;
        return etVar.invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        ym0 ym0Var = (ym0) this.f4940a;
        ym0Var.a().f7412r = this.f4941b;
        int i13 = 0;
        ym0Var.setOnClickListener(new l2(this.f4941b, i13));
        ym0Var.setOnTouchListener(new m2(this.f4941b, i13));
        return Unit.f80348a;
    }

    public static final boolean a(ed2 ed2Var, View view, MotionEvent motionEvent) {
        ed2Var.f4824f.set(true);
        view.performClick();
        return false;
    }
}
