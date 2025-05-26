package ba1;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f22401r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ y f22402s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(y yVar, bl2.c cVar) {
        super(2, cVar);
        this.f22402s = yVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        u uVar = new u(this.f22402s, cVar);
        uVar.f22401r = obj;
        return uVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((u) create((j) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        j jVar = (j) this.f22401r;
        int i13 = y.M0;
        y yVar = this.f22402s;
        yVar.getClass();
        if (jVar.f22374b == null) {
            ConstraintLayout constraintLayout = yVar.H0;
            if (constraintLayout == null) {
                Intrinsics.r("instagramApiBannerContainer");
                throw null;
            }
            constraintLayout.setVisibility(8);
        } else {
            ConstraintLayout constraintLayout2 = yVar.H0;
            if (constraintLayout2 == null) {
                Intrinsics.r("instagramApiBannerContainer");
                throw null;
            }
            constraintLayout2.setVisibility(0);
            GestaltText gestaltText = yVar.J0;
            if (gestaltText == null) {
                Intrinsics.r("instagramApiBannerErrorText");
                throw null;
            }
            gestaltText.i(new q91.h(jVar, 13));
            if (jVar.f22375c) {
                GestaltIcon gestaltIcon = yVar.I0;
                if (gestaltIcon == null) {
                    Intrinsics.r("instagramApiBannerIcon");
                    throw null;
                }
                dl2.b.z(gestaltIcon, x.f22408k);
                ConstraintLayout constraintLayout3 = yVar.H0;
                if (constraintLayout3 == null) {
                    Intrinsics.r("instagramApiBannerContainer");
                    throw null;
                }
                constraintLayout3.setBackgroundResource(c52.b.claimed_account_warning);
            }
        }
        return Unit.f80348a;
    }
}
