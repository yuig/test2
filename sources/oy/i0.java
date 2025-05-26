package oy;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import h32.a4;
import h32.d4;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i0 extends j0 implements ey.b2 {

    /* renamed from: e, reason: collision with root package name */
    public final s92.l f98071e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f98072f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f98073g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f98074h;

    /* renamed from: i, reason: collision with root package name */
    public final d4 f98075i;

    /* renamed from: j, reason: collision with root package name */
    public final a4 f98076j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(String pinUid, s92.l pwtCause, boolean z13, d4 viewType, a4 viewParameterType, int i13) {
        super(pinUid);
        pwtCause = (i13 & 2) != 0 ? s92.l.USER_NAVIGATION : pwtCause;
        viewType = (i13 & 64) != 0 ? d4.STORY_PIN : viewType;
        viewParameterType = (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? a4.PIN_CLOSEUP : viewParameterType;
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        Intrinsics.checkNotNullParameter(pwtCause, "pwtCause");
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        Intrinsics.checkNotNullParameter(viewParameterType, "viewParameterType");
        this.f98071e = pwtCause;
        this.f98072f = false;
        this.f98073g = z13;
        this.f98074h = false;
        this.f98075i = viewType;
        this.f98076j = viewParameterType;
    }
}
