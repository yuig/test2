package f00;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.Request;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements ak2.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f60743a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f60744b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f60745c;

    public /* synthetic */ a(int i13, Object obj, Object obj2) {
        this.f60743a = i13;
        this.f60744b = obj;
        this.f60745c = obj2;
    }

    @Override // ak2.e
    public final void accept(Object obj) {
        switch (this.f60743a) {
            case 0:
                g this$0 = (g) this.f60744b;
                Request request = (Request) this.f60745c;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(request, "$request");
                rz.b.e(obj, this$0.f110218a, request);
                break;
            default:
                String str = (String) this.f60744b;
                su1.a aVar = (su1.a) this.f60745c;
                String str2 = (String) obj;
                if (!str2.equals(str)) {
                    aVar.f115228b = str2;
                    break;
                } else {
                    aVar.f115228b = null;
                    break;
                }
        }
    }
}
