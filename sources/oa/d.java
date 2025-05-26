package oa;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Context f93836a;

    /* renamed from: b, reason: collision with root package name */
    public final String f93837b;

    /* renamed from: c, reason: collision with root package name */
    public final c f93838c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f93839d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f93840e;

    public d(Context context, String str, c callback, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f93836a = context;
        this.f93837b = str;
        this.f93838c = callback;
        this.f93839d = z13;
        this.f93840e = z14;
    }
}
