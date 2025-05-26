package ads_mobile_sdk;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class ot1 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewParent f9433a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pt1 f9434b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ot1(ViewParent viewParent, pt1 pt1Var, bl2.c cVar) {
        super(2, cVar);
        this.f9433a = viewParent;
        this.f9434b = pt1Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new ot1(this.f9433a, this.f9434b, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new ot1(this.f9433a, this.f9434b, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        ((ViewGroup) this.f9433a).removeView(this.f9434b.e());
        Context c13 = this.f9434b.K.c();
        if (c13 == null) {
            c13 = this.f9434b.f13046a;
        }
        return Boolean.valueOf(this.f9434b.a(c13));
    }
}
