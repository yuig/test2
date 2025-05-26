package ads_mobile_sdk;

import ao2.j0;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class j1 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f6598a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wb0 f6599b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f6600c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(wb0 wb0Var, String str, bl2.c cVar) {
        super(2, cVar);
        this.f6599b = wb0Var;
        this.f6600c = str;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        j1 j1Var = new j1(this.f6599b, this.f6600c, cVar);
        j1Var.f6598a = obj;
        return j1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j1) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        j0 j0Var = (j0) this.f6598a;
        for (Map.Entry entry : this.f6599b.f12972b.entrySet()) {
            i1 block = new i1(this.f6600c, (String) entry.getKey(), entry.getValue(), null);
            kotlin.coroutines.j context = kotlin.coroutines.j.f80412a;
            Intrinsics.checkNotNullParameter(j0Var, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            kotlin.jvm.internal.j.z(j0Var, context, null, new et2(block, null), 2);
        }
        return Unit.f80348a;
    }
}
