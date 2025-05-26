package r1;

import androidx.compose.foundation.lazy.layout.w0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class l extends androidx.compose.foundation.lazy.layout.o implements e0 {

    /* renamed from: a, reason: collision with root package name */
    public final k0 f105932a = new k0(this);

    /* renamed from: b, reason: collision with root package name */
    public final w0 f105933b = new w0();

    /* renamed from: c, reason: collision with root package name */
    public boolean f105934c;

    public l(Function1 function1) {
        function1.invoke(this);
    }

    @Override // androidx.compose.foundation.lazy.layout.o
    public final w0 m() {
        return this.f105933b;
    }

    public final void s(int i13, Function1 function1, Function2 function2, Function1 function12, q2.h hVar) {
        this.f105933b.a(i13, new i(function1, function2 == null ? j.f105916j : function2, function12, hVar));
        if (function2 != null) {
            this.f105934c = true;
        }
    }
}
