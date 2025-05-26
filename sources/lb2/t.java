package lb2;

import com.pinterest.identity.core.error.UnauthException;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import uj2.b0;

/* loaded from: classes4.dex */
public final class t extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ List f82813i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(ArrayList arrayList) {
        super(1);
        this.f82813i = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Throwable throwable = (Throwable) obj;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        List list = this.f82813i;
        list.add(throwable);
        return b0.g(new UnauthException.LogoutCompositeError(list));
    }
}
