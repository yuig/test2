package wn0;

import android.content.Context;
import androidx.lifecycle.u;
import androidx.lifecycle.z;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import m60.f0;
import nx.d0;
import wa2.m;

/* loaded from: classes5.dex */
public final class e extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f130469i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j f130470j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(j jVar, int i13) {
        super(0);
        this.f130469i = i13;
        this.f130470j = jVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f130469i;
        j jVar = this.f130470j;
        switch (i13) {
            case 0:
                return new d(jVar);
            case 1:
                Context requireContext = jVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                sn0.b bVar = jVar.f130486i1;
                return new com.pinterest.feature.board.organize.l(requireContext, new WeakReference(bVar != null ? ((un0.h) bVar).f122856x : null));
            case 2:
                Context requireContext2 = jVar.requireContext();
                sn0.b bVar2 = jVar.f130486i1;
                WeakReference weakReference = new WeakReference(bVar2 != null ? ((un0.h) bVar2).f122856x : null);
                d0 s73 = jVar.s7();
                z viewLifecycleOwner = jVar.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                u S = bf.b.S(viewLifecycleOwner);
                m i03 = f0.i0(jVar.W8().f103320a);
                Intrinsics.f(requireContext2);
                return new v42.k(requireContext2, s73, S, i03, weakReference, true, true, false, false, false, null, 3712);
            default:
                mk0.e eVar = jVar.f130487j1;
                if (eVar != null) {
                    eVar.r3();
                }
                return Unit.f80348a;
        }
    }
}
