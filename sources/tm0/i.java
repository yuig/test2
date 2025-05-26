package tm0;

import com.pinterest.api.model.v7;
import kotlin.jvm.internal.Intrinsics;
import om0.n;
import om0.z;
import org.chromium.net.y;
import pm0.l;

/* loaded from: classes5.dex */
public final class i implements e {

    /* renamed from: a, reason: collision with root package name */
    public final h f118130a;

    /* renamed from: b, reason: collision with root package name */
    public final c f118131b;

    public i(k topBarStateMapper, y collaboratorStateMapper) {
        Intrinsics.checkNotNullParameter(topBarStateMapper, "topBarStateMapper");
        Intrinsics.checkNotNullParameter(collaboratorStateMapper, "collaboratorStateMapper");
        this.f118130a = topBarStateMapper;
        this.f118131b = collaboratorStateMapper;
    }

    @Override // tm0.h
    public final z a(v7 board) {
        Intrinsics.checkNotNullParameter(board, "board");
        return this.f118130a.a(board);
    }

    @Override // tm0.c
    public final n v(l collaborators) {
        Intrinsics.checkNotNullParameter(collaborators, "collaborators");
        return this.f118131b.v(collaborators);
    }
}
