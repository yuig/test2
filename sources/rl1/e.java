package rl1;

import android.content.Context;
import kh2.g3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e implements c {

    /* renamed from: a, reason: collision with root package name */
    public final String f108542a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f108543b;

    public e(String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.f108542a = userId;
        this.f108543b = new d(g3.x(userId) + 1);
    }

    @Override // rl1.c
    public final int a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.f108543b.a(context);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Intrinsics.d(this.f108542a, ((e) obj).f108542a);
    }

    public final int hashCode() {
        return this.f108542a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("AvatarColorFromUserId(userId="), this.f108542a, ")");
    }
}
