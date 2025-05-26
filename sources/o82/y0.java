package o82;

import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class y0 implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final List f93756a;

    /* renamed from: b, reason: collision with root package name */
    public final kg.q f93757b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f93758c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f93759d;

    /* renamed from: e, reason: collision with root package name */
    public final int f93760e;

    public y0(List items, kg.q loadingState, boolean z13) {
        boolean z14;
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(loadingState, "loadingState");
        this.f93756a = items;
        this.f93757b = loadingState;
        this.f93758c = z13;
        if ((loadingState instanceof v) || Intrinsics.d(loadingState, w.f93734e) || Intrinsics.d(loadingState, u.f93720e)) {
            z14 = false;
        } else {
            if (!(loadingState instanceof t) && !(loadingState instanceof s)) {
                throw new NoWhenBranchMatchedException();
            }
            z14 = items.isEmpty();
        }
        this.f93759d = z14;
        this.f93760e = items.size();
    }

    public static y0 e(List items, kg.q loadingState, boolean z13) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(loadingState, "loadingState");
        return new y0(items, loadingState, z13);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    public static /* synthetic */ y0 f(y0 y0Var, ArrayList arrayList, kg.q qVar, int i13) {
        ArrayList arrayList2 = arrayList;
        if ((i13 & 1) != 0) {
            arrayList2 = y0Var.f93756a;
        }
        if ((i13 & 2) != 0) {
            qVar = y0Var.f93757b;
        }
        boolean z13 = (i13 & 4) != 0 ? y0Var.f93758c : false;
        y0Var.getClass();
        return e(arrayList2, qVar, z13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return Intrinsics.d(this.f93756a, y0Var.f93756a) && Intrinsics.d(this.f93757b, y0Var.f93757b) && this.f93758c == y0Var.f93758c;
    }

    public final boolean g() {
        return this.f93758c;
    }

    public final List h() {
        return this.f93756a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f93758c) + ((this.f93757b.hashCode() + (this.f93756a.hashCode() * 31)) * 31);
    }

    public final kg.q i() {
        return this.f93757b;
    }

    public final boolean j() {
        return this.f93759d;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SectionDisplayState(items=");
        sb3.append(this.f93756a);
        sb3.append(", loadingState=");
        sb3.append(this.f93757b);
        sb3.append(", hasMore=");
        return a.a.r(sb3, this.f93758c, ")");
    }

    public y0(List list, v vVar, boolean z13, int i13) {
        this((i13 & 1) != 0 ? kotlin.collections.q0.f80391a : list, (i13 & 2) != 0 ? v.f93728e : vVar, (i13 & 4) != 0 ? false : z13);
    }
}
