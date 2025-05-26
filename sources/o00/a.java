package o00;

import ao2.f0;
import ao2.i1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final f0 f92750a;

    /* renamed from: b, reason: collision with root package name */
    public final f0 f92751b;

    public a(f0 backgroundDispatcher, f0 highPriorityDispatcher, i1 newSingleThreadDispatcher) {
        Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
        Intrinsics.checkNotNullParameter(highPriorityDispatcher, "highPriorityDispatcher");
        Intrinsics.checkNotNullParameter(newSingleThreadDispatcher, "newSingleThreadDispatcher");
        this.f92750a = backgroundDispatcher;
        this.f92751b = newSingleThreadDispatcher;
    }
}
