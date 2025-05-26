package r02;

import android.widget.LinearLayout;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.reportFlow.feature.rvc.model.LinkedBA;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class n extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f105776r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ r f105777s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f105777s = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        n nVar = new n(this.f105777s, cVar);
        nVar.f105776r = obj;
        return nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((s02.a) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        String f50426a;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        s02.a aVar2 = (s02.a) this.f105776r;
        int i13 = r.f105790l0;
        r rVar = this.f105777s;
        rVar.getClass();
        List e13 = aVar2.e();
        if (e13 != null) {
            rVar.f105796h0 = e13;
            boolean z13 = !e13.isEmpty();
            LinearLayout linearLayout = rVar.f105794f0;
            if (linearLayout == null) {
                Intrinsics.r("llAccountHeader");
                throw null;
            }
            int i14 = 0;
            linearLayout.setVisibility(z13 ? 0 : 8);
            if (z13) {
                GestaltText gestaltText = rVar.f105795g0;
                if (gestaltText == null) {
                    Intrinsics.r("spAccountSelector");
                    throw null;
                }
                CharSequence text = gestaltText.getText();
                if (text == null || kotlin.text.z.j(text)) {
                    LinkedBA linkedBA = (LinkedBA) CollectionsKt.firstOrNull(rVar.f105796h0);
                    if (linkedBA != null && (f50426a = linkedBA.getF50426a()) != null) {
                        GestaltText gestaltText2 = rVar.f105795g0;
                        if (gestaltText2 == null) {
                            Intrinsics.r("spAccountSelector");
                            throw null;
                        }
                        pk.a0.p(gestaltText2, f50426a);
                    }
                    GestaltText gestaltText3 = rVar.f105795g0;
                    if (gestaltText3 == null) {
                        Intrinsics.r("spAccountSelector");
                        throw null;
                    }
                    gestaltText3.setOnClickListener(new m(rVar, i14));
                }
            }
        }
        return Unit.f80348a;
    }
}
