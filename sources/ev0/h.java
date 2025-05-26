package ev0;

import av0.u;
import av0.w;
import com.pinterest.api.model.wy0;
import h32.u0;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import lh0.a4;
import lh0.s1;
import lh0.z3;

/* loaded from: classes5.dex */
public final class h extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f60256i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l f60257j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(l lVar, int i13) {
        super(1);
        this.f60256i = i13;
        this.f60257j = lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f60256i;
        l lVar = this.f60257j;
        switch (i13) {
            case 0:
                lVar.b6().q((Throwable) obj, "Failed to generate Adjusted Image for deleted board", tb0.p.IDEA_PINS_CREATION);
                break;
            default:
                u0 u0Var = u0.STORY_PIN_PUBLISH_BUTTON;
                HashMap hashMap = new HashMap();
                hashMap.put("has_internet", String.valueOf(qb0.d.f103396a.c()));
                Unit unit = Unit.f80348a;
                l.W8(lVar, u0Var, hashMap);
                av0.g gVar = lVar.N0;
                if (gVar != null) {
                    dv0.k kVar = (dv0.k) gVar;
                    if (!kVar.f56362u.isEmpty()) {
                        ((l) ((av0.d) kVar.getView())).X8(av0.p.f20517b);
                    } else {
                        z3 z3Var = a4.f83297a;
                        s1 s1Var = kVar.f56351j;
                        if (s1Var.a("disable_all", z3Var) || s1Var.a("disable_idea_pins", z3Var) || s1Var.a("disable_video", z3Var)) {
                            ((l) ((av0.d) kVar.getView())).X8(av0.q.f20518b);
                        } else {
                            wy0 f13 = ((b60.d) kVar.f56354m).f();
                            if (f13 != null) {
                                Integer n43 = f13.n4();
                                if (kVar.F3() && n43.intValue() >= 100) {
                                    ((l) ((av0.d) kVar.getView())).X8(w.f20524b);
                                }
                            }
                            if (kVar.F3()) {
                                ((l) ((av0.d) kVar.getView())).X8(u.f20522b);
                            } else {
                                kVar.B3(null);
                            }
                        }
                    }
                }
                break;
        }
        return Unit.f80348a;
    }
}
