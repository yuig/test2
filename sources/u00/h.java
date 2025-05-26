package u00;

import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class h extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f119839i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Map f119840j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i13, Map map) {
        super(1);
        this.f119839i = i13;
        this.f119840j = map;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f119839i;
        Map map = this.f119840j;
        switch (i13) {
            case 0:
                wc.k cache = (wc.k) obj;
                Intrinsics.checkNotNullParameter(cache, "cache");
                return cache.c(CollectionsKt.F0(map.values()), wc.a.f129075b);
            default:
                dl1.s mergedModel = (dl1.s) obj;
                Intrinsics.checkNotNullParameter(mergedModel, "mergedModel");
                Object obj2 = map.get(mergedModel.getId());
                Intrinsics.f(obj2);
                return new Pair(obj2, mergedModel);
        }
    }
}
