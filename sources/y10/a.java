package y10;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import m60.e;
import m60.q;
import nx.r0;
import xk2.m;
import xk2.v;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final vb0.c f136614a;

    /* renamed from: b, reason: collision with root package name */
    public final e f136615b;

    /* renamed from: c, reason: collision with root package name */
    public final b f136616c;

    /* renamed from: d, reason: collision with root package name */
    public final gz1.b f136617d;

    /* renamed from: e, reason: collision with root package name */
    public final v f136618e;

    /* renamed from: f, reason: collision with root package name */
    public final v f136619f;

    public a(vb0.c applicationUtils, e applicationInfo, b userAgentRegistry, q developerOptions, gz1.b googlePlayServices, Context application) {
        Intrinsics.checkNotNullParameter(applicationUtils, "applicationUtils");
        Intrinsics.checkNotNullParameter(applicationInfo, "applicationInfo");
        Intrinsics.checkNotNullParameter(userAgentRegistry, "userAgentRegistry");
        Intrinsics.checkNotNullParameter(developerOptions, "developerOptions");
        Intrinsics.checkNotNullParameter(googlePlayServices, "googlePlayServices");
        Intrinsics.checkNotNullParameter(application, "application");
        this.f136614a = applicationUtils;
        this.f136615b = applicationInfo;
        this.f136616c = userAgentRegistry;
        this.f136617d = googlePlayServices;
        this.f136618e = m.b(new l5.a(application, 1));
        this.f136619f = m.b(new r0(this, 3));
    }
}
