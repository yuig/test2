package r72;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f106456a;

    /* renamed from: b, reason: collision with root package name */
    public final long f106457b;

    /* renamed from: c, reason: collision with root package name */
    public final List f106458c;

    /* renamed from: d, reason: collision with root package name */
    public final h1 f106459d;

    public d1(String id3, long j13, List states, h1 timingFunction) {
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(states, "states");
        Intrinsics.checkNotNullParameter(timingFunction, "timingFunction");
        this.f106456a = id3;
        this.f106457b = j13;
        this.f106458c = states;
        this.f106459d = timingFunction;
    }

    public static d1 a(d1 d1Var, ArrayList states, h1 h1Var, int i13) {
        String id3 = d1Var.f106456a;
        long j13 = d1Var.f106457b;
        if ((i13 & 8) != 0) {
            h1Var = d1Var.f106459d;
        }
        h1 timingFunction = h1Var;
        d1Var.getClass();
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(states, "states");
        Intrinsics.checkNotNullParameter(timingFunction, "timingFunction");
        return new d1(id3, j13, states, timingFunction);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj;
        return Intrinsics.d(this.f106456a, d1Var.f106456a) && zn2.b.d(this.f106457b, d1Var.f106457b) && Intrinsics.d(this.f106458c, d1Var.f106458c) && this.f106459d == d1Var.f106459d;
    }

    public final int hashCode() {
        int hashCode = this.f106456a.hashCode() * 31;
        zn2.a aVar = zn2.b.f142311b;
        return this.f106459d.hashCode() + ep.b.c(this.f106458c, a.a.c(this.f106457b, hashCode, 31), 31);
    }

    public final String toString() {
        StringBuilder w13 = a.a.w("Keyframe(id=", a.a.p(new StringBuilder("KeyframeId(value="), this.f106456a, ")"), ", duration=", zn2.b.o(this.f106457b), ", states=");
        w13.append(this.f106458c);
        w13.append(", timingFunction=");
        w13.append(this.f106459d);
        w13.append(")");
        return w13.toString();
    }
}
