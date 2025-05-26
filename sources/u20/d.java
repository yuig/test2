package u20;

import hk2.o;
import java.util.HashMap;
import jk2.i1;
import kotlin.Pair;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import nm.u;
import p1.v;
import p32.f;
import p32.i;
import qz.f0;
import uj2.b0;
import uj2.q;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final a f120066a;

    /* renamed from: b, reason: collision with root package name */
    public final b f120067b;

    /* renamed from: c, reason: collision with root package name */
    public final qz.a f120068c;

    public d(a sendShareService, b sendShareServiceTrk, qz.a cache) {
        Intrinsics.checkNotNullParameter(sendShareService, "sendShareService");
        Intrinsics.checkNotNullParameter(sendShareServiceTrk, "sendShareServiceTrk");
        Intrinsics.checkNotNullParameter(cache, "cache");
        this.f120066a = sendShareService;
        this.f120067b = sendShareServiceTrk;
        this.f120068c = cache;
    }

    public static q d(d dVar, int i13) {
        dVar.getClass();
        Pair pair = new Pair("page_size", Integer.valueOf(i13));
        n00.c cVar = n00.c.SEND_SHARE_CONTACT;
        HashMap f13 = z0.f(pair, new Pair("add_fields", n00.b.a(cVar)), new Pair("add_fields", n00.b.a(cVar)), new Pair("hide_group_conversations", "false"));
        f0 f0Var = new f0();
        f0Var.c(i13, "page_size");
        f0Var.e("add_fields", n00.b.a(cVar));
        f0Var.e("hide_group_conversations", "false");
        vd0.c a13 = dVar.f120068c.a(f0Var);
        if (a13 == null) {
            return dVar.a(f13, f0Var);
        }
        i1 y13 = q.y(a13);
        Intrinsics.checkNotNullExpressionValue(y13, "just(...)");
        return y13;
    }

    public final q a(HashMap params, f0 requestParams) {
        String a13;
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(requestParams, "requestParams");
        if (params.containsKey("add_fields") && (params.get("add_fields") instanceof String)) {
            Object obj = params.get("add_fields");
            Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.String");
            a13 = (String) obj;
        } else {
            a13 = n00.b.a(n00.c.SEND_SHARE_CONTACT);
        }
        params.put("api_fields", a13);
        b0<vd0.c> b13 = this.f120066a.b(params);
        c cVar = new c(0, new v(3, this, requestParams));
        b13.getClass();
        q u13 = new o(3, b13, cVar).u();
        Intrinsics.checkNotNullExpressionValue(u13, "toObservable(...)");
        return u13;
    }

    public final b0 b(String objectId, p32.c inviteCategory, i inviteObject, f inviteChannel) {
        Intrinsics.checkNotNullParameter(objectId, "objectId");
        Intrinsics.checkNotNullParameter(inviteCategory, "inviteCategory");
        Intrinsics.checkNotNullParameter(inviteObject, "inviteObject");
        Intrinsics.checkNotNullParameter(inviteChannel, "inviteChannel");
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("object_id", objectId);
        u uVar = new u();
        uVar.s(Integer.valueOf(inviteCategory.getValue()), "invite_category");
        uVar.s(Integer.valueOf(inviteObject.getValue()), "invite_object");
        uVar.s(Integer.valueOf(inviteChannel.getValue()), "invite_channel");
        String sVar = uVar.toString();
        Intrinsics.checkNotNullExpressionValue(sVar, "toString(...)");
        hashMap.put("invite_type", sVar);
        return this.f120066a.a(hashMap);
    }

    public final b0 c(p32.c inviteCategory, i inviteObject, f inviteChannel, String objectId, int i13, String inviteCode, String str) {
        Intrinsics.checkNotNullParameter(inviteCategory, "inviteCategory");
        Intrinsics.checkNotNullParameter(inviteObject, "inviteObject");
        Intrinsics.checkNotNullParameter(inviteChannel, "inviteChannel");
        Intrinsics.checkNotNullParameter(objectId, "objectId");
        Intrinsics.checkNotNullParameter(inviteCode, "inviteCode");
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("invite_source", Integer.valueOf(i13));
        if (inviteCode.length() > 0) {
            hashMap.put("invite_code", inviteCode);
        }
        hashMap.put("object_id", objectId);
        u uVar = new u();
        uVar.s(Integer.valueOf(inviteCategory.getValue()), "invite_category");
        uVar.s(Integer.valueOf(inviteObject.getValue()), "invite_object");
        uVar.s(Integer.valueOf(inviteChannel.getValue()), "invite_channel");
        String sVar = uVar.toString();
        Intrinsics.checkNotNullExpressionValue(sVar, "toString(...)");
        hashMap.put("invite_type", sVar);
        if (str != null) {
            hashMap.put("client_tracking_params", str);
        }
        return this.f120067b.a(hashMap);
    }
}
