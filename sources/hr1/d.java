package hr1;

import com.facebook.AccessToken;
import com.facebook.login.x;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class d extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final d f69986j = new d(0);

    /* renamed from: k, reason: collision with root package name */
    public static final d f69987k = new d(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f69988i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i13) {
        super(1);
        this.f69988i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f69988i) {
            case 0:
                x loginManager = (x) obj;
                Intrinsics.checkNotNullParameter(loginManager, "loginManager");
                return new fk2.g(new g51.h(loginManager, 18), 1);
            default:
                b it = (b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                AccessToken accessToken = it.f69983a;
                return new Pair(accessToken.f29855i, accessToken.f29851e);
        }
    }
}
