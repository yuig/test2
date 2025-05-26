package do1;

import android.content.res.TypedArray;
import com.pinterest.gestalt.toast.GestaltToast;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import u50.f0;

/* loaded from: classes5.dex */
public final class a extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f55661i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ GestaltToast f55662j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(GestaltToast gestaltToast, int i13) {
        super(1);
        this.f55661i = i13;
        this.f55662j = gestaltToast;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        m mVar;
        b bVar;
        int i13 = this.f55661i;
        GestaltToast gestaltToast = this.f55662j;
        switch (i13) {
            case 0:
                TypedArray $receiver = (TypedArray) obj;
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                rm1.i iVar = GestaltToast.E;
                gestaltToast.getClass();
                String string = $receiver.getString(d0.GestaltToast_android_text);
                f0 p23 = string != null ? bs1.c.p2(string) : bs1.c.p2("");
                String string2 = $receiver.getString(d0.GestaltToast_gestalt_toastAvatarImageUrl);
                String string3 = $receiver.getString(d0.GestaltToast_gestalt_toastAvatarName);
                if ((string2 == null || string2.length() == 0) && (string3 == null || string3.length() == 0)) {
                    mVar = null;
                } else {
                    if (string2 == null) {
                        string2 = "";
                    }
                    mVar = new e(string2, string3 != null ? string3 : "");
                }
                if (mVar == null) {
                    String string4 = $receiver.getString(d0.GestaltToast_gestalt_toastImage);
                    m jVar = string4 != null ? new j(string4) : null;
                    if (jVar == null) {
                        rm1.q b13 = rm1.r.b($receiver, d0.GestaltToast_gestalt_toastIcon);
                        if (b13 != null) {
                            int i14 = $receiver.getInt(d0.GestaltToast_gestalt_toastIconSize, -1);
                            jVar = new l(new rm1.f(b13, i14 >= 0 ? rm1.i.values()[i14] : GestaltToast.E));
                        } else {
                            jVar = null;
                        }
                    }
                    mVar = jVar;
                }
                String string5 = $receiver.getString(d0.GestaltToast_gestalt_toastButtonText);
                if (string5 != null) {
                    Intrinsics.checkNotNullParameter(string5, "string");
                    bVar = new b(new f0(string5), r.f55692i);
                } else {
                    bVar = null;
                }
                int i15 = $receiver.getInt(d0.GestaltToast_gestalt_toastVariant, -1);
                n nVar = i15 >= 0 ? n.values()[i15] : GestaltToast.F;
                int i16 = $receiver.getInt(d0.GestaltToast_gestalt_toastDurationMs, 5000);
                int i17 = $receiver.getInt(d0.GestaltToast_gestalt_toastTextMaxLines, 2);
                int resourceId = $receiver.getResourceId(d0.GestaltToast_gestalt_toastVerticalMargin, -1);
                return new d(p23, mVar, bVar, nVar, gestaltToast.getId(), i16, i17, resourceId > 0 ? new u50.b0(resourceId) : null, $receiver.getBoolean(d0.GestaltToast_gestalt_toastIsBottomPosition, false));
            default:
                gm1.a it = (gm1.a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                rm1.i iVar2 = GestaltToast.E;
                gestaltToast.getClass();
                com.google.firebase.messaging.q.K(gestaltToast.f49689p, true, null, new gv0.b(gestaltToast, 29), 2);
                return Unit.f80348a;
        }
    }
}
