package bm1;

import android.content.Context;
import android.content.res.TypedArray;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.buttonToggle.GestaltButtonToggle;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import u50.i0;

/* loaded from: classes5.dex */
public final class a extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f23486i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ GestaltButtonToggle f23487j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(GestaltButtonToggle gestaltButtonToggle, int i13) {
        super(1);
        this.f23486i = i13;
        this.f23487j = gestaltButtonToggle;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f23486i;
        GestaltButtonToggle gestaltButtonToggle = this.f23487j;
        switch (i13) {
            case 0:
                TypedArray $receiver = (TypedArray) obj;
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                int i14 = GestaltButtonToggle.f49328x;
                gestaltButtonToggle.getClass();
                int i15 = b0.GestaltButtonToggle_gestalt_toggleButtonSize;
                o oVar = o.LARGE;
                int i16 = $receiver.getInt(i15, -1);
                return new m(i16 >= 0 ? o.values()[i16] : oVar, $receiver.getBoolean(b0.GestaltButtonToggle_android_checked, false) ? n.SELECTED : n.UNSELECTED, null, $receiver.getBoolean(b0.GestaltButtonToggle_android_enabled, true), d7.b.Y($receiver, b0.GestaltButtonToggle_android_visibility, fm1.c.VISIBLE), gestaltButtonToggle.getId(), null, 68);
            case 1:
                Intrinsics.checkNotNullParameter((gm1.a) obj, "it");
                int i17 = GestaltButtonToggle.f49328x;
                gestaltButtonToggle.x();
                return Unit.f80348a;
            case 2:
                fm1.c it = (fm1.c) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                gestaltButtonToggle.setVisibility(it.getVisibility());
                return Unit.f80348a;
            case 3:
                gestaltButtonToggle.setId(((Number) obj).intValue());
                return Unit.f80348a;
            case 4:
                i0 it2 = (i0) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                Context context = gestaltButtonToggle.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                gestaltButtonToggle.setContentDescription(it2.a(context));
                return Unit.f80348a;
            case 5:
                Intrinsics.checkNotNullParameter((Unit) obj, "it");
                gestaltButtonToggle.getClass();
                return Unit.f80348a;
            case 6:
                Intrinsics.checkNotNullParameter((Unit) obj, "it");
                int i18 = GestaltButtonToggle.f49328x;
                return gestaltButtonToggle.f32352o ? new r(gestaltButtonToggle.u().f23512f) : new s(gestaltButtonToggle.u().f23512f);
            default:
                m it3 = (m) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                return m.e(it3, null, kh2.j.S(gestaltButtonToggle.u().f23508b), null, false, null, 0, null, RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_DETAILED);
        }
    }
}
