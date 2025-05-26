package uq;

import com.pinterest.activity.pin.view.unifiedcomments.CommentComposerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import org.json.JSONObject;
import u50.f0;

/* loaded from: classes3.dex */
public final class c extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f122984i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ CommentComposerView f122985j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(CommentComposerView commentComposerView, int i13) {
        super(1);
        this.f122984i = i13;
        this.f122985j = commentComposerView;
    }

    public final void b(ResponseBody responseBody) {
        int i13 = this.f122984i;
        CommentComposerView commentComposerView = this.f122985j;
        switch (i13) {
            case 1:
                commentComposerView.X().h("PREF_COMMENT_CODE_MODAL_VIEW_COUNT", new JSONObject(responseBody.string()).optInt("data"));
                break;
            default:
                commentComposerView.X().i("PREF_COMMENT_CODE_MODAL_IS_ACCEPTED", new JSONObject(responseBody.string()).optInt("data") == 1);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f122984i;
        CommentComposerView commentComposerView = this.f122985j;
        switch (i13) {
            case 0:
                rl1.q it = (rl1.q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                int i14 = CommentComposerView.L;
                return commentComposerView.a0() ? rl1.q.e(it, null, null, false, null, null, false, false, fm1.c.GONE, 0, null, null, 1919) : rl1.q.e(it, null, null, true, null, null, false, false, null, 0, null, null, 2043);
            case 1:
                b((ResponseBody) obj);
                return Unit.f80348a;
            case 2:
                b((ResponseBody) obj);
                return Unit.f80348a;
            default:
                wn1.d it2 = (wn1.d) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                String str = commentComposerView.D;
                f0 x13 = ep.b.x(str, "string", str);
                om1.c cVar = it2.f130533t;
                return wn1.d.e(it2, null, x13, null, null, true, null, cVar != null ? om1.c.e(cVar, null, null, null, fm1.c.GONE, null, false, 0, 1015) : null, null, null, 7863293);
        }
    }
}
