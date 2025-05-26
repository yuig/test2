package lb2;

import android.app.Activity;
import android.content.Intent;
import com.pinterest.api.model.wy0;
import ey.b0;
import ey.d0;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final i f82765j = new i(0);

    /* renamed from: k, reason: collision with root package name */
    public static final i f82766k = new i(1);

    /* renamed from: l, reason: collision with root package name */
    public static final i f82767l = new i(2);

    /* renamed from: m, reason: collision with root package name */
    public static final i f82768m = new i(3);

    /* renamed from: n, reason: collision with root package name */
    public static final i f82769n = new i(4);

    /* renamed from: o, reason: collision with root package name */
    public static final i f82770o = new i(5);

    /* renamed from: p, reason: collision with root package name */
    public static final i f82771p = new i(6);

    /* renamed from: q, reason: collision with root package name */
    public static final i f82772q = new i(7);

    /* renamed from: r, reason: collision with root package name */
    public static final i f82773r = new i(8);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f82774i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i13) {
        super(1);
        this.f82774i = i13;
    }

    public final Boolean b(wy0 it) {
        List u23;
        switch (this.f82774i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(!dl2.b.L1(it));
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                boolean[] zArr = it.V1;
                return Boolean.valueOf(zArr.length > 17 && zArr[17] && (u23 = it.u2()) != null && !u23.isEmpty());
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        c60.a aVar;
        switch (this.f82774i) {
            case 0:
                return b((wy0) obj);
            case 1:
                return b((wy0) obj);
            case 2:
                wy0 it = (wy0) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return uj2.q.w(it.u2());
            case 3:
                wy0 linkedBusiness = (wy0) obj;
                Intrinsics.checkNotNullParameter(linkedBusiness, "linkedBusiness");
                String userUid = linkedBusiness.getId();
                Intrinsics.checkNotNullExpressionValue(userUid, "getUid(...)");
                Intrinsics.checkNotNullParameter(userUid, "userUid");
                a60.a.a(null).edit().remove(userUid).commit();
                return Unit.f80348a;
            case 4:
                LinkedHashSet linkedHashSet = d0.f60468a;
                b0 tag = b0.TAG_DELAYED_BOTTOM_NAV_INFLATION;
                Intrinsics.checkNotNullParameter(tag, "tag");
                LinkedHashSet linkedHashSet2 = d0.f60468a;
                if (linkedHashSet2.contains(tag)) {
                    linkedHashSet2.remove(tag);
                }
                return Unit.f80348a;
            case 5:
                mr1.h businessAccount = (mr1.h) obj;
                Intrinsics.checkNotNullParameter(businessAccount, "businessAccount");
                mr1.h hVar = businessAccount.f88091d;
                if (hVar == null || (aVar = hVar.f88090c) == null) {
                    throw new IllegalStateException("Linked account must have a parent account with a valid access token");
                }
                return aVar;
            case 6:
                qr1.d authResult = (qr1.d) obj;
                Intrinsics.checkNotNullParameter(authResult, "authResult");
                return new c60.a(authResult.getV3AccessToken(), authResult.getV5AccessToken(), authResult.getV5RefreshToken());
            case 7:
                Activity activity = (Activity) obj;
                Intrinsics.checkNotNullParameter(activity, "activity");
                Intent intent = new Intent("com.pinterest.unauth.ACTION_USER_LOG_IN_SUCCESS");
                intent.setPackage(activity.getPackageName());
                activity.sendBroadcast(intent);
                return Unit.f80348a;
            default:
                vd0.c response = (vd0.c) obj;
                Intrinsics.checkNotNullParameter(response, "response");
                return response.h("data", Boolean.FALSE);
        }
    }
}
