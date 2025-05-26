package zh0;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;
import okhttp3.MultipartBody;
import okhttp3.RequestBody$Companion$toRequestBody$2;

/* loaded from: classes.dex */
public abstract class d {
    public static final MultipartBody.Part a(RequestBody$Companion$toRequestBody$2 requestBody$Companion$toRequestBody$2, String name, String encoding, String filename) {
        Intrinsics.checkNotNullParameter(requestBody$Companion$toRequestBody$2, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(encoding, "encoding");
        Intrinsics.checkNotNullParameter(filename, "filename");
        String q13 = a.a.q(new StringBuilder("form-data; name=\""), name, "\"; filename=\"", filename, "\"");
        Headers.Builder builder = new Headers.Builder();
        builder.d("Content-Disposition", q13);
        builder.d("Content-Transfer-Encoding", encoding);
        Headers e13 = builder.e();
        MultipartBody.Part.f95670c.getClass();
        return MultipartBody.Part.Companion.a(e13, requestBody$Companion$toRequestBody$2);
    }
}
