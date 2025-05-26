package nm2;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import pn2.h0;
import pn2.r1;

/* loaded from: classes2.dex */
public final class a extends pn2.c {

    /* renamed from: a, reason: collision with root package name */
    public final r1 f91520a;

    /* renamed from: b, reason: collision with root package name */
    public final b f91521b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f91522c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f91523d;

    /* renamed from: e, reason: collision with root package name */
    public final Set f91524e;

    /* renamed from: f, reason: collision with root package name */
    public final h0 f91525f;

    public a(r1 howThisTypeIsUsed, b flexibility, boolean z13, boolean z14, Set set, h0 h0Var) {
        Intrinsics.checkNotNullParameter(howThisTypeIsUsed, "howThisTypeIsUsed");
        Intrinsics.checkNotNullParameter(flexibility, "flexibility");
        Intrinsics.checkNotNullParameter(howThisTypeIsUsed, "howThisTypeIsUsed");
        this.f91520a = howThisTypeIsUsed;
        this.f91521b = flexibility;
        this.f91522c = z13;
        this.f91523d = z14;
        this.f91524e = set;
        this.f91525f = h0Var;
    }

    public static a g(a aVar, b bVar, boolean z13, Set set, h0 h0Var, int i13) {
        r1 howThisTypeIsUsed = aVar.f91520a;
        if ((i13 & 2) != 0) {
            bVar = aVar.f91521b;
        }
        b flexibility = bVar;
        if ((i13 & 4) != 0) {
            z13 = aVar.f91522c;
        }
        boolean z14 = z13;
        boolean z15 = aVar.f91523d;
        if ((i13 & 16) != 0) {
            set = aVar.f91524e;
        }
        Set set2 = set;
        if ((i13 & 32) != 0) {
            h0Var = aVar.f91525f;
        }
        aVar.getClass();
        Intrinsics.checkNotNullParameter(howThisTypeIsUsed, "howThisTypeIsUsed");
        Intrinsics.checkNotNullParameter(flexibility, "flexibility");
        return new a(howThisTypeIsUsed, flexibility, z14, z15, set2, h0Var);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(aVar.f91525f, this.f91525f) && aVar.f91520a == this.f91520a && aVar.f91521b == this.f91521b && aVar.f91522c == this.f91522c && aVar.f91523d == this.f91523d;
    }

    public final a h(b flexibility) {
        Intrinsics.checkNotNullParameter(flexibility, "flexibility");
        return g(this, flexibility, false, null, null, 61);
    }

    public final int hashCode() {
        h0 h0Var = this.f91525f;
        int hashCode = h0Var != null ? h0Var.hashCode() : 0;
        int hashCode2 = this.f91520a.hashCode() + (hashCode * 31) + hashCode;
        int hashCode3 = this.f91521b.hashCode() + (hashCode2 * 31) + hashCode2;
        int i13 = (hashCode3 * 31) + (this.f91522c ? 1 : 0) + hashCode3;
        return (i13 * 31) + (this.f91523d ? 1 : 0) + i13;
    }

    public final String toString() {
        return "JavaTypeAttributes(howThisTypeIsUsed=" + this.f91520a + ", flexibility=" + this.f91521b + ", isRaw=" + this.f91522c + ", isForAnnotationParameter=" + this.f91523d + ", visitedTypeParameters=" + this.f91524e + ", defaultType=" + this.f91525f + ')';
    }

    public /* synthetic */ a(r1 r1Var, boolean z13, boolean z14, Set set, int i13) {
        this(r1Var, b.INFLEXIBLE, (i13 & 4) != 0 ? false : z13, (i13 & 8) != 0 ? false : z14, (i13 & 16) != 0 ? null : set, null);
    }
}
