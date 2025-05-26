package nd;

import android.text.TextUtils;
import m60.f0;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: e, reason: collision with root package name */
    public static final f0 f90417e = new f0();

    /* renamed from: a, reason: collision with root package name */
    public final Object f90418a;

    /* renamed from: b, reason: collision with root package name */
    public final j f90419b;

    /* renamed from: c, reason: collision with root package name */
    public final String f90420c;

    /* renamed from: d, reason: collision with root package name */
    public volatile byte[] f90421d;

    public k(String str, Object obj, j jVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        this.f90420c = str;
        this.f90418a = obj;
        this.f90419b = jVar;
    }

    public static k a(Object obj, String str) {
        return new k(str, obj, f90417e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f90420c.equals(((k) obj).f90420c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f90420c.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("Option{key='"), this.f90420c, "'}");
    }
}
