package na2;

import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import vn1.g;

/* loaded from: classes4.dex */
public final class a extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final a f90096j = new a(0);

    /* renamed from: k, reason: collision with root package name */
    public static final a f90097k = new a(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f90098i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i13) {
        super(1);
        this.f90098i = i13;
    }

    public final rn1.a b(rn1.a it) {
        switch (this.f90098i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, e0.b(vn1.e.BOLD), g.BODY_300, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097127);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, g.UI_400, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097135);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f90098i) {
        }
        return b((rn1.a) obj);
    }
}
