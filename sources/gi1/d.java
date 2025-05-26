package gi1;

import com.pinterest.feature.video.worker.base.BaseUploadAWSMediaWorker;
import df.j1;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import pm.k;
import pm.l;
import pm.m;

/* loaded from: classes5.dex */
public final class d extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f65160i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ BaseUploadAWSMediaWorker f65161j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(BaseUploadAWSMediaWorker baseUploadAWSMediaWorker, int i13) {
        super(0);
        this.f65160i = i13;
        this.f65161j = baseUploadAWSMediaWorker;
    }

    public final String b() {
        int i13 = this.f65160i;
        BaseUploadAWSMediaWorker baseUploadAWSMediaWorker = this.f65161j;
        switch (i13) {
            case 1:
                String h10 = baseUploadAWSMediaWorker.f78963b.f19998b.h("UPLOAD_PARAMS_OBJ");
                if (h10 != null) {
                    return h10;
                }
                String[] i14 = baseUploadAWSMediaWorker.f78963b.f19998b.i("UPLOAD_PARAMS_OBJ");
                String str = i14 != null ? i14[0] : null;
                return str == null ? "{}" : str;
            default:
                String h13 = baseUploadAWSMediaWorker.f78963b.f19998b.h("UPLOAD_URL");
                return h13 == null ? "" : h13;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f65160i) {
            case 0:
                l lVar = (l) j1.p1((String) this.f65161j.f49038r.getValue()).i().f91366a.entrySet();
                LinkedHashMap linkedHashMap = new LinkedHashMap(lVar.size());
                Iterator it = lVar.iterator();
                while (((m) it).hasNext()) {
                    Map.Entry entry = (Map.Entry) ((k) it).next();
                    linkedHashMap.put((String) entry.getKey(), ((nm.s) entry.getValue()).p());
                }
                break;
        }
        return b();
    }
}
