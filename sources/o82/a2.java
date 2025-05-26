package o82;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a2 implements d2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f93526a;

    /* renamed from: b, reason: collision with root package name */
    public final List f93527b;

    /* renamed from: c, reason: collision with root package name */
    public final sq0.y f93528c;

    /* renamed from: d, reason: collision with root package name */
    public final int f93529d;

    public a2(int i13, int i14, sq0.y scrollDirection, ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(scrollDirection, "scrollDirection");
        this.f93526a = i13;
        this.f93527b = items;
        this.f93528c = scrollDirection;
        this.f93529d = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2)) {
            return false;
        }
        a2 a2Var = (a2) obj;
        return this.f93526a == a2Var.f93526a && Intrinsics.d(this.f93527b, a2Var.f93527b) && this.f93528c == a2Var.f93528c && this.f93529d == a2Var.f93529d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f93529d) + ((this.f93528c.hashCode() + ep.b.c(this.f93527b, Integer.hashCode(this.f93526a) * 31, 31)) * 31);
    }

    public final String toString() {
        return "PrefetchImagesFromPosition(pos=" + this.f93526a + ", items=" + this.f93527b + ", scrollDirection=" + this.f93528c + ", numberOfColumns=" + this.f93529d + ")";
    }

    public /* synthetic */ a2(int i13, ArrayList arrayList) {
        this(i13, Integer.MIN_VALUE, sq0.y.DOWN, arrayList);
    }
}
