package xf2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f134855a;

    /* renamed from: b, reason: collision with root package name */
    public final ri2.e f134856b;

    public d0(String id3, boolean z13, int i13) {
        z13 = (i13 & 8) != 0 ? false : z13;
        Intrinsics.checkNotNullParameter(id3, "id");
        String h13 = ig1.b.h1(id3, z13);
        this.f134855a = h13;
        ri2.e a13 = ri2.e.a(qi2.c.STRING, h13);
        Intrinsics.checkNotNullExpressionValue(a13, "stringKey(name)");
        this.f134856b = a13;
    }
}
