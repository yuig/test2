package tw0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import okhttp3.HttpUrl;

/* loaded from: classes5.dex */
public final class b extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ g f119602i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f119603j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(g gVar, long j13) {
        super(1);
        this.f119602i = gVar;
        this.f119603j = j13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        HttpUrl url = (HttpUrl) obj;
        Intrinsics.checkNotNullParameter(url, "httpUrl");
        g gVar = this.f119602i;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(url, "url");
        kk2.b bVar = new kk2.b(new g0.e(gVar, this.f119603j, url), 0);
        Intrinsics.checkNotNullExpressionValue(bVar, "create(...)");
        return bVar.r(tk2.e.f118017c);
    }
}
