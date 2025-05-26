package y42;

import com.google.gson.reflect.TypeToken;
import i91.h0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kk2.t;
import kotlin.jvm.internal.Intrinsics;
import qz.f0;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final n20.a f137708a;

    /* renamed from: b, reason: collision with root package name */
    public final List f137709b;

    public c(n20.a logApi, List params) {
        Intrinsics.checkNotNullParameter(logApi, "logApi");
        Intrinsics.checkNotNullParameter(params, "params");
        this.f137708a = logApi;
        this.f137709b = params;
    }

    public final void a(h0 onSuccess, h0 onError) {
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        List list = this.f137709b;
        Object obj = list.get(0);
        Intrinsics.g(obj, "null cannot be cast to non-null type com.pinterest.api.RequestParams");
        f0 f0Var = (f0) obj;
        Object obj2 = list.get(1);
        Intrinsics.g(obj2, "null cannot be cast to non-null type kotlin.String");
        Object obj3 = list.get(2);
        Intrinsics.g(obj3, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj3;
        f0Var.e("event", "pin_create_success");
        f0Var.e("pin_id", str);
        f0Var.e("client", "android");
        Map map = (Map) vd0.c.f125622b.d((String) obj2, new TypeToken<Map<String, ? extends String>>() { // from class: com.pinterest.service.PinCreateLogRequest$metadataToQuery$map$1
        }.f33847b);
        for (String str2 : map.keySet()) {
            String str3 = (String) map.get(str2);
            if (str3 != null) {
                f0Var.e(str2, str3);
            }
        }
        LinkedHashMap i13 = f0Var.i();
        String str4 = (String) i13.get("user_mention_tags");
        String str5 = (String) i13.get("method");
        String str6 = (String) i13.get("share_twitter");
        String str7 = (String) i13.get("description");
        String str8 = (String) i13.get("media");
        String str9 = (String) i13.get("title");
        String str10 = (String) i13.get("url");
        String str11 = (String) i13.get("board_id");
        String str12 = (String) i13.get("guid");
        n20.a aVar = this.f137708a;
        aVar.getClass();
        if (str12 == null) {
            str12 = "";
        }
        t l13 = aVar.f88963a.a(str4, str5, str6, str7, str8, str9, str10, str11, "android", str12, "pin_create_success", str).l(tk2.e.f118017c);
        Intrinsics.checkNotNullExpressionValue(l13, "observeOn(...)");
        Intrinsics.checkNotNullExpressionValue(l13.o(onSuccess, onError), "subscribe(...)");
    }
}
