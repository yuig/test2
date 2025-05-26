package aj0;

import bj0.g;
import com.pinterest.api.model.wy0;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import kh2.m0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class a extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f15408i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ zi0.a f15409j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(zi0.a aVar, int i13) {
        super(1);
        this.f15408i = i13;
        this.f15409j = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f15408i;
        zi0.a aVar = this.f15409j;
        switch (i13) {
            case 0:
                wy0 user = (wy0) obj;
                Intrinsics.f(user);
                g gVar = (g) aVar;
                gVar.getClass();
                Intrinsics.checkNotNullParameter(user, "user");
                GestaltAvatar gestaltAvatar = gVar.f22957d;
                if (gestaltAvatar != null) {
                    m0.V0(gestaltAvatar, user);
                }
                GestaltAvatar gestaltAvatar2 = gVar.f22957d;
                if (gestaltAvatar2 != null) {
                    gestaltAvatar2.H2(bj0.a.f22942n);
                }
                break;
            default:
                ((g) aVar).g();
                break;
        }
        return Unit.f80348a;
    }
}
