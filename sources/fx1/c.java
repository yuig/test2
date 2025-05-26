package fx1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class c extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final c f63088j = new c(0);

    /* renamed from: k, reason: collision with root package name */
    public static final c f63089k = new c(1);

    /* renamed from: l, reason: collision with root package name */
    public static final c f63090l = new c(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f63091i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i13) {
        super(1);
        this.f63091i = i13;
    }

    public final rn1.a b(rn1.a it) {
        switch (this.f63091i) {
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return rn1.a.y(it, null, null, null, null, null, 0, fm1.c.GONE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097087);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f63091i) {
            case 0:
                gx1.d it = (gx1.d) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return b((rn1.a) obj);
    }
}
