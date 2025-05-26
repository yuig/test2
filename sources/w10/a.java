package w10;

import com.pinterest.api.model.q8;
import kotlin.jvm.internal.Intrinsics;
import vd0.c;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final ke0.a f127600a;

    public a(ke0.a boardMoreIdeasCardsCarouselDeserializer) {
        Intrinsics.checkNotNullParameter(boardMoreIdeasCardsCarouselDeserializer, "boardMoreIdeasCardsCarouselDeserializer");
        this.f127600a = boardMoreIdeasCardsCarouselDeserializer;
    }

    public final q8 a(c modelJson) {
        Intrinsics.checkNotNullParameter(modelJson, "modelJson");
        return (q8) this.f127600a.d(modelJson);
    }
}
