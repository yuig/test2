package ba;

import i2.v3;
import java.io.File;
import java.util.List;
import java.util.ListIterator;
import kh2.s0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import tt0.l0;

/* loaded from: classes3.dex */
public final class u extends kotlin.jvm.internal.s implements kl2.m {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f22295i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f22296j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f22297k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(int i13, Object obj, Object obj2) {
        super(4);
        this.f22295i = i13;
        this.f22296j = obj;
        this.f22297k = obj2;
    }

    @Override // kl2.m
    public final Object c(Object obj, Object obj2, Object obj3, Object obj4) {
        int i13 = this.f22295i;
        Object obj5 = this.f22297k;
        Object obj6 = this.f22296j;
        Object obj7 = null;
        switch (i13) {
            case 0:
                i1.r rVar = (i1.r) obj;
                z9.k kVar = (z9.k) obj2;
                i2.o oVar = (i2.o) obj3;
                ((Number) obj4).intValue();
                List list = (List) ((v3) obj5).getValue();
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        Object previous = listIterator.previous();
                        if (Intrinsics.d(kVar, (z9.k) previous)) {
                            obj7 = previous;
                        }
                    }
                }
                z9.k kVar2 = (z9.k) obj7;
                if (kVar2 != null) {
                    s0.o(kVar2, (r2.d) obj6, q2.i.b(oVar, -1425390790, new androidx.compose.foundation.lazy.layout.v(7, kVar2, rVar)), oVar, 456);
                }
                return Unit.f80348a;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                File outputFile = (File) obj2;
                long longValue = ((Number) obj3).longValue();
                Boolean bool = (Boolean) obj4;
                bool.getClass();
                Intrinsics.checkNotNullParameter(outputFile, "outputFile");
                l0 l0Var = (l0) obj6;
                l0Var.f119180p0.z(false);
                tt0.z zVar = l0Var.J0;
                if (zVar == null) {
                    Intrinsics.r("cameraController");
                    throw null;
                }
                zVar.w(tt0.s.RECORDING_STOPPED);
                tt0.z zVar2 = l0Var.J0;
                if (zVar2 == null) {
                    Intrinsics.r("cameraController");
                    throw null;
                }
                String announcement = l0Var.requireContext().getString(aq1.h.idea_pin_recording_stopped);
                Intrinsics.checkNotNullExpressionValue(announcement, "getString(...)");
                Intrinsics.checkNotNullParameter(announcement, "announcement");
                zVar2.o().announceForAccessibility(announcement);
                rt0.b bVar = l0Var.f119180p0;
                if (booleanValue) {
                    l0Var.h8().h(x0.oops_something_went_wrong);
                    outputFile.delete();
                    bVar.t();
                } else {
                    bVar.A(longValue, outputFile);
                }
                ((Function1) obj5).invoke(bool);
                return Unit.f80348a;
        }
    }
}
