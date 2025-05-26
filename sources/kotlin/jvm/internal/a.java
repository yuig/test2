package kotlin.jvm.internal;

import a.cb;
import java.io.Serializable;

/* loaded from: classes4.dex */
public abstract class a implements n, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f80413a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f80414b;

    /* renamed from: c, reason: collision with root package name */
    public final String f80415c;

    /* renamed from: d, reason: collision with root package name */
    public final String f80416d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f80417e = false;

    /* renamed from: f, reason: collision with root package name */
    public final int f80418f;

    /* renamed from: g, reason: collision with root package name */
    public final int f80419g;

    public a(int i13, Object obj, Class cls, String str, String str2, int i14) {
        this.f80413a = obj;
        this.f80414b = cls;
        this.f80415c = str;
        this.f80416d = str2;
        this.f80418f = i13;
        this.f80419g = i14 >> 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f80417e == aVar.f80417e && this.f80418f == aVar.f80418f && this.f80419g == aVar.f80419g && Intrinsics.d(this.f80413a, aVar.f80413a) && Intrinsics.d(this.f80414b, aVar.f80414b) && this.f80415c.equals(aVar.f80415c) && this.f80416d.equals(aVar.f80416d);
    }

    @Override // kotlin.jvm.internal.n
    public final int getArity() {
        return this.f80418f;
    }

    public final int hashCode() {
        Object obj = this.f80413a;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.f80414b;
        return ((((cb.d(this.f80416d, cb.d(this.f80415c, (hashCode + (cls != null ? cls.hashCode() : 0)) * 31, 31), 31) + (this.f80417e ? 1231 : 1237)) * 31) + this.f80418f) * 31) + this.f80419g;
    }

    public final String toString() {
        return k0.f80436a.h(this);
    }
}
