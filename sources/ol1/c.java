package ol1;

import gb2.i;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.m0;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import wa2.o;

/* loaded from: classes2.dex */
public final class c extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final c f96444j = new c(0);

    /* renamed from: k, reason: collision with root package name */
    public static final c f96445k = new c(1);

    /* renamed from: l, reason: collision with root package name */
    public static final c f96446l = new c(2);

    /* renamed from: m, reason: collision with root package name */
    public static final c f96447m = new c(3);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f96448i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i13) {
        super(1);
        this.f96448i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f96448i) {
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
                i it3 = (i) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                return Boolean.valueOf(it3.f64755c.compareTo(o.UI_ONLY) > 0);
        }
    }
}
