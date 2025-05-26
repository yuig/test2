package r72;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class r1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f106635a;

    /* renamed from: b, reason: collision with root package name */
    public final float f106636b;

    /* renamed from: c, reason: collision with root package name */
    public final String f106637c;

    /* renamed from: d, reason: collision with root package name */
    public final float f106638d;

    /* renamed from: e, reason: collision with root package name */
    public final float f106639e;

    /* renamed from: f, reason: collision with root package name */
    public final float f106640f;

    /* renamed from: g, reason: collision with root package name */
    public final String f106641g;

    /* renamed from: h, reason: collision with root package name */
    public final float f106642h;

    /* renamed from: i, reason: collision with root package name */
    public final float f106643i;

    /* renamed from: j, reason: collision with root package name */
    public final String f106644j;

    public r1(String id3, float f13, String name, float f14, float f15, float f16, String url, float f17, float f18, String key) {
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(key, "key");
        this.f106635a = id3;
        this.f106636b = f13;
        this.f106637c = name;
        this.f106638d = f14;
        this.f106639e = f15;
        this.f106640f = f16;
        this.f106641g = url;
        this.f106642h = f17;
        this.f106643i = f18;
        this.f106644j = key;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r1)) {
            return false;
        }
        r1 r1Var = (r1) obj;
        String str = r1Var.f106635a;
        int i13 = s1.f106649a;
        return Intrinsics.d(this.f106635a, str) && Float.compare(this.f106636b, r1Var.f106636b) == 0 && Intrinsics.d(this.f106637c, r1Var.f106637c) && Float.compare(this.f106638d, r1Var.f106638d) == 0 && Float.compare(this.f106639e, r1Var.f106639e) == 0 && Float.compare(this.f106640f, r1Var.f106640f) == 0 && Intrinsics.d(this.f106641g, r1Var.f106641g) && Float.compare(this.f106642h, r1Var.f106642h) == 0 && Float.compare(this.f106643i, r1Var.f106643i) == 0 && Intrinsics.d(this.f106644j, r1Var.f106644j);
    }

    public final int hashCode() {
        int i13 = s1.f106649a;
        return this.f106644j.hashCode() + a.a.a(this.f106643i, a.a.a(this.f106642h, cb.d(this.f106641g, a.a.a(this.f106640f, a.a.a(this.f106639e, a.a.a(this.f106638d, cb.d(this.f106637c, a.a.a(this.f106636b, this.f106635a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ShuffleFont(id=");
        sb3.append(this.f106635a);
        sb3.append(", key=");
        sb3.append(this.f106644j);
        sb3.append(", url=");
        return a.a.p(sb3, this.f106641g, ")");
    }
}
