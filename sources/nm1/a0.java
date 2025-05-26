package nm1;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a0 implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f91373a;

    /* renamed from: b, reason: collision with root package name */
    public final int f91374b;

    /* renamed from: c, reason: collision with root package name */
    public final h0 f91375c;

    /* renamed from: d, reason: collision with root package name */
    public final int f91376d;

    public a0(List tabItems, int i13, h0 variant, int i14) {
        Intrinsics.checkNotNullParameter(tabItems, "tabItems");
        Intrinsics.checkNotNullParameter(variant, "variant");
        this.f91373a = tabItems;
        this.f91374b = i13;
        this.f91375c = variant;
        this.f91376d = i14;
    }

    @Override // nm1.d0
    public final int a() {
        return this.f91374b;
    }

    @Override // nm1.d0
    public final d0 b(int i13) {
        List tabItems = this.f91373a;
        Intrinsics.checkNotNullParameter(tabItems, "tabItems");
        h0 variant = this.f91375c;
        Intrinsics.checkNotNullParameter(variant, "variant");
        return new a0(tabItems, i13, variant, this.f91376d);
    }

    @Override // nm1.d0
    public final List c() {
        return this.f91373a;
    }

    @Override // nm1.d0
    public final h0 d() {
        return this.f91375c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return Intrinsics.d(this.f91373a, a0Var.f91373a) && this.f91374b == a0Var.f91374b && this.f91375c == a0Var.f91375c && this.f91376d == a0Var.f91376d;
    }

    @Override // nm1.m
    public final int getId() {
        return this.f91376d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f91376d) + ((this.f91375c.hashCode() + ep.b.b(this.f91374b, this.f91373a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "ScrollingTabs(tabItems=" + this.f91373a + ", selectedIndex=" + this.f91374b + ", variant=" + this.f91375c + ", id=" + this.f91376d + ")";
    }

    public /* synthetic */ a0(List list, int i13, h0 h0Var, int i14, int i15) {
        this(list, i13, (i14 & 4) != 0 ? h0.NORMAL : h0Var, Integer.MIN_VALUE);
    }
}
