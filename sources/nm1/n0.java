package nm1;

import android.view.View;
import com.pinterest.gestalt.headerBar.GestaltHeaderBar;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f91451i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ GestaltHeaderBar f91452j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ s f91453k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0(GestaltHeaderBar gestaltHeaderBar, s sVar, int i13) {
        super(1);
        this.f91451i = i13;
        this.f91452j = gestaltHeaderBar;
        this.f91453k = sVar;
    }

    public final void b(l startActions) {
        int i13 = this.f91451i;
        GestaltHeaderBar gestaltHeaderBar = this.f91452j;
        s sVar = this.f91453k;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(startActions, "startActions");
                GestaltHeaderBar.X(gestaltHeaderBar, sVar.f91482b, gestaltHeaderBar);
                List list = sVar.f91482b;
                list.clear();
                List list2 = sVar.f91481a;
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
                GestaltHeaderBar.X(gestaltHeaderBar, sVar.f91486f, gestaltHeaderBar);
                List list3 = sVar.f91486f;
                list3.clear();
                List list4 = sVar.f91485e;
                Iterator it2 = list4.iterator();
                while (it2.hasNext()) {
                    gestaltHeaderBar.removeView((View) it2.next());
                }
                list4.clear();
                GestaltHeaderBar.T(gestaltHeaderBar, list4, startActions, false);
                GestaltHeaderBar.Z(gestaltHeaderBar, list3, startActions, false);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f91451i) {
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
