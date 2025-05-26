package pv0;

import com.pinterest.api.model.zq;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;

/* loaded from: classes5.dex */
public final /* synthetic */ class c extends p implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f101441a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Object obj, int i13) {
        super(2, obj, d.class, "openColorPickerForSticker", "openColorPickerForSticker(Lcom/pinterest/api/model/IdeaPinSticker;Ljava/lang/String;)V", 0);
        this.f101441a = i13;
        if (i13 == 1) {
            super(2, obj, f.class, "openColorPickerForSticker", "openColorPickerForSticker(Lcom/pinterest/api/model/IdeaPinSticker;Ljava/lang/String;)V", 0);
        } else if (i13 != 2) {
        } else {
            super(2, obj, f.class, "openColorPickerForSticker", "openColorPickerForSticker(Lcom/pinterest/api/model/IdeaPinSticker;Ljava/lang/String;)V", 0);
        }
    }

    public final void h(zq p03, String p13) {
        switch (this.f101441a) {
            case 0:
                Intrinsics.checkNotNullParameter(p03, "p0");
                Intrinsics.checkNotNullParameter(p13, "p1");
                d dVar = (d) this.receiver;
                dVar.getClass();
                Boolean w13 = p03.w();
                Intrinsics.checkNotNullExpressionValue(w13, "getShouldShowColorPickerAfterSelection(...)");
                if (w13.booleanValue()) {
                    dVar.f101445d.d(new hv0.e(p13));
                    break;
                }
                break;
            case 1:
                Intrinsics.checkNotNullParameter(p03, "p0");
                Intrinsics.checkNotNullParameter(p13, "p1");
                f.t3((f) this.receiver, p03, p13);
                break;
            default:
                Intrinsics.checkNotNullParameter(p03, "p0");
                Intrinsics.checkNotNullParameter(p13, "p1");
                f.t3((f) this.receiver, p03, p13);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f101441a) {
            case 0:
                h((zq) obj, (String) obj2);
                break;
            case 1:
                h((zq) obj, (String) obj2);
                break;
            default:
                h((zq) obj, (String) obj2);
                break;
        }
        return Unit.f80348a;
    }
}
