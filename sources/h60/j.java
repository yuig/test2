package h60;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class j extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f67808i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ a f67809j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(a aVar, int i13) {
        super(1);
        this.f67808i = i13;
        this.f67809j = aVar;
    }

    public final rn1.a b(rn1.a it) {
        int i13 = this.f67808i;
        a aVar = this.f67809j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.j2(new String[0], aVar.f67776a), null, aVar.f67779d, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097146);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.j2(new String[0], aVar.f67777b.intValue()), null, aVar.f67779d, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097082);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f67808i) {
        }
        return b((rn1.a) obj);
    }
}
