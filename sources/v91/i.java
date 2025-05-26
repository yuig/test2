package v91;

import android.widget.FrameLayout;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import com.pinterest.gestalt.switchComponent.GestaltSwitch;
import com.pinterest.gestalt.text.GestaltText;
import kh2.s0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import u50.k0;

/* loaded from: classes5.dex */
public final class i extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f124984r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ m f124985s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(m mVar, bl2.c cVar) {
        super(2, cVar);
        this.f124985s = mVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        i iVar = new i(this.f124985s, cVar);
        iVar.f124984r = obj;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((a) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        a aVar2 = (a) this.f124984r;
        boolean z13 = aVar2.f124973a;
        m mVar = this.f124985s;
        GestaltSpinner gestaltSpinner = mVar.f124999f0;
        if (gestaltSpinner == null) {
            Intrinsics.r("spinner");
            throw null;
        }
        s0.w(gestaltSpinner, new u81.h(z13, 9));
        FrameLayout frameLayout = mVar.f124998e0;
        if (frameLayout == null) {
            Intrinsics.r("spinnerContainer");
            throw null;
        }
        frameLayout.setVisibility(z13 ? 0 : 8);
        k0 k0Var = aVar2.f124974b;
        if (k0Var != null) {
            GestaltText gestaltText = mVar.f125000g0;
            if (gestaltText == null) {
                Intrinsics.r("connectedTo");
                throw null;
            }
            gestaltText.i(new uv.b(k0Var, 4));
        }
        k0 k0Var2 = aVar2.f124975c;
        if (k0Var2 != null) {
            GestaltSwitch gestaltSwitch = mVar.f125002i0;
            if (gestaltSwitch == null) {
                Intrinsics.r("optInToggle");
                throw null;
            }
            gestaltSwitch.i(new u81.h(aVar2.f124976d, 10));
            GestaltText gestaltText2 = mVar.f125003j0;
            if (gestaltText2 == null) {
                Intrinsics.r("optInToggleLabel");
                throw null;
            }
            gestaltText2.i(new uv.b(k0Var2, 5));
        }
        return Unit.f80348a;
    }
}
