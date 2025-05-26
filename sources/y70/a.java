package y70;

import android.content.pm.ResolveInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class a extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f137965i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f137966j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj, int i13) {
        super(1);
        this.f137965i = i13;
        this.f137966j = obj;
    }

    public final Comparable b(ResolveInfo it) {
        int i13 = this.f137965i;
        Object obj = this.f137966j;
        switch (i13) {
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return Intrinsics.d(it.activityInfo.packageName, (String) obj) ? -100 : 1;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return ((g) obj).c(it) ? -1 : 1;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f137965i) {
            case 0:
                c cVar = (c) this.f137966j;
                g gVar = cVar.f137979i;
                z70.c chromeSessionEvent = new z70.c(cVar.f137971a);
                gVar.getClass();
                Intrinsics.checkNotNullParameter(chromeSessionEvent, "chromeSessionEvent");
                gVar.f138002m.c(chromeSessionEvent);
                break;
        }
        return b((ResolveInfo) obj);
    }
}
