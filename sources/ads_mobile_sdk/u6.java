package ads_mobile_sdk;

import a.w0;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class u6 extends dl2.j implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public int f11844a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z6 f11845b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f11846c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n6 f11847d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u6(z6 z6Var, String str, n6 n6Var, bl2.c cVar) {
        super(1, cVar);
        this.f11845b = z6Var;
        this.f11846c = str;
        this.f11847d = n6Var;
    }

    @Override // dl2.a
    public final bl2.c create(bl2.c cVar) {
        return new u6(this.f11845b, this.f11846c, this.f11847d, cVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((u6) create((bl2.c) obj)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f11844a;
        if (i13 == 0) {
            ue.c.H(obj);
            z6 z6Var = this.f11845b;
            String adapterName = this.f11846c;
            n6 n6Var = this.f11847d;
            this.f11844a = 1;
            List list = z6.f14642n;
            z6Var.getClass();
            if (z6.f14642n.contains(adapterName)) {
                obj = new pk0(Unit.f80348a);
            } else {
                w0 a13 = a.fe.a(z6Var.f14646d, adapterName, false, true, null, 10);
                if (a13 == null) {
                    synchronized (z6Var) {
                        a.j1 j1Var = z6Var.f14647e;
                        LinkedHashMap adapterStatusMap = z6Var.f14655m;
                        r6 adapterStatus = new r6(xi.a.FAILED, "The adapter was unable to be instantiated via reflection.", 0);
                        j1Var.getClass();
                        Intrinsics.checkNotNullParameter(adapterStatusMap, "adapterStatusMap");
                        Intrinsics.checkNotNullParameter(adapterName, "adapterName");
                        Intrinsics.checkNotNullParameter(adapterStatus, "adapterStatus");
                        adapterStatusMap.put(adapterName, new Pair(adapterStatus, null));
                        Unit unit = Unit.f80348a;
                    }
                    obj = new nk0("The adapter was unable to be instantiated via reflection.", yx0.f14443a);
                } else {
                    obj = z6Var.a(a13, adapterName, n6Var, this);
                }
            }
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
