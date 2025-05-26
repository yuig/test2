package tu1;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.ResponseBody;

/* loaded from: classes4.dex */
public final class p extends z0 {

    /* renamed from: f, reason: collision with root package name */
    public final Call f119422f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q f119423g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, ResponseBody delegate, Call call) {
        super(delegate, false);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(call, "call");
        this.f119423g = qVar;
        this.f119422f = call;
    }

    @Override // tu1.z0
    public final void a() {
        this.f119423g.f119428d.remove(this.f119422f);
    }
}
