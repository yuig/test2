package vy;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import okhttp3.RequestBody;

/* loaded from: classes.dex */
public final class g extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f126854i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ m f126855j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i13, m mVar) {
        super(1);
        this.f126854i = i13;
        this.f126855j = mVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f126854i;
        m mVar = this.f126855j;
        switch (i13) {
            case 0:
                ((m60.d) mVar.f126882f).f85896f.getClass();
                return Unit.f80348a;
            case 1:
                RequestBody it = (RequestBody) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return mVar.h().b(it);
            default:
                Throwable th3 = (Throwable) obj;
                ob0.a aVar = mVar.f126883g;
                Intrinsics.f(th3);
                ((tb0.h) aVar).o("Failed submitting post install data", th3);
                th3.getLocalizedMessage();
                return Unit.f80348a;
        }
    }
}
