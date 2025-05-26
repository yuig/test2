package oh1;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final /* synthetic */ class h extends kotlin.jvm.internal.p implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f94507a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Object obj, int i13) {
        super(0, obj, m.class, "updateComposerForReply", "updateComposerForReply()V", 0);
        this.f94507a = i13;
        if (i13 == 1) {
            super(0, obj, com.pinterest.feature.unifiedcomments.d.class, "closeAndResetComposer", "closeAndResetComposer()V", 0);
            return;
        }
        if (i13 == 2) {
            super(0, obj, com.pinterest.feature.unifiedcomments.d.class, "closeAndResetComposer", "closeAndResetComposer()V", 0);
            return;
        }
        if (i13 == 3) {
            super(0, obj, com.pinterest.feature.unifiedcomments.d.class, "closeAndResetComposer", "closeAndResetComposer()V", 0);
        } else if (i13 != 4) {
        } else {
            super(0, obj, com.pinterest.feature.unifiedcomments.d.class, "closeAndResetComposer", "closeAndResetComposer()V", 0);
        }
    }

    public final void h() {
        switch (this.f94507a) {
            case 0:
                ((m) this.receiver).g4();
                break;
            case 1:
                ((rh1.k) ((com.pinterest.feature.unifiedcomments.d) this.receiver)).U8();
                break;
            case 2:
                ((rh1.k) ((com.pinterest.feature.unifiedcomments.d) this.receiver)).U8();
                break;
            case 3:
                ((rh1.k) ((com.pinterest.feature.unifiedcomments.d) this.receiver)).U8();
                break;
            default:
                ((rh1.k) ((com.pinterest.feature.unifiedcomments.d) this.receiver)).U8();
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f94507a) {
            case 0:
                h();
                break;
            case 1:
                h();
                break;
            case 2:
                h();
                break;
            case 3:
                h();
                break;
            default:
                h();
                break;
        }
        return Unit.f80348a;
    }
}
