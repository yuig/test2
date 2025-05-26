package cw0;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f53326a;

    /* renamed from: b, reason: collision with root package name */
    public final String f53327b;

    /* renamed from: c, reason: collision with root package name */
    public final c f53328c;

    /* renamed from: d, reason: collision with root package name */
    public final double f53329d;

    /* renamed from: e, reason: collision with root package name */
    public final String f53330e;

    /* renamed from: f, reason: collision with root package name */
    public final String f53331f;

    public a(String id3, String key, c type, double d2, String name, String path) {
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(path, "path");
        this.f53326a = id3;
        this.f53327b = key;
        this.f53328c = type;
        this.f53329d = d2;
        this.f53330e = name;
        this.f53331f = path;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f53326a, aVar.f53326a) && Intrinsics.d(this.f53327b, aVar.f53327b) && this.f53328c == aVar.f53328c && Double.compare(this.f53329d, aVar.f53329d) == 0 && Intrinsics.d(this.f53330e, aVar.f53330e) && Intrinsics.d(this.f53331f, aVar.f53331f);
    }

    public final int hashCode() {
        return this.f53331f.hashCode() + cb.d(this.f53330e, a.c.a(this.f53329d, (this.f53328c.hashCode() + cb.d(this.f53327b, this.f53326a.hashCode() * 31, 31)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("IdeaPinFont(id=");
        sb3.append(this.f53326a);
        sb3.append(", key=");
        sb3.append(this.f53327b);
        sb3.append(", type=");
        sb3.append(this.f53328c);
        sb3.append(", lineHeight=");
        sb3.append(this.f53329d);
        sb3.append(", name=");
        sb3.append(this.f53330e);
        sb3.append(", path=");
        return a.a.p(sb3, this.f53331f, ")");
    }
}
