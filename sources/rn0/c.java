package rn0;

import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.g0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import u50.h0;
import u50.i0;

/* loaded from: classes5.dex */
public final class c extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final c f108824j = new c(0);

    /* renamed from: k, reason: collision with root package name */
    public static final c f108825k = new c(1);

    /* renamed from: l, reason: collision with root package name */
    public static final c f108826l = new c(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f108827i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i13) {
        super(1);
        this.f108827i = i13;
    }

    public final ao1.b b(ao1.b displayState) {
        h0 helperText = h0.f120562a;
        switch (this.f108827i) {
            case 1:
                Intrinsics.checkNotNullParameter(displayState, "state");
                Intrinsics.checkNotNullParameter(displayState, "displayState");
                i0 i0Var = displayState.f20030a;
                Intrinsics.checkNotNullParameter(helperText, "helperText");
                yn1.f variant = yn1.f.DEFAULT;
                Intrinsics.checkNotNullParameter(variant, "variant");
                return new ao1.b(i0Var, displayState.f20031b, helperText, displayState.f20033d, displayState.f20034e, variant, displayState.f20036g, displayState.f20037h, displayState.f20038i, displayState.f20039j, displayState.f20040k, displayState.f20041l, displayState.f20042m, displayState.f20043n, displayState.f20044o, displayState.f20045p, displayState.f20046q, displayState.f20047r, displayState.f20048s, displayState.f20049t, displayState.f20050u, displayState.f20051v);
            default:
                Intrinsics.checkNotNullParameter(displayState, "state");
                Intrinsics.checkNotNullParameter(displayState, "displayState");
                i0 i0Var2 = displayState.f20030a;
                Intrinsics.checkNotNullParameter(helperText, "helperText");
                return new ao1.b(i0Var2, displayState.f20031b, helperText, displayState.f20033d, displayState.f20034e, displayState.f20035f, displayState.f20036g, displayState.f20037h, displayState.f20038i, 50, displayState.f20040k, displayState.f20041l, displayState.f20042m, displayState.f20043n, displayState.f20044o, displayState.f20045p, displayState.f20046q, displayState.f20047r, displayState.f20048s, displayState.f20049t, displayState.f20050u, displayState.f20051v);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f108827i) {
            case 0:
                Navigation navigation = (Navigation) obj;
                Intrinsics.checkNotNullParameter(navigation, "navigation");
                ScreenLocation location = navigation.getF49939a();
                Intrinsics.checkNotNullExpressionValue(location, "getLocation(...)");
                Intrinsics.checkNotNullParameter(location, "location");
                el2.a entries = g70.b.getEntries();
                ArrayList arrayList = new ArrayList(g0.q(entries, 10));
                Iterator<E> it = entries.iterator();
                while (it.hasNext()) {
                    arrayList.add(((g70.b) it.next()).getScreenLocation());
                }
                break;
        }
        return b((ao1.b) obj);
    }
}
