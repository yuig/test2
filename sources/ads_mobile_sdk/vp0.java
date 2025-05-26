package ads_mobile_sdk;

import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import r4.i;

/* loaded from: classes2.dex */
public final class vp0 implements Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f12597a;

    public vp0(i iVar) {
        this.f12597a = iVar;
    }

    @Override // okhttp3.Callback
    public final void onFailure(Call call, IOException iOException) {
        this.f12597a.d(iOException);
    }

    @Override // okhttp3.Callback
    public final void onResponse(Call call, Response response) {
        this.f12597a.b(response);
    }
}
