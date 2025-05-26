package hb2;

import com.pinterest.api.model.fy;
import com.pinterest.api.model.tm;
import com.pinterest.ui.view.NoticeView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class m extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f68592i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ fy f68593j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ NoticeView f68594k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(fy fyVar, NoticeView noticeView, int i13) {
        super(1);
        this.f68592i = i13;
        this.f68593j = fyVar;
        this.f68594k = noticeView;
    }

    public final rn1.a b(rn1.a it) {
        String c13;
        String str;
        int i13 = this.f68592i;
        NoticeView noticeView = this.f68594k;
        fy fyVar = this.f68593j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                tm f13 = fyVar.f();
                c13 = f13 != null ? f13.c() : null;
                str = c13 != null ? c13 : "";
                return rn1.a.y(it, ep.b.x(str, "string", str), noticeView.f52712f, kotlin.collections.e0.b(noticeView.f52711e), kotlin.collections.e0.b(vn1.e.BOLD), vn1.g.BODY_200, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097120);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                tm e13 = fyVar.e();
                c13 = e13 != null ? e13.c() : null;
                str = c13 != null ? c13 : "";
                return rn1.a.y(it, ep.b.x(str, "string", str), noticeView.f52712f, kotlin.collections.e0.b(noticeView.f52711e), kotlin.collections.e0.b(vn1.e.BOLD), vn1.g.BODY_300, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097120);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f68592i) {
        }
        return b((rn1.a) obj);
    }
}
