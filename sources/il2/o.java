package il2;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class o extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ArrayList f72583i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(ArrayList arrayList) {
        super(1);
        this.f72583i = arrayList;
    }

    public final void b(@NotNull String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.f72583i.add(it);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((String) obj);
        return Unit.f80348a;
    }
}
