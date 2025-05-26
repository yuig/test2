package rq;

import android.content.Context;
import com.pinterest.activity.pin.view.modules.PinCloseupBaseModule;
import com.pinterest.gestalt.divider.GestaltDivider;
import kotlin.jvm.internal.Intrinsics;
import so.jb;
import so.oa;
import so.s8;

/* loaded from: classes3.dex */
public final class f extends PinCloseupBaseModule {

    /* renamed from: a, reason: collision with root package name */
    public boolean f109178a;

    /* renamed from: b, reason: collision with root package name */
    public final xk2.v f109179b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        inject();
        this.f109179b = xk2.m.b(new e(this, 0));
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final void createView() {
        addView((GestaltDivider) this.f109179b.getValue());
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final h32.g0 getComponentType() {
        return h32.g0.PIN_CLOSEUP;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean hasContent() {
        return true;
    }

    @Override // rq.k
    public final void inject() {
        if (this.f109178a) {
            return;
        }
        this.f109178a = true;
        jb jbVar = (jb) ((g) generatedComponent());
        oa oaVar = jbVar.f113483a;
        this.clickThroughHelperFactory = (a11.d) oaVar.f113668ec.get();
        this.presenterPinalyticsFactory = (uk1.e) oaVar.f113702ga.get();
        s8 s8Var = jbVar.f113485c;
        this.closeupActionController = s8Var.h5();
        this.bidiFormatter = a02.e.I1();
        this.baseCloseupLibraryExperiments = s8Var.k5();
        this.pinAuxHelper = (nx.b0) oaVar.R8.get();
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean shouldShowForPin() {
        return true;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean shouldUpdateView() {
        return true;
    }
}
