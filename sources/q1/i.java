package q1;

import androidx.compose.foundation.lazy.layout.w0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class i extends androidx.compose.foundation.lazy.layout.o implements x {

    /* renamed from: a, reason: collision with root package name */
    public final w0 f101930a = new w0();

    public i(Function1 function1) {
        function1.invoke(this);
    }

    @Override // androidx.compose.foundation.lazy.layout.o
    public final w0 m() {
        return this.f101930a;
    }

    public final void s(int i13, Function1 function1, Function1 function12, q2.h hVar) {
        this.f101930a.a(i13, new g(function1, function12, hVar));
    }
}
