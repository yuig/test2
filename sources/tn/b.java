package tn;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.credentials.playservices.HiddenActivity$$ExternalSyntheticOutline0;
import com.linecorp.linesdk.LineAccessToken;
import com.linecorp.linesdk.LineApiError;
import gi.m;
import java.util.Collections;
import java.util.LinkedHashMap;
import kh2.u2;
import wn.j;
import xn.e;
import xn.g;

/* loaded from: classes3.dex */
public final class b implements sn.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f118588a;

    /* renamed from: b, reason: collision with root package name */
    public final e f118589b;

    /* renamed from: c, reason: collision with root package name */
    public final m f118590c;

    static {
        rn.b.a(rn.c.INTERNAL_ERROR, new LineApiError("access token is null"));
    }

    public b(String str, e eVar, g gVar, m mVar) {
        this.f118588a = str;
        this.f118589b = eVar;
        this.f118590c = mVar;
    }

    @Override // sn.a
    public final rn.b a() {
        m mVar = this.f118590c;
        try {
            wn.e x13 = mVar.x();
            if (x13 != null) {
                String str = x13.f130438d;
                if (!TextUtils.isEmpty(str)) {
                    e eVar = this.f118589b;
                    Uri I = u2.I(eVar.f135426a, "oauth2/v2.1", "token");
                    LinkedHashMap B = u2.B("grant_type", "refresh_token", "refresh_token", x13.f130438d, "client_id", this.f118588a);
                    rn.b f13 = eVar.f135427b.f(I, Collections.emptyMap(), B, e.f135423f);
                    if (!f13.d()) {
                        return rn.b.a(f13.f108809a, f13.f108811c);
                    }
                    j jVar = (j) f13.c();
                    if (!TextUtils.isEmpty(jVar.f130459c)) {
                        str = jVar.f130459c;
                    }
                    String str2 = jVar.f130457a;
                    long j13 = jVar.f130458b;
                    long currentTimeMillis = System.currentTimeMillis();
                    try {
                        ((Context) mVar.f65095d).getSharedPreferences((String) mVar.f65093b, 0).edit().putString("accessToken", mVar.v(str2)).putString("expiresIn", mVar.u(j13)).putString("issuedClientTime", mVar.u(currentTimeMillis)).putString("refreshToken", mVar.v(str)).apply();
                        return rn.b.b(new LineAccessToken(str2, j13, currentTimeMillis));
                    } catch (Exception e13) {
                        return rn.b.a(rn.c.INTERNAL_ERROR, new LineApiError(HiddenActivity$$ExternalSyntheticOutline0.m(e13, new StringBuilder("save access token fail:"))));
                    }
                }
            }
            return rn.b.a(rn.c.INTERNAL_ERROR, new LineApiError("access token or refresh token is not found."));
        } catch (Exception e14) {
            return rn.b.a(rn.c.INTERNAL_ERROR, new LineApiError(HiddenActivity$$ExternalSyntheticOutline0.m(e14, new StringBuilder("get access token fail:"))));
        }
    }
}
