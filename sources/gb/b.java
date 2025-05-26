package gb;

import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.layout.adapter.extensions.MulticastConsumer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;

/* loaded from: classes3.dex */
public final /* synthetic */ class b extends p implements Function1 {
    public b(MulticastConsumer multicastConsumer) {
        super(1, multicastConsumer, MulticastConsumer.class, "accept", "accept(Landroidx/window/extensions/layout/WindowLayoutInfo;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        WindowLayoutInfo p03 = (WindowLayoutInfo) obj;
        Intrinsics.checkNotNullParameter(p03, "p0");
        ((MulticastConsumer) this.receiver).accept(p03);
        return Unit.f80348a;
    }
}
