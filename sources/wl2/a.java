package wl2;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.f0;
import rm2.c0;
import rm2.e0;

/* loaded from: classes4.dex */
public final class a implements e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f0 f130213a;

    public a(f0 f0Var) {
        this.f130213a = f0Var;
    }

    @Override // rm2.e0
    public final void a() {
    }

    @Override // rm2.e0
    public final c0 b(ym2.b classId, fm2.a source) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        Intrinsics.checkNotNullParameter(source, "source");
        if (!Intrinsics.d(classId, im2.c0.f72700b)) {
            return null;
        }
        this.f130213a.f80424a = true;
        return null;
    }
}
