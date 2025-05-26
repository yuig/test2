package dg;

import com.pinterest.api.model.qc;
import com.pinterest.framework.screens.ScreenManager$Companion;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.function.Consumer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54900a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f54901b;

    public /* synthetic */ c(Serializable serializable, int i13) {
        this.f54900a = i13;
        this.f54901b = serializable;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i13 = this.f54900a;
        Object obj2 = this.f54901b;
        switch (i13) {
            case 0:
                StringBuilder sb3 = (StringBuilder) obj2;
                Class<?> cls = obj.getClass();
                try {
                    try {
                        sb3.append(" ");
                        sb3.append(cls.getSimpleName());
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                } catch (Exception unused2) {
                    sb3.append(" ");
                    sb3.append(cls.getName());
                    return;
                }
            case 1:
                ArrayList collabInvitedIds = (ArrayList) obj2;
                qc invite = (qc) obj;
                Intrinsics.checkNotNullParameter(collabInvitedIds, "$collabInvitedIds");
                Intrinsics.checkNotNullParameter(invite, "invite");
                collabInvitedIds.add(invite.f41259b.getId());
                break;
            default:
                ScreenManager$Companion.removeAllViewModelStoresForContext$lambda$1$lambda$0((Function1) obj2, obj);
                break;
        }
    }
}
