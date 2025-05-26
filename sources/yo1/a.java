package yo1;

import com.pinterest.framework.screens.ScreenLocation;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import pk.o1;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Set f139603a;

    public a(o1 unauthLocations) {
        Intrinsics.checkNotNullParameter(unauthLocations, "unauthLocations");
        this.f139603a = unauthLocations;
    }

    public final boolean a(ScreenLocation location) {
        Intrinsics.checkNotNullParameter(location, "location");
        return this.f139603a.contains(location);
    }
}
