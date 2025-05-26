package f72;

import a.cb;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@no2.g
/* loaded from: classes4.dex */
public final class w1 {

    @NotNull
    public static final v1 Companion = new v1();

    /* renamed from: e, reason: collision with root package name */
    public static final no2.b[] f61377e = {null, null, null, new qo2.d(qo2.j1.f104576a, 0)};

    /* renamed from: a, reason: collision with root package name */
    public final String f61378a;

    /* renamed from: b, reason: collision with root package name */
    public final String f61379b;

    /* renamed from: c, reason: collision with root package name */
    public final int f61380c;

    /* renamed from: d, reason: collision with root package name */
    public final List f61381d;

    public w1(int i13, String str, String str2, int i14, List list) {
        if (15 != (i13 & 15)) {
            kg.t.b1(i13, 15, u1.f61372b);
            throw null;
        }
        this.f61378a = str;
        this.f61379b = str2;
        this.f61380c = i14;
        this.f61381d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w1)) {
            return false;
        }
        w1 w1Var = (w1) obj;
        return Intrinsics.d(this.f61378a, w1Var.f61378a) && Intrinsics.d(this.f61379b, w1Var.f61379b) && this.f61380c == w1Var.f61380c && Intrinsics.d(this.f61381d, w1Var.f61381d);
    }

    public final int hashCode() {
        return this.f61381d.hashCode() + ep.b.b(this.f61380c, cb.d(this.f61379b, this.f61378a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("TemplateConfigEntity(id=");
        sb3.append(this.f61378a);
        sb3.append(", type=");
        sb3.append(this.f61379b);
        sb3.append(", sequence_id=");
        sb3.append(this.f61380c);
        sb3.append(", labels=");
        return a.c.j(sb3, this.f61381d, ")");
    }
}
