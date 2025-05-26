package oo1;

import com.pinterest.activity.sendapin.model.TypeAheadItem;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.wy0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class c implements ak2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f96831a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f96832b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f96833c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f96834d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f96835e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f96836f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f96837g;

    public /* synthetic */ c(TypeAheadItem typeAheadItem, no1.e eVar, wy0 wy0Var, String str, f30 f30Var, Function0 function0) {
        this.f96833c = typeAheadItem;
        this.f96834d = eVar;
        this.f96835e = wy0Var;
        this.f96832b = str;
        this.f96836f = f30Var;
        this.f96837g = function0;
    }

    @Override // ak2.a
    public final void run() {
        int i13 = this.f96831a;
        Object obj = this.f96837g;
        Object obj2 = this.f96836f;
        Object obj3 = this.f96835e;
        Object obj4 = this.f96834d;
        Object obj5 = this.f96833c;
        switch (i13) {
            case 0:
                TypeAheadItem typeAheadItem = (TypeAheadItem) obj5;
                no1.e conversationRemoteDataSource = (no1.e) obj4;
                wy0 sender = (wy0) obj3;
                Function0 shouldShowThreadEntryPoint = (Function0) obj;
                Intrinsics.checkNotNullParameter(typeAheadItem, "$typeAheadItem");
                Intrinsics.checkNotNullParameter(conversationRemoteDataSource, "$conversationRemoteDataSource");
                Intrinsics.checkNotNullParameter(sender, "$sender");
                String pinId = this.f96832b;
                Intrinsics.checkNotNullParameter(pinId, "$pinId");
                Intrinsics.checkNotNullParameter(shouldShowThreadEntryPoint, "$shouldShowThreadEntryPoint");
                new kk2.m(j.i(typeAheadItem), new d(0, new h(conversationRemoteDataSource, 3)), 0).l(wj2.c.a()).o(new dl1.c(18, new aw0.j(sender, pinId, (f30) obj2, shouldShowThreadEntryPoint, 26)), new dl1.c(19, g.f96847p));
                break;
            default:
                wq1.n this$0 = (wq1.n) obj5;
                String businessName = (String) obj4;
                String accountType = (String) obj3;
                String advertisingIntent = (String) obj2;
                String website = (String) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                String key = this.f96832b;
                Intrinsics.checkNotNullParameter(key, "$key");
                Intrinsics.checkNotNullParameter(businessName, "$businessName");
                Intrinsics.checkNotNullParameter(accountType, "$accountType");
                Intrinsics.checkNotNullParameter(advertisingIntent, "$advertisingIntent");
                Intrinsics.checkNotNullParameter(website, "$website");
                this$0.w3(key, businessName, accountType, advertisingIntent, website);
                break;
        }
    }

    public /* synthetic */ c(wq1.n nVar, String str, String str2, String str3, String str4, String str5) {
        this.f96833c = nVar;
        this.f96832b = str;
        this.f96834d = str2;
        this.f96835e = str3;
        this.f96836f = str4;
        this.f96837g = str5;
    }
}
