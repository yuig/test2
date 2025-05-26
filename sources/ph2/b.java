package ph2;

import android.content.Context;
import kh2.g2;
import kotlin.jvm.internal.Intrinsics;
import xh2.d;
import xk2.m;
import xk2.v;

/* loaded from: classes4.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f100163a;

    /* renamed from: b, reason: collision with root package name */
    public final nf2.b f100164b;

    /* renamed from: c, reason: collision with root package name */
    public final d f100165c;

    /* renamed from: d, reason: collision with root package name */
    public final lh2.b f100166d;

    /* renamed from: e, reason: collision with root package name */
    public final v f100167e;

    public b(Context context, nf2.b deviceArchitecture, d serializer, lh2.b logger) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(deviceArchitecture, "deviceArchitecture");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f100163a = context;
        this.f100164b = deviceArchitecture;
        this.f100165c = serializer;
        this.f100166d = logger;
        this.f100167e = m.b(new g2(this, 3));
    }
}
