package s81;

import com.pinterest.api.model.d30;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import u81.t;
import uj2.q;
import yk1.r;

/* loaded from: classes5.dex */
public final class d extends yk1.c implements m81.m {

    /* renamed from: a, reason: collision with root package name */
    public final c f111896a;

    /* renamed from: b, reason: collision with root package name */
    public d30 f111897b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(uk1.d presenterPinalytics, q networkStateStream, c listener) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f111896a = listener;
    }

    @Override // yk1.p
    /* renamed from: q3, reason: merged with bridge method [inline-methods] */
    public final void r3(m81.l view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        d30 d30Var = this.f111897b;
        if (d30Var != null) {
            t tVar = (t) view;
            Intrinsics.checkNotNullParameter(this, "listener");
            tVar.K = this;
            String path = d30Var.e();
            Intrinsics.checkNotNullParameter(path, "path");
            File file = new File(path);
            int i13 = tVar.L;
            tVar.P0(file, i13, i13);
        }
    }
}
