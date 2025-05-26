package hr1;

import com.facebook.AccessToken;
import com.facebook.Profile;
import com.facebook.login.x;
import com.facebook.login.y;
import kk2.c0;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import l7.w0;
import so.oa;
import uj2.f0;

/* loaded from: classes4.dex */
public final class m extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f70003i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q f70004j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(q qVar, int i13) {
        super(1);
        this.f70003i = i13;
        this.f70004j = qVar;
    }

    public final f0 b(b attributes) {
        int i13 = this.f70003i;
        q qVar = this.f70004j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(attributes, "attributes");
                Profile profile = attributes.f69984b;
                qVar.getClass();
                String str = profile.f29918a;
                return qVar.f70014j.a(str != null ? str : "", attributes.f69983a.f29851e, false).b();
            default:
                Intrinsics.checkNotNullParameter(attributes, "attributes");
                Profile profile2 = attributes.f69984b;
                qVar.getClass();
                String str2 = profile2.f29918a;
                String str3 = str2 != null ? str2 : "";
                AccessToken accessToken = attributes.f69983a;
                String str4 = accessToken.f29851e;
                String Z = CollectionsKt.Z(accessToken.f29848b, ",", null, null, 0, null, null, 62);
                oa oaVar = qVar.f70015k.f113538a.f113568a;
                gr1.f fVar = new gr1.f(str3, str4, Z);
                fVar.f65999d = (cr1.a) oaVar.A2.get();
                fVar.f66000e = (or1.i) oaVar.f114015y5.get();
                return fVar.e();
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f70003i;
        q qVar = this.f70004j;
        switch (i13) {
            case 0:
                return b((b) obj);
            case 1:
                x loginManager = (x) obj;
                Intrinsics.checkNotNullParameter(loginManager, "loginManager");
                qVar.getClass();
                c0 c0Var = new c0(new w0(15), new oo1.d(18, new o(qVar, loginManager)), new zq1.c0(7, new p(1, loginManager, x.class, "unregisterCallback", "unregisterCallback(Lcom/facebook/CallbackManager;)V", 0)));
                Intrinsics.checkNotNullExpressionValue(c0Var, "using(...)");
                return c0Var;
            case 2:
                y it = (y) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                qVar.getClass();
                return e.h();
            default:
                return b((b) obj);
        }
    }
}
