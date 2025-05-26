package u81;

import android.content.Context;
import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final m60.w f121105a;

    /* renamed from: b, reason: collision with root package name */
    public final rw0.f f121106b;

    /* renamed from: c, reason: collision with root package name */
    public final i92.k f121107c;

    /* renamed from: d, reason: collision with root package name */
    public final m60.e f121108d;

    /* renamed from: e, reason: collision with root package name */
    public final b60.b f121109e;

    /* renamed from: f, reason: collision with root package name */
    public Context f121110f;

    /* renamed from: g, reason: collision with root package name */
    public Bitmap f121111g;

    /* renamed from: h, reason: collision with root package name */
    public nx.d0 f121112h;

    /* renamed from: i, reason: collision with root package name */
    public z f121113i;

    /* renamed from: j, reason: collision with root package name */
    public final xk2.v f121114j;

    public x(m60.w eventManager, rw0.f mediaUtils, i92.k toastUtils, m60.e applicationInfoProvider, b60.b activeUserManager) {
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(mediaUtils, "mediaUtils");
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        Intrinsics.checkNotNullParameter(applicationInfoProvider, "applicationInfoProvider");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        this.f121105a = eventManager;
        this.f121106b = mediaUtils;
        this.f121107c = toastUtils;
        this.f121108d = applicationInfoProvider;
        this.f121109e = activeUserManager;
        this.f121114j = xk2.m.b(w.f121104i);
    }
}
