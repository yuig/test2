package nm1;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b0 implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final c0 f91379a;

    /* renamed from: b, reason: collision with root package name */
    public final c0 f91380b;

    /* renamed from: c, reason: collision with root package name */
    public final int f91381c;

    /* renamed from: d, reason: collision with root package name */
    public final h0 f91382d;

    /* renamed from: e, reason: collision with root package name */
    public final l f91383e;

    /* renamed from: f, reason: collision with root package name */
    public final l f91384f;

    /* renamed from: g, reason: collision with root package name */
    public final int f91385g;

    public b0(c0 firstTab, c0 c0Var, int i13, h0 variant, l startActions, l endActions, int i14) {
        Intrinsics.checkNotNullParameter(firstTab, "firstTab");
        Intrinsics.checkNotNullParameter(variant, "variant");
        Intrinsics.checkNotNullParameter(startActions, "startActions");
        Intrinsics.checkNotNullParameter(endActions, "endActions");
        this.f91379a = firstTab;
        this.f91380b = c0Var;
        this.f91381c = i13;
        this.f91382d = variant;
        this.f91383e = startActions;
        this.f91384f = endActions;
        this.f91385g = i14;
    }

    @Override // nm1.d0
    public final int a() {
        return this.f91381c;
    }

    @Override // nm1.d0
    public final List c() {
        c0[] elements = {this.f91379a, this.f91380b};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.c0.A(elements);
    }

    @Override // nm1.d0
    public final h0 d() {
        return this.f91382d;
    }

    @Override // nm1.d0
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final b0 b(int i13) {
        c0 firstTab = this.f91379a;
        Intrinsics.checkNotNullParameter(firstTab, "firstTab");
        h0 variant = this.f91382d;
        Intrinsics.checkNotNullParameter(variant, "variant");
        l startActions = this.f91383e;
        Intrinsics.checkNotNullParameter(startActions, "startActions");
        l endActions = this.f91384f;
        Intrinsics.checkNotNullParameter(endActions, "endActions");
        return new b0(firstTab, this.f91380b, i13, variant, startActions, endActions, this.f91385g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return Intrinsics.d(this.f91379a, b0Var.f91379a) && Intrinsics.d(this.f91380b, b0Var.f91380b) && this.f91381c == b0Var.f91381c && this.f91382d == b0Var.f91382d && Intrinsics.d(this.f91383e, b0Var.f91383e) && Intrinsics.d(this.f91384f, b0Var.f91384f) && this.f91385g == b0Var.f91385g;
    }

    @Override // nm1.m
    public final int getId() {
        return this.f91385g;
    }

    public final int hashCode() {
        int hashCode = this.f91379a.hashCode() * 31;
        c0 c0Var = this.f91380b;
        return Integer.hashCode(this.f91385g) + ((this.f91384f.hashCode() + ((this.f91383e.hashCode() + ((this.f91382d.hashCode() + ep.b.b(this.f91381c, (hashCode + (c0Var == null ? 0 : c0Var.hashCode())) * 31, 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("StaticTabs(firstTab=");
        sb3.append(this.f91379a);
        sb3.append(", secondTab=");
        sb3.append(this.f91380b);
        sb3.append(", selectedIndex=");
        sb3.append(this.f91381c);
        sb3.append(", variant=");
        sb3.append(this.f91382d);
        sb3.append(", startActions=");
        sb3.append(this.f91383e);
        sb3.append(", endActions=");
        sb3.append(this.f91384f);
        sb3.append(", id=");
        return a.a.n(sb3, this.f91385g, ")");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ b0(nm1.c0 r10, nm1.c0 r11, int r12, nm1.h0 r13, nm1.l r14, nm1.l r15, int r16, int r17) {
        /*
            r9 = this;
            r0 = r16 & 8
            if (r0 == 0) goto L8
            nm1.h0 r0 = nm1.h0.NORMAL
            r5 = r0
            goto L9
        L8:
            r5 = r13
        L9:
            r0 = r16 & 16
            nm1.f r1 = nm1.f.f91423a
            if (r0 == 0) goto L11
            r6 = r1
            goto L12
        L11:
            r6 = r14
        L12:
            r0 = r16 & 32
            if (r0 == 0) goto L18
            r7 = r1
            goto L19
        L18:
            r7 = r15
        L19:
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nm1.b0.<init>(nm1.c0, nm1.c0, int, nm1.h0, nm1.l, nm1.l, int, int):void");
    }
}
