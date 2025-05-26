package wo0;

import androidx.recyclerview.widget.b2;
import com.pinterest.api.model.hk0;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.xk;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import lh0.a4;
import lh0.g1;
import lh0.x;
import lh0.z3;
import xo0.k;

/* loaded from: classes5.dex */
public final class d extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f130642i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e f130643j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(e eVar, int i13) {
        super(1);
        this.f130642i = i13;
        this.f130643j = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LinkedHashMap linkedHashMap;
        int i13 = this.f130642i;
        e eVar = this.f130643j;
        switch (i13) {
            case 0:
                xk bubble = (xk) obj;
                Intrinsics.checkNotNullParameter(bubble, "bubble");
                eVar.E = bubble;
                uk1.d presenterPinalytics = eVar.getPresenterPinalytics();
                i61.a aVar = presenterPinalytics instanceof i61.a ? (i61.a) presenterPinalytics : null;
                if (aVar != null && (linkedHashMap = aVar.f71626g) != null) {
                    linkedHashMap.put("story_category", String.valueOf(bubble.j()));
                }
                uo0.a aVar2 = (uo0.a) eVar.getView();
                String title = bubble.n();
                if (title == null) {
                    title = "";
                }
                k kVar = (k) aVar2;
                kVar.getClass();
                Intrinsics.checkNotNullParameter(title, "title");
                fo1.a i73 = kVar.i7();
                if (i73 != null) {
                    ((GestaltToolbarImpl) i73).c0(title, fm1.c.INVISIBLE);
                }
                Integer j13 = bubble.j();
                hk0 hk0Var = hk0.SHOPPING_SPOTLIGHT;
                if (j13.intValue() == hk0Var.getValue()) {
                    x xVar = eVar.C;
                    xVar.getClass();
                    z3 z3Var = a4.f83298b;
                    g1 g1Var = (g1) xVar.f83502a;
                    if (g1Var.o("android_sharing_on_shopping_spotlight", "enabled", z3Var) || g1Var.l("android_sharing_on_shopping_spotlight")) {
                        ((k) ((uo0.a) eVar.getView())).g9(true);
                        ((k) ((uo0.a) eVar.getView())).h9(true);
                        e.V3(eVar);
                        break;
                    }
                }
                if (bubble.j().intValue() != hk0.STYLE_PIVOT.getValue()) {
                    if (bubble.j().intValue() != hk0Var.getValue()) {
                        ((k) ((uo0.a) eVar.getView())).g9(true);
                        ((k) ((uo0.a) eVar.getView())).h9(false);
                    }
                }
                ((k) ((uo0.a) eVar.getView())).g9(false);
                ((k) ((uo0.a) eVar.getView())).h9(true);
                e.V3(eVar);
                break;
            default:
                wy0 user = (wy0) obj;
                Intrinsics.checkNotNullParameter(user, "user");
                vo0.d dVar = new vo0.d(user);
                if (eVar.f109906r.size() > 0 && !eVar.w3(dVar.getUid())) {
                    boolean d2 = eVar.d2(1);
                    ArrayList arrayList = eVar.f109906r;
                    if (d2 || 1 == arrayList.size()) {
                        arrayList.add(1, dVar);
                        ((b2) eVar.getAdapter()).j(1);
                    }
                }
                eVar.F = dVar;
                break;
        }
        return Unit.f80348a;
    }
}
