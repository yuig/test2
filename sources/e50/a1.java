package e50;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f57258a;

    /* renamed from: b, reason: collision with root package name */
    public final String f57259b;

    /* renamed from: c, reason: collision with root package name */
    public final y0 f57260c;

    /* renamed from: d, reason: collision with root package name */
    public final z0 f57261d;

    /* renamed from: e, reason: collision with root package name */
    public final List f57262e;

    public a1(Object obj, String str, y0 y0Var, z0 z0Var, List list) {
        this.f57258a = obj;
        this.f57259b = str;
        this.f57260c = y0Var;
        this.f57261d = z0Var;
        this.f57262e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        return Intrinsics.d(this.f57258a, a1Var.f57258a) && Intrinsics.d(this.f57259b, a1Var.f57259b) && Intrinsics.d(this.f57260c, a1Var.f57260c) && Intrinsics.d(this.f57261d, a1Var.f57261d) && Intrinsics.d(this.f57262e, a1Var.f57262e);
    }

    public final int hashCode() {
        Object obj = this.f57258a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        String str = this.f57259b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        y0 y0Var = this.f57260c;
        int hashCode3 = (hashCode2 + (y0Var == null ? 0 : y0Var.hashCode())) * 31;
        z0 z0Var = this.f57261d;
        int hashCode4 = (hashCode3 + (z0Var == null ? 0 : z0Var.hashCode())) * 31;
        List list = this.f57262e;
        return hashCode4 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Notice(style=");
        sb3.append(this.f57258a);
        sb3.append(", title=");
        sb3.append(this.f57259b);
        sb3.append(", description=");
        sb3.append(this.f57260c);
        sb3.append(", footer=");
        sb3.append(this.f57261d);
        sb3.append(", actions=");
        return a.c.j(sb3, this.f57262e, ")");
    }
}
