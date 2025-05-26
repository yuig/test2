package td;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes3.dex */
public final class r0 implements c0 {

    /* renamed from: b, reason: collision with root package name */
    public static final Set f117432b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* renamed from: a, reason: collision with root package name */
    public final c0 f117433a;

    public r0(c0 c0Var) {
        this.f117433a = c0Var;
    }

    @Override // td.c0
    public final boolean a(Object obj) {
        return f117432b.contains(((Uri) obj).getScheme());
    }

    @Override // td.c0
    public final b0 b(Object obj, int i13, int i14, nd.l lVar) {
        return this.f117433a.b(new t(((Uri) obj).toString()), i13, i14, lVar);
    }
}
