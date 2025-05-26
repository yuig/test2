package rh1;

import android.content.Context;
import android.text.Editable;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class g extends kotlin.jvm.internal.p implements kl2.o {
    public g(Object obj) {
        super(6, obj, k.class, "onClickSendComment", "onClickSendComment(Landroid/text/Editable;Ljava/lang/String;Ljava/lang/String;Lcom/pinterest/feature/comment/unifiedcomments/model/UnifiedComment;Lcom/pinterest/feature/comment/unifiedcomments/model/UnifiedComment;Ljava/util/List;)V", 0);
    }

    @Override // kl2.o
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Editable editable = (Editable) obj;
        String str = (String) obj2;
        String str2 = (String) obj3;
        rp0.d dVar = (rp0.d) obj4;
        rp0.d dVar2 = (rp0.d) obj5;
        List list = (List) obj6;
        k kVar = (k) this.receiver;
        com.pinterest.feature.unifiedcomments.c cVar = kVar.Z0;
        if (cVar != null) {
            Context requireContext = kVar.requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            cVar.u(requireContext, editable, str, str2, dVar, dVar2, list);
        }
        return Unit.f80348a;
    }
}
