package aw0;

import com.pinterest.feature.ideaPinCreation.worker.UploadIdeaPinImageMediaWorker;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class s extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f20581i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ UploadIdeaPinImageMediaWorker f20582j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(UploadIdeaPinImageMediaWorker uploadIdeaPinImageMediaWorker, int i13) {
        super(0);
        this.f20581i = i13;
        this.f20582j = uploadIdeaPinImageMediaWorker;
    }

    public final Integer b() {
        int i13 = this.f20581i;
        UploadIdeaPinImageMediaWorker uploadIdeaPinImageMediaWorker = this.f20582j;
        switch (i13) {
            case 4:
                return Integer.valueOf(UploadIdeaPinImageMediaWorker.z(uploadIdeaPinImageMediaWorker, "MEDIA_COUNT", 1));
            case 5:
            default:
                return Integer.valueOf(UploadIdeaPinImageMediaWorker.z(uploadIdeaPinImageMediaWorker, "PAGE_COUNT_FROM_LAST_SESSION", 0));
            case 6:
                return Integer.valueOf(UploadIdeaPinImageMediaWorker.z(uploadIdeaPinImageMediaWorker, "MEDIA_INDEX", 0));
        }
    }

    public final String e() {
        int i13 = this.f20581i;
        UploadIdeaPinImageMediaWorker uploadIdeaPinImageMediaWorker = this.f20582j;
        switch (i13) {
            case 0:
                return UploadIdeaPinImageMediaWorker.A(uploadIdeaPinImageMediaWorker, "IDEA_PIN_LOCAL_DRAFT_ID");
            case 1:
                return UploadIdeaPinImageMediaWorker.A(uploadIdeaPinImageMediaWorker, "IDEA_PIN_CREATION_SESSION_ID");
            case 7:
                kb.l lVar = uploadIdeaPinImageMediaWorker.f78963b.f19998b;
                String h10 = lVar.h("STORY_PIN_LOCAL_PAGE_ID");
                if (h10 != null) {
                    return h10;
                }
                String[] i14 = lVar.i("STORY_PIN_LOCAL_PAGE_ID");
                String str = i14 != null ? i14[0] : null;
                if (str != null) {
                    return str;
                }
                vb0.j.f125466a.F("PageId should not be null", tb0.p.IDEA_PINS_CREATION, new Object[0]);
                return "";
            default:
                return UploadIdeaPinImageMediaWorker.A(uploadIdeaPinImageMediaWorker, "RAW_MEDIA_PATH");
        }
    }

    public final String[] f() {
        int i13 = this.f20581i;
        UploadIdeaPinImageMediaWorker uploadIdeaPinImageMediaWorker = this.f20582j;
        switch (i13) {
            case 2:
                String[] i14 = uploadIdeaPinImageMediaWorker.f78963b.f19998b.i("STORY_PIN_IMAGE_KEY_AND_IMAGE_SIGNATURE");
                return i14 == null ? new String[0] : i14;
            default:
                String[] i15 = uploadIdeaPinImageMediaWorker.f78963b.f19998b.i("STORY_PIN_PAGE_ID_AND_TRACKING_ID");
                return i15 == null ? new String[0] : i15;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        int i13 = this.f20581i;
        UploadIdeaPinImageMediaWorker uploadIdeaPinImageMediaWorker = this.f20582j;
        switch (i13) {
            case 3:
                return Boolean.valueOf(uploadIdeaPinImageMediaWorker.f78963b.f19998b.b("IDEA_PIN_IS_MODIFIED"));
            default:
                Object obj = uploadIdeaPinImageMediaWorker.f78963b.f19998b.f().get("MEDIA_EXPORT_SKIPPED");
                if (obj instanceof Boolean) {
                    return (Boolean) obj;
                }
                return null;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f20581i;
        UploadIdeaPinImageMediaWorker uploadIdeaPinImageMediaWorker = this.f20582j;
        switch (i13) {
            case 0:
                return e();
            case 1:
                return e();
            case 2:
                return f();
            case 3:
                return invoke();
            case 4:
                return b();
            case 5:
                return invoke();
            case 6:
                return b();
            case 7:
                return e();
            case 8:
                return f();
            case 9:
                return b();
            case 10:
                return e();
            case 11:
                return new bw0.q(uploadIdeaPinImageMediaWorker.E());
            default:
                return uploadIdeaPinImageMediaWorker.D().f15134g;
        }
    }
}
