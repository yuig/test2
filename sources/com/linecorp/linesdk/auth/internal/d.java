package com.linecorp.linesdk.auth.internal;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import androidx.camera.core.impl.j;
import com.linecorp.linesdk.LineAccessToken;
import com.linecorp.linesdk.LineCredential;
import com.linecorp.linesdk.LineIdToken;
import com.linecorp.linesdk.LineProfile;
import com.linecorp.linesdk.auth.LineLoginResult;
import com.linecorp.linesdk.internal.pkce.PKCECode;
import gi.m;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import kh2.u2;
import wn.i;

/* loaded from: classes3.dex */
public final class d extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f34100a;

    public d(f fVar) {
        this.f34100a = fVar;
    }

    public final void a(LineIdToken lineIdToken, String str) {
        f fVar = this.f34100a;
        rn.b a13 = fVar.f34105c.a();
        if (!a13.d()) {
            throw new RuntimeException("Failed to get OpenId Discovery Document.  Response Code: " + a13.f108809a + " Error Data: " + a13.f108811c);
        }
        i iVar = (i) a13.c();
        j jVar = new j(9);
        jVar.f16875b = lineIdToken;
        jVar.f16876c = iVar.f130450a;
        jVar.f16877d = str;
        jVar.f16878e = fVar.f34104b.f34065a;
        jVar.f16879f = fVar.f34110h.f34089d;
        xn.b bVar = new xn.b(jVar);
        LineIdToken lineIdToken2 = bVar.f135415a;
        String str2 = lineIdToken2.f34036b;
        String str3 = bVar.f135416b;
        if (!str3.equals(str2)) {
            xn.b.a(str3, str2, "OpenId issuer does not match.");
            throw null;
        }
        String str4 = bVar.f135417c;
        if (str4 != null) {
            String str5 = lineIdToken2.f34037c;
            if (!str4.equals(str5)) {
                xn.b.a(str4, str5, "OpenId subject does not match.");
                throw null;
            }
        }
        String str6 = bVar.f135418d;
        String str7 = lineIdToken2.f34038d;
        if (!str6.equals(str7)) {
            xn.b.a(str6, str7, "OpenId audience does not match.");
            throw null;
        }
        String str8 = lineIdToken2.f34042h;
        String str9 = bVar.f135419e;
        if (!(str9 == null && str8 == null) && (str9 == null || !str9.equals(str8))) {
            xn.b.a(str9, str8, "OpenId nonce does not match.");
            throw null;
        }
        Date date = new Date();
        Date date2 = lineIdToken2.f34040f;
        long time = date2.getTime();
        long time2 = date.getTime();
        long j13 = xn.b.f135414f;
        if (time > time2 + j13) {
            throw new RuntimeException("OpenId issuedAt is after current time: " + date2);
        }
        Date date3 = lineIdToken2.f34039e;
        if (date3.getTime() >= date.getTime() - j13) {
            return;
        }
        throw new RuntimeException("OpenId expiresAt is before current time: " + date3);
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        LineProfile lineProfile;
        String str;
        a aVar = ((a[]) objArr)[0];
        if (TextUtils.isEmpty(aVar.f34091a)) {
            throw new UnsupportedOperationException("requestToken is null. Please check result by isSuccess before.");
        }
        f fVar = this.f34100a;
        LineAuthenticationStatus lineAuthenticationStatus = fVar.f34110h;
        PKCECode pKCECode = lineAuthenticationStatus.f34086a;
        String str2 = lineAuthenticationStatus.f34087b;
        String str3 = aVar.f34091a;
        if (TextUtils.isEmpty(str3) || pKCECode == null || TextUtils.isEmpty(str2)) {
            return LineLoginResult.b("Requested data is missing.");
        }
        String str4 = fVar.f34104b.f34065a;
        xn.e eVar = fVar.f34105c;
        rn.b f13 = eVar.f135427b.f(u2.I(eVar.f135426a, "oauth2/v2.1", "token"), Collections.emptyMap(), u2.B("grant_type", "authorization_code", "code", str3, "redirect_uri", str2, "client_id", str4, "code_verifier", pKCECode.f34142a, "id_token_key_type", wn.d.JWK.name(), "client_version", "LINE SDK Android v5.8.0"), eVar.f135428c);
        if (!f13.d()) {
            return LineLoginResult.a(f13.f108809a, f13.f108811c);
        }
        wn.f fVar2 = (wn.f) f13.c();
        wn.e eVar2 = fVar2.f130439a;
        rn.j jVar = rn.j.f108817c;
        List list = fVar2.f130440b;
        if (list.contains(jVar)) {
            xn.g gVar = fVar.f34106d;
            rn.b a13 = gVar.f135434b.a(u2.I(gVar.f135433a, "v2", "profile"), xn.g.a(eVar2), Collections.emptyMap(), xn.g.f135432c);
            if (!a13.d()) {
                return LineLoginResult.a(a13.f108809a, a13.f108811c);
            }
            lineProfile = (LineProfile) a13.c();
            str = lineProfile.f34061a;
        } else {
            lineProfile = null;
            str = null;
        }
        m mVar = fVar.f34108f;
        ((Context) mVar.f65095d).getSharedPreferences((String) mVar.f65093b, 0).edit().putString("accessToken", mVar.v(eVar2.f130435a)).putString("expiresIn", mVar.u(eVar2.f130436b)).putString("issuedClientTime", mVar.u(eVar2.f130437c)).putString("refreshToken", mVar.v(eVar2.f130438d)).apply();
        LineIdToken lineIdToken = fVar2.f130441c;
        if (lineIdToken != null) {
            try {
                a(lineIdToken, str);
            } catch (Exception e13) {
                return LineLoginResult.b(e13.getMessage());
            }
        }
        jf2.c cVar = new jf2.c(7);
        cVar.f75873b = fVar.f34110h.f34089d;
        cVar.f75874c = lineProfile;
        cVar.f75875d = lineIdToken;
        if (TextUtils.isEmpty(aVar.f34091a)) {
            throw new UnsupportedOperationException("requestToken is null. Please check result by isSuccess before.");
        }
        cVar.f75876e = aVar.f34092b;
        cVar.f75877f = new LineCredential(new LineAccessToken(eVar2.f130435a, eVar2.f130436b, eVar2.f130437c), list);
        return new LineLoginResult(cVar);
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        f fVar = this.f34100a;
        LineAuthenticationStatus lineAuthenticationStatus = fVar.f34110h;
        lineAuthenticationStatus.getClass();
        lineAuthenticationStatus.f34090e = h.INTENT_HANDLED;
        fVar.f34103a.a((LineLoginResult) obj);
    }
}
