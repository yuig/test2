package w41;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class l0 implements o82.c, kotlin.jvm.internal.m {

    /* renamed from: a, reason: collision with root package name */
    public static final l0 f128039a = new l0();

    @Override // kotlin.jvm.internal.m
    public final xk2.g c() {
        return new kotlin.jvm.internal.p(2, w0.class, "updateDisplayState", "updateDisplayState(Lcom/pinterest/feature/profile/pins/ui/MetadataDisplayState;)V", 0);
    }

    @Override // o82.c
    public final void e(View view, u50.o oVar) {
        w0 p03 = (w0) view;
        h state = (h) oVar;
        Intrinsics.checkNotNullParameter(p03, "p0");
        Intrinsics.checkNotNullParameter(state, "p1");
        p03.getClass();
        Intrinsics.checkNotNullParameter(state, "state");
        p03.f128093a.i(new j41.i(state, 3));
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof o82.c) && (obj instanceof kotlin.jvm.internal.m)) {
            return Intrinsics.d(c(), ((kotlin.jvm.internal.m) obj).c());
        }
        return false;
    }

    public final int hashCode() {
        return c().hashCode();
    }
}
