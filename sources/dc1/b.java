package dc1;

import com.pinterest.api.model.wy0;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class b extends s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public static final b f54363i = new b(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        wy0 user = (wy0) obj;
        List settings = (List) obj2;
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(settings, "settings");
        return new a(user, settings);
    }
}
