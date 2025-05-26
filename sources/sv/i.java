package sv;

import com.pinterest.api.model.f30;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class i implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f115296a;

    /* renamed from: b, reason: collision with root package name */
    public final int f115297b;

    /* renamed from: c, reason: collision with root package name */
    public final List f115298c;

    /* renamed from: d, reason: collision with root package name */
    public final zy.a0 f115299d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f115300e;

    /* renamed from: f, reason: collision with root package name */
    public final f30 f115301f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f115302g;

    public i(boolean z13, int i13, List cutoutItems, zy.a0 pinalyticsState, boolean z14, f30 f30Var, boolean z15) {
        Intrinsics.checkNotNullParameter(cutoutItems, "cutoutItems");
        Intrinsics.checkNotNullParameter(pinalyticsState, "pinalyticsState");
        this.f115296a = z13;
        this.f115297b = i13;
        this.f115298c = cutoutItems;
        this.f115299d = pinalyticsState;
        this.f115300e = z14;
        this.f115301f = f30Var;
        this.f115302g = z15;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.List] */
    public static i e(i iVar, int i13, ArrayList arrayList, zy.a0 a0Var, boolean z13, f30 f30Var, boolean z14, int i14) {
        boolean z15 = (i14 & 1) != 0 ? iVar.f115296a : false;
        if ((i14 & 2) != 0) {
            i13 = iVar.f115297b;
        }
        int i15 = i13;
        ArrayList arrayList2 = arrayList;
        if ((i14 & 4) != 0) {
            arrayList2 = iVar.f115298c;
        }
        ArrayList cutoutItems = arrayList2;
        if ((i14 & 8) != 0) {
            a0Var = iVar.f115299d;
        }
        zy.a0 pinalyticsState = a0Var;
        if ((i14 & 16) != 0) {
            z13 = iVar.f115300e;
        }
        boolean z16 = z13;
        if ((i14 & 32) != 0) {
            f30Var = iVar.f115301f;
        }
        f30 f30Var2 = f30Var;
        if ((i14 & 64) != 0) {
            z14 = iVar.f115302g;
        }
        iVar.getClass();
        Intrinsics.checkNotNullParameter(cutoutItems, "cutoutItems");
        Intrinsics.checkNotNullParameter(pinalyticsState, "pinalyticsState");
        return new i(z15, i15, cutoutItems, pinalyticsState, z16, f30Var2, z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f115296a == iVar.f115296a && this.f115297b == iVar.f115297b && Intrinsics.d(this.f115298c, iVar.f115298c) && Intrinsics.d(this.f115299d, iVar.f115299d) && this.f115300e == iVar.f115300e && Intrinsics.d(this.f115301f, iVar.f115301f) && this.f115302g == iVar.f115302g;
    }

    public final int hashCode() {
        int e13 = ep.b.e(this.f115300e, (this.f115299d.hashCode() + ep.b.c(this.f115298c, ep.b.b(this.f115297b, Boolean.hashCode(this.f115296a) * 31, 31), 31)) * 31, 31);
        f30 f30Var = this.f115301f;
        return Boolean.hashCode(this.f115302g) + ((e13 + (f30Var == null ? 0 : f30Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("HeroCutoutDisplayState(isLoading=");
        sb3.append(this.f115296a);
        sb3.append(", initialPosition=");
        sb3.append(this.f115297b);
        sb3.append(", cutoutItems=");
        sb3.append(this.f115298c);
        sb3.append(", pinalyticsState=");
        sb3.append(this.f115299d);
        sb3.append(", isSingleDestination=");
        sb3.append(this.f115300e);
        sb3.append(", collagePin=");
        sb3.append(this.f115301f);
        sb3.append(", loadingCutoutFailed=");
        return a.a.r(sb3, this.f115302g, ")");
    }

    public i() {
        this(true, 0, q0.f80391a, new zy.a0(), false, null, false);
    }
}
