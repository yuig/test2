package r70;

import h32.u0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import rm1.q;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final u70.a f106380a;

    /* renamed from: b, reason: collision with root package name */
    public final int f106381b;

    /* renamed from: c, reason: collision with root package name */
    public final int f106382c;

    /* renamed from: d, reason: collision with root package name */
    public final u0 f106383d;

    /* renamed from: e, reason: collision with root package name */
    public final int f106384e;

    /* renamed from: f, reason: collision with root package name */
    public final Function0 f106385f;

    /* renamed from: g, reason: collision with root package name */
    public final int f106386g;

    /* renamed from: h, reason: collision with root package name */
    public final Function0 f106387h;

    /* renamed from: i, reason: collision with root package name */
    public final Function0 f106388i;

    /* renamed from: j, reason: collision with root package name */
    public final int f106389j;

    /* renamed from: k, reason: collision with root package name */
    public final Integer f106390k;

    /* renamed from: l, reason: collision with root package name */
    public final q f106391l;

    /* renamed from: m, reason: collision with root package name */
    public final q f106392m;

    public i(u70.a type, int i13, int i14, u0 elementType, int i15, Function0 navigation, int i16, int i17, q unselectedIcon, q selectedIcon) {
        d shouldShowEmptyBadge = d.f106363m;
        d onTabSelectedListener = d.f106364n;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(elementType, "elementType");
        Intrinsics.checkNotNullParameter(navigation, "navigation");
        Intrinsics.checkNotNullParameter(shouldShowEmptyBadge, "shouldShowEmptyBadge");
        Intrinsics.checkNotNullParameter(onTabSelectedListener, "onTabSelectedListener");
        Intrinsics.checkNotNullParameter(unselectedIcon, "unselectedIcon");
        Intrinsics.checkNotNullParameter(selectedIcon, "selectedIcon");
        this.f106380a = type;
        this.f106381b = i13;
        this.f106382c = i14;
        this.f106383d = elementType;
        this.f106384e = i15;
        this.f106385f = navigation;
        this.f106386g = i16;
        this.f106387h = shouldShowEmptyBadge;
        this.f106388i = onTabSelectedListener;
        this.f106389j = i17;
        this.f106390k = null;
        this.f106391l = unselectedIcon;
        this.f106392m = selectedIcon;
    }

    public final int a() {
        return this.f106382c;
    }

    public final int b() {
        return this.f106381b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f106380a == iVar.f106380a && this.f106381b == iVar.f106381b && this.f106382c == iVar.f106382c && this.f106383d == iVar.f106383d && this.f106384e == iVar.f106384e && Intrinsics.d(this.f106385f, iVar.f106385f) && this.f106386g == iVar.f106386g && Intrinsics.d(this.f106387h, iVar.f106387h) && Intrinsics.d(this.f106388i, iVar.f106388i) && this.f106389j == iVar.f106389j && Intrinsics.d(this.f106390k, iVar.f106390k) && this.f106391l == iVar.f106391l && this.f106392m == iVar.f106392m;
    }

    public final int hashCode() {
        int b13 = ep.b.b(this.f106389j, d7.g.b(this.f106388i, d7.g.b(this.f106387h, ep.b.b(this.f106386g, d7.g.b(this.f106385f, ep.b.b(this.f106384e, (this.f106383d.hashCode() + ep.b.b(this.f106382c, ep.b.b(this.f106381b, this.f106380a.hashCode() * 31, 31), 31)) * 31, 31), 31), 31), 31), 31), 31);
        Integer num = this.f106390k;
        return this.f106392m.hashCode() + ((this.f106391l.hashCode() + ((b13 + (num == null ? 0 : num.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        return "BottomNavTabModel(type=" + this.f106380a + ", unselectedImageRes=" + this.f106381b + ", selectedImageRes=" + this.f106382c + ", elementType=" + this.f106383d + ", viewId=" + this.f106384e + ", navigation=" + this.f106385f + ", labelStringRes=" + this.f106386g + ", shouldShowEmptyBadge=" + this.f106387h + ", onTabSelectedListener=" + this.f106388i + ", talkbackLabel=" + this.f106389j + ", alternateUnselectedImageRes=" + this.f106390k + ", unselectedIcon=" + this.f106391l + ", selectedIcon=" + this.f106392m + ")";
    }
}
