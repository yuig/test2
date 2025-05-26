package ki1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import ln1.d;
import ln1.e;
import ln1.f;
import u50.i0;

/* loaded from: classes5.dex */
public final class b extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final b f79803i = new b(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        d it = (d) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        e loadingState = e.LOADING;
        f size = f.LG;
        ln1.c color = it.f84000b;
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(loadingState, "loadingState");
        i0 label = it.f84002d;
        Intrinsics.checkNotNullParameter(label, "label");
        fm1.c visibility = it.f84003e;
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        return new d(size, color, loadingState, label, visibility, it.f84004f);
    }
}
