package b60;

import com.pinterest.api.model.vy0;
import com.pinterest.api.model.wy0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public interface b extends a {
    default void a(Function1 transformer) {
        Intrinsics.checkNotNullParameter(transformer, "transformer");
        d dVar = (d) this;
        wy0 f13 = dVar.f();
        if (f13 != null) {
            vy0 H4 = f13.H4();
            Intrinsics.checkNotNullExpressionValue(H4, "toBuilder(...)");
            dVar.j((wy0) transformer.invoke(H4));
        }
    }

    default boolean b(String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        wy0 f13 = ((d) this).f();
        Boolean valueOf = f13 != null ? Boolean.valueOf(Intrinsics.d(f13.getUid(), userId)) : null;
        if (valueOf != null) {
            return valueOf.booleanValue();
        }
        return false;
    }

    default boolean c(wy0 wy0Var) {
        Boolean bool;
        if (wy0Var != null) {
            String uid = wy0Var.getUid();
            Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
            bool = Boolean.valueOf(e(uid));
        } else {
            bool = null;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    default boolean d(wy0 user) {
        Intrinsics.checkNotNullParameter(user, "user");
        String uid = user.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        return b(uid);
    }

    default boolean e(String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Boolean valueOf = ((d) this).f() != null ? Boolean.valueOf(!Intrinsics.d(r0.getUid(), userId)) : null;
        if (valueOf != null) {
            return valueOf.booleanValue();
        }
        return false;
    }
}
