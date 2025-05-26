package xn;

import android.text.TextUtils;
import android.util.Log;
import c0.s0;
import com.linecorp.linesdk.LineIdToken;
import io.jsonwebtoken.Jwts;
import org.json.JSONException;
import org.json.JSONObject;
import rn.j;

/* loaded from: classes3.dex */
public final class d extends s0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f135421b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final Object f135422c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar) {
        super(9);
        this.f135422c = eVar;
    }

    @Override // c0.s0
    public final Object j(JSONObject jSONObject) {
        switch (this.f135421b) {
            case 0:
                String string = jSONObject.getString("token_type");
                if (!"Bearer".equals(string)) {
                    throw new JSONException(a.a.j("Illegal token type. token_type=", string));
                }
                try {
                    return new wn.f(new wn.e(1000 * jSONObject.getLong("expires_in"), System.currentTimeMillis(), jSONObject.getString("access_token"), jSONObject.getString("refresh_token")), j.c(jSONObject.getString("scope")), q(jSONObject.optString("id_token")));
                } catch (Exception e13) {
                    throw new JSONException(e13.getMessage());
                }
            default:
                return jSONObject.getString((String) this.f135422c);
        }
    }

    public final LineIdToken q(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ll.j jVar = ((e) this.f135422c).f135429d;
        int i13 = a.f135413b;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return a.a(str, Jwts.parser().setAllowedClockSkewSeconds(a.f135412a).setSigningKeyResolver(jVar).parseClaimsJws(str).getBody());
        } catch (Exception e13) {
            Log.e("IdTokenParser", "failed to parse IdToken: " + str, e13);
            throw e13;
        }
    }

    public /* synthetic */ d(e eVar, int i13) {
        this(eVar);
    }
}
