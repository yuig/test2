package rh1;

import android.graphics.Rect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class i extends kotlin.jvm.internal.p implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f108160a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, int i13) {
        super(2, kVar, k.class, "onClickAction", "onClickAction(Lcom/pinterest/feature/comment/unifiedcomments/model/UnifiedComment;Lcom/pinterest/feature/unifiedcomments/view/CommentRep$ActionType;)V", 0);
        this.f108160a = i13;
        if (i13 == 1) {
            super(2, kVar, k.class, "onLongClickReactionButton", "onLongClickReactionButton(Lcom/pinterest/feature/comment/unifiedcomments/model/UnifiedComment;Landroid/graphics/Rect;)V", 0);
        } else if (i13 != 2) {
        } else {
            super(2, kVar, k.class, "onClickTranslation", "onClickTranslation(Lcom/pinterest/feature/comment/unifiedcomments/model/UnifiedComment;Lcom/pinterest/feature/unifiedcomments/view/CommentRep;)V", 0);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        com.pinterest.feature.unifiedcomments.c cVar;
        switch (this.f108160a) {
            case 0:
                rp0.d p03 = (rp0.d) obj;
                x p13 = (x) obj2;
                Intrinsics.checkNotNullParameter(p03, "p0");
                Intrinsics.checkNotNullParameter(p13, "p1");
                k kVar = (k) this.receiver;
                int i13 = k.f108194h1;
                kVar.getClass();
                if (p13 == x.Like || p13 == x.Unlike || p13 == x.Helpful || p13 == x.NotHelpful) {
                    kVar.a9().l(new px0.g(kVar, p03, p13, 18));
                } else {
                    com.pinterest.feature.unifiedcomments.c cVar2 = kVar.Z0;
                    if (cVar2 != null) {
                        cVar2.K(p03, p13);
                    }
                }
                break;
            case 1:
                rp0.d p04 = (rp0.d) obj;
                Rect p14 = (Rect) obj2;
                Intrinsics.checkNotNullParameter(p04, "p0");
                Intrinsics.checkNotNullParameter(p14, "p1");
                k kVar2 = (k) this.receiver;
                int i14 = k.f108194h1;
                kVar2.a9().l(new px0.g(kVar2, p04, p14, 19));
                break;
            default:
                rp0.d p05 = (rp0.d) obj;
                z p15 = (z) obj2;
                Intrinsics.checkNotNullParameter(p05, "p0");
                Intrinsics.checkNotNullParameter(p15, "p1");
                k kVar3 = (k) this.receiver;
                int i15 = k.f108194h1;
                kVar3.getClass();
                if (Intrinsics.d(p05.y(), Boolean.TRUE) && (cVar = kVar3.Z0) != null) {
                    ((oh1.m) cVar).R3(p05.v(), p05.r(), new e(p15, 0));
                }
                break;
        }
        return Unit.f80348a;
    }
}
