package el;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class e0 {

    /* renamed from: b, reason: collision with root package name */
    public static final e0 f59476b = new e0();

    /* renamed from: c, reason: collision with root package name */
    public static final d0 f59477c = new d0();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f59478a = new AtomicReference();

    public final d0 a() {
        d0 d0Var = (d0) this.f59478a.get();
        return d0Var == null ? f59477c : d0Var;
    }
}
