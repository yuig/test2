package we1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v1 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f129647i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f129648j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ re1.v f129649k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v1(String str, re1.v vVar, int i13) {
        super(1);
        this.f129647i = i13;
        this.f129648j = str;
        this.f129649k = vVar;
    }

    public final rn1.a b(rn1.a it) {
        int i13 = this.f129647i;
        re1.v vVar = this.f129649k;
        String str = this.f129648j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                u50.f0 h23 = bs1.c.h2(str);
                fm1.c cVar = fm1.c.VISIBLE;
                return rn1.a.y(it, h23, vVar.f107681a, kotlin.collections.e0.b(vVar.f107682b), kotlin.collections.e0.b(vVar.f107683c), null, 0, cVar, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097072);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                u50.f0 h24 = bs1.c.h2(str);
                vn1.c cVar2 = vVar.f107681a;
                fm1.c cVar3 = fm1.c.VISIBLE;
                return rn1.a.y(it, h24, cVar2, kotlin.collections.e0.b(vVar.f107682b), kotlin.collections.e0.b(vVar.f107683c), null, 0, cVar3, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097072);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f129647i) {
        }
        return b((rn1.a) obj);
    }
}
