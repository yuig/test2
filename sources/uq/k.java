package uq;

import android.text.Editable;
import com.pinterest.activity.pin.view.unifiedcomments.CommentComposerView;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class k extends kotlin.jvm.internal.s implements kl2.n {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ CommentComposerView f123011i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ kl2.o f123012j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(CommentComposerView commentComposerView, kl2.o oVar) {
        super(5);
        this.f123011i = commentComposerView;
        this.f123012j = oVar;
    }

    @Override // kl2.n
    public final Object p(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        List list;
        Editable editable = (Editable) obj;
        String str = (String) obj2;
        String str2 = (String) obj3;
        rp0.d dVar = (rp0.d) obj4;
        rp0.d dVar2 = (rp0.d) obj5;
        CommentComposerView commentComposerView = this.f123011i;
        commentComposerView.f35086s.X(d.f122992p);
        if (editable != null) {
            qh1.e eVar = commentComposerView.f35074g;
            if (eVar == null) {
                Intrinsics.r("commentUtils");
                throw null;
            }
            list = eVar.g(editable);
        } else {
            list = null;
        }
        this.f123012j.g(editable, str, str2, dVar, dVar2, list);
        return Unit.f80348a;
    }
}
