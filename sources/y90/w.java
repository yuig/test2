package y90;

import android.view.View;
import android.view.ViewStub;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class w extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f138262i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f138263j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(Object obj, int i13) {
        super(0);
        this.f138262i = i13;
        this.f138263j = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f138262i;
        Object obj = this.f138263j;
        switch (i13) {
            case 0:
                switch (i13) {
                    case 0:
                        ((ek.e) obj).f59131h.performClick();
                        break;
                    default:
                        ((k1) obj).f138199e.n();
                        break;
                }
                return Unit.f80348a;
            case 1:
                return (Fragment) obj;
            case 2:
                return (androidx.lifecycle.u1) ((Function0) obj).invoke();
            case 3:
                return ((androidx.lifecycle.u1) ((xk2.k) obj).getValue()).getViewModelStore();
            case 4:
                List list = ((l82.c0) obj).f82214c;
                ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new m0((zy.k0) it.next()));
                }
                return arrayList;
            case 5:
                switch (i13) {
                    case 0:
                        ((ek.e) obj).f59131h.performClick();
                        break;
                    default:
                        ((k1) obj).f138199e.n();
                        break;
                }
                return Unit.f80348a;
            default:
                x72.b bVar = x72.b.f134124d;
                if (bVar == null) {
                    Intrinsics.r("current");
                    throw null;
                }
                View findViewById = ((View) obj).findViewById(x1.effect_item_scene_view_stub);
                Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
                return bVar.p((ViewStub) findViewById);
        }
    }
}
