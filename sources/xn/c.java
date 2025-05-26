package xn;

import android.net.Uri;
import c0.s0;
import com.google.android.gms.internal.measurement.x;
import com.linecorp.linesdk.LineFriendProfile;
import com.linecorp.linesdk.LineGroup;
import com.linecorp.linesdk.LineProfile;
import com.linecorp.linesdk.openchat.OpenChatRoomInfo;
import com.pinterest.shuffles.scene.composer.AnimatedTarget;
import io.jsonwebtoken.JwsHeader;
import java.util.ArrayList;
import kh2.k3;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import rn.k;
import wn.h;
import wn.i;
import wn.j;

/* loaded from: classes3.dex */
public final class c extends s0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f135420b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i13) {
        super(9);
        this.f135420b = i13;
    }

    public static LineProfile q(JSONObject jSONObject) {
        String optString = jSONObject.optString("pictureUrl", null);
        return new LineProfile(optString == null ? null : Uri.parse(optString), jSONObject.getString("userId"), jSONObject.getString("displayName"), jSONObject.optString("statusMessage", null));
    }

    @Override // c0.s0
    public final Object j(JSONObject jSONObject) {
        int i13 = 0;
        switch (this.f135420b) {
            case 0:
                ArrayList arrayList = new ArrayList();
                JSONArray jSONArray = jSONObject.getJSONArray("keys");
                while (i13 < jSONArray.length()) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i13);
                    jf2.c cVar = new jf2.c();
                    cVar.f75872a = jSONObject2.getString("kty");
                    cVar.f75873b = jSONObject2.getString(JwsHeader.ALGORITHM);
                    cVar.f75874c = jSONObject2.getString("use");
                    cVar.f75875d = jSONObject2.getString(JwsHeader.KEY_ID);
                    cVar.f75876e = jSONObject2.getString("crv");
                    cVar.f75877f = jSONObject2.getString("x");
                    cVar.f75878g = jSONObject2.getString("y");
                    arrayList.add(new wn.g(cVar));
                    i13++;
                }
                za.c cVar2 = new za.c(2);
                cVar2.f141454b = arrayList;
                return new h(cVar2);
            case 1:
                String string = jSONObject.getString("token_type");
                if ("Bearer".equals(string)) {
                    return new j(jSONObject.getString("access_token"), jSONObject.getLong("expires_in") * 1000, jSONObject.getString("refresh_token"), rn.j.c(jSONObject.getString("scope")));
                }
                throw new JSONException(a.a.j("Illegal token type. token_type=", string));
            case 2:
                return new wn.a(jSONObject.getLong("expires_in") * 1000, jSONObject.getString("client_id"), rn.j.c(jSONObject.getString("scope")));
            case 3:
                jf2.c cVar3 = new jf2.c();
                cVar3.f75872a = jSONObject.getString("issuer");
                cVar3.f75873b = jSONObject.getString("authorization_endpoint");
                cVar3.f75874c = jSONObject.getString("token_endpoint");
                cVar3.f75875d = jSONObject.getString("jwks_uri");
                cVar3.f75876e = k3.V1(jSONObject.getJSONArray("response_types_supported"));
                cVar3.f75877f = k3.V1(jSONObject.getJSONArray("subject_types_supported"));
                cVar3.f75878g = k3.V1(jSONObject.getJSONArray("id_token_signing_alg_values_supported"));
                return new i(cVar3);
            case 4:
                ArrayList arrayList2 = new ArrayList();
                JSONArray jSONArray2 = jSONObject.getJSONArray("friends");
                while (i13 < jSONArray2.length()) {
                    JSONObject jSONObject3 = jSONArray2.getJSONObject(i13);
                    LineProfile q13 = q(jSONObject3);
                    arrayList2.add(new LineFriendProfile(q13.f34061a, q13.f34062b, q13.f34063c, q13.f34064d, jSONObject3.optString("displayNameOverridden", null)));
                    i13++;
                }
                return new x(17, arrayList2, jSONObject.optString("pageToken", null));
            case 5:
                boolean z13 = jSONObject.getBoolean("friendFlag");
                rn.d dVar = new rn.d();
                dVar.f108812a = z13;
                return dVar;
            case 6:
                ArrayList arrayList3 = new ArrayList();
                JSONArray jSONArray3 = jSONObject.getJSONArray("groups");
                while (i13 < jSONArray3.length()) {
                    JSONObject jSONObject4 = jSONArray3.getJSONObject(i13);
                    String optString = jSONObject4.optString("pictureUrl", null);
                    arrayList3.add(new LineGroup(optString == null ? null : Uri.parse(optString), jSONObject4.getString("groupId"), jSONObject4.getString("groupName")));
                    i13++;
                }
                return new bh.b(21, arrayList3, jSONObject.optString("pageToken", null));
            case 7:
                return ao.a.valueOf(jSONObject.getString(AnimatedTarget.PROPERTY_STATE).toUpperCase());
            case 8:
                ArrayList arrayList4 = new ArrayList();
                if (jSONObject.has("results")) {
                    JSONArray jSONArray4 = jSONObject.getJSONArray("results");
                    while (i13 < jSONArray4.length()) {
                        JSONObject jSONObject5 = jSONArray4.getJSONObject(i13);
                        Object obj = jSONObject5.get("status");
                        k kVar = k.OK;
                        if (!obj.equals(kVar.name().toLowerCase())) {
                            kVar = k.DISCARDED;
                        }
                        arrayList4.add(new x(18, jSONObject5.getString("to"), kVar));
                        i13++;
                    }
                }
                return arrayList4;
            case 9:
                return Boolean.valueOf(jSONObject.getBoolean("agreed"));
            case 10:
                return new OpenChatRoomInfo(jSONObject.getString("openchatId"), jSONObject.getString("url"));
            case 11:
                return ao.b.valueOf(jSONObject.getString("type").toUpperCase());
            case 12:
                return ao.c.valueOf(jSONObject.getString("status").toUpperCase());
            default:
                return q(jSONObject);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i13, int i14) {
        this(1);
        this.f135420b = i13;
        int i15 = 2;
        if (i13 != 2) {
        } else {
            this(i15);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i13, Object obj) {
        this(7);
        this.f135420b = i13;
        switch (i13) {
            case 9:
                this(9);
                break;
            case 10:
                this(10);
                break;
            case 11:
                this(11);
                break;
            case 12:
                this(12);
                break;
            default:
                break;
        }
    }
}
