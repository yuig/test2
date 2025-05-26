package n41;

import com.pinterest.api.model.wy0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c extends h {

    /* renamed from: b, reason: collision with root package name */
    public final wy0 f89211b;

    /* renamed from: c, reason: collision with root package name */
    public final String f89212c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(wy0 user, String blockContext) {
        super(oz1.e.lego_profile_overflow_block_option_title);
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter("profile", "blockSource");
        Intrinsics.checkNotNullParameter(blockContext, "blockContext");
        this.f89211b = user;
        this.f89212c = blockContext;
    }
}
