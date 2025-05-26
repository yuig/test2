package aq;

import com.pinterest.api.model.ew;
import com.pinterest.api.model.kg0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes3.dex */
public final class l extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f20352i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h f20353j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(h hVar, int i13) {
        super(1);
        this.f20352i = i13;
        this.f20353j = hVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f20352i;
        h hVar = this.f20353j;
        switch (i13) {
            case 0:
                tt1.a aVar = (tt1.a) obj;
                ew.m((kg0) aVar.c());
                String id3 = ((kg0) aVar.c()).getId();
                Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
                hVar.a(id3);
                break;
            default:
                Throwable th3 = (Throwable) obj;
                Intrinsics.f(th3);
                hVar.onError(th3);
                break;
        }
        return Unit.f80348a;
    }
}
