package px0;

import com.pinterest.feature.newshub.feed.view.NewsHubFeedItemBaseView;
import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class e extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f101595i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j f101596j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f101597k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(j jVar, String str, int i13) {
        super(0);
        this.f101595i = i13;
        this.f101596j = jVar;
        this.f101597k = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f101595i) {
            case 0:
                m234invoke();
                break;
            default:
                m234invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m234invoke() {
        int i13 = this.f101595i;
        String id3 = this.f101597k;
        j jVar = this.f101596j;
        switch (i13) {
            case 0:
                mx0.b bVar = (mx0.b) jVar.getViewIfBound();
                if (bVar != null) {
                    Intrinsics.checkNotNullParameter(id3, "id");
                    ((NewsHubFeedItemBaseView) bVar).a().d(new mx0.d(id3));
                    break;
                }
                break;
            default:
                jVar.f101617b.b(e0.b(id3), false).l(tk2.e.f118017c).h(wj2.c.a()).i(new xo.b(27), new hx0.a(7, d.f101589m));
                break;
        }
    }
}
