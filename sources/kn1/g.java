package kn1;

import android.content.Context;
import com.pinterest.gestalt.sheet.header.GestaltSheetHeader;
import hn1.u;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class g extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f80263i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ GestaltSheetHeader f80264j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(GestaltSheetHeader gestaltSheetHeader, int i13) {
        super(0);
        this.f80263i = i13;
        this.f80264j = gestaltSheetHeader;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f80263i;
        GestaltSheetHeader gestaltSheetHeader = this.f80264j;
        switch (i13) {
            case 0:
                Context context = gestaltSheetHeader.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                return Boolean.valueOf(dl2.b.v0(eo1.a.comp_sheet_enable_media_header, context));
            default:
                return Integer.valueOf(gestaltSheetHeader.getContext().getResources().getInteger(u.anim_speed_fastest));
        }
    }
}
