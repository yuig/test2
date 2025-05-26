package x00;

import com.google.firebase.messaging.q;
import ey.e;
import kotlin.jvm.internal.Intrinsics;
import pc.f;
import qc.d;
import qc.h;

/* loaded from: classes.dex */
public final class a implements h {

    /* renamed from: a, reason: collision with root package name */
    public final d f131276a;

    public a(d apolloHttpRequestComposer) {
        Intrinsics.checkNotNullParameter(apolloHttpRequestComposer, "apolloHttpRequestComposer");
        this.f131276a = apolloHttpRequestComposer;
    }

    @Override // qc.h
    public final q a(f apolloRequest) {
        Intrinsics.checkNotNullParameter(apolloRequest, "apolloRequest");
        new e().i();
        q a13 = this.f131276a.a(apolloRequest);
        new ey.f().i();
        return a13;
    }
}
