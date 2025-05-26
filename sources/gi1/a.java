package gi1;

import android.net.Uri;
import com.pinterest.api.model.uu;
import com.pinterest.feature.video.worker.base.BaseMediaWorker;
import java.io.File;
import kb.l;
import kotlin.collections.c0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class a extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f65151i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ BaseMediaWorker f65152j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(BaseMediaWorker baseMediaWorker, int i13) {
        super(0);
        this.f65151i = i13;
        this.f65152j = baseMediaWorker;
    }

    public final String b() {
        int i13 = this.f65151i;
        BaseMediaWorker baseMediaWorker = this.f65152j;
        switch (i13) {
            case 0:
                return baseMediaWorker.s().getCanonicalPath();
            case 1:
            default:
                l lVar = baseMediaWorker.f78963b.f19998b;
                String h10 = lVar.h("MEDIA_TYPE");
                if (h10 != null) {
                    return h10;
                }
                String[] i14 = lVar.i("MEDIA_TYPE");
                String str = i14 != null ? (String) c0.J(0, i14) : null;
                return str == null ? uu.UNDEFINED.getValue() : str;
            case 2:
                return String.valueOf(baseMediaWorker.f78963b.f19998b.g("MEDIA_ID", 0L));
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f65151i;
        BaseMediaWorker baseMediaWorker = this.f65152j;
        switch (i13) {
            case 0:
                return b();
            case 1:
                return new File(baseMediaWorker.u().getPath());
            case 2:
                return b();
            case 3:
                return b();
            default:
                l lVar = baseMediaWorker.f78963b.f19998b;
                String h10 = lVar.h("MEDIA_URI");
                if (h10 == null) {
                    String[] i14 = lVar.i("MEDIA_URI");
                    h10 = i14 != null ? (String) c0.J(0, i14) : null;
                    if (h10 == null) {
                        h10 = "";
                    }
                }
                return Uri.parse(h10);
        }
    }
}
