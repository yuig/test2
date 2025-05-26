package aw0;

import com.pinterest.feature.ideaPinCreation.worker.PinInterestTagsWorker;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class r extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f20579i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ PinInterestTagsWorker f20580j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(PinInterestTagsWorker pinInterestTagsWorker, int i13) {
        super(0);
        this.f20579i = i13;
        this.f20580j = pinInterestTagsWorker;
    }

    public final String b() {
        int i13 = this.f20579i;
        PinInterestTagsWorker pinInterestTagsWorker = this.f20580j;
        switch (i13) {
            case 0:
                String h10 = pinInterestTagsWorker.f78963b.f19998b.h("IDEA_PIN_CREATION_SESSION_ID");
                return h10 == null ? "" : h10;
            case 1:
                String h13 = pinInterestTagsWorker.f78963b.f19998b.h("FREEFORM_TAG_TEXTS_PARAM");
                return h13 == null ? "" : h13;
            case 2:
                String h14 = pinInterestTagsWorker.f78963b.f19998b.h("INTEREST_IDS_PARAM");
                return h14 == null ? "" : h14;
            case 3:
                String h15 = pinInterestTagsWorker.f78963b.f19998b.h("LANGUAGE_PARAM");
                return h15 == null ? "en" : h15;
            default:
                String h16 = pinInterestTagsWorker.f78963b.f19998b.h("PIN_ID");
                return h16 == null ? "" : h16;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f20579i) {
        }
        return b();
    }
}
