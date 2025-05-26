package rr1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c implements f {

    /* renamed from: a, reason: collision with root package name */
    public final int f109939a;

    public c(int i13) {
        this.f109939a = i13;
    }

    @Override // rr1.f
    public final boolean test(Object obj) {
        String password = (String) obj;
        Intrinsics.checkNotNullParameter(password, "password");
        return password.length() >= this.f109939a;
    }
}
