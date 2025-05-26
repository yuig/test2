package ads_mobile_sdk;

import android.os.Bundle;
import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class o03 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f9091a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p03 f9092b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ cd0 f9093c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f9094d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o03(p03 p03Var, cd0 cd0Var, String str, bl2.c cVar) {
        super(2, cVar);
        this.f9092b = p03Var;
        this.f9093c = cd0Var;
        this.f9094d = str;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new o03(this.f9092b, this.f9093c, this.f9094d, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o03) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f9091a;
        if (i13 == 0) {
            ue.c.H(obj);
            p03 p03Var = this.f9092b;
            fd0 fd0Var = p03Var.f9513a;
            cd0 cd0Var = this.f9093c;
            Bundle bundle = p03Var.f9517e.f10387q;
            String str = this.f9094d;
            this.f9091a = 1;
            fd0Var.getClass();
            if (fd0.a(fd0Var, cd0Var, bundle, str) == aVar) {
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
