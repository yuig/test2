package rl1;

import android.content.Context;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    public final int f108539a;

    public d(int i13) {
        this.f108539a = i13;
    }

    @Override // rl1.c
    public final int a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int i13 = eo1.b.color_themed_background_secondary_base;
        if (!dl2.b.v0(eo1.a.comp_avatar_is_vr, context)) {
            return i13;
        }
        Integer num = (Integer) CollectionsKt.U(this.f108539a - 1, f.f108571a);
        return num != null ? num.intValue() : i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && this.f108539a == ((d) obj).f108539a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f108539a);
    }

    public final String toString() {
        return a.a.n(new StringBuilder("AvatarColorFromIndex(index="), this.f108539a, ")");
    }
}
