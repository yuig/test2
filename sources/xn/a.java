package xn;

import com.appsflyer.AdRevenueScheme;
import com.linecorp.linesdk.LineIdToken;
import io.jsonwebtoken.Claims;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final long f135412a = TimeUnit.DAYS.toSeconds(10000);

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f135413b = 0;

    public static LineIdToken a(String str, Claims claims) {
        LineIdToken.Address address;
        com.linecorp.linesdk.c cVar = new com.linecorp.linesdk.c();
        cVar.f34116a = str;
        cVar.f34117b = claims.getIssuer();
        cVar.f34118c = claims.getSubject();
        cVar.f34119d = claims.getAudience();
        cVar.f34120e = claims.getExpiration();
        cVar.f34121f = claims.getIssuedAt();
        cVar.f34122g = (Date) claims.get("auth_time", Date.class);
        cVar.f34123h = (String) claims.get("nonce", String.class);
        cVar.f34124i = (List) claims.get("amr", List.class);
        cVar.f34125j = (String) claims.get("name", String.class);
        cVar.f34126k = (String) claims.get("picture", String.class);
        cVar.f34127l = (String) claims.get("phone_number", String.class);
        cVar.f34128m = (String) claims.get("email", String.class);
        cVar.f34129n = (String) claims.get("gender", String.class);
        cVar.f34130o = (String) claims.get("birthdate", String.class);
        Map map = (Map) claims.get("address", Map.class);
        if (map == null) {
            address = null;
        } else {
            com.linecorp.linesdk.b bVar = new com.linecorp.linesdk.b();
            bVar.f34111a = (String) map.get("street_address");
            bVar.f34112b = (String) map.get("locality");
            bVar.f34113c = (String) map.get("region");
            bVar.f34114d = (String) map.get("postal_code");
            bVar.f34115e = (String) map.get(AdRevenueScheme.COUNTRY);
            address = new LineIdToken.Address(bVar);
        }
        cVar.f34131p = address;
        cVar.f34132q = (String) claims.get("given_name", String.class);
        cVar.f34133r = (String) claims.get("given_name_pronunciation", String.class);
        cVar.f34134s = (String) claims.get("middle_name", String.class);
        cVar.f34135t = (String) claims.get("family_name", String.class);
        cVar.f34136u = (String) claims.get("family_name_pronunciation", String.class);
        return new LineIdToken(cVar);
    }
}
