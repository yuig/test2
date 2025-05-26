package lu1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import pk.h1;
import tb0.h;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final h f84975a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f84976b;

    public d(h crashReporting, h1 activityClassProviderMap) {
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        Intrinsics.checkNotNullParameter(activityClassProviderMap, "activityClassProviderMap");
        this.f84975a = crashReporting;
        this.f84976b = activityClassProviderMap;
    }

    public final Class a(a activityKey) {
        Intrinsics.checkNotNullParameter(activityKey, "activityKey");
        Map map = this.f84976b;
        String str = "getting Activity class for " + activityKey + ", with " + map.size() + " activities registered";
        h hVar = this.f84975a;
        hVar.h(str);
        if (map.containsKey(activityKey)) {
            Object obj = map.get(activityKey);
            Intrinsics.f(obj);
            return (Class) obj;
        }
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            hVar.h(((a) ((Map.Entry) it.next()).getKey()) + " is registered with DefaultActivityIntentFactory");
        }
        throw new IllegalStateException(activityKey + " not registered with ActivityIntentFactory");
    }

    public final Intent b(Context context, a activityKey) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(activityKey, "activityKey");
        return new Intent(context, (Class<?>) a(activityKey));
    }

    public final boolean c(Activity activity, a activityKey) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(activityKey, "activityKey");
        return Intrinsics.d(activity.getClass(), a(activityKey));
    }
}
