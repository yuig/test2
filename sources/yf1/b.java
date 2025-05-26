package yf1;

import a42.r;
import android.content.Context;
import android.os.Bundle;
import com.pinterest.component.modal.BaseModalViewWrapper;
import kotlin.jvm.internal.Intrinsics;
import yb0.n;

/* loaded from: classes5.dex */
public final class b extends jc0.b {

    /* renamed from: a, reason: collision with root package name */
    public final n f138964a;

    /* renamed from: b, reason: collision with root package name */
    public final r f138965b;

    public /* synthetic */ b(xf1.a aVar, int i13) {
        this((i13 & 1) != 0 ? null : aVar, (r) null);
    }

    @Override // jc0.b
    public final BaseModalViewWrapper createModalView(Context context, Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        d dVar = new d(context, this.f138965b, new a(this, 0));
        jc0.n nVar = new jc0.n(context);
        nVar.x(dVar);
        nVar.T(false);
        return nVar;
    }

    public b(n nVar, r rVar) {
        this.f138964a = nVar;
        this.f138965b = rVar;
    }
}
