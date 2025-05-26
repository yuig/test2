package j7;

import com.google.common.util.concurrent.k0;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/* loaded from: classes3.dex */
public final class a implements Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k0 f74829a;

    public a(k0 k0Var) {
        this.f74829a = k0Var;
    }

    @Override // okhttp3.Callback
    public final void onFailure(Call call, IOException iOException) {
        this.f74829a.w(iOException);
    }

    @Override // okhttp3.Callback
    public final void onResponse(Call call, Response response) {
        this.f74829a.v(response);
    }
}
