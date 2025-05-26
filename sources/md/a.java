package md;

import android.util.Log;
import com.bumptech.glide.h;
import com.bumptech.glide.load.HttpException;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.data.e;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import td.t;

/* loaded from: classes.dex */
public final class a implements e, Callback {

    /* renamed from: a, reason: collision with root package name */
    public final Call.Factory f86946a;

    /* renamed from: b, reason: collision with root package name */
    public final t f86947b;

    /* renamed from: c, reason: collision with root package name */
    public he.e f86948c;

    /* renamed from: d, reason: collision with root package name */
    public ResponseBody f86949d;

    /* renamed from: e, reason: collision with root package name */
    public d f86950e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Call f86951f;

    public a(Call.Factory factory, t tVar) {
        this.f86946a = factory;
        this.f86947b = tVar;
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void b() {
        try {
            he.e eVar = this.f86948c;
            if (eVar != null) {
                eVar.close();
            }
        } catch (IOException unused) {
        }
        ResponseBody responseBody = this.f86949d;
        if (responseBody != null) {
            responseBody.close();
        }
        this.f86950e = null;
    }

    @Override // com.bumptech.glide.load.data.e
    public final nd.a c() {
        return nd.a.REMOTE;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
        Call call = this.f86951f;
        if (call != null) {
            call.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void e(h hVar, d dVar) {
        Request.Builder builder = new Request.Builder();
        builder.j(this.f86947b.d());
        for (Map.Entry entry : this.f86947b.f117435b.a().entrySet()) {
            builder.a((String) entry.getKey(), (String) entry.getValue());
        }
        Request b13 = builder.b();
        this.f86950e = dVar;
        this.f86951f = this.f86946a.newCall(b13);
        this.f86951f.k1(this);
    }

    @Override // okhttp3.Callback
    public final void onFailure(Call call, IOException iOException) {
        if (Log.isLoggable("OkHttpFetcher", 3)) {
            Log.d("OkHttpFetcher", "OkHttp failed to obtain result", iOException);
        }
        this.f86950e.d(iOException);
    }

    @Override // okhttp3.Callback
    public final void onResponse(Call call, Response response) {
        this.f86949d = response.f95726g;
        if (!response.d()) {
            this.f86950e.d(new HttpException(response.f95722c, response.f95723d));
            return;
        }
        ResponseBody responseBody = this.f86949d;
        d7.b.p(responseBody, "Argument must not be null");
        he.e eVar = new he.e(this.f86949d.byteStream(), responseBody.getF95752e());
        this.f86948c = eVar;
        this.f86950e.f(eVar);
    }
}
