package u5;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f120497a;

    public b(CharSequence userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.f120497a = userId;
        if (userId.length() <= 0) {
            throw new IllegalArgumentException("userId should not be empty".toString());
        }
    }
}
