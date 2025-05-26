package nm1;

import android.view.View;
import com.pinterest.gestalt.headerBar.GestaltHeaderBar;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f91458i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ GestaltHeaderBar f91459j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ s f91460k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f91461l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0(GestaltHeaderBar gestaltHeaderBar, s sVar, kotlin.jvm.internal.f0 f0Var, int i13) {
        super(1);
        this.f91458i = i13;
        this.f91459j = gestaltHeaderBar;
        this.f91460k = sVar;
        this.f91461l = f0Var;
    }

    public final void b(u50.i0 it) {
        int i13 = this.f91458i;
        kotlin.jvm.internal.f0 f0Var = this.f91461l;
        GestaltHeaderBar gestaltHeaderBar = this.f91459j;
        s sVar = this.f91460k;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                GestaltHeaderBar.X(gestaltHeaderBar, sVar.f91484d, gestaltHeaderBar);
                sVar.f91484d.clear();
                List list = sVar.f91483c;
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    gestaltHeaderBar.removeView((View) it2.next());
                }
                list.clear();
                f0Var.f80424a = true;
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                GestaltHeaderBar.X(gestaltHeaderBar, sVar.f91484d, gestaltHeaderBar);
                sVar.f91484d.clear();
                List list2 = sVar.f91483c;
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    gestaltHeaderBar.removeView((View) it3.next());
                }
                list2.clear();
                f0Var.f80424a = true;
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f91458i) {
            case 0:
                b((u50.i0) obj);
                break;
            default:
                b((u50.i0) obj);
                break;
        }
        return Unit.f80348a;
    }
}
