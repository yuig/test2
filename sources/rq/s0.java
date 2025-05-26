package rq;

import android.content.Context;
import android.widget.LinearLayout;
import com.pinterest.activity.pin.view.modules.PinCloseupBaseModule;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class s0 extends PinCloseupBaseModule {

    /* renamed from: a, reason: collision with root package name */
    public final e11.a f109535a;

    /* renamed from: b, reason: collision with root package name */
    public String f109536b;

    /* renamed from: c, reason: collision with root package name */
    public b11.k f109537c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(Context context, e11.a pinCloseupMetadataModuleListener) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinCloseupMetadataModuleListener, "pinCloseupMetadataModuleListener");
        this.f109535a = pinCloseupMetadataModuleListener;
        setClipChildren(false);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new com.google.android.material.navigation.b(this, 3));
        } else {
            pinCloseupMetadataModuleListener.w6(getHeight());
        }
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final void createView() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        b11.k kVar = new b11.k(context, kh2.n3.E(getViewPinalytics(), tb0.p.CLOSEUP_CLICKTHROUGH));
        kVar.f21057h = this.f109536b;
        kVar.f21055f = getProductTagParentPinId();
        maybeUpdateLayoutForTabletPortrait(kVar);
        this.f109537c = kVar;
        addView(kVar);
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final h32.g0 getComponentType() {
        return h32.g0.PIN_CLOSEUP_ACTION;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean hasContent() {
        return true;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean shouldShowForPin() {
        return true;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean shouldUpdateView() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005e, code lost:
    
        if (r1 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ba, code lost:
    
        if (r0.l("closeup_redesign_tablet_android") == false) goto L39;
     */
    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void updatePin(com.pinterest.api.model.f30 r20) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: rq.s0.updatePin(com.pinterest.api.model.f30):void");
    }
}
