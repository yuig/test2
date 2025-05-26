package sl1;

import android.content.Context;
import com.pinterest.gestalt.avatargroup.GestaltAvatarGroup;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f113201i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ GestaltAvatarGroup f113202j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(GestaltAvatarGroup gestaltAvatarGroup, int i13) {
        super(0);
        this.f113201i = i13;
        this.f113202j = gestaltAvatarGroup;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f113201i;
        GestaltAvatarGroup gestaltAvatarGroup = this.f113202j;
        switch (i13) {
            case 0:
                return new n(gestaltAvatarGroup.c().f113176a, gestaltAvatarGroup.c().f113182g);
            default:
                Context context = gestaltAvatarGroup.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                return Boolean.valueOf(dl2.b.v0(eo1.a.comp_avatargroup_is_vr, context));
        }
    }
}
