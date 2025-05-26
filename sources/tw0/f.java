package tw0;

import java.io.IOException;
import java.io.InterruptedIOException;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import qz.x;
import uj2.c0;

/* loaded from: classes5.dex */
public final class f implements Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f119609a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f119610b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c0 f119611c;

    public f(x xVar, long j13, kk2.a aVar) {
        this.f119609a = xVar;
        this.f119610b = j13;
        this.f119611c = aVar;
    }

    @Override // okhttp3.Callback
    public final void onFailure(Call call, IOException e13) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(e13, "e");
        boolean z13 = e13 instanceof InterruptedIOException;
        x xVar = this.f119609a;
        if (z13) {
            xVar.f105458o = this.f119610b;
        } else {
            xVar.f105458o = -1L;
        }
        ((kk2.a) this.f119611c).b(xVar.D());
    }

    @Override // okhttp3.Callback
    public final void onResponse(Call call, Response response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        response.close();
        int i13 = response.f95723d;
        x xVar = this.f119609a;
        xVar.f105457n = i13;
        ((kk2.a) this.f119611c).b(xVar.D());
    }
}
