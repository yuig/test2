package le;

import a.cb;
import com.facebook.FacebookRequestError;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: e, reason: collision with root package name */
    public static final String f83043e = e0.class.getCanonicalName();

    /* renamed from: a, reason: collision with root package name */
    public final HttpURLConnection f83044a;

    /* renamed from: b, reason: collision with root package name */
    public final JSONObject f83045b;

    /* renamed from: c, reason: collision with root package name */
    public final FacebookRequestError f83046c;

    /* renamed from: d, reason: collision with root package name */
    public final JSONObject f83047d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e0(a0 request, HttpURLConnection httpURLConnection, FacebookRequestError error) {
        this(request, httpURLConnection, null, null, error);
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(error, "error");
    }

    public final String toString() {
        String str;
        try {
            Locale locale = Locale.US;
            Object[] objArr = new Object[1];
            HttpURLConnection httpURLConnection = this.f83044a;
            objArr[0] = Integer.valueOf(httpURLConnection == null ? 200 : httpURLConnection.getResponseCode());
            str = String.format(locale, "%d", Arrays.copyOf(objArr, 1));
            Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(locale, format, *args)");
        } catch (IOException unused) {
            str = "unknown";
        }
        StringBuilder o13 = cb.o("{Response:  responseCode: ", str, ", graphObject: ");
        o13.append(this.f83045b);
        o13.append(", error: ");
        o13.append(this.f83046c);
        o13.append("}");
        String sb3 = o13.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder()\n        .append(\"{Response: \")\n        .append(\" responseCode: \")\n        .append(responseCode)\n        .append(\", graphObject: \")\n        .append(graphObject)\n        .append(\", error: \")\n        .append(error)\n        .append(\"}\")\n        .toString()");
        return sb3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e0(a0 request, HttpURLConnection httpURLConnection, String rawResponse, JSONObject jSONObject) {
        this(request, httpURLConnection, jSONObject, null, null);
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(rawResponse, "rawResponse");
    }

    public e0(a0 request, HttpURLConnection httpURLConnection, JSONObject jSONObject, JSONArray jSONArray, FacebookRequestError facebookRequestError) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f83044a = httpURLConnection;
        this.f83045b = jSONObject;
        this.f83046c = facebookRequestError;
        this.f83047d = jSONObject;
    }
}
