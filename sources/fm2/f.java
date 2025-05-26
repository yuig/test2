package fm2;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import ln2.u;
import pm2.j;

/* loaded from: classes2.dex */
public final class f implements u, om2.a {

    /* renamed from: b, reason: collision with root package name */
    public static final f f62581b = new f();

    /* renamed from: c, reason: collision with root package name */
    public static final f f62582c = new f();

    @Override // ln2.u
    public void a(dm2.b descriptor, ArrayList unresolvedSuperClasses) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(unresolvedSuperClasses, "unresolvedSuperClasses");
        throw new IllegalStateException("Incomplete hierarchy for class " + descriptor.getName() + ", unresolved classes " + unresolvedSuperClasses);
    }

    public h b(j javaElement) {
        Intrinsics.checkNotNullParameter(javaElement, "javaElement");
        return new h((gm2.u) javaElement);
    }

    @Override // ln2.u
    public void c(am2.d descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        throw new IllegalStateException("Cannot infer visibility for " + descriptor);
    }
}
