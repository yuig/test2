package nm1;

import android.view.View;
import com.pinterest.gestalt.headerBar.GestaltHeaderBar;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f91446i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ GestaltHeaderBar f91447j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ r f91448k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(GestaltHeaderBar gestaltHeaderBar, r rVar, int i13) {
        super(1);
        this.f91446i = i13;
        this.f91447j = gestaltHeaderBar;
        this.f91448k = rVar;
    }

    public final void b(l startActions) {
        int i13 = this.f91446i;
        GestaltHeaderBar gestaltHeaderBar = this.f91447j;
        r rVar = this.f91448k;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(startActions, "startActions");
                GestaltHeaderBar.X(gestaltHeaderBar, rVar.f91475e, gestaltHeaderBar);
                List list = rVar.f91475e;
                list.clear();
                List list2 = rVar.f91474d;
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    gestaltHeaderBar.removeView((View) it.next());
                }
                list2.clear();
                GestaltHeaderBar.T(gestaltHeaderBar, list2, startActions, true);
                GestaltHeaderBar.Z(gestaltHeaderBar, list, startActions, true);
                break;
            default:
                Intrinsics.checkNotNullParameter(startActions, "endActions");
                GestaltHeaderBar.X(gestaltHeaderBar, rVar.f91477g, gestaltHeaderBar);
                List list3 = rVar.f91477g;
                list3.clear();
                List list4 = rVar.f91476f;
                Iterator it2 = list4.iterator();
                while (it2.hasNext()) {
                    gestaltHeaderBar.removeView((View) it2.next());
                }
                list4.clear();
                boolean z13 = startActions instanceof k;
                f fVar = f.f91423a;
                GestaltHeaderBar.T(gestaltHeaderBar, list4, z13 ? fVar : startActions, false);
                if (z13) {
                    startActions = fVar;
                }
                GestaltHeaderBar.Z(gestaltHeaderBar, list3, startActions, false);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f91446i) {
            case 0:
                b((l) obj);
                break;
            default:
                b((l) obj);
                break;
        }
        return Unit.f80348a;
    }
}
