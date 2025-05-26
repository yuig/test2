package g72;

import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final d0 f63960j = new d0(0);

    /* renamed from: k, reason: collision with root package name */
    public static final d0 f63961k = new d0(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f63962i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(int i13) {
        super(1);
        this.f63962i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f63962i) {
            case 0:
                List it = (List) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                ro2.n nVar = (ro2.n) it.get(0);
                ro2.n nVar2 = (ro2.n) it.get(1);
                String str = (String) CollectionsKt.R(ro2.o.f(nVar).f108979a.keySet());
                if (!Intrinsics.d(str, "unique")) {
                    return new Pair(str, nVar2);
                }
                ro2.n nVar3 = (ro2.n) ro2.o.f((ro2.n) kotlin.collections.z0.e(str, ro2.o.f(nVar))).get("_0");
                String b13 = nVar3 != null ? ro2.o.g(nVar3).b() : null;
                if (b13 == null) {
                    b13 = "";
                }
                ro2.d0 d0Var = new ro2.d0();
                Boolean bool = Boolean.TRUE;
                Intrinsics.checkNotNullParameter(d0Var, "<this>");
                Intrinsics.checkNotNullParameter("unique", "key");
                d0Var.a("unique", new ro2.v(bool, false, null));
                ro2.o.f(nVar2).forEach(new c0(new jq1.b(d0Var, 10), 0));
                return new Pair(b13, new ro2.c0(d0Var.f108980a));
            default:
                ro2.d0 putJsonObject = (ro2.d0) obj;
                Intrinsics.checkNotNullParameter(putJsonObject, "$this$putJsonObject");
                return Unit.f80348a;
        }
    }
}
