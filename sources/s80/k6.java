package s80;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k6 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f111637i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f111638j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ float f111639k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6(float f13, float f14, boolean z13) {
        super(1);
        this.f111637i = z13;
        this.f111638j = f13;
        this.f111639k = f14;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        j it = (j) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        Intrinsics.checkNotNullParameter(it, "<this>");
        it.f111607p.getClass();
        return j.e(it, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, new i(this.f111638j, this.f111639k, this.f111637i), 98303);
    }
}
