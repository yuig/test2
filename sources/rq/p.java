package rq;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class p extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f109431i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f109432j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ fm1.c f109433k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(String str, fm1.c cVar, int i13) {
        super(1);
        this.f109431i = i13;
        this.f109432j = str;
        this.f109433k = cVar;
    }

    public final rn1.a b(rn1.a it) {
        int i13 = this.f109431i;
        String str = this.f109432j;
        switch (i13) {
            case 0:
                return rn1.a.y(it, jq.b.p(it, "it", str, "string", str), null, null, null, null, 0, this.f109433k, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 1:
                return rn1.a.y(it, jq.b.p(it, "it", str, "string", str), null, null, null, null, 0, this.f109433k, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(str), null, null, null, null, 0, this.f109433k, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f109431i) {
            case 0:
                return b((rn1.a) obj);
            case 1:
                return b((rn1.a) obj);
            case 2:
                yl1.b state = (yl1.b) obj;
                Intrinsics.checkNotNullParameter(state, "state");
                return yl1.b.f(state, bs1.c.h2(this.f109432j), false, this.f109433k, null, null, null, null, null, 0, null, 1016);
            default:
                return b((rn1.a) obj);
        }
    }
}
