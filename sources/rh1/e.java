package rh1;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class e extends kotlin.jvm.internal.p implements kl2.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f108135a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Object obj, int i13) {
        super(3, obj, z.class, "updateTranslation", "updateTranslation(Ljava/lang/String;Ljava/lang/String;Lcom/pinterest/feature/unifiedcomments/view/CommentRep$TranslationStatus;)V", 0);
        this.f108135a = i13;
        if (i13 != 1) {
        } else {
            super(3, obj, k.class, "onClickReactionIndicator", "onClickReactionIndicator(Ljava/lang/String;Ljava/lang/String;Z)V", 0);
        }
    }

    @Override // kl2.l
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f108135a) {
            case 0:
                String p13 = (String) obj2;
                y p23 = (y) obj3;
                Intrinsics.checkNotNullParameter(p13, "p1");
                Intrinsics.checkNotNullParameter(p23, "p2");
                ((z) this.receiver).h6((String) obj, p13, p23);
                break;
            default:
                String p03 = (String) obj;
                String p14 = (String) obj2;
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                Intrinsics.checkNotNullParameter(p03, "p0");
                Intrinsics.checkNotNullParameter(p14, "p1");
                ((k) this.receiver).e9(p03, p14, booleanValue);
                break;
        }
        return Unit.f80348a;
    }
}
