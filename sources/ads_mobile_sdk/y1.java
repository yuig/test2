package ads_mobile_sdk;

import android.os.Bundle;
import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class y1 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f13937a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f13938b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f13939c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f13940d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Bundle f13941e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(String str, String str2, Object obj, bl2.c cVar, Bundle bundle) {
        super(2, cVar);
        this.f13938b = str;
        this.f13939c = str2;
        this.f13940d = obj;
        this.f13941e = bundle;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new y1(this.f13938b, this.f13939c, this.f13940d, cVar, this.f13941e);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((y1) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f13937a;
        if (i13 == 0) {
            ue.c.H(obj);
            ok.e0 e0Var = gk0.f5596a;
            a.c.u("Invoking function [", this.f13938b, "] on listener [", this.f13939c, "]");
            a.a0 a0Var = (a.a0) this.f13940d;
            Bundle bundle = this.f13941e;
            this.f13937a = 1;
            if (a0Var.a(bundle, this) == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        return Unit.f80348a;
    }
}
