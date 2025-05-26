package hb2;

import com.pinterest.ui.view.NoticeView;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class p extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f68598i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ NoticeView f68599j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(NoticeView noticeView, int i13) {
        super(1);
        this.f68598i = i13;
        this.f68599j = noticeView;
    }

    public final rn1.a b(rn1.a it) {
        int i13 = this.f68598i;
        NoticeView noticeView = this.f68599j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                vn1.g gVar = vn1.g.BODY_200;
                return rn1.a.y(it, null, noticeView.f52712f, kotlin.collections.e0.b(noticeView.f52711e), null, gVar, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097129);
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                vn1.g gVar2 = vn1.g.BODY_300;
                return rn1.a.y(it, null, noticeView.f52712f, kotlin.collections.e0.b(noticeView.f52711e), null, gVar2, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097129);
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, noticeView.f52712f, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097149);
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, noticeView.f52712f, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097149);
            case 4:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, noticeView.f52712f, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097149);
            case 5:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, noticeView.f52712f, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097149);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                vn1.g gVar3 = vn1.g.HEADING_400;
                List b13 = kotlin.collections.e0.b(vn1.e.BOLD);
                return rn1.a.y(it, null, noticeView.f52712f, kotlin.collections.e0.b(noticeView.f52711e), b13, gVar3, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097121);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f68598i) {
            case 0:
                return b((rn1.a) obj);
            case 1:
                return b((rn1.a) obj);
            case 2:
                return b((rn1.a) obj);
            case 3:
                return b((rn1.a) obj);
            case 4:
                return b((rn1.a) obj);
            case 5:
                return b((rn1.a) obj);
            case 6:
                rn1.k bind = (rn1.k) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.e(k42.f.sensitivity_notice_suggested_resource_title);
                bind.h(vn1.g.BODY_200);
                NoticeView noticeView = this.f68599j;
                bind.b(noticeView.f52712f);
                bind.a(kotlin.collections.e0.b(noticeView.f52711e));
                bind.d(kotlin.collections.e0.b(vn1.e.BOLD));
                return Unit.f80348a;
            default:
                return b((rn1.a) obj);
        }
    }
}
