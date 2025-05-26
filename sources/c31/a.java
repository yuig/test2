package c31;

import kh2.a1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final int f25562a;

    /* renamed from: b, reason: collision with root package name */
    public final b22.l f25563b;

    /* renamed from: c, reason: collision with root package name */
    public final f31.j f25564c;

    /* renamed from: d, reason: collision with root package name */
    public final o82.a0 f25565d;

    /* renamed from: e, reason: collision with root package name */
    public final a1 f25566e;

    /* renamed from: f, reason: collision with root package name */
    public final zy.a0 f25567f;

    /* renamed from: g, reason: collision with root package name */
    public final zy.b f25568g;

    public a(int i13, b22.l pinsViewType, f31.j searchBarDisplayState, o82.a0 listDisplayState, a1 allPinsOfflineView, zy.a0 pinalyticsDisplayState, zy.b impressionDisplayState) {
        Intrinsics.checkNotNullParameter(pinsViewType, "pinsViewType");
        Intrinsics.checkNotNullParameter(searchBarDisplayState, "searchBarDisplayState");
        Intrinsics.checkNotNullParameter(listDisplayState, "listDisplayState");
        Intrinsics.checkNotNullParameter(allPinsOfflineView, "allPinsOfflineView");
        Intrinsics.checkNotNullParameter(pinalyticsDisplayState, "pinalyticsDisplayState");
        Intrinsics.checkNotNullParameter(impressionDisplayState, "impressionDisplayState");
        this.f25562a = i13;
        this.f25563b = pinsViewType;
        this.f25564c = searchBarDisplayState;
        this.f25565d = listDisplayState;
        this.f25566e = allPinsOfflineView;
        this.f25567f = pinalyticsDisplayState;
        this.f25568g = impressionDisplayState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v2, types: [kh2.a1] */
    public static a e(a aVar, int i13, b22.l lVar, f31.j jVar, o82.a0 a0Var, w wVar, zy.a0 a0Var2, int i14) {
        if ((i14 & 1) != 0) {
            i13 = aVar.f25562a;
        }
        int i15 = i13;
        if ((i14 & 2) != 0) {
            lVar = aVar.f25563b;
        }
        b22.l pinsViewType = lVar;
        if ((i14 & 4) != 0) {
            jVar = aVar.f25564c;
        }
        f31.j searchBarDisplayState = jVar;
        if ((i14 & 8) != 0) {
            a0Var = aVar.f25565d;
        }
        o82.a0 listDisplayState = a0Var;
        w wVar2 = wVar;
        if ((i14 & 16) != 0) {
            wVar2 = aVar.f25566e;
        }
        w allPinsOfflineView = wVar2;
        if ((i14 & 32) != 0) {
            a0Var2 = aVar.f25567f;
        }
        zy.a0 pinalyticsDisplayState = a0Var2;
        zy.b impressionDisplayState = aVar.f25568g;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(pinsViewType, "pinsViewType");
        Intrinsics.checkNotNullParameter(searchBarDisplayState, "searchBarDisplayState");
        Intrinsics.checkNotNullParameter(listDisplayState, "listDisplayState");
        Intrinsics.checkNotNullParameter(allPinsOfflineView, "allPinsOfflineView");
        Intrinsics.checkNotNullParameter(pinalyticsDisplayState, "pinalyticsDisplayState");
        Intrinsics.checkNotNullParameter(impressionDisplayState, "impressionDisplayState");
        return new a(i15, pinsViewType, searchBarDisplayState, listDisplayState, allPinsOfflineView, pinalyticsDisplayState, impressionDisplayState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f25562a == aVar.f25562a && this.f25563b == aVar.f25563b && Intrinsics.d(this.f25564c, aVar.f25564c) && Intrinsics.d(this.f25565d, aVar.f25565d) && Intrinsics.d(this.f25566e, aVar.f25566e) && Intrinsics.d(this.f25567f, aVar.f25567f) && Intrinsics.d(this.f25568g, aVar.f25568g);
    }

    public final int f() {
        return this.f25562a;
    }

    public final zy.a0 g() {
        return this.f25567f;
    }

    public final int hashCode() {
        int hashCode = (this.f25567f.hashCode() + ((this.f25566e.hashCode() + ep.b.c(this.f25565d.f93524a, (this.f25564c.hashCode() + ((this.f25563b.hashCode() + (Integer.hashCode(this.f25562a) * 31)) * 31)) * 31, 31)) * 31)) * 31;
        this.f25568g.getClass();
        return hashCode + 172602875;
    }

    public final String toString() {
        return "AllPinsDisplayState(columnCount=" + this.f25562a + ", pinsViewType=" + this.f25563b + ", searchBarDisplayState=" + this.f25564c + ", listDisplayState=" + this.f25565d + ", allPinsOfflineView=" + this.f25566e + ", pinalyticsDisplayState=" + this.f25567f + ", impressionDisplayState=" + this.f25568g + ")";
    }

    public /* synthetic */ a(f31.j jVar, o82.a0 a0Var, zy.a0 a0Var2, int i13) {
        this(2, b22.l.DEFAULT, (i13 & 4) != 0 ? f31.f.f61000a : jVar, (i13 & 8) != 0 ? new o82.a0() : a0Var, w.f25626c, (i13 & 32) != 0 ? new zy.a0() : a0Var2, zy.b.f143058a);
    }
}
