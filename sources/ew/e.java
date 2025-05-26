package ew;

import ads_mobile_sdk.nh;
import com.pinterest.api.model.f30;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import m60.u;

/* loaded from: classes3.dex */
public final class e extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f60298i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f30 f60299j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ j f60300k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Function1 f60301l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(f30 f30Var, j jVar, Function1 function1, int i13) {
        super(1);
        this.f60298i = i13;
        this.f60299j = f30Var;
        this.f60300k = jVar;
        this.f60301l = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String uid;
        String uid2;
        int i13 = this.f60298i;
        Function1 function1 = this.f60301l;
        j jVar = this.f60300k;
        f30 f30Var = this.f60299j;
        switch (i13) {
            case 0:
                nh ad3 = (nh) obj;
                Intrinsics.checkNotNullParameter(ad3, "ad");
                if (f30Var != null && (uid = f30Var.getUid()) != null) {
                    String concat = "[AdView] Caching ad view for pinId: ".concat(uid);
                    jVar.getClass();
                    u.f85943a.d(new z.a(concat, 12));
                    jVar.f60336v.d(uid, ad3);
                    function1.invoke(ad3);
                }
                break;
            default:
                bj.f ad4 = (bj.f) obj;
                Intrinsics.checkNotNullParameter(ad4, "ad");
                if (f30Var != null && (uid2 = f30Var.getUid()) != null) {
                    String concat2 = "[NativeAd] Caching native ad for pinId: ".concat(uid2);
                    jVar.getClass();
                    u.f85943a.d(new z.a(concat2, 12));
                    jVar.f60335u.d(uid2, ad4);
                    function1.invoke(ad4);
                }
                break;
        }
        return Unit.f80348a;
    }
}
