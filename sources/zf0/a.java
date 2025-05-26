package zf0;

import com.pinterest.education.ActionPromptView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class a extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f141896i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ ActionPromptView f141897j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(ActionPromptView actionPromptView, int i13) {
        super(1);
        this.f141896i = i13;
        this.f141897j = actionPromptView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f141896i;
        ActionPromptView actionPromptView = this.f141897j;
        switch (i13) {
            case 0:
                em1.d it = (em1.d) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return em1.d.e(it, actionPromptView.k().f58866i ? em1.b.CHECKED : em1.b.UNCHECKED, null, d7.b.Z(actionPromptView.k().f58867j.length() > 0), bs1.c.h2(actionPromptView.k().f58867j), null, null, 0, null, false, 0, 1010);
            default:
                ao1.b it2 = (ao1.b) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return ao1.b.e(it2, null, null, null, bs1.c.h2(actionPromptView.k().f58865h), null, false, 0, 0, 0, false, false, false, fm1.c.VISIBLE, false, null, null, null, null, null, 0, 4186095);
        }
    }
}
