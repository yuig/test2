package xo;

import com.pinterest.activity.sendapin.model.TypeAheadItem;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class t extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f135557i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f135558j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ TypeAheadItem f135559k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(String str, TypeAheadItem typeAheadItem, int i13) {
        super(1);
        this.f135557i = i13;
        this.f135558j = str;
        this.f135559k = typeAheadItem;
    }

    public final rl1.q b(rl1.q it) {
        int i13 = this.f135557i;
        TypeAheadItem typeAheadItem = this.f135559k;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                String imageUri = this.f135558j;
                Intrinsics.checkNotNullExpressionValue(imageUri, "$imageUri");
                String n13 = typeAheadItem.n();
                Intrinsics.checkNotNullExpressionValue(n13, "getTitle(...)");
                return rl1.q.e(it, imageUri, n13, false, null, null, false, false, null, 0, new rl1.d(typeAheadItem.f35147h), null, 1532);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                String url = this.f135558j;
                Intrinsics.checkNotNullExpressionValue(url, "$url");
                String n14 = typeAheadItem.n();
                Intrinsics.checkNotNullExpressionValue(n14, "getTitle(...)");
                return rl1.q.e(it, url, n14, false, null, null, false, false, null, 0, new rl1.d(typeAheadItem.f35147h), null, 1532);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f135557i) {
        }
        return b((rl1.q) obj);
    }
}
