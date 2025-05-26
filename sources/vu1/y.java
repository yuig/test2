package vu1;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.ResponseBody;
import tu1.z0;

/* loaded from: classes4.dex */
public final class y extends z0 {

    /* renamed from: f, reason: collision with root package name */
    public final Call f126747f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ z f126748g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(z zVar, ResponseBody delegate, Call call) {
        super(delegate, false);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(call, "call");
        this.f126748g = zVar;
        this.f126747f = call;
    }

    @Override // tu1.z0
    public final void a() {
        this.f126748g.f126752d.remove(this.f126747f);
    }
}
