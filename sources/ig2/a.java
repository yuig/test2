package ig2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: g, reason: collision with root package name */
    public static final LinkedHashMap f72242g = new LinkedHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final uh2.b f72243a;

    /* renamed from: b, reason: collision with root package name */
    public final sg2.a f72244b;

    /* renamed from: c, reason: collision with root package name */
    public final vf2.c f72245c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f72246d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReference f72247e;

    /* renamed from: f, reason: collision with root package name */
    public final nd2.a f72248f;

    public a(uh2.b preferencesService, sg2.a configService, ei2.a writer) {
        Intrinsics.checkNotNullParameter(preferencesService, "preferencesService");
        Intrinsics.checkNotNullParameter(configService, "configService");
        Intrinsics.checkNotNullParameter(writer, "writer");
        this.f72243a = preferencesService;
        this.f72244b = configService;
        this.f72245c = writer;
        this.f72246d = new HashMap();
        this.f72247e = new AtomicReference(f72242g);
        this.f72248f = new nd2.a(this, 16);
    }

    public final LinkedHashMap a() {
        LinkedHashMap j13;
        synchronized (this.f72247e) {
            j13 = z0.j(b(), this.f72246d);
        }
        return j13;
    }

    public final Map b() {
        Object obj = this.f72247e.get();
        LinkedHashMap linkedHashMap = f72242g;
        if (obj == linkedHashMap) {
            synchronized (this.f72247e) {
                try {
                    if (this.f72247e.get() == linkedHashMap) {
                        this.f72247e.set(this.f72248f.invoke());
                    }
                    Unit unit = Unit.f80348a;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        Object obj2 = this.f72247e.get();
        Intrinsics.checkNotNullExpressionValue(obj2, "permanentPropertiesReference.get()");
        return (Map) obj2;
    }
}
