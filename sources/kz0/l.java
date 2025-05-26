package kz0;

import com.pinterest.api.model.kb0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class l extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f81169i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ kb0 f81170j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(kb0 kb0Var, int i13) {
        super(1);
        this.f81169i = i13;
        this.f81170j = kb0Var;
    }

    public final rn1.a b(rn1.a it) {
        String q13;
        String l13;
        int i13 = this.f81169i;
        String str = "";
        kb0 kb0Var = this.f81170j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                if (kb0Var != null && (q13 = kb0Var.q()) != null) {
                    str = q13;
                }
                return rn1.a.y(it, bs1.c.h2(str), null, null, null, vn1.g.HEADING_400, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097134);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                if (kb0Var != null && (l13 = kb0Var.l()) != null) {
                    str = l13;
                }
                return rn1.a.y(it, bs1.c.h2(str), null, null, null, vn1.g.BODY_300, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097134);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f81169i) {
        }
        return b((rn1.a) obj);
    }
}
