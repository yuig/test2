package ee2;

import android.util.SparseArray;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final fe2.b f58824a;

    /* renamed from: b, reason: collision with root package name */
    public ke2.b f58825b;

    public e(fe2.b sticker, ke2.b layout) {
        Intrinsics.checkNotNullParameter(sticker, "sticker");
        Intrinsics.checkNotNullParameter(layout, "layout");
        this.f58824a = sticker;
        this.f58825b = layout;
        new SparseArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f58824a, eVar.f58824a) && Intrinsics.d(this.f58825b, eVar.f58825b);
    }

    public final int hashCode() {
        return this.f58825b.hashCode() + (this.f58824a.hashCode() * 31);
    }

    public final String toString() {
        return "LegacySceneItem(sticker=" + this.f58824a + ", layout=" + this.f58825b + ')';
    }
}
