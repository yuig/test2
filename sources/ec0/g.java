package ec0;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.avatargroup.GestaltAvatarGroup;
import dc0.k;
import dc0.o;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import yl1.l;

/* loaded from: classes5.dex */
public final class g extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f58383i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ o f58384j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(o oVar, int i13) {
        super(1);
        this.f58383i = i13;
        this.f58384j = oVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        sl1.h hVar;
        List list;
        int i13 = this.f58383i;
        o oVar = this.f58384j;
        switch (i13) {
            case 0:
                sl1.i it = (sl1.i) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                fm1.c Z = d7.b.Z(oVar.f54340d != null);
                k kVar = oVar.f54340d;
                if (kVar == null || (hVar = kVar.f54326b) == null) {
                    hVar = GestaltAvatarGroup.f49252f;
                }
                sl1.h hVar2 = hVar;
                if (kVar == null || (list = kVar.f54325a) == null) {
                    list = q0.f80391a;
                }
                return sl1.i.e(it, list, 0, hVar2, false, sl1.f.THREE, Z, RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_STORY_PIN);
            default:
                l bind = (l) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.e(d7.b.Z(oVar.f54360x));
                return Unit.f80348a;
        }
    }
}
