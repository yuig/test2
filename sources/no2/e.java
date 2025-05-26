package no2;

import java.util.List;
import java.util.Map;
import kh2.n3;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.s;
import oo2.l;
import qo2.j1;

/* loaded from: classes4.dex */
public final class e extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f91671i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f f91672j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(f fVar, int i13) {
        super(1);
        this.f91671i = i13;
        this.f91672j = fVar;
    }

    public final void b(oo2.a buildSerialDescriptor) {
        int i13 = this.f91671i;
        f fVar = this.f91672j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
                for (Map.Entry entry : fVar.f91677e.entrySet()) {
                    oo2.a.a(buildSerialDescriptor, (String) entry.getKey(), ((b) entry.getValue()).a());
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
                f0.h.n0(o0.f80439a);
                oo2.a.a(buildSerialDescriptor, "type", j1.f104577b);
                oo2.a.a(buildSerialDescriptor, "value", n3.o("kotlinx.serialization.Sealed<" + fVar.f91673a.f() + '>', l.f96901a, new oo2.g[0], new e(fVar, 0)));
                List list = fVar.f91674b;
                Intrinsics.checkNotNullParameter(list, "<set-?>");
                buildSerialDescriptor.f96863b = list;
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f91671i) {
            case 0:
                b((oo2.a) obj);
                break;
            default:
                b((oo2.a) obj);
                break;
        }
        return Unit.f80348a;
    }
}
