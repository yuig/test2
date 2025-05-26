package o82;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class w1 implements d2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f93739a;

    /* renamed from: b, reason: collision with root package name */
    public final l82.i0 f93740b;

    /* renamed from: c, reason: collision with root package name */
    public final List f93741c;

    public w1(int i13, l82.i0 item, ArrayList items) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f93739a = i13;
        this.f93740b = item;
        this.f93741c = items;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w1)) {
            return false;
        }
        w1 w1Var = (w1) obj;
        return this.f93739a == w1Var.f93739a && Intrinsics.d(this.f93740b, w1Var.f93740b) && Intrinsics.d(this.f93741c, w1Var.f93741c);
    }

    public final int hashCode() {
        return this.f93741c.hashCode() + ((this.f93740b.hashCode() + (Integer.hashCode(this.f93739a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ItemDisappeared(pos=");
        sb3.append(this.f93739a);
        sb3.append(", item=");
        sb3.append(this.f93740b);
        sb3.append(", items=");
        return a.c.j(sb3, this.f93741c, ")");
    }
}
