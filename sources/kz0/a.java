package kz0;

import com.pinterest.api.model.cb0;
import com.pinterest.api.model.ua0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class a extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f81137i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ cb0 f81138j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(cb0 cb0Var, int i13) {
        super(1);
        this.f81137i = i13;
        this.f81138j = cb0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        ua0 u13;
        String str2;
        ua0 u14;
        int i13 = this.f81137i;
        cb0 cb0Var = this.f81138j;
        switch (i13) {
            case 0:
                rn1.a it = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (cb0Var == null || (u13 = cb0Var.u()) == null || (str = u13.f()) == null) {
                    str = "Need a gift for someone else?";
                }
                return rn1.a.y(it, ep.b.x(str, "string", str), null, null, null, vn1.g.HEADING_600, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097134);
            default:
                yl1.b it2 = (yl1.b) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (cb0Var == null || (u14 = cb0Var.u()) == null || (str2 = u14.e()) == null) {
                    str2 = "Retake the quiz";
                }
                return yl1.b.f(it2, ep.b.x(str2, "string", str2), false, null, null, null, null, null, null, 0, null, 1022);
        }
    }
}
