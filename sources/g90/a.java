package g90;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final int f64503a;

    /* renamed from: b, reason: collision with root package name */
    public final List f64504b;

    /* renamed from: c, reason: collision with root package name */
    public final zy.a0 f64505c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f64506d;

    public a(int i13, List cutoutItems, zy.a0 pinalyticsState, boolean z13) {
        Intrinsics.checkNotNullParameter(cutoutItems, "cutoutItems");
        Intrinsics.checkNotNullParameter(pinalyticsState, "pinalyticsState");
        this.f64503a = i13;
        this.f64504b = cutoutItems;
        this.f64505c = pinalyticsState;
        this.f64506d = z13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    public static a e(a aVar, int i13, ArrayList arrayList, zy.a0 pinalyticsState, boolean z13, int i14) {
        if ((i14 & 1) != 0) {
            i13 = aVar.f64503a;
        }
        ArrayList cutoutItems = arrayList;
        if ((i14 & 2) != 0) {
            cutoutItems = aVar.f64504b;
        }
        if ((i14 & 4) != 0) {
            pinalyticsState = aVar.f64505c;
        }
        if ((i14 & 8) != 0) {
            z13 = aVar.f64506d;
        }
        aVar.getClass();
        Intrinsics.checkNotNullParameter(cutoutItems, "cutoutItems");
        Intrinsics.checkNotNullParameter(pinalyticsState, "pinalyticsState");
        return new a(i13, cutoutItems, pinalyticsState, z13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f64503a == aVar.f64503a && Intrinsics.d(this.f64504b, aVar.f64504b) && Intrinsics.d(this.f64505c, aVar.f64505c) && this.f64506d == aVar.f64506d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f64506d) + ((this.f64505c.hashCode() + ep.b.c(this.f64504b, Integer.hashCode(this.f64503a) * 31, 31)) * 31);
    }

    public final String toString() {
        return "CutoutCloseupDisplayState(initialPosition=" + this.f64503a + ", cutoutItems=" + this.f64504b + ", pinalyticsState=" + this.f64505c + ", loadingCutoutFailed=" + this.f64506d + ")";
    }

    public a() {
        this(0, q0.f80391a, new zy.a0(), false);
    }
}
