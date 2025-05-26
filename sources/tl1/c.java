package tl1;

import com.pinterest.gestalt.avatargroup.legacy.AvatarGroup;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import sl1.r;

/* loaded from: classes5.dex */
public final class c extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f118076i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ AvatarGroup f118077j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(AvatarGroup avatarGroup, int i13) {
        super(0);
        this.f118076i = i13;
        this.f118077j = avatarGroup;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        AvatarGroup avatarGroup = this.f118077j;
        int i13 = this.f118076i;
        switch (i13) {
            case 0:
                switch (i13) {
                }
            default:
                switch (i13) {
                }
        }
        return Integer.valueOf(bs1.c.W(avatarGroup, r.avatar_group_chip_border_width_default));
    }
}
