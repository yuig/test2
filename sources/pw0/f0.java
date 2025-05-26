package pw0;

import com.pinterest.api.model.pu;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f101515a;

    /* renamed from: b, reason: collision with root package name */
    public final pu f101516b;

    /* renamed from: c, reason: collision with root package name */
    public final Function1 f101517c;

    public f0(int i13, pu mediaItem, qw0.h deleteAction) {
        Intrinsics.checkNotNullParameter(mediaItem, "mediaItem");
        Intrinsics.checkNotNullParameter(deleteAction, "deleteAction");
        this.f101515a = i13;
        this.f101516b = mediaItem;
        this.f101517c = deleteAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return this.f101515a == f0Var.f101515a && Intrinsics.d(this.f101516b, f0Var.f101516b) && Intrinsics.d(this.f101517c, f0Var.f101517c);
    }

    public final int hashCode() {
        return this.f101517c.hashCode() + ((this.f101516b.hashCode() + (Integer.hashCode(this.f101515a) * 31)) * 31);
    }

    public final String toString() {
        return "ThumbnailState(position=" + this.f101515a + ", mediaItem=" + this.f101516b + ", deleteAction=" + this.f101517c + ")";
    }
}
