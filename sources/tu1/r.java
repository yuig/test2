package tu1;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.ResponseBody;

/* loaded from: classes4.dex */
public final class r extends z0 {

    /* renamed from: f, reason: collision with root package name */
    public final Call f119433f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ s f119434g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar, ResponseBody delegate, Call call) {
        super(delegate, false);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(call, "call");
        this.f119434g = sVar;
        this.f119433f = call;
    }

    @Override // tu1.z0
    public final void a() {
        this.f119434g.f119438d.remove(this.f119433f);
    }
}
