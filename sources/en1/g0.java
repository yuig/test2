package en1;

import com.pinterest.gestalt.searchGuide.GestaltSearchGuide;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ b0 f59669i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ GestaltSearchGuide f59670j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(b0 b0Var, GestaltSearchGuide gestaltSearchGuide) {
        super(1);
        this.f59669i = b0Var;
        this.f59670j = gestaltSearchGuide;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        sl1.i it = (sl1.i) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        e eVar = (e) this.f59669i;
        List list = eVar.f59664a;
        sl1.f fVar = sl1.f.TWO;
        fm1.c cVar = fm1.c.VISIBLE;
        b bVar = this.f59670j.f49547c;
        if (bVar != null) {
            return sl1.i.e(it, list, eVar.f59665b, bVar.getValue(), false, fVar, cVar, 200);
        }
        Intrinsics.r("avatarGroupSize");
        throw null;
    }
}
