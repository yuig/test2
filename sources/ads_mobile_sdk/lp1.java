package ads_mobile_sdk;

import android.database.sqlite.SQLiteDatabase;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class lp1 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f7916a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ np1 f7917b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lp1(np1 np1Var, bl2.c cVar) {
        super(2, cVar);
        this.f7917b = np1Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        lp1 lp1Var = new lp1(this.f7917b, cVar);
        lp1Var.f7916a = obj;
        return lp1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        lp1 lp1Var = new lp1(this.f7917b, (bl2.c) obj2);
        lp1Var.f7916a = (SQLiteDatabase) obj;
        return lp1Var.invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        np1.a(this.f7917b, (SQLiteDatabase) this.f7916a);
        return Unit.f80348a;
    }
}
