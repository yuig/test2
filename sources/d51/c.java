package d51;

import com.pinterest.api.model.BoardInviteFeed;
import com.pinterest.api.model.k8;
import com.pinterest.api.model.v7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.g0;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final c f53687j = new c(0);

    /* renamed from: k, reason: collision with root package name */
    public static final c f53688k = new c(1);

    /* renamed from: l, reason: collision with root package name */
    public static final c f53689l = new c(2);

    /* renamed from: m, reason: collision with root package name */
    public static final c f53690m = new c(3);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f53691i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i13) {
        super(1);
        this.f53691i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f53691i) {
            case 0:
                BoardInviteFeed feed = (BoardInviteFeed) obj;
                Intrinsics.checkNotNullParameter(feed, "feed");
                ArrayList arrayList = new ArrayList();
                List q13 = feed.q();
                Intrinsics.checkNotNullExpressionValue(q13, "getItems(...)");
                if (!q13.isEmpty()) {
                    Iterator it = CollectionsKt.q0(q13).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            k8 k8Var = (k8) it.next();
                            if (!Intrinsics.d(k8Var.f39332b, "0")) {
                                arrayList.add(k8Var);
                            }
                        }
                    }
                }
                return CollectionsKt.F0(arrayList);
            case 1:
                return Unit.f80348a;
            case 2:
                i51.d it2 = (i51.d) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return String.valueOf(it2.c().getValue());
            default:
                tt1.a response = (tt1.a) obj;
                Intrinsics.checkNotNullParameter(response, "response");
                Iterable iterable = (List) response.c();
                if (iterable == null) {
                    iterable = q0.f80391a;
                }
                Iterable iterable2 = iterable;
                ArrayList arrayList2 = new ArrayList(g0.q(iterable2, 10));
                Iterator it3 = iterable2.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(new o((v7) it3.next(), false));
                }
                return arrayList2;
        }
    }
}
