package ads_mobile_sdk;

import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class cb0 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f3845a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3846b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f3847c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f3848d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ UUID f3849e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cb0(String str, String str2, UUID uuid, bl2.c cVar) {
        super(2, cVar);
        this.f3847c = str;
        this.f3848d = str2;
        this.f3849e = uuid;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        cb0 cb0Var = new cb0(this.f3847c, this.f3848d, this.f3849e, cVar);
        cb0Var.f3846b = obj;
        return cb0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((cb0) create((sy0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f3845a;
        if (i13 == 0) {
            ue.c.H(obj);
            sy0 sy0Var = (sy0) this.f3846b;
            String str = this.f3847c;
            String str2 = this.f3848d;
            UUID uuid = this.f3849e;
            this.f3845a = 1;
            sy0Var.getClass();
            obj = sy0.a(sy0Var, str, str2, uuid, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        return obj;
    }
}
