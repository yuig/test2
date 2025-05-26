package aw0;

import com.pinterest.feature.ideaPinCreation.worker.LogRawIPDWorker;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class o extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f20575i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ LogRawIPDWorker f20576j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(LogRawIPDWorker logRawIPDWorker, int i13) {
        super(0);
        this.f20575i = i13;
        this.f20576j = logRawIPDWorker;
    }

    public final String b() {
        int i13 = this.f20575i;
        LogRawIPDWorker logRawIPDWorker = this.f20576j;
        switch (i13) {
            case 1:
                return logRawIPDWorker.f78963b.f19998b.h("BOARD_ID");
            case 2:
                return logRawIPDWorker.f78963b.f19998b.h("BOARD_SECTION_ID");
            case 3:
            case 10:
            case 12:
            case 13:
            default:
                String h10 = logRawIPDWorker.f78963b.f19998b.h("STORY_PIN_DATA_ID");
                return h10 == null ? "" : h10;
            case 4:
                String h13 = logRawIPDWorker.f78963b.f19998b.h("PIN_ID");
                return h13 == null ? "" : h13;
            case 5:
                String h14 = logRawIPDWorker.f78963b.f19998b.h("IDEA_PIN_LOCAL_DRAFT_ID");
                return h14 == null ? "" : h14;
            case 6:
                String h15 = logRawIPDWorker.f78963b.f19998b.h("IDEA_PIN_CREATION_SESSION_ID");
                return h15 == null ? "" : h15;
            case 7:
                String h16 = logRawIPDWorker.f78963b.f19998b.h("ENTRY_TYPE");
                return h16 == null ? "" : h16;
            case 8:
                String h17 = logRawIPDWorker.f78963b.f19998b.h("FREEFORM_TAG_TEXTS_PARAM");
                return h17 == null ? "" : h17;
            case 9:
                String h18 = logRawIPDWorker.f78963b.f19998b.h("INTEREST_IDS_PARAM");
                return h18 == null ? "" : h18;
            case 11:
                return logRawIPDWorker.f78963b.f19998b.h("STORY_PIN_LINK");
            case 14:
                String h19 = logRawIPDWorker.f78963b.f19998b.h("PIN_IMAGE_SIGNATURE");
                return h19 == null ? "" : h19;
            case 15:
                return logRawIPDWorker.f78963b.f19998b.h("SPONSOR_ID");
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        int i13 = this.f20575i;
        LogRawIPDWorker logRawIPDWorker = this.f20576j;
        switch (i13) {
            case 0:
                return Boolean.valueOf(logRawIPDWorker.f78963b.f19998b.b("ALLOW_SHOPPING_REC"));
            case 3:
                return Boolean.valueOf(logRawIPDWorker.f78963b.f19998b.b("COMMENTS_ENABLED"));
            default:
                return Boolean.valueOf(logRawIPDWorker.f78963b.f19998b.b("IS_DRAFT"));
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f20575i;
        LogRawIPDWorker logRawIPDWorker = this.f20576j;
        switch (i13) {
            case 0:
                return invoke();
            case 1:
                return b();
            case 2:
                return b();
            case 3:
                return invoke();
            case 4:
                return b();
            case 5:
                return b();
            case 6:
                return b();
            case 7:
                return b();
            case 8:
                return b();
            case 9:
                return b();
            case 10:
                return invoke();
            case 11:
                return b();
            case 12:
                return logRawIPDWorker.f46672m.f15131d;
            case 13:
                return logRawIPDWorker.f46672m.f15133f;
            case 14:
                return b();
            case 15:
                return b();
            case 16:
                return b();
            default:
                return Integer.valueOf(logRawIPDWorker.f78963b.f19998b.d("TEMPLATE_TYPE", 0));
        }
    }
}
