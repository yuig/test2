package ep;

import com.pinterest.api.model.BoardInviteFeed;
import com.pinterest.api.model.k8;
import com.pinterest.framework.multisection.datasource.pagedlist.p;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import pc.p0;
import pc.q0;
import x40.bd;
import x40.uc;

/* loaded from: classes3.dex */
public final class d extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final d f59865j = new d(0);

    /* renamed from: k, reason: collision with root package name */
    public static final d f59866k = new d(1);

    /* renamed from: l, reason: collision with root package name */
    public static final d f59867l = new d(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f59868i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i13) {
        super(1);
        this.f59868i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f59868i) {
            case 0:
                BoardInviteFeed it = (BoardInviteFeed) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                ArrayList arrayList = new ArrayList();
                Intrinsics.checkNotNullExpressionValue(it.q(), "getItems(...)");
                if (!r1.isEmpty()) {
                    for (k8 k8Var : it.q()) {
                        Intrinsics.f(k8Var);
                        arrayList.add(new pb2.a(k8Var));
                    }
                }
                return CollectionsKt.F0(arrayList);
            case 1:
                p requestState = (p) obj;
                Intrinsics.checkNotNullParameter(requestState, "requestState");
                q0 q0Var = new q0(Integer.valueOf(requestState.f49152a));
                String str = requestState.f49153b;
                return new bd(q0Var, str == null ? p0.f99597a : new q0(str));
            default:
                z40.f item = (z40.f) obj;
                Intrinsics.checkNotNullParameter(item, "item");
                return ((uc) item).f133466c;
        }
    }
}
