package fm2;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import lb.l0;
import rm2.a0;
import rm2.b0;

/* loaded from: classes2.dex */
public final class d implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public final ClassLoader f62578a;

    /* renamed from: b, reason: collision with root package name */
    public final mn2.e f62579b;

    public d(ClassLoader classLoader) {
        Intrinsics.checkNotNullParameter(classLoader, "classLoader");
        this.f62578a = classLoader;
        this.f62579b = new mn2.e();
    }

    public final a0 a(ym2.b classId, xm2.g jvmMetadataVersion) {
        c f13;
        Intrinsics.checkNotNullParameter(classId, "classId");
        Intrinsics.checkNotNullParameter(jvmMetadataVersion, "jvmMetadataVersion");
        String b13 = classId.h().b();
        Intrinsics.checkNotNullExpressionValue(b13, "asString(...)");
        String m13 = z.m(b13, '.', '$');
        if (!classId.g().d()) {
            m13 = classId.g() + '.' + m13;
        }
        Class z13 = l0.z1(this.f62578a, m13);
        if (z13 == null || (f13 = re2.h.f(z13)) == null) {
            return null;
        }
        return new a0(f13);
    }
}
