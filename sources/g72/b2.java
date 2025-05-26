package g72;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@no2.g
/* loaded from: classes4.dex */
public final class b2 {

    @NotNull
    public static final a2 Companion = new a2();

    /* renamed from: c, reason: collision with root package name */
    public static final no2.b[] f63931c = {new qo2.d(h2.f64001b, 0), null};

    /* renamed from: a, reason: collision with root package name */
    public final List f63932a;

    /* renamed from: b, reason: collision with root package name */
    public final String f63933b;

    public b2(int i13, String str, List list) {
        if (3 != (i13 & 3)) {
            kg.t.b1(i13, 3, z1.f64167b);
            throw null;
        }
        this.f63932a = list;
        this.f63933b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b2)) {
            return false;
        }
        b2 b2Var = (b2) obj;
        return Intrinsics.d(this.f63932a, b2Var.f63932a) && Intrinsics.d(this.f63933b, b2Var.f63933b);
    }

    public final int hashCode() {
        return this.f63933b.hashCode() + (this.f63932a.hashCode() * 31);
    }

    public final String toString() {
        return "KeyframeAnimationEntity(keyFrames=" + this.f63932a + ", loopMode=" + this.f63933b + ")";
    }
}
