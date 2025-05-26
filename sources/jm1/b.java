package jm1;

import kotlin.jvm.internal.Intrinsics;
import u50.b0;
import u50.n;
import u50.o;

/* loaded from: classes2.dex */
public final class b implements o {

    /* renamed from: a, reason: collision with root package name */
    public final fm1.c f77020a;

    /* renamed from: b, reason: collision with root package name */
    public final n f77021b;

    /* renamed from: c, reason: collision with root package name */
    public final n f77022c;

    /* renamed from: d, reason: collision with root package name */
    public final n f77023d;

    /* renamed from: e, reason: collision with root package name */
    public final n f77024e;

    /* renamed from: f, reason: collision with root package name */
    public final c f77025f;

    /* renamed from: g, reason: collision with root package name */
    public final int f77026g;

    public b(fm1.c visibility, n paddingTop, n paddingBottom, n paddingStart, n paddingEnd, c orientation, int i13) {
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        Intrinsics.checkNotNullParameter(paddingTop, "paddingTop");
        Intrinsics.checkNotNullParameter(paddingBottom, "paddingBottom");
        Intrinsics.checkNotNullParameter(paddingStart, "paddingStart");
        Intrinsics.checkNotNullParameter(paddingEnd, "paddingEnd");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        this.f77020a = visibility;
        this.f77021b = paddingTop;
        this.f77022c = paddingBottom;
        this.f77023d = paddingStart;
        this.f77024e = paddingEnd;
        this.f77025f = orientation;
        this.f77026g = i13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [u50.n] */
    /* JADX WARN: Type inference failed for: r11v2, types: [u50.n] */
    /* JADX WARN: Type inference failed for: r12v2, types: [u50.n] */
    /* JADX WARN: Type inference failed for: r13v2, types: [u50.n] */
    public static b e(b bVar, fm1.c cVar, b0 b0Var, b0 b0Var2, b0 b0Var3, b0 b0Var4, int i13) {
        if ((i13 & 1) != 0) {
            cVar = bVar.f77020a;
        }
        fm1.c visibility = cVar;
        b0 b0Var5 = b0Var;
        if ((i13 & 2) != 0) {
            b0Var5 = bVar.f77021b;
        }
        b0 paddingTop = b0Var5;
        b0 b0Var6 = b0Var2;
        if ((i13 & 4) != 0) {
            b0Var6 = bVar.f77022c;
        }
        b0 paddingBottom = b0Var6;
        b0 b0Var7 = b0Var3;
        if ((i13 & 8) != 0) {
            b0Var7 = bVar.f77023d;
        }
        b0 paddingStart = b0Var7;
        b0 b0Var8 = b0Var4;
        if ((i13 & 16) != 0) {
            b0Var8 = bVar.f77024e;
        }
        b0 paddingEnd = b0Var8;
        c orientation = bVar.f77025f;
        int i14 = bVar.f77026g;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        Intrinsics.checkNotNullParameter(paddingTop, "paddingTop");
        Intrinsics.checkNotNullParameter(paddingBottom, "paddingBottom");
        Intrinsics.checkNotNullParameter(paddingStart, "paddingStart");
        Intrinsics.checkNotNullParameter(paddingEnd, "paddingEnd");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        return new b(visibility, paddingTop, paddingBottom, paddingStart, paddingEnd, orientation, i14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f77020a == bVar.f77020a && Intrinsics.d(this.f77021b, bVar.f77021b) && Intrinsics.d(this.f77022c, bVar.f77022c) && Intrinsics.d(this.f77023d, bVar.f77023d) && Intrinsics.d(this.f77024e, bVar.f77024e) && this.f77025f == bVar.f77025f && this.f77026g == bVar.f77026g;
    }

    public final n f() {
        return this.f77022c;
    }

    public final n g() {
        return this.f77024e;
    }

    public final n h() {
        return this.f77023d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f77026g) + ((this.f77025f.hashCode() + d7.g.e(this.f77024e, d7.g.e(this.f77023d, d7.g.e(this.f77022c, d7.g.e(this.f77021b, this.f77020a.hashCode() * 31, 31), 31), 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DisplayState(visibility=");
        sb3.append(this.f77020a);
        sb3.append(", paddingTop=");
        sb3.append(this.f77021b);
        sb3.append(", paddingBottom=");
        sb3.append(this.f77022c);
        sb3.append(", paddingStart=");
        sb3.append(this.f77023d);
        sb3.append(", paddingEnd=");
        sb3.append(this.f77024e);
        sb3.append(", orientation=");
        sb3.append(this.f77025f);
        sb3.append(", id=");
        return a.a.n(sb3, this.f77026g, ")");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ b(u50.b0 r9, int r10) {
        /*
            r8 = this;
            fm1.c r1 = com.pinterest.gestalt.divider.GestaltDivider.f49365d
            r10 = r10 & 2
            u50.q r5 = u50.q.f120581a
            if (r10 == 0) goto La
            r2 = r5
            goto Lb
        La:
            r2 = r9
        Lb:
            jm1.c r6 = com.pinterest.gestalt.divider.GestaltDivider.f49367f
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r8
            r3 = r5
            r4 = r5
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jm1.b.<init>(u50.b0, int):void");
    }
}
