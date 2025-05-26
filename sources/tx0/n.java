package tx0;

import com.pinterest.api.model.dh;
import com.pinterest.api.model.qx;
import com.pinterest.feature.newshub.model.NewsHubItemFeed;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.g0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o82.l0;

/* loaded from: classes5.dex */
public final class n extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final n f119665j = new n(0);

    /* renamed from: k, reason: collision with root package name */
    public static final n f119666k = new n(1);

    /* renamed from: l, reason: collision with root package name */
    public static final n f119667l = new n(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f119668i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(int i13) {
        super(1);
        this.f119668i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f119668i;
        switch (i13) {
            case 0:
                q vmState = (q) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(vmState, "vmState");
                        return vmState.f119669a;
                    default:
                        Intrinsics.checkNotNullParameter(vmState, "vmState");
                        return vmState.f119669a;
                }
            case 1:
                q vmState2 = (q) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(vmState2, "vmState");
                        return vmState2.f119669a;
                    default:
                        Intrinsics.checkNotNullParameter(vmState2, "vmState");
                        return vmState2.f119669a;
                }
            default:
                NewsHubItemFeed newsHubItemFeed = (NewsHubItemFeed) obj;
                Intrinsics.checkNotNullParameter(newsHubItemFeed, "newsHubItemFeed");
                List q13 = newsHubItemFeed.q();
                Intrinsics.checkNotNullExpressionValue(q13, "getItems(...)");
                List<qx> list = q13;
                ArrayList arrayList = new ArrayList(g0.q(list, 10));
                for (qx qxVar : list) {
                    Intrinsics.f(qxVar);
                    dh g13 = qxVar.g();
                    Intrinsics.checkNotNullExpressionValue(g13, "getDisplayMode(...)");
                    arrayList.add(new q(qxVar, g13));
                }
                return new l0(arrayList, newsHubItemFeed.f105383c);
        }
    }
}
