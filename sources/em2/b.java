package em2;

import am2.l1;
import am2.o1;
import am2.p1;
import am2.q1;
import am2.t1;
import am2.u1;
import kotlin.jvm.internal.Intrinsics;
import yk2.g;

/* loaded from: classes2.dex */
public final class b extends u1 {

    /* renamed from: c, reason: collision with root package name */
    public static final b f59639c = new b("protected_and_package", true);

    @Override // am2.u1
    public final Integer a(u1 visibility) {
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        if (Intrinsics.d(this, visibility)) {
            return 0;
        }
        if (visibility == l1.f15563c) {
            return null;
        }
        g gVar = t1.f15591a;
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        return visibility == o1.f15567c || visibility == p1.f15568c ? 1 : -1;
    }

    @Override // am2.u1
    public final String b() {
        return "protected/*protected and package*/";
    }

    @Override // am2.u1
    public final u1 c() {
        return q1.f15570c;
    }
}
