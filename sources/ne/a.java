package ne;

import df.c0;
import df.e0;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;
import le.v;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f90432a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f90433b;

    public final void a() {
        String rulesFromServer;
        if (p001if.a.b(this)) {
            return;
        }
        try {
            e0 e0Var = e0.f54743a;
            c0 f13 = e0.f(v.b(), false);
            if (f13 == null || (rulesFromServer = f13.f54736m) == null) {
                return;
            }
            CopyOnWriteArraySet copyOnWriteArraySet = c.f90435d;
            Intrinsics.checkNotNullParameter(rulesFromServer, "rulesFromServer");
            try {
                c.a().clear();
                wc.b.j(new JSONObject(rulesFromServer));
            } catch (JSONException unused) {
            }
        } catch (Throwable th3) {
            p001if.a.a(this, th3);
        }
    }
}
