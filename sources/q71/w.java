package q71;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class w extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f102779i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ x f102780j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(x xVar, int i13) {
        super(0);
        this.f102779i = i13;
        this.f102780j = xVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f102779i) {
            case 0:
                m237invoke();
                break;
            default:
                m237invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m237invoke() {
        int i13 = this.f102779i;
        x xVar = this.f102780j;
        switch (i13) {
            case 0:
                xVar.s7().h0((r18 & 1) != 0 ? h32.f1.TAP : h32.f1.VOICE_PERMISSIONS_PROMPT, (r18 & 2) != 0 ? null : h32.u0.DECLINE_BUTTON, (r18 & 4) != 0 ? null : h32.g0.SEARCH_BOX, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                break;
            default:
                xVar.s7().h0((r18 & 1) != 0 ? h32.f1.TAP : h32.f1.VOICE_PERMISSIONS_PROMPT, (r18 & 2) != 0 ? null : h32.u0.ACCEPT_BUTTON, (r18 & 4) != 0 ? null : h32.g0.SEARCH_BOX, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                xVar.a9();
                break;
        }
    }
}
