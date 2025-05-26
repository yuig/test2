package qz;

import com.pinterest.api.model.DynamicFeed;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class g extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f105401i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i f105402j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(i iVar, int i13) {
        super(1);
        this.f105401i = i13;
        this.f105402j = iVar;
    }

    public final j b(DynamicFeed feed) {
        int i13 = this.f105401i;
        i iVar = this.f105402j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(feed, "feed");
                return new j(i.a(iVar, feed), null);
            default:
                Intrinsics.checkNotNullParameter(feed, "feed");
                return new j(i.a(iVar, feed), feed.f35556d);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f105401i) {
        }
        return b((DynamicFeed) obj);
    }
}
