package a72;

import android.graphics.Point;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class b extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1261i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ hd2.b f1262j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(hd2.b bVar, int i13) {
        super(1);
        this.f1261i = i13;
        this.f1262j = bVar;
    }

    public final void b(b72.a postScale) {
        int i13 = this.f1261i;
        hd2.b bVar = this.f1262j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(postScale, "$this$postScale");
                postScale.b((Point) CollectionsKt.S(bVar.f68914a));
                Iterator it = CollectionsKt.N(bVar.f68914a, 1).iterator();
                while (it.hasNext()) {
                    postScale.a((Point) it.next());
                }
                postScale.f22096b.append("Z");
                break;
            default:
                Intrinsics.checkNotNullParameter(postScale, "$this$postScale");
                postScale.b((Point) CollectionsKt.S(bVar.f68914a));
                Iterator it2 = CollectionsKt.N(bVar.f68914a, 1).iterator();
                while (it2.hasNext()) {
                    postScale.a((Point) it2.next());
                }
                postScale.f22096b.append("Z");
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f1261i) {
            case 0:
                b((b72.a) obj);
                break;
            default:
                b((b72.a) obj);
                break;
        }
        return Unit.f80348a;
    }
}
