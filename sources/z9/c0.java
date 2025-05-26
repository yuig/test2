package z9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final r0 f141166a;

    /* renamed from: b, reason: collision with root package name */
    public final int f141167b;

    /* renamed from: c, reason: collision with root package name */
    public final String f141168c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f141169d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f141170e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f141171f;

    /* renamed from: g, reason: collision with root package name */
    public final s0 f141172g;

    /* renamed from: h, reason: collision with root package name */
    public final String f141173h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f141174i;

    public c0(s0 provider, String startDestination, String str) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(startDestination, "startDestination");
        provider.getClass();
        Intrinsics.checkNotNullParameter(d0.class, "navigatorClass");
        r0 navigator = provider.b(g4.u.n0(d0.class));
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f141166a = navigator;
        this.f141167b = -1;
        this.f141168c = str;
        this.f141169d = new LinkedHashMap();
        this.f141170e = new ArrayList();
        this.f141171f = new LinkedHashMap();
        this.f141174i = new ArrayList();
        this.f141172g = provider;
        this.f141173h = startDestination;
    }

    public final z a() {
        z a13 = this.f141166a.a();
        a13.f141325d = null;
        for (Map.Entry entry : this.f141169d.entrySet()) {
            String argumentName = (String) entry.getKey();
            g argument = (g) entry.getValue();
            Intrinsics.checkNotNullParameter(argumentName, "argumentName");
            Intrinsics.checkNotNullParameter(argument, "argument");
            a13.f141328g.put(argumentName, argument);
        }
        Iterator it = this.f141170e.iterator();
        while (it.hasNext()) {
            a13.b((w) it.next());
        }
        for (Map.Entry entry2 : this.f141171f.entrySet()) {
            a13.n(((Number) entry2.getKey()).intValue(), (f) entry2.getValue());
        }
        String str = this.f141168c;
        if (str != null) {
            a13.p(str);
        }
        int i13 = this.f141167b;
        if (i13 != -1) {
            a13.f141329h = i13;
            a13.f141324c = null;
        }
        return a13;
    }
}
