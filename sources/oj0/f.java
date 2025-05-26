package oj0;

import com.pinterest.api.model.f30;
import com.pinterest.feature.pin.j;
import com.pinterest.feature.pin.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import nx.b0;
import nx.d1;
import qa2.h0;
import tb0.p;
import x02.i2;

/* loaded from: classes5.dex */
public final class f extends d {

    /* renamed from: q, reason: collision with root package name */
    public final String f95381q;

    /* renamed from: r, reason: collision with root package name */
    public final i f95382r;

    /* renamed from: s, reason: collision with root package name */
    public final Function0 f95383s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(String boardId, String str, uk1.d presenterPinalytics, d1 trackingParamAttacher, i2 pinRepository, r repinAnimationUtil, w eventManager, j pinAction, b saveActionLoggingData, a delegate, i iVar, Function0 function0, b0 pinAuxHelper, int i13) {
        super(boardId, str, presenterPinalytics, trackingParamAttacher, pinRepository, repinAnimationUtil, eventManager, pinAction, saveActionLoggingData, delegate, false, pinAuxHelper);
        i iVar2 = (i13 & 2048) != 0 ? null : iVar;
        Function0 isOneTapModuleAtTop = (i13 & 4096) != 0 ? e.f95380i : function0;
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(repinAnimationUtil, "repinAnimationUtil");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(pinAction, "pinAction");
        Intrinsics.checkNotNullParameter(saveActionLoggingData, "saveActionLoggingData");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(isOneTapModuleAtTop, "isOneTapModuleAtTop");
        Intrinsics.checkNotNullParameter(pinAuxHelper, "pinAuxHelper");
        this.f95381q = boardId;
        this.f95382r = iVar2;
        this.f95383s = isOneTapModuleAtTop;
    }

    @Override // oj0.d, mj0.g
    public final void l2(f30 pin, h0 h0Var) {
        i iVar;
        Intrinsics.checkNotNullParameter(pin, "pin");
        vb0.j.f125466a.M(this.f95381q, "onOneTapSaveButtonClicked was called when boardId was null", p.BOARD_AND_SECTION_VIEW, new Object[0]);
        if (((Boolean) this.f95383s.invoke()).booleanValue() && (iVar = this.f95382r) != null) {
            iVar.a3();
        }
        super.l2(pin, h0Var);
    }
}
