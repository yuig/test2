package r60;

import a.cb;
import android.content.Context;
import com.pinterest.api.model.wy0;
import kh2.m2;
import kotlin.jvm.internal.Intrinsics;
import m60.u;
import m60.w;

/* loaded from: classes5.dex */
public final class h {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f106328e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Context f106329a;

    /* renamed from: b, reason: collision with root package name */
    public final s60.e f106330b;

    /* renamed from: c, reason: collision with root package name */
    public final w f106331c;

    /* renamed from: d, reason: collision with root package name */
    public final uk2.f f106332d;

    public h(Context context, s60.d userBlockActions) {
        w eventManager = u.f85943a;
        Intrinsics.checkNotNullExpressionValue(eventManager, "getInstance(...)");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(userBlockActions, "userBlockActions");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        this.f106329a = context;
        this.f106330b = userBlockActions;
        this.f106331c = eventManager;
        this.f106332d = cb.r("create(...)");
    }

    public final uk2.f a(wy0 user, String str, String str2) {
        Intrinsics.checkNotNullParameter(user, "user");
        f fVar = new f(this, 0);
        f fVar2 = new f(this, 1);
        Boolean s22 = user.s2();
        Intrinsics.checkNotNullExpressionValue(s22, "getBlockedByMe(...)");
        boolean booleanValue = s22.booleanValue();
        m2.B1(this.f106329a, booleanValue, user.Z2(), user.z4(), this.f106331c, new g(booleanValue, this, user, fVar, fVar2, str, str2));
        return this.f106332d;
    }
}
