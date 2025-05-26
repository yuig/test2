package j7;

import a7.j0;
import android.net.Uri;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource$HttpDataSourceException;
import androidx.media3.datasource.HttpDataSource$InvalidContentTypeException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import com.google.common.util.concurrent.k0;
import d7.n0;
import g7.i;
import g7.s;
import g7.t;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.Intrinsics;
import ok.w;
import okhttp3.CacheControl;
import okhttp3.Call;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.RequestBody$Companion$toRequestBody$2;
import okhttp3.Response;
import okhttp3.ResponseBody;
import qk.e;

/* loaded from: classes3.dex */
public final class c extends g7.b {

    /* renamed from: e, reason: collision with root package name */
    public final Call.Factory f74833e;

    /* renamed from: f, reason: collision with root package name */
    public final s f74834f;

    /* renamed from: g, reason: collision with root package name */
    public final String f74835g;

    /* renamed from: h, reason: collision with root package name */
    public final CacheControl f74836h;

    /* renamed from: i, reason: collision with root package name */
    public final s f74837i;

    /* renamed from: j, reason: collision with root package name */
    public final w f74838j;

    /* renamed from: k, reason: collision with root package name */
    public i f74839k;

    /* renamed from: l, reason: collision with root package name */
    public Response f74840l;

    /* renamed from: m, reason: collision with root package name */
    public InputStream f74841m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f74842n;

    /* renamed from: o, reason: collision with root package name */
    public long f74843o;

    /* renamed from: p, reason: collision with root package name */
    public long f74844p;

    static {
        j0.a("media3.datasource.okhttp");
    }

    public c(Call.Factory factory, String str, s sVar) {
        super(true);
        factory.getClass();
        this.f74833e = factory;
        this.f74835g = str;
        this.f74836h = null;
        this.f74837i = sVar;
        this.f74838j = null;
        this.f74834f = new s(0);
    }

    @Override // g7.f
    public final void close() {
        if (this.f74842n) {
            this.f74842n = false;
            u();
            x();
        }
        this.f74840l = null;
        this.f74839k = null;
    }

    @Override // g7.f
    public final long d(i iVar) {
        RequestBody$Companion$toRequestBody$2 requestBody$Companion$toRequestBody$2;
        this.f74839k = iVar;
        long j13 = 0;
        this.f74844p = 0L;
        this.f74843o = 0L;
        v(iVar);
        long j14 = iVar.f63791f;
        String uri = iVar.f63786a.toString();
        HttpUrl.f95629k.getClass();
        HttpUrl url = HttpUrl.Companion.f(uri);
        if (url == null) {
            throw new HttpDataSource$HttpDataSourceException("Malformed URL", 1004);
        }
        Request.Builder builder = new Request.Builder();
        Intrinsics.checkNotNullParameter(url, "url");
        builder.f95706a = url;
        CacheControl cacheControl = this.f74836h;
        if (cacheControl != null) {
            builder.c(cacheControl);
        }
        HashMap hashMap = new HashMap();
        s sVar = this.f74837i;
        if (sVar != null) {
            hashMap.putAll(sVar.b());
        }
        hashMap.putAll(this.f74834f.b());
        hashMap.putAll(iVar.f63790e);
        for (Map.Entry entry : hashMap.entrySet()) {
            builder.d((String) entry.getKey(), (String) entry.getValue());
        }
        long j15 = iVar.f63792g;
        String a13 = t.a(j14, j15);
        if (a13 != null) {
            builder.a("Range", a13);
        }
        String str = this.f74835g;
        if (str != null) {
            builder.a("User-Agent", str);
        }
        if (!iVar.c(1)) {
            builder.a("Accept-Encoding", "identity");
        }
        int i13 = iVar.f63788c;
        byte[] bArr = iVar.f63789d;
        if (bArr != null) {
            RequestBody.Companion companion = RequestBody.f95711a;
            companion.getClass();
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            requestBody$Companion$toRequestBody$2 = RequestBody.Companion.e(companion, bArr, null, 7);
        } else if (i13 == 2) {
            byte[] bArr2 = n0.f53868c;
            RequestBody.Companion companion2 = RequestBody.f95711a;
            companion2.getClass();
            Intrinsics.checkNotNullParameter(bArr2, "<this>");
            requestBody$Companion$toRequestBody$2 = RequestBody.Companion.e(companion2, bArr2, null, 7);
        } else {
            requestBody$Companion$toRequestBody$2 = null;
        }
        builder.f(i.b(i13), requestBody$Companion$toRequestBody$2);
        Call newCall = this.f74833e.newCall(builder.b());
        try {
            k0 k0Var = new k0();
            newCall.k1(new a(k0Var));
            try {
                Response response = (Response) k0Var.get();
                this.f74840l = response;
                ResponseBody responseBody = response.f95726g;
                responseBody.getClass();
                this.f74841m = responseBody.byteStream();
                boolean d2 = response.d();
                long j16 = iVar.f63791f;
                int i14 = response.f95723d;
                if (!d2) {
                    Headers headers = response.f95725f;
                    if (i14 == 416 && j16 == t.c(headers.c("Content-Range"))) {
                        this.f74842n = true;
                        w(iVar);
                        if (j15 != -1) {
                            return j15;
                        }
                        return 0L;
                    }
                    try {
                        InputStream inputStream = this.f74841m;
                        inputStream.getClass();
                        e.b(inputStream);
                    } catch (IOException unused) {
                        int i15 = n0.f53866a;
                    }
                    TreeMap i16 = headers.i();
                    x();
                    throw new HttpDataSource$InvalidResponseCodeException(i14, i14 == 416 ? new DataSourceException(2008) : null, i16);
                }
                MediaType f95751d = responseBody.getF95751d();
                String str2 = f95751d != null ? f95751d.f95654a : "";
                w wVar = this.f74838j;
                if (wVar != null && !wVar.apply(str2)) {
                    x();
                    throw new HttpDataSource$InvalidContentTypeException(str2);
                }
                if (i14 == 200 && j16 != 0) {
                    j13 = j16;
                }
                if (j15 != -1) {
                    this.f74843o = j15;
                } else {
                    long f95980e = responseBody.getF95980e();
                    this.f74843o = f95980e != -1 ? f95980e - j13 : -1L;
                }
                this.f74842n = true;
                w(iVar);
                try {
                    y(j13);
                    return this.f74843o;
                } catch (HttpDataSource$HttpDataSourceException e13) {
                    x();
                    throw e13;
                }
            } catch (InterruptedException unused2) {
                newCall.cancel();
                throw new InterruptedIOException();
            } catch (ExecutionException e14) {
                throw new IOException(e14);
            }
        } catch (IOException e15) {
            throw HttpDataSource$HttpDataSourceException.b(e15, 1);
        }
    }

    @Override // g7.f
    public final Map e() {
        Response response = this.f74840l;
        return response == null ? Collections.emptyMap() : response.f95725f.i();
    }

    @Override // g7.f
    public final Uri r() {
        Response response = this.f74840l;
        if (response != null) {
            return Uri.parse(response.f95720a.f95700a.f95639i);
        }
        i iVar = this.f74839k;
        if (iVar != null) {
            return iVar.f63786a;
        }
        return null;
    }

    @Override // a7.k
    public final int read(byte[] bArr, int i13, int i14) {
        if (i14 == 0) {
            return 0;
        }
        try {
            long j13 = this.f74843o;
            if (j13 != -1) {
                long j14 = j13 - this.f74844p;
                if (j14 != 0) {
                    i14 = (int) Math.min(i14, j14);
                }
                return -1;
            }
            InputStream inputStream = this.f74841m;
            int i15 = n0.f53866a;
            int read = inputStream.read(bArr, i13, i14);
            if (read == -1) {
                return -1;
            }
            this.f74844p += read;
            t(read);
            return read;
        } catch (IOException e13) {
            int i16 = n0.f53866a;
            throw HttpDataSource$HttpDataSourceException.b(e13, 2);
        }
    }

    public final void x() {
        Response response = this.f74840l;
        if (response != null) {
            ResponseBody responseBody = response.f95726g;
            responseBody.getClass();
            responseBody.close();
        }
        this.f74841m = null;
    }

    public final void y(long j13) {
        if (j13 == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j13 > 0) {
            try {
                int min = (int) Math.min(j13, 4096);
                InputStream inputStream = this.f74841m;
                int i13 = n0.f53866a;
                int read = inputStream.read(bArr, 0, min);
                if (Thread.currentThread().isInterrupted()) {
                    throw new InterruptedIOException();
                }
                if (read == -1) {
                    throw new HttpDataSource$HttpDataSourceException(2008);
                }
                j13 -= read;
                t(read);
            } catch (IOException e13) {
                if (!(e13 instanceof HttpDataSource$HttpDataSourceException)) {
                    throw new HttpDataSource$HttpDataSourceException(2000);
                }
                throw ((HttpDataSource$HttpDataSourceException) e13);
            }
        }
    }
}
