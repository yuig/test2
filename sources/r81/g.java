package r81;

import androidx.recyclerview.widget.w;
import com.pinterest.api.model.pu;
import java.util.List;
import jk2.h0;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import sq0.u;
import uj2.q;
import wt1.c0;
import wt1.v;

/* loaded from: classes5.dex */
public final class g extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final g f106762j = new g(0);

    /* renamed from: k, reason: collision with root package name */
    public static final g f106763k = new g(1);

    /* renamed from: l, reason: collision with root package name */
    public static final g f106764l = new g(2);

    /* renamed from: m, reason: collision with root package name */
    public static final g f106765m = new g(3);

    /* renamed from: n, reason: collision with root package name */
    public static final g f106766n = new g(4);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f106767i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i13) {
        super(1);
        this.f106767i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f106767i) {
            case 0:
                return Unit.f80348a;
            case 1:
                c0 it = (c0) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf((it instanceof v) || it.f131095a != null);
            case 2:
                c0 it2 = (c0) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (it2 instanceof v) {
                    return q.y(new u());
                }
                w wVar = it2.f131095a;
                return wVar != null ? q.y(new sq0.q(wVar)) : h0.f76488a;
            case 3:
                pu it3 = (pu) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                return it3.e();
            default:
                List it4 = (List) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                return CollectionsKt.F0(it4);
        }
    }
}
