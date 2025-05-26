package aw0;

import com.pinterest.feature.ideaPinCreation.worker.IdeaPinBulkStatusMediaWorker;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.c0;
import kotlin.collections.y0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* loaded from: classes5.dex */
public final class b extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f20543i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ IdeaPinBulkStatusMediaWorker f20544j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(IdeaPinBulkStatusMediaWorker ideaPinBulkStatusMediaWorker, int i13) {
        super(0);
        this.f20543i = i13;
        this.f20544j = ideaPinBulkStatusMediaWorker;
    }

    public final String b() {
        String str;
        String str2;
        int i13 = this.f20543i;
        IdeaPinBulkStatusMediaWorker ideaPinBulkStatusMediaWorker = this.f20544j;
        switch (i13) {
            case 0:
                String[] i14 = ideaPinBulkStatusMediaWorker.f78963b.f19998b.i("IDEA_PIN_LOCAL_DRAFT_ID");
                return (i14 == null || (str = (String) c0.C(i14)) == null) ? "" : str;
            default:
                String[] i15 = ideaPinBulkStatusMediaWorker.f78963b.f19998b.i("IDEA_PIN_CREATION_SESSION_ID");
                return (i15 == null || (str2 = (String) c0.C(i15)) == null) ? "" : str2;
        }
    }

    public final String[] e() {
        int i13 = this.f20543i;
        IdeaPinBulkStatusMediaWorker ideaPinBulkStatusMediaWorker = this.f20544j;
        switch (i13) {
            case 2:
                String[] i14 = ideaPinBulkStatusMediaWorker.f78963b.f19998b.i("STORY_PIN_IMAGE_KEY_AND_IMAGE_SIGNATURE");
                return i14 == null ? new String[0] : i14;
            case 3:
            default:
                String[] i15 = ideaPinBulkStatusMediaWorker.f78963b.f19998b.i("STORY_PIN_PAGE_ID_AND_TRACKING_ID");
                return i15 == null ? new String[0] : i15;
            case 4:
                return (String[]) ((Map) ideaPinBulkStatusMediaWorker.f46632x.getValue()).keySet().toArray(new String[0]);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        List split$default;
        int i13 = this.f20543i;
        IdeaPinBulkStatusMediaWorker ideaPinBulkStatusMediaWorker = this.f20544j;
        switch (i13) {
            case 0:
                return b();
            case 1:
                return b();
            case 2:
                return e();
            case 3:
                String[] strArr = (String[]) ideaPinBulkStatusMediaWorker.f46631w.getValue();
                Intrinsics.checkNotNullParameter(strArr, "<this>");
                Intrinsics.checkNotNullParameter(":", "delimiter");
                int a13 = y0.a(strArr.length);
                if (a13 < 16) {
                    a13 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(a13);
                for (String str : strArr) {
                    split$default = StringsKt__StringsKt.split$default(str, new String[]{":"}, false, 0, 6, null);
                    linkedHashMap.put(split$default.get(1), split$default.get(0));
                }
                return linkedHashMap;
            case 4:
                return e();
            case 5:
                return e();
            default:
                return ideaPinBulkStatusMediaWorker.f46627s.f15134g;
        }
    }
}
