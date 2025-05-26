package w1;

import kotlin.jvm.internal.Intrinsics;
import t3.s3;

/* loaded from: classes2.dex */
public final class h1 implements i1 {

    /* renamed from: a, reason: collision with root package name */
    public final s3 f127280a;

    /* renamed from: b, reason: collision with root package name */
    public j1 f127281b;

    /* renamed from: c, reason: collision with root package name */
    public z2.j f127282c;

    public h1(s3 s3Var) {
        this.f127280a = s3Var;
    }

    public final j1 a() {
        j1 j1Var = this.f127281b;
        if (j1Var != null) {
            return j1Var;
        }
        Intrinsics.r("keyboardActions");
        throw null;
    }
}
