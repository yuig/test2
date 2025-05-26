package y90;

import android.content.Context;
import android.util.AttributeSet;
import com.pinterest.collage.effects.components.EffectCategoryTabView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class z extends kotlin.jvm.internal.p implements Function2 {
    public z(Object obj) {
        super(2, obj, d0.class, "bindCategoryTab", "bindCategoryTab(Lcom/google/android/material/tabs/TabLayout$Tab;Lcom/pinterest/shuffles/composer/ui/effects/EffectCategoryModel;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        rm1.q qVar;
        ek.e p03 = (ek.e) obj;
        m62.h p13 = (m62.h) obj2;
        Intrinsics.checkNotNullParameter(p03, "p0");
        Intrinsics.checkNotNullParameter(p13, "p1");
        d0 d0Var = (d0) this.receiver;
        int i13 = d0.f138146w0;
        d0Var.getClass();
        Context requireContext = d0Var.requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        EffectCategoryTabView effectCategoryTabView = new EffectCategoryTabView(6, requireContext, (AttributeSet) null);
        switch (t.f138244a[p13.f86005a.f85977a.ordinal()]) {
            case 1:
                qVar = rm1.q.AUDIO_MIX;
                break;
            case 2:
                qVar = rm1.q.FILL_OPAQUE;
                break;
            case 3:
                qVar = rm1.q.ANIMATE;
                break;
            case 4:
                qVar = rm1.q.SCISSORS;
                break;
            case 5:
                qVar = rm1.q.ELLIPSIS;
                break;
            case 6:
                qVar = rm1.q.TEXT_ALIGN_CENTER;
                break;
            case 7:
                qVar = rm1.q.COLOR_SOLID;
                break;
            case 8:
                qVar = rm1.q.FILL_OPAQUE;
                break;
            case 9:
                qVar = rm1.q.TEXT_SENTENCE_CASE;
                break;
            default:
                qVar = rm1.q.ELLIPSIS;
                break;
        }
        m62.g gVar = p13.f86005a;
        int i14 = 0;
        effectCategoryTabView.o(new z90.d(bs1.c.j2(new String[0], gVar.f85978b), qVar, gVar.f85979c && p13.f86006b));
        w action = new w(p03, i14);
        Intrinsics.checkNotNullParameter(action, "action");
        effectCategoryTabView.f44647i = action;
        effectCategoryTabView.setTag(p13);
        p03.f59129f = effectCategoryTabView;
        p03.c();
        return Unit.f80348a;
    }
}
