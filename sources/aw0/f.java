package aw0;

import com.pinterest.feature.ideaPinCreation.worker.IdeaPinS3MediaUploadWorker;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class f extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f20551i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ IdeaPinS3MediaUploadWorker f20552j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(IdeaPinS3MediaUploadWorker ideaPinS3MediaUploadWorker, int i13) {
        super(0);
        this.f20551i = i13;
        this.f20552j = ideaPinS3MediaUploadWorker;
    }

    public final Integer b() {
        int i13 = this.f20551i;
        IdeaPinS3MediaUploadWorker ideaPinS3MediaUploadWorker = this.f20552j;
        switch (i13) {
            case 3:
                return Integer.valueOf(ideaPinS3MediaUploadWorker.f78963b.f19998b.d("MEDIA_COUNT", 1));
            default:
                return Integer.valueOf(ideaPinS3MediaUploadWorker.f78963b.f19998b.d("MEDIA_INDEX", 0));
        }
    }

    public final String e() {
        int i13 = this.f20551i;
        IdeaPinS3MediaUploadWorker ideaPinS3MediaUploadWorker = this.f20552j;
        switch (i13) {
            case 0:
                String h10 = ideaPinS3MediaUploadWorker.f78963b.f19998b.h("IDEA_PIN_LOCAL_DRAFT_ID");
                return h10 == null ? "" : h10;
            case 1:
                String h13 = ideaPinS3MediaUploadWorker.f78963b.f19998b.h("IDEA_PIN_CREATION_SESSION_ID");
                return h13 == null ? "" : h13;
            default:
                String h14 = ideaPinS3MediaUploadWorker.f78963b.f19998b.h("STORY_PIN_LOCAL_PAGE_ID");
                return h14 == null ? "" : h14;
        }
    }

    public final String[] f() {
        int i13 = this.f20551i;
        IdeaPinS3MediaUploadWorker ideaPinS3MediaUploadWorker = this.f20552j;
        switch (i13) {
            case 2:
                String[] i14 = ideaPinS3MediaUploadWorker.f78963b.f19998b.i("STORY_PIN_IMAGE_KEY_AND_IMAGE_SIGNATURE");
                return i14 == null ? new String[0] : i14;
            default:
                String[] i15 = ideaPinS3MediaUploadWorker.f78963b.f19998b.i("STORY_PIN_PAGE_ID_AND_TRACKING_ID");
                return i15 == null ? new String[0] : i15;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f20551i) {
            case 0:
                return e();
            case 1:
                return e();
            case 2:
                return f();
            case 3:
                return b();
            case 4:
                Object obj = this.f20552j.f78963b.f19998b.f().get("MEDIA_EXPORT_SKIPPED");
                if (obj instanceof Boolean) {
                    return (Boolean) obj;
                }
                return null;
            case 5:
                return b();
            case 6:
                return e();
            default:
                return f();
        }
    }
}
