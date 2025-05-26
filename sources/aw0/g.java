package aw0;

import com.pinterest.api.model.pc0;
import com.pinterest.feature.ideaPinCreation.worker.IdeaPinVideoExportWorker;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class g extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f20553i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ IdeaPinVideoExportWorker f20554j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(IdeaPinVideoExportWorker ideaPinVideoExportWorker, int i13) {
        super(0);
        this.f20553i = i13;
        this.f20554j = ideaPinVideoExportWorker;
    }

    public final Integer b() {
        int i13 = this.f20553i;
        IdeaPinVideoExportWorker ideaPinVideoExportWorker = this.f20554j;
        switch (i13) {
            case 8:
                return Integer.valueOf(ideaPinVideoExportWorker.f78963b.f19998b.d("MEDIA_COUNT", 1));
            case 9:
                return Integer.valueOf(ideaPinVideoExportWorker.f78963b.f19998b.d("MEDIA_INDEX", 0));
            default:
                return Integer.valueOf(ideaPinVideoExportWorker.f78963b.f19998b.d("REGISTER_MEDIA_ROTATION", 0));
        }
    }

    public final String e() {
        int i13 = this.f20553i;
        IdeaPinVideoExportWorker ideaPinVideoExportWorker = this.f20554j;
        switch (i13) {
            case 1:
                String h10 = ideaPinVideoExportWorker.f78963b.f19998b.h("IDEA_PIN_LOCAL_DRAFT_ID");
                return h10 == null ? "" : h10;
            case 2:
                String h13 = ideaPinVideoExportWorker.f78963b.f19998b.h("IDEA_PIN_CREATION_SESSION_ID");
                return h13 == null ? "" : h13;
            case 3:
                String h14 = ideaPinVideoExportWorker.f78963b.f19998b.h("VIDEO_EXPORT_DST_PATH");
                return h14 == null ? "" : h14;
            case 14:
                String h15 = ideaPinVideoExportWorker.f78963b.f19998b.h("REGISTER_MEDIA_TYPE");
                return h15 == null ? pc0.REGISTER_TYPE_UNDEFINED.getValue() : h15;
            default:
                String h16 = ideaPinVideoExportWorker.f78963b.f19998b.h("STORY_PIN_LOCAL_PAGE_ID");
                return h16 == null ? "" : h16;
        }
    }

    public final String[] f() {
        int i13 = this.f20553i;
        IdeaPinVideoExportWorker ideaPinVideoExportWorker = this.f20554j;
        switch (i13) {
            case 4:
                String[] i14 = ideaPinVideoExportWorker.f78963b.f19998b.i("STORY_PIN_IMAGE_KEY_AND_IMAGE_SIGNATURE");
                return i14 == null ? new String[0] : i14;
            default:
                String[] i15 = ideaPinVideoExportWorker.f78963b.f19998b.i("STORY_PIN_PAGE_ID_AND_TRACKING_ID");
                return i15 == null ? new String[0] : i15;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        int i13 = this.f20553i;
        IdeaPinVideoExportWorker ideaPinVideoExportWorker = this.f20554j;
        switch (i13) {
            case 7:
                return Boolean.valueOf(ideaPinVideoExportWorker.f78963b.f19998b.b("IS_EARLY_UPLOAD"));
            case 11:
                return Boolean.valueOf(!ideaPinVideoExportWorker.f46665v.f141929e.isEmpty());
            default:
                return Boolean.valueOf(ideaPinVideoExportWorker.L > 0);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f20553i;
        IdeaPinVideoExportWorker ideaPinVideoExportWorker = this.f20554j;
        switch (i13) {
        }
        return e();
    }
}
