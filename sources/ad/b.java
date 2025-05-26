package ad;

import do2.i;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import pc.f;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final List f2078a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2079b;

    public b(List interceptors, int i13) {
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        this.f2078a = interceptors;
        this.f2079b = i13;
    }

    public final i a(f request) {
        Intrinsics.checkNotNullParameter(request, "request");
        List list = this.f2078a;
        int size = list.size();
        int i13 = this.f2079b;
        if (i13 < size) {
            return ((a) list.get(i13)).a(request, new b(list, i13 + 1));
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
