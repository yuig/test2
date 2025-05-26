package zd0;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f141672a;

    /* renamed from: b, reason: collision with root package name */
    public final String f141673b;

    /* renamed from: c, reason: collision with root package name */
    public final cw0.c f141674c;

    /* renamed from: d, reason: collision with root package name */
    public final double f141675d;

    /* renamed from: e, reason: collision with root package name */
    public final String f141676e;

    /* renamed from: f, reason: collision with root package name */
    public final String f141677f;

    public e(String id3, String key, cw0.c type, double d2, String name, String path) {
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(path, "path");
        this.f141672a = id3;
        this.f141673b = key;
        this.f141674c = type;
        this.f141675d = d2;
        this.f141676e = name;
        this.f141677f = path;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f141672a, eVar.f141672a) && Intrinsics.d(this.f141673b, eVar.f141673b) && this.f141674c == eVar.f141674c && Double.compare(this.f141675d, eVar.f141675d) == 0 && Intrinsics.d(this.f141676e, eVar.f141676e) && Intrinsics.d(this.f141677f, eVar.f141677f);
    }

    public final int hashCode() {
        return this.f141677f.hashCode() + cb.d(this.f141676e, a.c.a(this.f141675d, (this.f141674c.hashCode() + cb.d(this.f141673b, this.f141672a.hashCode() * 31, 31)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("IdeaPinFontEntity(id=");
        sb3.append(this.f141672a);
        sb3.append(", key=");
        sb3.append(this.f141673b);
        sb3.append(", type=");
        sb3.append(this.f141674c);
        sb3.append(", lineHeight=");
        sb3.append(this.f141675d);
        sb3.append(", name=");
        sb3.append(this.f141676e);
        sb3.append(", path=");
        return a.a.p(sb3, this.f141677f, ")");
    }
}
