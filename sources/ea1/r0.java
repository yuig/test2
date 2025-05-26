package ea1;

import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f58125i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ a f58126j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ v0 f58127k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0(a aVar, v0 v0Var, int i13) {
        super(1);
        this.f58125i = i13;
        this.f58126j = aVar;
        this.f58127k = v0Var;
    }

    public final rn1.a b(rn1.a it) {
        u50.i0 h23;
        int i13 = this.f58125i;
        v0 v0Var = this.f58127k;
        a aVar = this.f58126j;
        switch (i13) {
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                if (aVar.f58029s) {
                    h23 = bs1.c.j2(new String[0], c52.e.board_not_found_error_fallback_profile);
                } else {
                    int i14 = c52.e.board_not_found_error_fallback;
                    Object[] objArr = new Object[1];
                    String str = aVar.f58027q;
                    if (str == null) {
                        str = v0Var.getString(c52.e.social_board);
                        Intrinsics.checkNotNullExpressionValue(str, "getString(...)");
                    }
                    objArr[0] = str;
                    String string = v0Var.getString(i14, objArr);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    h23 = bs1.c.h2(string);
                }
                return rn1.a.y(it, h23, null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                String string2 = v0Var.getString(aVar.f58015e.intValue());
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return rn1.a.y(it, bs1.c.h2(string2), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
        }
    }

    public final void e(wm1.k0 bind) {
        u50.i0 k0Var;
        u50.i0 i0Var = null;
        int i13 = 6;
        boolean z13 = false;
        int i14 = this.f58125i;
        v0 v0Var = this.f58127k;
        a aVar = this.f58126j;
        switch (i14) {
            case 0:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                String Z7 = v0.Z7(v0Var, aVar.f58020j, aVar.f58017g, aVar.f58016f);
                wm1.q middleItem = new wm1.q(ep.b.x(Z7, "string", Z7), i0Var, z13, i13);
                bind.getClass();
                Intrinsics.checkNotNullParameter(middleItem, "middleItem");
                bind.f130312c = middleItem;
                break;
            default:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                String str = aVar.f58027q;
                if (str == null) {
                    int i15 = c52.e.social_board;
                    String[] formatArgs = new String[0];
                    Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
                    k0Var = new u50.k0(i15, new ArrayList(0));
                } else if (aVar.f58029s) {
                    String string = v0Var.getString(m60.x0.profile);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    Intrinsics.checkNotNullParameter(string, "string");
                    k0Var = new u50.f0(string);
                } else {
                    k0Var = ep.b.x(str, "string", str);
                }
                wm1.q middleItem2 = new wm1.q(k0Var, i0Var, z13, i13);
                bind.getClass();
                Intrinsics.checkNotNullParameter(middleItem2, "middleItem");
                bind.f130312c = middleItem2;
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f58125i) {
            case 0:
                e((wm1.k0) obj);
                break;
            case 1:
                e((wm1.k0) obj);
                break;
        }
        return b((rn1.a) obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0(v0 v0Var, a aVar, int i13) {
        super(1);
        this.f58125i = i13;
        this.f58127k = v0Var;
        this.f58126j = aVar;
    }
}
