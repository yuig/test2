package ar;

import com.pinterest.hairball.network.f;
import com.pinterest.hairball.network.g;
import e12.d;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b extends g {

    /* renamed from: a, reason: collision with root package name */
    public final String f20366a;

    /* renamed from: b, reason: collision with root package name */
    public final d f20367b;

    public b(String boardId, d boardService) {
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(boardService, "boardService");
        this.f20366a = boardId;
        this.f20367b = boardService;
    }

    @Override // com.pinterest.hairball.network.g
    public final f a(Object... params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return new a(this, this.f20366a);
    }
}
