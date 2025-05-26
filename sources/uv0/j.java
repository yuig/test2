package uv0;

import com.pinterest.api.model.ln0;
import com.pinterest.feature.ideaPinCreation.closeup.view.r0;
import dl1.t;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class j extends s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public static final j f123175i = new j(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ln0 draft = (ln0) obj;
        String imagePath = (String) obj2;
        Intrinsics.checkNotNullParameter(draft, "draft");
        Intrinsics.checkNotNullParameter(imagePath, "imagePath");
        ((dl1.l) ((t) k.f123176a.getValue())).W(draft.I(new r0(23, draft, imagePath)));
        return imagePath;
    }
}
