package xk1;

import androidx.recyclerview.widget.a0;
import com.pinterest.framework.multisection.datasource.pagedlist.r0;
import com.pinterest.framework.multisection.datasource.pagedlist.s;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kp.n;
import o82.c3;
import o82.u0;
import o82.y0;

/* loaded from: classes5.dex */
public final class a extends a0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f135178b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f135179c;

    /* renamed from: d, reason: collision with root package name */
    public final List f135180d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f135181e;

    public a(List oldList, List newList, Set forceInvalidateNewPositions) {
        this.f135178b = 2;
        Intrinsics.checkNotNullParameter(oldList, "oldList");
        Intrinsics.checkNotNullParameter(newList, "newList");
        Intrinsics.checkNotNullParameter(forceInvalidateNewPositions, "forceInvalidateNewPositions");
        this.f135180d = oldList;
        this.f135179c = newList;
        this.f135181e = forceInvalidateNewPositions;
    }

    @Override // androidx.recyclerview.widget.a0
    public final boolean a(int i13, int i14) {
        int i15 = this.f135178b;
        Boolean bool = null;
        Object obj = this.f135179c;
        List list = this.f135180d;
        Object obj2 = this.f135181e;
        switch (i15) {
            case 0:
                Object U = CollectionsKt.U(i13, ((c) obj2).f135191h);
                Object U2 = CollectionsKt.U(i14, list);
                wt1.a aVar = (wt1.a) obj;
                if (U != null && U2 != null) {
                    bool = Boolean.valueOf(aVar.z(U, U2));
                }
                if (bool != null) {
                    return bool.booleanValue();
                }
                return false;
            case 1:
                Object U3 = CollectionsKt.U(i13, ((s) obj2).f49180s);
                Object U4 = CollectionsKt.U(i14, list);
                wt1.a aVar2 = (wt1.a) obj;
                if (U3 != null && U4 != null) {
                    bool = Boolean.valueOf(aVar2.z(U3, U4));
                }
                if (bool != null) {
                    return bool.booleanValue();
                }
                return false;
            case 2:
                return Intrinsics.d(list.get(i13), ((List) obj).get(i14)) && !((Set) obj2).contains(Integer.valueOf(i14));
            default:
                o82.a aVar3 = ((c3) obj2).f93551a;
                u0 oldItem = (u0) list.get(i13);
                u0 newItem = (u0) ((List) obj).get(i14);
                switch (((n) aVar3).f80561a) {
                    case 0:
                        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                        Intrinsics.checkNotNullParameter(newItem, "newItem");
                        return Intrinsics.d(oldItem.f93721a, newItem.f93721a);
                    default:
                        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                        Intrinsics.checkNotNullParameter(newItem, "newItem");
                        return Intrinsics.d(oldItem.f93721a, newItem.f93721a);
                }
        }
    }

    @Override // androidx.recyclerview.widget.a0
    public final boolean c(int i13, int i14) {
        int i15 = this.f135178b;
        Boolean bool = null;
        Object obj = this.f135181e;
        Object obj2 = this.f135179c;
        List list = this.f135180d;
        switch (i15) {
            case 0:
                Object U = CollectionsKt.U(i13, ((c) obj).f135191h);
                Object U2 = CollectionsKt.U(i14, list);
                wt1.a aVar = (wt1.a) obj2;
                if (U != null && U2 != null) {
                    bool = Boolean.valueOf(aVar.y(U, U2));
                }
                if (bool != null) {
                    return bool.booleanValue();
                }
                return false;
            case 1:
                Object U3 = CollectionsKt.U(i13, ((s) obj).f49180s);
                Object U4 = CollectionsKt.U(i14, list);
                wt1.a aVar2 = (wt1.a) obj2;
                if (U3 != null && U4 != null) {
                    bool = Boolean.valueOf(aVar2.y(U3, U4));
                }
                if (bool != null) {
                    return bool.booleanValue();
                }
                return false;
            case 2:
                return Intrinsics.d(((dl1.s) list.get(i13)).getId(), ((dl1.s) ((List) obj2).get(i14)).getId());
            default:
                o82.a aVar3 = ((c3) obj).f93551a;
                u0 oldItem = (u0) list.get(i13);
                u0 newItem = (u0) ((List) obj2).get(i14);
                switch (((n) aVar3).f80561a) {
                    case 0:
                        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                        Intrinsics.checkNotNullParameter(newItem, "newItem");
                        if (oldItem.getClass() != newItem.getClass() || !Intrinsics.d(oldItem.f93723c, newItem.f93723c)) {
                            return false;
                        }
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                        Intrinsics.checkNotNullParameter(newItem, "newItem");
                        if (!Intrinsics.d(oldItem.getClass(), newItem.getClass()) || !Intrinsics.d(oldItem.f93723c, newItem.f93723c)) {
                            return false;
                        }
                        break;
                }
                return true;
        }
    }

    @Override // androidx.recyclerview.widget.a0
    public final int h() {
        int i13 = this.f135178b;
        List newItems = this.f135180d;
        Object obj = this.f135179c;
        switch (i13) {
            case 0:
                ((wt1.a) obj).getClass();
                Intrinsics.checkNotNullParameter(newItems, "newItems");
                break;
            case 1:
                ((wt1.a) obj).getClass();
                Intrinsics.checkNotNullParameter(newItems, "newItems");
                break;
        }
        return ((List) obj).size();
    }

    @Override // androidx.recyclerview.widget.a0
    public final int i() {
        int i13 = this.f135178b;
        Object obj = this.f135181e;
        Object obj2 = this.f135179c;
        List list = this.f135180d;
        switch (i13) {
            case 0:
                ArrayList oldItems = ((c) obj).f135191h;
                ((wt1.a) obj2).getClass();
                Intrinsics.checkNotNullParameter(oldItems, "oldItems");
                break;
            case 1:
                List oldItems2 = ((s) obj).f49180s;
                ((wt1.a) obj2).getClass();
                Intrinsics.checkNotNullParameter(oldItems2, "oldItems");
                break;
        }
        return list.size();
    }

    public a(y0 y0Var, c3 c3Var) {
        this.f135178b = 3;
        this.f135181e = c3Var;
        this.f135180d = y0Var.f93756a;
        this.f135179c = c3Var.f93555e.f93756a;
    }

    public a(wt1.a aVar, r0 r0Var, List list, int i13) {
        this.f135178b = i13;
        this.f135179c = aVar;
        this.f135181e = r0Var;
        this.f135180d = list;
    }
}
