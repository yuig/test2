package wi0;

import com.pinterest.api.model.wy0;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import e0.t;
import jc0.l;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import rq.e2;
import xi0.f;

/* loaded from: classes5.dex */
public final class a extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f129996i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ vi0.b f129997j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(vi0.b bVar, int i13) {
        super(1);
        this.f129996i = i13;
        this.f129997j = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f129996i;
        vi0.b bVar = this.f129997j;
        switch (i13) {
            case 0:
                wy0 wy0Var = (wy0) obj;
                Intrinsics.f(wy0Var);
                String url = dl2.b.s0(wy0Var);
                Integer q23 = wy0Var.q2();
                Intrinsics.checkNotNullExpressionValue(q23, "getAvatarColorIndex(...)");
                int intValue = q23.intValue();
                f fVar = (f) bVar;
                fVar.getClass();
                Intrinsics.checkNotNullParameter(url, "url");
                e2 e2Var = new e2(intValue, url);
                GestaltAvatar gestaltAvatar = fVar.f135013j;
                gestaltAvatar.H2(e2Var);
                t.g(gestaltAvatar, new l(dl2.b.j1(wy0Var), 21));
                break;
            default:
                bVar.f();
                break;
        }
        return Unit.f80348a;
    }
}
