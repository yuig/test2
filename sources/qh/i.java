package qh;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.common.api.internal.n;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import df.j1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i extends j1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f103885i;

    public i(int i13) {
        this.f103885i = i13;
    }

    @Override // df.j1
    public final jh.h t(Context context, Looper looper, jh.g clientSettings, com.google.android.gms.common.api.b bVar, com.google.android.gms.common.api.internal.e connectionCallbacks, n connectionFailedListener) {
        switch (this.f103885i) {
            case 0:
                com.google.android.gms.common.api.a apiOptions = (com.google.android.gms.common.api.a) bVar;
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(looper, "looper");
                Intrinsics.checkNotNullParameter(clientSettings, "commonSettings");
                Intrinsics.checkNotNullParameter(apiOptions, "apiOptions");
                Intrinsics.checkNotNullParameter(connectionCallbacks, "connectedListener");
                Intrinsics.checkNotNullParameter(connectionFailedListener, "connectionFailedListener");
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(looper, "looper");
                Intrinsics.checkNotNullParameter(clientSettings, "clientSettings");
                Intrinsics.checkNotNullParameter(connectionCallbacks, "connectionCallbacks");
                Intrinsics.checkNotNullParameter(connectionFailedListener, "connectionFailedListener");
                return new e(context, looper, 322, clientSettings, connectionCallbacks, connectionFailedListener);
            case 1:
                return new yh.b(context, looper, AdSize.MEDIUM_RECTANGLE_WIDTH, clientSettings, connectionCallbacks, connectionFailedListener);
            case 2:
                return new ai.h(context, looper, clientSettings, connectionCallbacks, connectionFailedListener);
            default:
                return new com.google.android.gms.internal.recaptcha.d(context, looper, RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_HEADER, clientSettings, connectionCallbacks, connectionFailedListener);
        }
    }
}
