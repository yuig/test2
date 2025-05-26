package aw0;

import android.net.Uri;
import com.pinterest.feature.ideaPinCreation.worker.IdeaPinS3CredentialsWorker;
import java.io.File;
import kotlin.collections.c0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f20548i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ IdeaPinS3CredentialsWorker f20549j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(IdeaPinS3CredentialsWorker ideaPinS3CredentialsWorker, int i13) {
        super(0);
        this.f20548i = i13;
        this.f20549j = ideaPinS3CredentialsWorker;
    }

    public final String b() {
        int i13 = this.f20548i;
        IdeaPinS3CredentialsWorker ideaPinS3CredentialsWorker = this.f20549j;
        switch (i13) {
            case 0:
                String h10 = ideaPinS3CredentialsWorker.f78963b.f19998b.h("IDEA_PIN_LOCAL_DRAFT_ID");
                return h10 == null ? "" : h10;
            case 1:
                String h13 = ideaPinS3CredentialsWorker.f78963b.f19998b.h("IDEA_PIN_CREATION_SESSION_ID");
                return h13 == null ? "" : h13;
            default:
                String h14 = ideaPinS3CredentialsWorker.f78963b.f19998b.h("STORY_PIN_LOCAL_PAGE_ID");
                return h14 == null ? "" : h14;
        }
    }

    public final String[] e() {
        int i13 = this.f20548i;
        IdeaPinS3CredentialsWorker ideaPinS3CredentialsWorker = this.f20549j;
        switch (i13) {
            case 2:
                String[] i14 = ideaPinS3CredentialsWorker.f78963b.f19998b.i("STORY_PIN_IMAGE_KEY_AND_IMAGE_SIGNATURE");
                return i14 == null ? new String[0] : i14;
            default:
                String[] i15 = ideaPinS3CredentialsWorker.f78963b.f19998b.i("STORY_PIN_PAGE_ID_AND_TRACKING_ID");
                return i15 == null ? new String[0] : i15;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f20548i;
        IdeaPinS3CredentialsWorker ideaPinS3CredentialsWorker = this.f20549j;
        switch (i13) {
            case 0:
                return b();
            case 1:
                return b();
            case 2:
                return e();
            case 3:
                Object value = ideaPinS3CredentialsWorker.f46642v.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                String path = ((Uri) value).getPath();
                if (path != null) {
                    return new File(path);
                }
                throw new IllegalArgumentException("Invalid media uri path");
            case 4:
                String h10 = ideaPinS3CredentialsWorker.f78963b.f19998b.h("MEDIA_URI");
                if (h10 == null) {
                    String[] i14 = ideaPinS3CredentialsWorker.f78963b.f19998b.i("MEDIA_URI");
                    h10 = i14 != null ? (String) c0.J(0, i14) : null;
                    if (h10 == null) {
                        h10 = "";
                    }
                }
                return Uri.parse(h10);
            case 5:
                return b();
            default:
                return e();
        }
    }
}
