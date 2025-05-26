package bv0;

import com.pinterest.api.model.wy0;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class b extends s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public static final b f23907i = new b(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        wy0 user = (wy0) obj;
        Boolean safeToComment = (Boolean) obj2;
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(safeToComment, "safeToComment");
        return new Pair(user, safeToComment);
    }
}
