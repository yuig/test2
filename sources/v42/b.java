package v42;

import android.content.Context;
import androidx.lifecycle.z;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import m60.f0;
import nx.d0;

/* loaded from: classes4.dex */
public final class b extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f124138i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c f124139j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(c cVar, int i13) {
        super(0);
        this.f124138i = i13;
        this.f124139j = cVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f124138i;
        c cVar = this.f124139j;
        switch (i13) {
            case 0:
                return new a(cVar);
            case 1:
                Context requireContext = cVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                d0 s73 = cVar.s7();
                z viewLifecycleOwner = cVar.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                return new k(requireContext, s73, bf.b.S(viewLifecycleOwner), f0.i0(cVar.W8().f103320a), null, false, false, false, false, false, null, 4080);
            case 2:
                Context requireContext2 = cVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                return new ho0.f(requireContext2, (Integer) null);
            default:
                Context requireContext3 = cVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
                return new m(requireContext3, new WeakReference(cVar));
        }
    }
}
