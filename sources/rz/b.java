package rz;

import android.net.Uri;
import com.pinterest.api.model.DynamicFeed;
import com.pinterest.api.model.Feed;
import com.pinterest.error.AuthFailureError;
import com.pinterest.error.NetworkErrorWithUrls;
import com.pinterest.error.NetworkResponseError;
import com.pinterest.error.NoConnectionErrorWithUrls;
import com.pinterest.error.ServerError;
import com.pinterest.error.TimeoutErrorWithUrls;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.collections.y0;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.e0;
import kotlin.text.z;
import m60.w;
import nm.u;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.ResponseBody;
import org.apache.http.conn.ConnectTimeoutException;
import pq2.a1;
import pq2.i;
import pq2.k;
import retrofit2.HttpException;
import t00.m;
import v.f1;

/* loaded from: classes.dex */
public abstract class b implements k {

    /* renamed from: a, reason: collision with root package name */
    public final m f110218a;

    /* renamed from: b, reason: collision with root package name */
    public final w f110219b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f110220c;

    /* renamed from: d, reason: collision with root package name */
    public final List f110221d;

    public b(m failureRouter, w eventManager, boolean z13) {
        Intrinsics.checkNotNullParameter(failureRouter, "failureRouter");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        this.f110218a = failureRouter;
        this.f110219b = eventManager;
        this.f110220c = z13;
        this.f110221d = f0.j("/v3/", "/v4/", "/vx/", "/");
    }

    public static Exception c(Throwable throwable, i call) {
        Map d2;
        Headers headers;
        ResponseBody responseBody;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(call, "call");
        if (!(throwable instanceof SocketTimeoutException) && !(throwable instanceof ConnectTimeoutException) && !(throwable instanceof InterruptedIOException)) {
            if (throwable instanceof MalformedURLException) {
                return new RuntimeException(a.a.j("Bad URL ", call.d().f95700a.b()), throwable);
            }
            if (!(throwable instanceof HttpException)) {
                if (throwable instanceof IOException) {
                    return new NoConnectionErrorWithUrls(d(call), throwable);
                }
                throwable.toString();
                return new NetworkResponseError(throwable);
            }
            HttpException httpException = (HttpException) throwable;
            a1 a1Var = httpException.f107723c;
            LinkedHashMap linkedHashMap = null;
            byte[] bytes = (a1Var == null || (responseBody = a1Var.f100991c) == null) ? null : responseBody.bytes();
            if (a1Var != null && (headers = a1Var.f100989a.f95725f) != null) {
                TreeMap i13 = headers.i();
                linkedHashMap = new LinkedHashMap(y0.a(i13.size()));
                for (Map.Entry entry : i13.entrySet()) {
                    linkedHashMap.put(entry.getKey(), CollectionsKt.H0((Collection) entry.getValue()));
                }
            }
            if (linkedHashMap != null) {
                d2 = new LinkedHashMap();
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    Iterator it = ((Iterable) entry2.getValue()).iterator();
                    while (it.hasNext()) {
                        d2.put(entry2.getKey(), (String) it.next());
                    }
                }
            } else {
                d2 = z0.d();
            }
            byte[] bArr = bytes == null ? new byte[0] : bytes;
            int i14 = httpException.f107721a;
            f1 response = new f1(i14, bArr, d2);
            if (bytes == null) {
                return new NetworkErrorWithUrls(response, d(call));
            }
            if (i14 != 301 && i14 != 302 && i14 != 401 && i14 != 403) {
                return new ServerError(response, d(call));
            }
            Intrinsics.checkNotNullParameter(response, "response");
            return new AuthFailureError(response);
        }
        return new TimeoutErrorWithUrls(d(call));
    }

    public static String d(i iVar) {
        Uri parse;
        StringBuilder sb3 = new StringBuilder();
        String b13 = iVar.d().f95700a.b();
        String b14 = iVar.d().f95700a.b();
        if (b13.length() > 0 && (parse = Uri.parse(b13)) != null) {
            sb3.append("Orig: ");
            sb3.append(parse.getPath());
        }
        if (b14.length() > 0 && !Intrinsics.d(b14, b13)) {
            if (sb3.length() > 0) {
                sb3.append(" ");
            }
            Uri parse2 = Uri.parse(b13);
            if (parse2 != null) {
                sb3.append("Redirect: ");
                sb3.append(parse2.getPath());
            }
        }
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "toString(...)");
        return sb4;
    }

    public static void e(Object obj, m failureRouter, Request request) {
        Intrinsics.checkNotNullParameter(failureRouter, "failureRouter");
        Intrinsics.checkNotNullParameter(request, "request");
        if (obj instanceof NetworkResponseError) {
            String b13 = request.f95700a.b();
            f1 f1Var = ((NetworkResponseError) obj).f45043a;
            byte[] bArr = f1Var != null ? (byte[]) f1Var.f123451d : null;
            if (bArr != null) {
                failureRouter.b(new String(bArr, Charsets.UTF_8), b13, (Throwable) obj);
            } else {
                failureRouter.a(new qz.d(), b13, (Throwable) obj);
            }
        }
    }

    public final String f(Request request) {
        String b13 = request.f95700a.b();
        Iterator it = this.f110221d.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String str = (String) it.next();
            if (z.p(b13, str, false)) {
                b13 = e0.y(str.length(), b13);
                break;
            }
        }
        return a.a.D(b13, "?", request.f95700a.d());
    }

    public final void g(Object obj, Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (obj instanceof Feed) {
            ((Feed) obj).f35558j = f(request);
            return;
        }
        if (obj instanceof DynamicFeed) {
            ((DynamicFeed) obj).f35555c = f(request);
            return;
        }
        if (obj instanceof qr0.e) {
            ((qr0.e) obj).f104965b = f(request);
            return;
        }
        if (obj instanceof vd0.b) {
            ((vd0.b) obj).f125621c = f(request);
        } else if (obj instanceof vd0.c) {
            vd0.c cVar = (vd0.c) obj;
            if (cVar.f125623a.f91366a.containsKey("url")) {
                return;
            }
            String f13 = f(request);
            u uVar = cVar.f125623a;
            uVar.u("url", f13);
            uVar.t("url_property_added_by_adapter_factory", Boolean.TRUE);
        }
    }
}
