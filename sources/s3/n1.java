package s3;

import android.content.Context;
import android.view.View;
import androidx.compose.ui.platform.AbstractComposeView;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import com.pinterest.ui.grid.LegoPinGridCellImpl;
import java.io.ByteArrayInputStream;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import t3.y3;

/* loaded from: classes.dex */
public final class n1 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f110845i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f110846j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f110847k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f110848l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n1(Object obj, Object obj2, Object obj3, int i13) {
        super(0);
        this.f110845i = i13;
        this.f110846j = obj;
        this.f110847k = obj2;
        this.f110848l = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f110845i;
        Object obj = this.f110848l;
        Object obj2 = this.f110847k;
        Object obj3 = this.f110846j;
        switch (i13) {
            case 0:
                m250invoke();
                return Unit.f80348a;
            case 1:
                m250invoke();
                return Unit.f80348a;
            case 2:
                lj1.b bVar = (lj1.b) obj3;
                Context context = ((SbaPinRep) obj2).getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                ee1.d onPrepareForReuse = new ee1.d((lj1.a) obj, 28);
                Intrinsics.checkNotNullParameter(bVar, "<this>");
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(onPrepareForReuse, "onPrepareForReuse");
                return new va2.a(context, ((Number) bVar.f83620e.a(context)).intValue(), bVar.f83616a.a(context).toString(), bVar.f83621f, ((Number) bVar.f83622g.a(context)).intValue(), bVar.f83623h.a(context).intValue(), bVar.f83624i.a(context).intValue(), bVar.f83625j.a(context).intValue(), bVar.f83626k.a(context).intValue(), onPrepareForReuse);
            case 3:
                qa2.n nVar = (qa2.n) obj;
                qa2.f0 f0Var = (qa2.f0) ((Function0) obj3).invoke();
                f0Var.getInternalCell().setPinalytics((nx.d0) obj2);
                if (nVar != null) {
                    qa2.h0 internalCell = f0Var.getInternalCell();
                    boolean z13 = internalCell instanceof qa2.o;
                    wa2.i iVar = nVar.f103320a;
                    if (z13) {
                        ((LegoPinGridCellImpl) ((qa2.o) internalCell)).s(iVar);
                    } else if (internalCell instanceof qa2.v1) {
                        ((qa2.v1) internalCell).applyUnMigratedPFCFields(iVar.f128792q0, iVar.f128772g0, iVar.f128768e0, iVar.f128782l0, iVar.M);
                    }
                }
                if (f0Var instanceof qa2.r0) {
                    qa2.a1 a1Var = ((qa2.r0) f0Var).f103346i;
                    if (a1Var == null) {
                        Intrinsics.r("pinSavedOverlayView");
                        throw null;
                    }
                    a1Var.z();
                }
                return (View) f0Var;
            case 4:
                ln2.a0 a0Var = (ln2.a0) obj3;
                ln2.e0 a13 = a0Var.a((am2.m) a0Var.f84059a.f82655d);
                List F0 = a13 != null ? CollectionsKt.F0(((ln2.o) a0Var.f84059a.f82653b).f84112e.h(a13, (zm2.c) obj2, (ln2.b) obj)) : null;
                return F0 == null ? kotlin.collections.q0.f80391a : F0;
            default:
                return ((zm2.d) ((zm2.b0) obj3)).b((ByteArrayInputStream) obj2, ((ln2.o) ((nn2.q) obj).f91630b.f82653b).f84122o);
        }
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m250invoke() {
        int i13 = this.f110845i;
        Object obj = this.f110848l;
        Object obj2 = this.f110847k;
        Object obj3 = this.f110846j;
        switch (i13) {
            case 0:
                b3.u0 u0Var = q1.G;
                ((q1) obj3).Q0((b3.u) obj2, (e3.d) obj);
                break;
            default:
                AbstractComposeView abstractComposeView = (AbstractComposeView) obj3;
                abstractComposeView.removeOnAttachStateChangeListener((t3.g0) obj2);
                y3 listener = (y3) obj;
                int i14 = x5.a.f133834a;
                Intrinsics.checkNotNullParameter(abstractComposeView, "<this>");
                Intrinsics.checkNotNullParameter(listener, "listener");
                x5.b b13 = x5.a.b(abstractComposeView);
                Intrinsics.checkNotNullParameter(listener, "listener");
                b13.f133836a.remove(listener);
                break;
        }
    }
}
