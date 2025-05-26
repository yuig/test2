package zl2;

import java.util.List;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pn2.h0;

/* loaded from: classes2.dex */
public final class o extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f142137i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ r f142138j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(r rVar, int i13) {
        super(0);
        this.f142137i = i13;
        this.f142138j = rVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f142137i;
        r rVar = this.f142138j;
        switch (i13) {
            case 0:
                h0 e13 = rVar.f142145a.f().e();
                Intrinsics.checkNotNullExpressionValue(e13, "getAnyType(...)");
                return e13;
            default:
                List annotations = e0.b(bm2.f.a(rVar.f142145a.f(), "This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version", "", "WARNING", true));
                Intrinsics.checkNotNullParameter(annotations, "annotations");
                return annotations.isEmpty() ? bm2.h.f23540a : new bm2.j(annotations, 0);
        }
    }
}
