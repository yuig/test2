package hj0;

import com.pinterest.hairball.network.d;
import com.pinterest.hairball.network.e;
import e12.c;
import h22.f;
import j90.b;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a extends e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69279a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Object f69280b;

    public a(c boardOrganizationService) {
        Intrinsics.checkNotNullParameter(boardOrganizationService, "boardOrganizationService");
        this.f69280b = boardOrganizationService;
    }

    @Override // com.pinterest.hairball.network.e
    public final d getBuilder(Object[] params) {
        switch (this.f69279a) {
            case 0:
                Intrinsics.checkNotNullParameter(params, "params");
                return new b(this, new Object[]{params});
            case 1:
                Intrinsics.checkNotNullParameter(params, "params");
                Object obj = params[0];
                String str = obj instanceof String ? (String) obj : null;
                if (str != null) {
                    return new qx.b(this, str);
                }
                throw new IllegalArgumentException("First argument should be boardId");
            case 2:
                Intrinsics.checkNotNullParameter(params, "params");
                return new b(this, Arrays.copyOf(params, params.length), 0);
            default:
                Intrinsics.checkNotNullParameter(params, "params");
                return new b(this, Arrays.copyOf(params, params.length), (Object) null);
        }
    }

    public a(f12.a boardCollaboratorService) {
        Intrinsics.checkNotNullParameter(boardCollaboratorService, "boardCollaboratorService");
        this.f69280b = boardCollaboratorService;
    }

    public a(f storyPinService) {
        Intrinsics.checkNotNullParameter(storyPinService, "storyPinService");
        this.f69280b = storyPinService;
    }

    public a(j22.b apiService) {
        Intrinsics.checkNotNullParameter(apiService, "apiService");
        this.f69280b = apiService;
    }
}
