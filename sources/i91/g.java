package i91;

import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;

/* loaded from: classes5.dex */
public final class g extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final g f71823j = new g(0);

    /* renamed from: k, reason: collision with root package name */
    public static final g f71824k = new g(1);

    /* renamed from: l, reason: collision with root package name */
    public static final g f71825l = new g(2);

    /* renamed from: m, reason: collision with root package name */
    public static final g f71826m = new g(3);

    /* renamed from: n, reason: collision with root package name */
    public static final g f71827n = new g(4);

    /* renamed from: o, reason: collision with root package name */
    public static final g f71828o = new g(5);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f71829i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i13) {
        super(1);
        this.f71829i = i13;
    }

    public final k50.a b(pc.h response) {
        i50.d dVar;
        i50.e eVar;
        i50.l lVar;
        i50.m mVar;
        switch (this.f71829i) {
            case 1:
                Intrinsics.checkNotNullParameter(response, "response");
                i50.g gVar = (i50.g) response.f99563c;
                if (gVar == null || (dVar = gVar.f71547a) == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(dVar, "<this>");
                i50.f fVar = dVar instanceof i50.f ? (i50.f) dVar : null;
                if (fVar == null || (eVar = fVar.f71546e) == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(eVar, "<this>");
                return eVar;
            default:
                Intrinsics.checkNotNullParameter(response, "response");
                i50.o oVar = (i50.o) response.f99563c;
                if (oVar == null || (lVar = oVar.f71560a) == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(lVar, "<this>");
                i50.n nVar = lVar instanceof i50.n ? (i50.n) lVar : null;
                if (nVar == null || (mVar = nVar.f71559e) == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(mVar, "<this>");
                return mVar;
        }
    }

    public final void e(Throwable error) {
        switch (this.f71829i) {
            case 0:
                error.getMessage();
                break;
            case 4:
                Intrinsics.checkNotNullParameter(error, "error");
                ig1.b.n(error, a62.e.send_collection_server_error, null);
                break;
            default:
                Intrinsics.checkNotNullParameter(error, "throwable");
                error.getMessage();
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f71829i) {
            case 0:
                e((Throwable) obj);
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                ResponseBody it = (ResponseBody) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                HashMap hashMap = rw0.f.f110112b;
                rw0.e.f110110a.getClass();
                break;
            case 4:
                e((Throwable) obj);
                break;
            default:
                e((Throwable) obj);
                break;
        }
        return Unit.f80348a;
    }
}
