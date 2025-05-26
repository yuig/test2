package ec1;

import h32.f1;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class e extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f58394i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f58395j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ j f58396k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f1 f58397l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f58398m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Function1 f58399n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String str, boolean z13, j jVar, f1 f1Var, int i13, Function1 function1) {
        super(1);
        this.f58394i = str;
        this.f58395j = z13;
        this.f58396k = jVar;
        this.f58397l = f1Var;
        this.f58398m = i13;
        this.f58399n = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        HashMap hashMap = new HashMap();
        boolean d2 = Intrinsics.d(this.f58394i, "ccpa_opted_out");
        boolean z13 = this.f58395j;
        ?? r23 = z13;
        if (d2) {
            r23 = !z13 ? 1 : 0;
        }
        hashMap.put("label", String.valueOf((int) r23));
        j jVar = this.f58396k;
        jVar.getPinalytics().g(this.f58397l, null, hashMap, false);
        jVar.f58424b.o(((yk1.a) jVar.f58425c).f139224a.getString(this.f58398m));
        jVar.f58423a.d(new of0.a(null));
        this.f58399n.invoke(Boolean.FALSE);
        return Unit.f80348a;
    }
}
