package h51;

import com.pinterest.hairball.network.d;
import com.pinterest.hairball.network.e;
import j90.b;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a extends e {

    /* renamed from: a, reason: collision with root package name */
    public final h12.a f67697a;

    public a(h12.a boardInviteApi) {
        Intrinsics.checkNotNullParameter(boardInviteApi, "boardInviteApi");
        this.f67697a = boardInviteApi;
    }

    @Override // com.pinterest.hairball.network.e
    public final d getBuilder(Object[] params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return new b(this);
    }
}
