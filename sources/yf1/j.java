package yf1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class j extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f138986i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ k f138987j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i13, k kVar) {
        super(1);
        this.f138986i = i13;
        this.f138987j = kVar;
    }

    public final em1.d b(em1.d it) {
        int i13 = this.f138986i;
        k kVar = this.f138987j;
        switch (i13) {
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return em1.d.e(it, null, null, null, k.a(dq1.c.user_comprehension_checkbox, kVar), null, null, 0, null, false, 0, 1015);
            case 2:
            case 4:
            case 6:
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return em1.d.e(it, null, null, null, k.a(dq1.c.other_issue_checkbox, kVar), null, null, 2, null, false, 0, 951);
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                return em1.d.e(it, null, null, null, k.a(dq1.c.feature_issue_checkbox, kVar), null, null, 2, null, false, 0, 951);
            case 5:
                Intrinsics.checkNotNullParameter(it, "it");
                return em1.d.e(it, null, null, null, k.a(dq1.c.viewing_issue_checkbox, kVar), null, null, 2, null, false, 0, 951);
            case 7:
                Intrinsics.checkNotNullParameter(it, "it");
                return em1.d.e(it, null, null, null, k.a(dq1.c.publish_issue_checkbox, kVar), null, null, 2, null, false, 0, 951);
        }
    }

    public final void e(em1.c event) {
        int i13 = this.f138986i;
        k kVar = this.f138987j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(event, "event");
                k.b(kVar, a42.i.OTHER, c0.d.b2(event));
                break;
            case 1:
            case 3:
            case 5:
            default:
                Intrinsics.checkNotNullParameter(event, "event");
                k.b(kVar, a42.i.PUBLISH_ISSUE, c0.d.b2(event));
                break;
            case 2:
                Intrinsics.checkNotNullParameter(event, "event");
                k.b(kVar, a42.i.USER_COMPREHENSION, c0.d.b2(event));
                break;
            case 4:
                Intrinsics.checkNotNullParameter(event, "event");
                k.b(kVar, a42.i.FEATURE_ISSUE, c0.d.b2(event));
                break;
            case 6:
                Intrinsics.checkNotNullParameter(event, "event");
                k.b(kVar, a42.i.VIEWING_IPS, c0.d.b2(event));
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f138986i) {
            case 0:
                e((em1.c) obj);
                return Unit.f80348a;
            case 1:
                return b((em1.d) obj);
            case 2:
                e((em1.c) obj);
                return Unit.f80348a;
            case 3:
                return b((em1.d) obj);
            case 4:
                e((em1.c) obj);
                return Unit.f80348a;
            case 5:
                return b((em1.d) obj);
            case 6:
                e((em1.c) obj);
                return Unit.f80348a;
            case 7:
                return b((em1.d) obj);
            case 8:
                e((em1.c) obj);
                return Unit.f80348a;
            default:
                return b((em1.d) obj);
        }
    }
}
