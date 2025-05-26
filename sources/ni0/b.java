package ni0;

import gb2.i;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.m0;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class b extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final b f90569j = new b(0);

    /* renamed from: k, reason: collision with root package name */
    public static final b f90570k = new b(1);

    /* renamed from: l, reason: collision with root package name */
    public static final b f90571l = new b(2);

    /* renamed from: m, reason: collision with root package name */
    public static final b f90572m = new b(3);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f90573i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i13) {
        super(1);
        this.f90573i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f90573i) {
            case 0:
                List list = (List) obj;
                Intrinsics.checkNotNullParameter(list, "list");
                return CollectionsKt.d0(list) instanceof i ? m0.F(list, i.class) : q0.f80391a;
            case 1:
                List it = (List) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(!it.isEmpty());
            case 2:
                List it2 = (List) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return (i) d7.b.j0(it2);
            default:
                return Unit.f80348a;
        }
    }
}
