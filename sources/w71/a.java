package w71;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final /* synthetic */ class a implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f128160a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f128161b;

    public /* synthetic */ a(d dVar, int i13) {
        this.f128160a = i13;
        this.f128161b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f128160a;
        d dVar = this.f128161b;
        g1.g gVar = (g1.g) obj;
        switch (i13) {
            case 0:
                dVar.d(gVar);
                break;
            default:
                dVar.c(gVar);
                break;
        }
        return Unit.f80348a;
    }
}
