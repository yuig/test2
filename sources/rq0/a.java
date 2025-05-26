package rq0;

import com.pinterest.api.model.v10;
import com.pinterest.api.model.wy0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final wy0 f109689a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f109690b;

    public a(wy0 user, boolean z13) {
        Intrinsics.checkNotNullParameter(user, "user");
        this.f109689a = user;
        this.f109690b = z13;
    }

    public final boolean a() {
        v10 Y3 = this.f109689a.Y3();
        if (Y3 != null) {
            return Intrinsics.d(Y3.I(), Boolean.TRUE);
        }
        return false;
    }
}
