package qp0;

import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class c extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final c f104720j = new c(0);

    /* renamed from: k, reason: collision with root package name */
    public static final c f104721k = new c(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f104722i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i13) {
        super(1);
        this.f104722i = i13;
    }

    public final rn1.a b(rn1.a it) {
        switch (this.f104722i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, vn1.c.INVERSE, null, e0.b(vn1.e.BOLD), vn1.g.BODY_100, 1, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097093);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, vn1.c.INVERSE, null, e0.b(vn1.e.BOLD), vn1.g.BODY_100, 1, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097093);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f104722i) {
        }
        return b((rn1.a) obj);
    }
}
