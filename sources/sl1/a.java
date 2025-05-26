package sl1;

import android.content.res.TypedArray;
import com.pinterest.gestalt.avatargroup.GestaltAvatarGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f113167i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ GestaltAvatarGroup f113168j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(GestaltAvatarGroup gestaltAvatarGroup, int i13) {
        super(1);
        this.f113167i = i13;
        this.f113168j = gestaltAvatarGroup;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f113167i;
        GestaltAvatarGroup gestaltAvatarGroup = this.f113168j;
        switch (i13) {
            case 0:
                TypedArray $receiver = (TypedArray) obj;
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                al1.n nVar = GestaltAvatarGroup.f49251e;
                gestaltAvatarGroup.getClass();
                int i14 = $receiver.getInt(w.GestaltAvatarGroup_gestalt_avatarGroupSize, -1);
                h hVar = i14 >= 0 ? h.values()[i14] : GestaltAvatarGroup.f49252f;
                boolean z13 = $receiver.getBoolean(w.GestaltAvatarGroup_gestalt_showAddUserIcon, false);
                fm1.c Y = d7.b.Y($receiver, w.GestaltAvatarGroup_android_visibility, GestaltAvatarGroup.f49254h);
                int i15 = $receiver.getInt(w.GestaltAvatarGroup_gestalt_avatarGroupMaxAvatarCount, -1);
                f fVar = i15 >= 0 ? f.values()[i15] : GestaltAvatarGroup.f49253g;
                String string = $receiver.getString(w.GestaltAvatarGroup_android_contentDescription);
                break;
            case 1:
                fm1.c it = (fm1.c) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                gestaltAvatarGroup.setVisibility(it.getVisibility());
                break;
            default:
                gestaltAvatarGroup.setId(((Number) obj).intValue());
                break;
        }
        return Unit.f80348a;
    }
}
