package cv1;

import b40.b0;
import b40.c0;
import b40.e0;
import b40.f0;
import dv1.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import pc.h;

/* loaded from: classes4.dex */
public final class a extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final a f53310i = new a(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        e0 e0Var;
        b0 b0Var;
        h response = (h) obj;
        Intrinsics.checkNotNullParameter(response, "response");
        f0 f0Var = (f0) response.f99563c;
        b0 newsHub = null;
        if (f0Var != null && (e0Var = f0Var.f21706a) != null) {
            Intrinsics.checkNotNullParameter(e0Var, "<this>");
            c0 c0Var = e0Var instanceof c0 ? (c0) e0Var : null;
            if (c0Var != null && (b0Var = c0Var.f21702e) != null) {
                Intrinsics.checkNotNullParameter(b0Var, "<this>");
                newsHub = b0Var;
            }
        }
        if (newsHub == null) {
            throw new IllegalStateException("NewsHubItem not found");
        }
        Intrinsics.checkNotNullParameter(newsHub, "newsHub");
        return new e(new dv1.a(newsHub));
    }
}
