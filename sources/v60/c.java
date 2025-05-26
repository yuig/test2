package v60;

import com.pinterest.api.model.fi0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import o82.l0;

/* loaded from: classes5.dex */
public final class c extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final c f124198i = new c(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        o12.b modelListWithBookmark = (o12.b) obj;
        Intrinsics.checkNotNullParameter(modelListWithBookmark, "modelListWithBookmark");
        List<dl1.s> list = modelListWithBookmark.f92783a;
        ArrayList arrayList = new ArrayList();
        for (dl1.s sVar : list) {
            com.pinterest.boardAutoCollages.d dVar = sVar instanceof fi0 ? new com.pinterest.boardAutoCollages.d((fi0) sVar) : null;
            if (dVar != null) {
                arrayList.add(dVar);
            }
        }
        return new l0(arrayList, modelListWithBookmark.f92784b);
    }
}
