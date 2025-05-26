package r2;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ c f106029i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p f106030j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ k f106031k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f106032l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f106033m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object[] f106034n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, p pVar, k kVar, String str, Object obj, Object[] objArr) {
        super(0);
        this.f106029i = cVar;
        this.f106030j = pVar;
        this.f106031k = kVar;
        this.f106032l = str;
        this.f106033m = obj;
        this.f106034n = objArr;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z13;
        c cVar = this.f106029i;
        k kVar = cVar.f106036b;
        k kVar2 = this.f106031k;
        boolean z14 = true;
        if (kVar != kVar2) {
            cVar.f106036b = kVar2;
            z13 = true;
        } else {
            z13 = false;
        }
        String str = cVar.f106037c;
        String str2 = this.f106032l;
        if (Intrinsics.d(str, str2)) {
            z14 = z13;
        } else {
            cVar.f106037c = str2;
        }
        cVar.f106035a = this.f106030j;
        cVar.f106038d = this.f106033m;
        cVar.f106039e = this.f106034n;
        l lVar = cVar.f106040f;
        if (lVar != null && z14) {
            lVar.a();
            cVar.f106040f = null;
            cVar.d();
        }
        return Unit.f80348a;
    }
}
