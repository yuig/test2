package kd2;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e implements fd2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f79266a;

    public e(i iVar) {
        this.f79266a = iVar;
    }

    public final void a(Function0 message) {
        Intrinsics.checkNotNullParameter("GLRenderThread", "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        d block = new d(message);
        Intrinsics.checkNotNullParameter(block, "block");
    }

    public final void b(Function0 message, String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        ax1.a block = new ax1.a(25, message);
        Intrinsics.checkNotNullParameter(block, "block");
        this.f79266a.getClass();
    }
}
