package u52;

import com.pinterest.api.model.f30;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final f f120687j = new f(0);

    /* renamed from: k, reason: collision with root package name */
    public static final f f120688k = new f(1);

    /* renamed from: l, reason: collision with root package name */
    public static final f f120689l = new f(2);

    /* renamed from: m, reason: collision with root package name */
    public static final f f120690m = new f(3);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f120691i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i13) {
        super(1);
        this.f120691i = i13;
    }

    public final x b(x it) {
        q qVar = q.f120727a;
        switch (this.f120691i) {
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return x.e(it, null, null, null, qVar, 7);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f120691i) {
            case 0:
                x it = (x) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                w wVar = it.f120744b;
                Intrinsics.g(wVar, "null cannot be cast to non-null type com.pinterest.share.board.video.templategallery.PinsState.Loaded");
                List list = ((v) wVar).f120740a;
                ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((f30) it2.next()).getId());
                }
                break;
        }
        return b((x) obj);
    }
}
