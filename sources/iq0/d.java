package iq0;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class d extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final d f73394i = new d(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        pn1.b it = (pn1.b) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        return pn1.b.e(it, bs1.c.j2(new String[0], xc0.i.conversation_popular_pins), null, 0, false, RecyclerViewTypes.VIEW_TYPE_STORY_BLOCK_PATTERN);
    }
}
