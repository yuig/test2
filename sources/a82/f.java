package a82;

import android.animation.ValueAnimator;
import android.view.ViewParent;
import com.pinterest.shuffles.scene.composer.k;
import kotlin.jvm.internal.Intrinsics;
import rl2.u;

/* loaded from: classes4.dex */
public final class f extends nl2.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1534b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f1535c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Boolean bool, g gVar, int i13) {
        super(bool);
        this.f1534b = i13;
        this.f1535c = gVar;
    }

    @Override // nl2.a
    public final void a(Object obj, u property, Object obj2) {
        int i13 = this.f1534b;
        g gVar = this.f1535c;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(property, "property");
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                if (((Boolean) obj).booleanValue() != booleanValue) {
                    ViewParent parent = gVar.f1537a.k().getParent();
                    if (parent != null) {
                        parent.requestDisallowInterceptTouchEvent(booleanValue);
                    }
                    gVar.f1538b.m(booleanValue);
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(property, "property");
                ke2.d dVar = (ke2.d) obj2;
                ke2.d dVar2 = (ke2.d) obj;
                if (!Intrinsics.d(dVar2, dVar)) {
                    if (dVar2 != null) {
                        gVar.b(dVar2);
                    }
                    if (dVar != null) {
                        gVar.getClass();
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(dVar.f79320b.f79308e, 1.05f);
                        ofFloat.setDuration(gVar.f1539c);
                        ofFloat.addUpdateListener(new k(dVar, 3));
                        ofFloat.start();
                        Intrinsics.checkNotNullExpressionValue(ofFloat, "apply(...)");
                    }
                    ke2.c f52892h = gVar.f1537a.getF52892h();
                    f52892h.f79316h = dVar;
                    f52892h.f79310b = true;
                    break;
                }
                break;
        }
    }
}
