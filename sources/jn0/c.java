package jn0;

import androidx.lifecycle.z;
import com.pinterest.feature.boardpreview.view.BaseBoardPreviewContainer;
import com.pinterest.shuffles.scene.composer.o0;
import kotlin.jvm.internal.j;

/* loaded from: classes5.dex */
public final class c implements o0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BaseBoardPreviewContainer f77083a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ an0.g f77084b;

    public c(BaseBoardPreviewContainer baseBoardPreviewContainer, an0.g gVar) {
        this.f77083a = baseBoardPreviewContainer;
        this.f77084b = gVar;
    }

    @Override // com.pinterest.shuffles.scene.composer.o0
    public final void a() {
        BaseBoardPreviewContainer baseBoardPreviewContainer = this.f77083a;
        z r13 = b7.c.r(baseBoardPreviewContainer);
        if (r13 != null) {
            j.z(bf.b.S(r13), null, null, new b(baseBoardPreviewContainer, this.f77084b, null), 3);
        }
    }
}
