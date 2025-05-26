package hl0;

import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import h32.d4;
import h32.h0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.g0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import wt1.c0;
import x40.b7;
import x40.c7;
import x40.f7;
import x40.g7;
import x40.h7;
import x40.i7;
import x40.j7;
import x40.k7;
import x40.l7;

/* loaded from: classes5.dex */
public final class i extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final i f69465j = new i(0);

    /* renamed from: k, reason: collision with root package name */
    public static final i f69466k = new i(1);

    /* renamed from: l, reason: collision with root package name */
    public static final i f69467l = new i(2);

    /* renamed from: m, reason: collision with root package name */
    public static final i f69468m = new i(3);

    /* renamed from: n, reason: collision with root package name */
    public static final i f69469n = new i(4);

    /* renamed from: o, reason: collision with root package name */
    public static final i f69470o = new i(5);

    /* renamed from: p, reason: collision with root package name */
    public static final i f69471p = new i(6);

    /* renamed from: q, reason: collision with root package name */
    public static final i f69472q = new i(7);

    /* renamed from: r, reason: collision with root package name */
    public static final i f69473r = new i(8);

    /* renamed from: s, reason: collision with root package name */
    public static final i f69474s = new i(9);

    /* renamed from: t, reason: collision with root package name */
    public static final i f69475t = new i(10);

    /* renamed from: u, reason: collision with root package name */
    public static final i f69476u = new i(11);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f69477i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i13) {
        super(1);
        this.f69477i = i13;
    }

    public final Boolean b(Navigation navigation) {
        switch (this.f69477i) {
            case 3:
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
                return Boolean.valueOf(CollectionsKt.J0(arrayList).contains(location));
            default:
                Intrinsics.checkNotNullParameter(navigation, "it");
                ScreenLocation location2 = navigation.getF49939a();
                Intrinsics.checkNotNullExpressionValue(location2, "getLocation(...)");
                Intrinsics.checkNotNullParameter(location2, "location");
                el2.a entries2 = g70.b.getEntries();
                ArrayList arrayList2 = new ArrayList(g0.q(entries2, 10));
                Iterator<E> it2 = entries2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((g70.b) it2.next()).getScreenLocation());
                }
                return Boolean.valueOf(CollectionsKt.J0(arrayList2).contains(location2));
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        b7 b7Var;
        c7 c7Var;
        i7 i7Var;
        List list;
        f7 f7Var;
        int i13 = this.f69477i;
        switch (i13) {
            case 0:
                pc.h response = (pc.h) obj;
                Intrinsics.checkNotNullParameter(response, "response");
                l7 l7Var = (l7) response.f99563c;
                ArrayList arrayList = null;
                if (l7Var != null && (b7Var = l7Var.f132705a) != null) {
                    Intrinsics.checkNotNullParameter(b7Var, "<this>");
                    k7 k7Var = b7Var instanceof k7 ? (k7) b7Var : null;
                    if (k7Var != null && (c7Var = k7Var.f132668e) != null) {
                        Intrinsics.checkNotNullParameter(c7Var, "<this>");
                        j7 j7Var = c7Var instanceof j7 ? (j7) c7Var : null;
                        if (j7Var != null && (i7Var = j7Var.f132594b) != null && (list = i7Var.f132543a) != null) {
                            ArrayList Q = CollectionsKt.Q(list);
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it = Q.iterator();
                            while (it.hasNext()) {
                                g7 g7Var = ((h7) it.next()).f132491a;
                                if (g7Var == null || (f7Var = g7Var.f132436e) == null) {
                                    f7Var = null;
                                } else {
                                    Intrinsics.checkNotNullParameter(f7Var, "<this>");
                                }
                                if (f7Var != null) {
                                    arrayList2.add(f7Var);
                                }
                            }
                            arrayList = arrayList2;
                        }
                    }
                }
                if (arrayList == null) {
                    break;
                }
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                c0 it2 = (c0) obj;
                switch (i13) {
                    case 4:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        break;
                }
            case 5:
                break;
            case 6:
                c0 it3 = (c0) obj;
                switch (i13) {
                    case 4:
                        Intrinsics.checkNotNullParameter(it3, "it");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it3, "it");
                        break;
                }
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                h0 update = (h0) obj;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                update.f67042a = d4.ACTION_SHEET;
                break;
            default:
                Navigation navigateToBoard = (Navigation) obj;
                Intrinsics.checkNotNullParameter(navigateToBoard, "$this$navigateToBoard");
                navigateToBoard.Y1("com.pinterest.EXTRA_BOARD_SPONSORED_PREVIEW_MODE", true);
                break;
        }
        return Unit.f80348a;
    }
}
