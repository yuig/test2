package lq0;

import android.content.Context;
import com.pinterest.feature.conversation.view.ContactRequestPreviewWarningView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import so.oa;

/* loaded from: classes5.dex */
public final class b extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f84248i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ ContactRequestPreviewWarningView f84249j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(ContactRequestPreviewWarningView contactRequestPreviewWarningView, int i13) {
        super(0);
        this.f84248i = i13;
        this.f84249j = contactRequestPreviewWarningView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f84248i) {
            case 0:
                m181invoke();
                break;
            default:
                m181invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m181invoke() {
        int i13 = this.f84248i;
        int i14 = 1;
        ContactRequestPreviewWarningView contactRequestPreviewWarningView = this.f84249j;
        switch (i13) {
            case 0:
                dq0.b bVar = contactRequestPreviewWarningView.f45522a;
                if (bVar != null) {
                    kp.m mVar = bVar.f56072e;
                    String str = bVar.f56069b;
                    if (str != null) {
                        mVar.f80557l = mVar.f80555j.a(str).i(new kp.b(mVar, 1), new jp.d(3, new kp.k(mVar, 1)));
                    } else {
                        mVar.getClass();
                    }
                    if (bVar.isBound()) {
                        bs1.c.X0(((ContactRequestPreviewWarningView) ((aq0.a) bVar.getView())).f45525d);
                        break;
                    }
                }
                break;
            default:
                dq0.b bVar2 = contactRequestPreviewWarningView.f45522a;
                if (bVar2 != null) {
                    if (bVar2.isBound()) {
                        bs1.c.X0(((ContactRequestPreviewWarningView) ((aq0.a) bVar2.getView())).f45525d);
                    }
                    jq0.a aVar = new jq0.a(xc0.i.decline_conversation_request, dq0.a.f56067i, new zp0.a(bVar2, i14), 0);
                    Context context = kb0.a.f79058b;
                    ((oa) ((j92.a) ep.b.g(j92.a.class))).E2().c(aVar);
                    bVar2.f56071d.invoke();
                    break;
                }
                break;
        }
    }
}
