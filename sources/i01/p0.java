package i01;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public final m60.w f70687a;

    /* renamed from: b, reason: collision with root package name */
    public final rg0.s f70688b;

    /* renamed from: c, reason: collision with root package name */
    public final x02.x0 f70689c;

    public p0(m60.w eventManager, rg0.s experiences, x02.x0 boardRepository) {
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(experiences, "experiences");
        Intrinsics.checkNotNullParameter(boardRepository, "boardRepository");
        this.f70687a = eventManager;
        this.f70688b = experiences;
        this.f70689c = boardRepository;
    }

    public final uj2.b0 a(f30 pin, String boardId, boolean z13) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        if (z13) {
            hk2.o oVar = new hk2.o(0, new jk2.e0(this.f70689c.P(boardId)), new wv0.a(16, new ky0.b(8, this, pin)));
            Intrinsics.checkNotNullExpressionValue(oVar, "flatMapSingle(...)");
            return oVar;
        }
        kk2.b j13 = uj2.b0.j(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(j13, "just(...)");
        return j13;
    }
}
