package ma;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b implements f {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f86750a;

    public b(g registry) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        this.f86750a = new LinkedHashSet();
        registry.c("androidx.savedstate.Restarter", this);
    }

    @Override // ma.f
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f86750a));
        return bundle;
    }

    public final void b(String className) {
        Intrinsics.checkNotNullParameter(className, "className");
        this.f86750a.add(className);
    }
}
