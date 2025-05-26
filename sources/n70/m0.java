package n70;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f89626i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ m f89627j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(m mVar, int i13) {
        super(1);
        this.f89626i = i13;
        this.f89627j = mVar;
    }

    public final a b(a displayState) {
        int i13 = this.f89626i;
        m mVar = this.f89627j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(displayState, "displayState");
                Map map = displayState.f89595a;
                map.remove(((f) mVar).f89608a.getId());
                return a.e(displayState, map, null, null, null, null, 30);
            case 1:
                Intrinsics.checkNotNullParameter(displayState, "displayState");
                Map map2 = displayState.f89595a;
                f fVar = (f) mVar;
                String id3 = fVar.f89608a.getId();
                Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
                map2.put(id3, null);
                return a.e(displayState, map2, null, null, null, fVar.f89608a, 14);
            default:
                Intrinsics.checkNotNullParameter(displayState, "displayState");
                Map map3 = displayState.f89595a;
                i iVar = (i) mVar;
                map3.put(iVar.f89617b, iVar.f89616a);
                return a.e(displayState, map3, null, null, null, null, 30);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f89626i) {
        }
        return b((a) obj);
    }
}
