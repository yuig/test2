package em0;

import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.screens.v;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.collections.g0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import m60.x0;

/* loaded from: classes5.dex */
public final class c extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final c f59585j = new c(0);

    /* renamed from: k, reason: collision with root package name */
    public static final c f59586k = new c(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f59587i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i13) {
        super(1);
        this.f59587i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f59587i) {
            case 0:
                Navigation it = (Navigation) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                ScreenLocation location = it.getF49939a();
                Intrinsics.checkNotNullExpressionValue(location, "getLocation(...)");
                Intrinsics.checkNotNullParameter(location, "location");
                el2.a entries = g70.b.getEntries();
                ArrayList arrayList = new ArrayList(g0.q(entries, 10));
                Iterator<E> it2 = entries.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((g70.b) it2.next()).getScreenLocation());
                }
                return Boolean.valueOf(CollectionsKt.J0(arrayList).contains(location) || Intrinsics.d(it.getF49939a(), (ScreenLocation) v.f51438a.getValue()));
            default:
                yl1.b state = (yl1.b) obj;
                Intrinsics.checkNotNullParameter(state, "state");
                return yl1.b.f(state, bs1.c.j2(new String[0], x0.done), false, fm1.c.VISIBLE, null, null, null, null, null, 0, null, 1016);
        }
    }
}
