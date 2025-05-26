package df;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class b1 {

    /* renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f54717a = new ConcurrentHashMap();

    public static final JSONObject a(String accessToken) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        return (JSONObject) f54717a.get(accessToken);
    }

    public static final void b(String key, JSONObject value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        f54717a.put(key, value);
    }
}
