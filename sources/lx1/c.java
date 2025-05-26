package lx1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class c extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final c f85066j = new c(0);

    /* renamed from: k, reason: collision with root package name */
    public static final c f85067k = new c(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f85068i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i13) {
        super(1);
        this.f85068i = i13;
    }

    public final rn1.a b(rn1.a it) {
        switch (this.f85068i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return rn1.a.y(it, null, null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2096895);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f85068i) {
        }
        return b((rn1.a) obj);
    }
}
