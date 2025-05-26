package d31;

import com.pinterest.framework.multisection.datasource.pagedlist.c;
import gh0.b;
import kotlin.jvm.internal.Intrinsics;
import m60.g0;
import nr0.l;
import qz.f0;

/* loaded from: classes5.dex */
public final class a extends c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String userId, g0 pageSizeProvider, l viewBinderDelegate) {
        super(a.a.p(new StringBuilder("users/"), userId, "/pins/"), viewBinderDelegate, null, null, null, new ke0.a[]{b.R(), b.N()}, null, null, null, 0L, null, 7132);
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(pageSizeProvider, "pageSizeProvider");
        Intrinsics.checkNotNullParameter(viewBinderDelegate, "viewBinderDelegate");
        f0 f0Var = new f0();
        f0Var.e("page_size", pageSizeProvider.d());
        f0Var.e("fields", n00.b.a(n00.c.PROFILE_ALL_PINS_FIELDS));
        this.f49121k = f0Var;
    }
}
