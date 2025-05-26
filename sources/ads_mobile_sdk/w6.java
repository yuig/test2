package ads_mobile_sdk;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class w6 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f12874a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z6 f12875b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map.Entry f12876c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w6(z6 z6Var, Map.Entry entry, bl2.c cVar) {
        super(2, cVar);
        this.f12875b = z6Var;
        this.f12876c = entry;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new w6(this.f12875b, this.f12876c, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new w6(this.f12875b, this.f12876c, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f12874a;
        if (i13 == 0) {
            ue.c.H(obj);
            z6 z6Var = this.f12875b;
            Object key = this.f12876c.getKey();
            Intrinsics.checkNotNullExpressionValue(key, "<get-key>(...)");
            Object value = this.f12876c.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "<get-value>(...)");
            this.f12874a = 1;
            if (z6.a(z6Var, (String) key, (n6) value, this) == aVar) {
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
