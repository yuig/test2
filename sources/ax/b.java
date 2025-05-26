package ax;

import android.util.LruCache;
import java.util.List;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    public final LruCache f20589a;

    /* renamed from: b, reason: collision with root package name */
    public String f20590b;

    /* renamed from: c, reason: collision with root package name */
    public String f20591c;

    /* renamed from: d, reason: collision with root package name */
    public int f20592d;

    public b() {
        new LruCache(3);
        this.f20589a = new LruCache(3);
        this.f20590b = "";
        this.f20591c = "";
    }

    public final List a(String uid) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        List list = (List) this.f20589a.get(uid);
        return list == null ? q0.f80391a : list;
    }

    public final int b() {
        return this.f20592d;
    }

    public final String c() {
        return this.f20591c;
    }

    public final String d() {
        return this.f20590b;
    }
}
