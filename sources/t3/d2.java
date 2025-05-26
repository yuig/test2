package t3;

import androidx.compose.ui.platform.ComposeView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class d2 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ComposeView f115936i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f115937j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(ComposeView composeView, int i13) {
        super(2);
        this.f115936i = composeView;
        this.f115937j = i13;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int p13 = i2.u.p(this.f115937j | 1);
        this.f115936i.b((i2.o) obj, p13);
        return Unit.f80348a;
    }
}
