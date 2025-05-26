package ads_mobile_sdk;

import co2.z;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class kg1 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f7302a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f7303b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ nm.q f7304c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7305d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ng1 f7306e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kg1(int i13, ng1 ng1Var, nm.q qVar, bl2.c cVar) {
        super(2, cVar);
        this.f7304c = qVar;
        this.f7305d = i13;
        this.f7306e = ng1Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        kg1 kg1Var = new kg1(this.f7305d, this.f7306e, this.f7304c, cVar);
        kg1Var.f7303b = obj;
        return kg1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((kg1) create((z) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f7302a;
        if (i13 == 0) {
            ue.c.H(obj);
            z zVar = (z) this.f7303b;
            int size = this.f7304c.f91364a.size();
            ArrayList arrayList = new ArrayList();
            for (int i14 = 0; i14 < this.f7305d; i14++) {
                ng1 ng1Var = this.f7306e;
                arrayList.add(kotlin.jvm.internal.j.z(ng1Var.f8792r, null, null, new jg1(ng1Var, i14, size, this.f7304c, zVar, null), 3));
            }
            this.f7302a = 1;
            if (com.bumptech.glide.c.E0(arrayList, this) == aVar) {
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
