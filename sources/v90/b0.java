package v90;

import android.view.ViewGroup;
import com.pinterest.shuffles.cutout.editor.ui.refine.EditMaskImageView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* loaded from: classes5.dex */
public final class b0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f124868i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i0 f124869j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(i0 i0Var, int i13) {
        super(0);
        this.f124868i = i13;
        this.f124869j = i0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f124868i) {
            case 0:
                m274invoke();
                break;
            case 1:
                m274invoke();
                break;
            case 2:
                m274invoke();
                break;
            case 3:
                m274invoke();
                break;
            case 4:
                m274invoke();
                break;
            case 5:
                m274invoke();
                break;
            default:
                m274invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m274invoke() {
        int i13 = this.f124868i;
        i0 i0Var = this.f124869j;
        switch (i13) {
            case 0:
                ViewGroup viewGroup = i0Var.f124914l0;
                if (viewGroup != null) {
                    if (viewGroup.getVisibility() == 0) {
                        dv0.q qVar = i0Var.f124916n0;
                        if (qVar != null) {
                            a0 onComplete = new a0(i0Var, 0);
                            Intrinsics.checkNotNullParameter(onComplete, "onComplete");
                            ((EditMaskImageView) qVar.f56381b).g2(onComplete);
                            return;
                        }
                        Intrinsics.r("refineMaskViewHelper");
                        throw null;
                    }
                    i0Var.b8(new l(n1.SELECT, null));
                    return;
                }
                Intrinsics.r("refineMaskContainer");
                throw null;
            case 1:
                l lVar = new l(n1.REFINE, p1.Add);
                IntRange intRange = i0.f124904q0;
                i0Var.b8(lVar);
                return;
            case 2:
                l lVar2 = new l(n1.REFINE, p1.Erase);
                IntRange intRange2 = i0.f124904q0;
                i0Var.b8(lVar2);
                return;
            case 3:
                w wVar = w.f124967a;
                IntRange intRange3 = i0.f124904q0;
                i0Var.b8(wVar);
                return;
            case 4:
                s sVar = s.f124959a;
                IntRange intRange4 = i0.f124904q0;
                i0Var.b8(sVar);
                dv0.q qVar2 = i0Var.f124916n0;
                if (qVar2 != null) {
                    qVar2.f(x62.m.f133988c);
                    return;
                } else {
                    Intrinsics.r("refineMaskViewHelper");
                    throw null;
                }
            case 5:
                r rVar = r.f124956a;
                IntRange intRange5 = i0.f124904q0;
                i0Var.b8(rVar);
                dv0.q qVar3 = i0Var.f124916n0;
                if (qVar3 != null) {
                    qVar3.f(x62.l.f133987c);
                    return;
                } else {
                    Intrinsics.r("refineMaskViewHelper");
                    throw null;
                }
            default:
                ViewGroup viewGroup2 = i0Var.f124914l0;
                if (viewGroup2 != null) {
                    if (viewGroup2.getVisibility() == 0) {
                        dv0.q qVar4 = i0Var.f124916n0;
                        if (qVar4 != null) {
                            a0 onComplete2 = new a0(i0Var, 1);
                            Intrinsics.checkNotNullParameter(onComplete2, "onComplete");
                            ((EditMaskImageView) qVar4.f56381b).g2(onComplete2);
                            return;
                        }
                        Intrinsics.r("refineMaskViewHelper");
                        throw null;
                    }
                    i0Var.b8(new x(null));
                    return;
                }
                Intrinsics.r("refineMaskContainer");
                throw null;
        }
    }
}
