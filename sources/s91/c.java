package s91;

import com.pinterest.api.model.deserializer.UserDeserializer;
import jk2.e0;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import lh0.m3;
import x02.x2;

/* loaded from: classes5.dex */
public final class c extends xk1.c {

    /* renamed from: k, reason: collision with root package name */
    public final x2 f112049k;

    /* renamed from: l, reason: collision with root package name */
    public final UserDeserializer f112050l;

    /* renamed from: m, reason: collision with root package name */
    public final x10.d f112051m;

    /* renamed from: n, reason: collision with root package name */
    public final yk1.a f112052n;

    /* renamed from: o, reason: collision with root package name */
    public final ll.j f112053o;

    /* renamed from: p, reason: collision with root package name */
    public final b60.b f112054p;

    /* renamed from: q, reason: collision with root package name */
    public final m3 f112055q;

    /* renamed from: r, reason: collision with root package name */
    public final lb0.q f112056r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(x2 userRepository, UserDeserializer userDeserializer, x10.d settingsApi, yk1.a resources, ll.j settingsTextUtils, b60.b activeUserManager, m3 experiments, lb0.q prefsManagerPersisted) {
        super(null);
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(userDeserializer, "userDeserializer");
        Intrinsics.checkNotNullParameter(settingsApi, "settingsApi");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(settingsTextUtils, "settingsTextUtils");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(prefsManagerPersisted, "prefsManagerPersisted");
        this.f112049k = userRepository;
        this.f112050l = userDeserializer;
        this.f112051m = settingsApi;
        this.f112052n = resources;
        this.f112053o = settingsTextUtils;
        this.f112054p = activeUserManager;
        this.f112055q = experiments;
        this.f112056r = prefsManagerPersisted;
        o(0, new sz0.a(26));
        o(1, new sz0.a(27));
        o(2, new sz0.a(28));
        o(3, new sz0.a(29));
        o(19, new b(0));
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        Object obj = CollectionsKt.F0(this.f135191h).get(i13);
        s sVar = obj instanceof s ? (s) obj : null;
        if (sVar != null) {
            return sVar.getViewType();
        }
        throw new IllegalStateException("Item should be SettingsMenuItem");
    }

    @Override // xk1.c
    public final uj2.q k() {
        uj2.q u13 = new hk2.o(0, new e0(this.f112049k.d0().Q("me")), new t81.a(15, new a(this, 0))).k(new t81.a(16, new a(this, 1))).u();
        Intrinsics.checkNotNullExpressionValue(u13, "toObservable(...)");
        return u13;
    }
}
