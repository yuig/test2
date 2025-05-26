package a41;

import i32.y0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f624i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ r f625j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(r rVar, int i13) {
        super(1);
        this.f624i = i13;
        this.f625j = rVar;
    }

    public final Boolean b(zf0.f listOf) {
        int i13 = this.f624i;
        r rVar = this.f625j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(listOf, "$this$listOf");
                int i14 = r.P1;
                rVar.j8();
                return Boolean.valueOf(zf0.f.f(y0.ANDROID_USER_PROFILE_TAKEOVER, new i32.l[]{i32.l.PROFILE_EVOLUTION_EDU_YOUR_ACCOUNT_ANDROID, i32.l.PROFILE_EVOLUTION_EDU_PUBLIC_PROFILE_ANDROID}));
            default:
                Intrinsics.checkNotNullParameter(listOf, "$this$listOf");
                int i15 = r.P1;
                rVar.j8();
                return Boolean.valueOf(zf0.f.f(y0.ANDROID_USER_PROFILE_TAKEOVER, new i32.l[]{i32.l.ANDROID_BIZ_HUB_PROFILE_IMAGE_TOOLTIP}));
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f624i) {
        }
        return b((zf0.f) obj);
    }
}
