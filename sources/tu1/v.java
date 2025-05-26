package tu1;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final w f119458a;

    /* renamed from: b, reason: collision with root package name */
    public final x f119459b;

    /* renamed from: c, reason: collision with root package name */
    public final xk2.v f119460c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f119461d;

    public v(w libraryProviderInstaller, x cronetLibraryStatePreference) {
        Intrinsics.checkNotNullParameter(libraryProviderInstaller, "libraryProviderInstaller");
        Intrinsics.checkNotNullParameter(cronetLibraryStatePreference, "cronetLibraryStatePreference");
        this.f119458a = libraryProviderInstaller;
        this.f119459b = cronetLibraryStatePreference;
        this.f119460c = xk2.m.b(new u(this, 0));
        this.f119461d = new AtomicBoolean(false);
    }
}
